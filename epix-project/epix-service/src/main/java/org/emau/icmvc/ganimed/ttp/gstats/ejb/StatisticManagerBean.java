package org.emau.icmvc.ganimed.ttp.gstats.ejb;

/*
 * ###license-information-start###
 * gStatS - a Generic Statistic Service
 * 
 * E-PIX - Enterprise Patient Identifier Cross-referencing
 * _
 * Copyright (C) 2013 - 2016 MOSAIC - Institut fuer Community Medicine der Universitaetsmedizin Greifswald - mosaic@uni-greifswald.de
 * __
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * ###license-information-end###
 */

import java.util.ArrayList;
import java.util.List;

import javax.annotation.security.RolesAllowed;
import javax.ejb.Remote;
import javax.ejb.Schedule;
import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.log4j.Logger;
import org.emau.icmvc.ganimed.ttp.gstats.CommonStatisticBean;
import org.emau.icmvc.ganimed.ttp.gstats.StatisticManager;
import org.jboss.ejb3.annotation.SecurityDomain;

/**
 * 
 * Statistic Service
 * 
 * @author bialkem
 * 
 */
@WebService(name = "statisticService")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@Stateless
@Remote(StatisticManager.class)

@SecurityDomain(value = "epix-security-domain")
public class StatisticManagerBean implements StatisticManager {

	private static final Logger logger = Logger.getLogger(StatisticManagerBean.class);
	private static final Object emSynchronizerDummy = new Object();
	private static final String UPDATE_QUERY = "call updateStats()";

	@PersistenceContext(unitName = "epix")
	private EntityManager em;

	private Boolean enableAutoUpdate = false;

	public StatisticManagerBean() {
	}

	// /
	// / SCHEDULED TASKS
	// /

	/**
	 * common scheduled task, to invoke update for stats in all configured datasources
	 */
	@Schedule(second = "0", minute = "5", hour = "*", persistent = false)
	private void automaticeUpdate() {
		if (enableAutoUpdate == true) {
			logger.info("performing automated update");

			updateStats();
		}
	}

	//
	// STATISTIC MANAGER IMPLEMENTATION
	//

	@RolesAllowed({ "user" })
	@Override
	public CommonStatisticBean getLatestStats() {

		logger.info("call to getLatestStats");

		CommonStatisticBean csbResult = null;

		if (em != null) {
			CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
			CriteriaQuery<Statistic> criteriaQuery = criteriaBuilder.createQuery(Statistic.class);
			Root<Statistic> root = criteriaQuery.from(Statistic.class);

			criteriaQuery.select(root);
			List<Statistic> result = em.createQuery(criteriaQuery).getResultList();

			if (result.size() > 0) {
				Statistic lastDataset = result.get(result.size() - 1);

				csbResult = lastDataset.convertToCommonStatisticBean();

				logger.info("latest stat: " + csbResult.toString());
			}
		} else {
			logger.error("error getting entitiymanager");
		}

		return csbResult;
	}

	@RolesAllowed({ "user" })
	@Override
	public List<CommonStatisticBean> getAllStats() {
		logger.info("call to getAllStats");

		List<CommonStatisticBean> resultlist = new ArrayList<CommonStatisticBean>();

		if (em != null) {

			CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
			CriteriaQuery<Statistic> criteriaQuery = criteriaBuilder.createQuery(Statistic.class);
			Root<Statistic> root = criteriaQuery.from(Statistic.class);

			criteriaQuery.select(root);
			List<Statistic> result = em.createQuery(criteriaQuery).getResultList();

			logger.info("number of results: " + result.size());
			for (Statistic stats : result) {
				logger.debug(stats.toString());
				resultlist.add(stats.convertToCommonStatisticBean());
			}

		} else {
			logger.error("error getting entitiymanager");
		}

		return resultlist;
	}

	@RolesAllowed({ "user" })
	@Override
	public void updateStats() {
		// invokes mysql procedure updateStats
		logger.info("call to invokeUpdate");

		if (em != null) {
			// schreibzugriff ueber stored procedure
			synchronized (emSynchronizerDummy) {
				List<?> results = em.createNativeQuery(UPDATE_QUERY).getResultList();
				if (results.size() > 0) {
					logger.info("updated");
				}
			}
		} else {
			logger.error("error getting entitiymanager");
		}
	}
}
