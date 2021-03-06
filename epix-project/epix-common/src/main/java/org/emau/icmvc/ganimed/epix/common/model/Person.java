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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>
 * Java class for Person complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Person">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="first-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="middle-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="last-name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="suffix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="gender" type="{http://www.ganimed.icmvc.emau.org/common/model}Gender" minOccurs="0"/>
 *         &lt;element name="contact" type="{http://www.ganimed.icmvc.emau.org/common/model}Contact" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="birth-date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="mpiid" type="{http://www.ganimed.icmvc.emau.org/common/model}MPIID" minOccurs="0"/>
 *         &lt;element name="identifiers" type="{http://www.ganimed.icmvc.emau.org/common/model}Identifier" maxOccurs="unbounded"/>
 *         &lt;element name="role" type="{http://www.ganimed.icmvc.emau.org/common/model}PersonRole"/>
 *         &lt;element name="birth-place" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="race" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="religion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mothers-maiden-name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="degree" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mother-tongue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nationality" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="civil-status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="origin-date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="value1" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="value2" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="value3" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="value4" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="value5" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="value6" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="value7" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="value8" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="value9" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="value10" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 * 	 &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}decimal"/>       
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
public class Person implements Serializable {

	private static final long serialVersionUID = 5286718944526022114L;

	protected Long id;

	protected String firstName;

	protected String middleName;

	protected String lastName;

	protected String prefix;

	protected String suffix;

	protected Gender gender;

	protected List<Contact> contacts;

	protected Date birthDate;

	protected MPIID mpiid;

	protected List<Identifier> identifiers;

	protected PersonRole role;
	
	protected String birthPlace;

	protected String race;

	protected String religion;

	protected String mothersMaidenName;

    protected String degree;
    
    protected String motherTongue;
    
    protected String nationality;
    
    protected String civilStatus;
    
    protected Date originDate;
	
	protected String value1;

	protected String value2;

	protected String value3;

	protected String value4;

	protected String value5;

	protected String value6;

	protected String value7;

	protected String value8;

	protected String value9;

	protected String value10;

	
	public Person() {
		super();
	}

	public Person(String firstName, String middleName, String lastName, String prefix, String suffix, Gender gender, 
			List<Contact> contacts, Date birthDate, MPIID mpiid, List<Identifier> identifiers, PersonRole role, 
			String birthPlace, String race, String religion, String mothersMaidenName, String degree, String motherTongue, 
			String nationality, String civilStatus, Date originDate,
			String value1, String value2, String value3, String value4,	String value5, String value6, String value7,
			String value8, String value9, String value10) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.prefix = prefix;
		this.suffix = suffix;
		this.gender = gender;
		this.contacts = contacts;
		if(birthDate != null) {
			this.birthDate = new Date(birthDate.getTime());
		}
		this.mpiid = mpiid;
		this.identifiers = identifiers;
		this.role = role;
		this.birthPlace = birthPlace;
		this.race = race;
		this.religion = religion;
		this.mothersMaidenName = mothersMaidenName;
		this.degree = degree;
		this.motherTongue = motherTongue;
		this.nationality = nationality;
		this.civilStatus = civilStatus;
		if(originDate != null) {
			this.originDate = new Date(originDate.getTime());
		}
		this.value1 = value1;
		this.value2 = value2;
		this.value3 = value3;
		this.value4 = value4;
		this.value5 = value5;
		this.value6 = value6;
		this.value7 = value7;
		this.value8 = value8;
		this.value9 = value9;
		this.value10 = value10;
	}

	/**
	 * Gets the value of the birthDate property.
	 * 
	 * @return possible object is {@link Date }
	 * 
	 */
	public Date getBirthDate() {
		if(birthDate != null) {
			return new Date(birthDate.getTime());
		}
		return null;
	}

	/**
	 * Gets the value of the contact property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
	 * not a <CODE>set</CODE> method for the contact property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getContact().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Contact }
	 * 
	 * 
	 */
	public List<Contact> getContacts() {
		if (contacts == null) {
			contacts = new ArrayList<Contact>();
		}
		return this.contacts;
	}

	/**
	 * Gets the value of the firstName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * Gets the value of the gender property.
	 * 
	 * @return possible object is {@link Gender }
	 * 
	 */
	public Gender getGender() {
		return gender;
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
	 * Gets the value of the identifiers property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list, not a snapshot. Therefore any modification you make to the returned list will be present inside the JAXB object. This is why there is
	 * not a <CODE>set</CODE> method for the identifiers property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * 
	 * <pre>
	 * getIdentifiers().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list {@link Identifier }
	 * 
	 * 
	 */
	public List<Identifier> getIdentifiers() {
		if (identifiers == null) {
			identifiers = new ArrayList<Identifier>();
		}
		return this.identifiers;
	}

	/**
	 * Gets the value of the lastName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * Gets the value of the middleName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * Gets the value of the mpiid property.
	 * 
	 * @return possible object is {@link MPIID }
	 * 
	 */
	public MPIID getMpiid() {
		return mpiid;
	}

	/**
	 * Gets the value of the prefix property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getPrefix() {
		return prefix;
	}

	/**
	 * @return the role
	 */
	public PersonRole getRole() {
		return role;
	}

	/**
	 * Gets the value of the suffix property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getSuffix() {
		return suffix;
	}
	
	/**
	 * Gets the value of the birthPlace property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getBirthPlace() {
		return birthPlace;
	}
	

	/**
	 * Gets the value of the mothersMaidenName property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getMothersMaidenName() {
		return mothersMaidenName;
	}

	/**
	 * Gets the value of the race property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getRace() {
		return race;
	}

	/**
	 * Gets the value of the religion property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getReligion() {
		return religion;
	}

	/**
	 * Sets the value of the birthDate property.
	 * 
	 * @param value
	 *            allowed object is {@link Date }
	 * 
	 */
	public void setBirthDate(Date birthDate) {
		if(birthDate != null) {
			this.birthDate = new Date(birthDate.getTime());
		}
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	/**
	 * Sets the value of the firstName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setFirstName(String value) {
		this.firstName = value;
	}

	/**
	 * Sets the value of the gender property.
	 * 
	 * @param value
	 *            allowed object is {@link Gender }
	 * 
	 */
	public void setGender(Gender value) {
		this.gender = value;
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

	public void setIdentifiers(List<Identifier> identifiers) {
		this.identifiers = identifiers;
	}

	/**
	 * Sets the value of the lastName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setLastName(String value) {
		this.lastName = value;
	}

	/**
	 * Sets the value of the middleName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMiddleName(String value) {
		this.middleName = value;
	}

	/**
	 * Sets the value of the mpiid property.
	 * 
	 * @param value
	 *            allowed object is {@link MPIID }
	 * 
	 */
	public void setMpiid(MPIID value) {
		this.mpiid = value;
	}

	/**
	 * Sets the value of the prefix property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setPrefix(String value) {
		this.prefix = value;
	}

	/**
	 * @param role
	 *            the role to set
	 */
	public void setRole(PersonRole role) {
		this.role = role;
	}

	/**
	 * Sets the value of the suffix property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setSuffix(String value) {
		this.suffix = value;
	}
	
	/**
	 * Sets the value of the birthPlace property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setBirthPlace(String value) {
		this.birthPlace = value;
	}
	
	/**
	 * Sets the value of the mothersMaidenName property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setMothersMaidenName(String value) {
		this.mothersMaidenName = value;
	}

	/**
	 * Sets the value of the race property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setRace(String value) {
		this.race = value;
	}

	/**
	 * Sets the value of the religion property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setReligion(String value) {
		this.religion = value;
	}
	
	 /**
     * Gets the value of the degree property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDegree() {
        return degree;
    }

    /**
     * Sets the value of the degree property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDegree(String value) {
        this.degree = value;
    }

    /**
     * Gets the value of the motherTongue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMotherTongue() {
        return motherTongue;
    }

    /**
     * Sets the value of the motherTongue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMotherTongue(String value) {
        this.motherTongue = value;
    }

    /**
     * Gets the value of the nationality property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * Sets the value of the nationality property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNationality(String value) {
        this.nationality = value;
    }

    /**
     * Gets the value of the civilStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCivilStatus() {
        return civilStatus;
    }

    /**
     * Sets the value of the civilStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCivilStatus(String value) {
        this.civilStatus = value;
    }
    
	public Date getOriginDate() {
		if(originDate != null) {
			return new Date(originDate.getTime());
		}
		return null;
	}

    /**
     * Sets the value of the originDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Date }
     */
	public void setOriginDate(Date originDate) {
		if(originDate != null) {
			this.originDate = new Date(originDate.getTime());
		}
	}

	/**
	 * Gets the value of the value1 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue1() {
		return value1;
	}

	/**
	 * Sets the value of the value1 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue1(String value1) {
		this.value1 = value1;
	}
	
	/**
	 * Gets the value of the value2 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue2() {
		return value2;
	}

	/**
	 * Sets the value of the value2 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue2(String value2) {
		this.value2 = value2;
	}
	
	/**
	 * Gets the value of the value3 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue3() {
		return value3;
	}

	/**
	 * Sets the value of the value3 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue3(String value3) {
		this.value3 = value3;
	}
	
	/**
	 * Gets the value of the value4 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue4() {
		return value4;
	}

	/**
	 * Sets the value of the value4 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue4(String value4) {
		this.value4 = value4;
	}
	
	/**
	 * Gets the value of the value5 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue5() {
		return value5;
	}

	/**
	 * Sets the value of the value5 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue5(String value5) {
		this.value5 = value5;
	}
	
	/**
	 * Gets the value of the value6 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue6() {
		return value6;
	}

	/**
	 * Sets the value of the value6 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue6(String value6) {
		this.value6 = value6;
	}
	
	/**
	 * Gets the value of the value7 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue7() {
		return value7;
	}

	/**
	 * Sets the value of the value7 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue7(String value7) {
		this.value7 = value7;
	}
	
	/**
	 * Gets the value of the value8 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue8() {
		return value8;
	}

	/**
	 * Sets the value of the value8 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue8(String value8) {
		this.value8 = value8;
	}
	
	/**
	 * Gets the value of the value9 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue9() {
		return value9;
	}

	/**
	 * Sets the value of the value9 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue9(String value9) {
		this.value9 = value9;
	}
	
	/**
	 * Gets the value of the value10 property.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getValue10() {
		return value10;
	}

	/**
	 * Sets the value of the value10 property.
	 * 
	 * @param value
	 *            allowed object is {@link String }
	 * 
	 */
	public void setValue10(String value10) {
		this.value10 = value10;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", firstName=" + firstName
				+ ", middleName=" + middleName + ", lastName=" + lastName
				+ ", prefix=" + prefix + ", suffix=" + suffix + ", gender="
				+ gender + ", contacts=" + contacts + ", birthDate="
				+ birthDate + ", mpiid=" + mpiid + ", identifiers="
				+ identifiers + ", birthPlace=" + birthPlace + ", race=" + race
				+ ", religion=" + religion + ", mothersMaidenName="
				+ mothersMaidenName + ", originDate="
				+ originDate + ", value1=" + value1 + ", value2=" + value2 + ", value3=" + value3 + ", value4=" + value4
				+ ", value5=" + value5 + ", value6=" + value6 + ", value7=" + value7 + ", value8=" + value8
				+ ", value9=" + value9 + ", value10=" + value10 + "]";
	}

}
