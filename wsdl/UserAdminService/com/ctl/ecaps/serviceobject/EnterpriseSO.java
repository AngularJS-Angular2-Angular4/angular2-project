
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EnterpriseSO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EnterpriseSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="creditHoldIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="deactivated" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="deactivatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="deactivatedStatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="defaultIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="desistAniIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="desistCardIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="desistDedicated8XXIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="desistSwitched8XXIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enewsIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="enterpriseChannelId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enterpriseCustomerType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enterpriseEmailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="enterpriseId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="enterpriseName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="noPicIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="originTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="parentEnterpriseInd" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="remoteControlId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="selfRegistration" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="userEnterpriseAlias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnterpriseSO", propOrder = {
    "createdDate",
    "creditHoldIndicator",
    "deactivated",
    "deactivatedDate",
    "deactivatedStatusCode",
    "defaultIndicator",
    "desistAniIndicator",
    "desistCardIndicator",
    "desistDedicated8XXIndicator",
    "desistSwitched8XXIndicator",
    "enewsIndicator",
    "enterpriseChannelId",
    "enterpriseCustomerType",
    "enterpriseEmailAddress",
    "enterpriseId",
    "enterpriseName",
    "noPicIndicator",
    "originTypeCode",
    "parentEnterpriseInd",
    "remoteControlId",
    "selfRegistration",
    "userEnterpriseAlias"
})
public class EnterpriseSO {

    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected Boolean creditHoldIndicator;
    protected boolean deactivated;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar deactivatedDate;
    protected String deactivatedStatusCode;
    protected Boolean defaultIndicator;
    protected Boolean desistAniIndicator;
    protected Boolean desistCardIndicator;
    protected Boolean desistDedicated8XXIndicator;
    protected Boolean desistSwitched8XXIndicator;
    protected Boolean enewsIndicator;
    protected String enterpriseChannelId;
    protected String enterpriseCustomerType;
    protected String enterpriseEmailAddress;
    protected Long enterpriseId;
    protected String enterpriseName;
    protected Boolean noPicIndicator;
    protected String originTypeCode;
    protected boolean parentEnterpriseInd;
    protected String remoteControlId;
    protected boolean selfRegistration;
    protected String userEnterpriseAlias;

    /**
     * Gets the value of the createdDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the creditHoldIndicator property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isCreditHoldIndicator() {
        return creditHoldIndicator;
    }

    /**
     * Sets the value of the creditHoldIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setCreditHoldIndicator(Boolean value) {
        this.creditHoldIndicator = value;
    }

    /**
     * Gets the value of the deactivated property.
     *
     */
    public boolean isDeactivated() {
        return deactivated;
    }

    /**
     * Sets the value of the deactivated property.
     *
     */
    public void setDeactivated(boolean value) {
        this.deactivated = value;
    }

    /**
     * Gets the value of the deactivatedDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getDeactivatedDate() {
        return deactivatedDate;
    }

    /**
     * Sets the value of the deactivatedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public void setDeactivatedDate(XMLGregorianCalendar value) {
        this.deactivatedDate = value;
    }

    /**
     * Gets the value of the deactivatedStatusCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDeactivatedStatusCode() {
        return deactivatedStatusCode;
    }

    /**
     * Sets the value of the deactivatedStatusCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDeactivatedStatusCode(String value) {
        this.deactivatedStatusCode = value;
    }

    /**
     * Gets the value of the defaultIndicator property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDefaultIndicator() {
        return defaultIndicator;
    }

    /**
     * Sets the value of the defaultIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDefaultIndicator(Boolean value) {
        this.defaultIndicator = value;
    }

    /**
     * Gets the value of the desistAniIndicator property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDesistAniIndicator() {
        return desistAniIndicator;
    }

    /**
     * Sets the value of the desistAniIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDesistAniIndicator(Boolean value) {
        this.desistAniIndicator = value;
    }

    /**
     * Gets the value of the desistCardIndicator property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDesistCardIndicator() {
        return desistCardIndicator;
    }

    /**
     * Sets the value of the desistCardIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDesistCardIndicator(Boolean value) {
        this.desistCardIndicator = value;
    }

    /**
     * Gets the value of the desistDedicated8XXIndicator property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDesistDedicated8XXIndicator() {
        return desistDedicated8XXIndicator;
    }

    /**
     * Sets the value of the desistDedicated8XXIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDesistDedicated8XXIndicator(Boolean value) {
        this.desistDedicated8XXIndicator = value;
    }

    /**
     * Gets the value of the desistSwitched8XXIndicator property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isDesistSwitched8XXIndicator() {
        return desistSwitched8XXIndicator;
    }

    /**
     * Sets the value of the desistSwitched8XXIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setDesistSwitched8XXIndicator(Boolean value) {
        this.desistSwitched8XXIndicator = value;
    }

    /**
     * Gets the value of the enewsIndicator property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isEnewsIndicator() {
        return enewsIndicator;
    }

    /**
     * Sets the value of the enewsIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setEnewsIndicator(Boolean value) {
        this.enewsIndicator = value;
    }

    /**
     * Gets the value of the enterpriseChannelId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEnterpriseChannelId() {
        return enterpriseChannelId;
    }

    /**
     * Sets the value of the enterpriseChannelId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEnterpriseChannelId(String value) {
        this.enterpriseChannelId = value;
    }

    /**
     * Gets the value of the enterpriseCustomerType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEnterpriseCustomerType() {
        return enterpriseCustomerType;
    }

    /**
     * Sets the value of the enterpriseCustomerType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEnterpriseCustomerType(String value) {
        this.enterpriseCustomerType = value;
    }

    /**
     * Gets the value of the enterpriseEmailAddress property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEnterpriseEmailAddress() {
        return enterpriseEmailAddress;
    }

    /**
     * Sets the value of the enterpriseEmailAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEnterpriseEmailAddress(String value) {
        this.enterpriseEmailAddress = value;
    }

    /**
     * Gets the value of the enterpriseId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * Sets the value of the enterpriseId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setEnterpriseId(Long value) {
        this.enterpriseId = value;
    }

    /**
     * Gets the value of the enterpriseName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEnterpriseName() {
        return enterpriseName;
    }

    /**
     * Sets the value of the enterpriseName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEnterpriseName(String value) {
        this.enterpriseName = value;
    }

    /**
     * Gets the value of the noPicIndicator property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isNoPicIndicator() {
        return noPicIndicator;
    }

    /**
     * Sets the value of the noPicIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setNoPicIndicator(Boolean value) {
        this.noPicIndicator = value;
    }

    /**
     * Gets the value of the originTypeCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOriginTypeCode() {
        return originTypeCode;
    }

    /**
     * Sets the value of the originTypeCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOriginTypeCode(String value) {
        this.originTypeCode = value;
    }

    /**
     * Gets the value of the parentEnterpriseInd property.
     *
     */
    public boolean isParentEnterpriseInd() {
        return parentEnterpriseInd;
    }

    /**
     * Sets the value of the parentEnterpriseInd property.
     *
     */
    public void setParentEnterpriseInd(boolean value) {
        this.parentEnterpriseInd = value;
    }

    /**
     * Gets the value of the remoteControlId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRemoteControlId() {
        return remoteControlId;
    }

    /**
     * Sets the value of the remoteControlId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRemoteControlId(String value) {
        this.remoteControlId = value;
    }

    /**
     * Gets the value of the selfRegistration property.
     *
     */
    public boolean isSelfRegistration() {
        return selfRegistration;
    }

    /**
     * Sets the value of the selfRegistration property.
     *
     */
    public void setSelfRegistration(boolean value) {
        this.selfRegistration = value;
    }

    /**
     * Gets the value of the userEnterpriseAlias property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserEnterpriseAlias() {
        return userEnterpriseAlias;
    }

    /**
     * Sets the value of the userEnterpriseAlias property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserEnterpriseAlias(String value) {
        this.userEnterpriseAlias = value;
    }

}
