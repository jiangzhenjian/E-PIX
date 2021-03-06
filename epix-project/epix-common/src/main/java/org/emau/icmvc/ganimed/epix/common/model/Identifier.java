//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.07.16 at 05:21:16 PM MESZ 
//

package org.emau.icmvc.ganimed.epix.common.model;

/*
 * ###license-information-start###
 * E-PIX - Enterprise Patient Identifier Cross-referencing
 * __
 * Copyright (C) 2009 - 2017 The MOSAIC Project - Institut fuer Community Medicine der
 * 							Universitaetsmedizin Greifswald - mosaic-projekt@uni-greifswald.de
 * 							concept and implementation
 * 							c. schack, d.langner, l. geidel
 * 							web client
 * 							a. blumentritt
 * 							g. weiher
 * 							please cite our publications
 * 							http://dx.doi.org/10.3414/ME14-01-0133
 * 							http://dx.doi.org/10.1186/s12967-015-0545-6
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


import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Java class for Identifier complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Identifier">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence> *        
 *         &lt;element name="value" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sending-application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sending-facility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receive-application" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="receive-facility" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="identifier-domain" type="{http://www.ganimed.icmvc.emau.org/common/model}IdentifierDomain"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Identifier", namespace = "http://www.ganimed.icmvc.emau.org/common/model", propOrder = { "value", "description", "sendingApplication", "sendingFacility", "receiveApplication",
		"receiveFacility", "identifierDomain" })
public class Identifier implements Serializable {

	private static final long serialVersionUID = 5707564949707149342L;

	@XmlAttribute
	protected Long id;

	@XmlElement(required = true)
	protected String value;

	protected String description;

	@XmlElement(name = "sending-application")
	protected String sendingApplication;

	@XmlElement(name = "sending-facility")
	protected String sendingFacility;

	@XmlElement(name = "receive-application")
	protected String receiveApplication;

	@XmlElement(name = "receive-facility")
	protected String receiveFacility;

	@XmlElement(name = "identifier-domain", required = true)
	protected IdentifierDomain identifierDomain;

	public Identifier() {
		super();
	}

	public Identifier(String value, String description, String sendingApplication, String sendingFacility, String receiveApplication, String receiveFacility, IdentifierDomain identifierDomain) {
		super();
		this.value = value;
		this.description = description;
		this.sendingApplication = sendingApplication;
		this.sendingFacility = sendingFacility;
		this.receiveApplication = receiveApplication;
		this.receiveFacility = receiveFacility;
		this.identifierDomain = identifierDomain;
	}

	/**
	 * Gets the value of the description property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * Gets the value of the id property.
	 * 
	 * @return possible object is {@link Long }
	 * 
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Gets the value of the identifierDomain property.
	 * 
	 * @return possible object is {@link IdentifierDomain }
	 * 
	 */
	public IdentifierDomain getIdentifierDomain() {
		return identifierDomain;
	}

	/**
	 * @return the receiveApplication
	 */
	public String getReceiveApplication() {
		return receiveApplication;
	}

	/**
	 * @return the receiveFacility
	 */
	public String getReceiveFacility() {
		return receiveFacility;
	}

	/**
	 * Gets the value of the sendingApplication property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSendingApplication() {
		return sendingApplication;
	}

	/**
	 * Gets the value of the sendingFacility property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSendingFacility() {
		return sendingFacility;
	}

	/**
	 * Gets the value of the value property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value of the description property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setDescription(String value) {
		this.description = value;
	}

	/**
	 * Sets the value of the id property.
	 * 
	 * @param value
	 *            allowed object is {@link Long }
	 * 
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Sets the value of the identifierDomain property.
	 * 
	 * @param value
	 *            allowed object is {@link IdentifierDomain }
	 * 
	 */
	public void setIdentifierDomain(IdentifierDomain value) {
		this.identifierDomain = value;
	}

	/**
	 * @param receiveApplication
	 *            the receiveApplication to set
	 */
	public void setReceiveApplication(String receiveApplication) {
		this.receiveApplication = receiveApplication;
	}

	/**
	 * @param receiveFacility
	 *            the receiveFacility to set
	 */
	public void setReceiveFacility(String receiveFacility) {
		this.receiveFacility = receiveFacility;
	}

	/**
	 * Sets the value of the sendingApplication property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSendingApplication(String value) {
		this.sendingApplication = value;
	}

	/**
	 * Sets the value of the sendingFacility property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSendingFacility(String value) {
		this.sendingFacility = value;
	}

	/**
	 * Sets the value of the value property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((identifierDomain == null) ? 0 : identifierDomain.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Identifier other = (Identifier) obj;
		if (identifierDomain == null) {
			if (other.identifierDomain != null)
				return false;
		} else if (!identifierDomain.equals(other.identifierDomain))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Identifier [id=" + id + ", value=" + value + ", description=" + description + ", sendingApplication=" + sendingApplication + ", sendingFacility=" + sendingFacility
				+ ", identifierDomain=" + identifierDomain + "]";
	}

}
