
package com.sforce.soap.schemas._class.ws_acq_leads;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for OpportunityData complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="OpportunityData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="businessName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="forecastCategory" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="industry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OpportunityUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opptyCloseDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="opptyCreatedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="opptyId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opptyName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="opptyStage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="postalCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="products" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualAttrs" type="{http://soap.sforce.com/schemas/class/WS_ACQ_Leads}QualificationAttr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceLocAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLocAddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLocCity" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLocCountry" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="serviceLocLatitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="serviceLocLongitude" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="serviceLocLst" type="{http://soap.sforce.com/schemas/class/WS_ACQ_Leads}ServiceLocationData" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="serviceLocState" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totalMRC" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpportunityData", propOrder = {
    "businessName",
    "forecastCategory",
    "industry",
    "opportunityUrl",
    "opptyCloseDate",
    "opptyCreatedDate",
    "opptyId",
    "opptyName",
    "opptyStage",
    "owner",
    "postalCode",
    "products",
    "qualAttrs",
    "serviceLocAddress",
    "serviceLocAddressLine2",
    "serviceLocCity",
    "serviceLocCountry",
    "serviceLocLatitude",
    "serviceLocLongitude",
    "serviceLocLst",
    "serviceLocState",
    "totalMRC"
})
public class OpportunityData {

    @XmlElementRef(name = "businessName", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> businessName;
    @XmlElementRef(name = "forecastCategory", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> forecastCategory;
    @XmlElementRef(name = "industry", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> industry;
    @XmlElementRef(name = "OpportunityUrl", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opportunityUrl;
    @XmlElementRef(name = "opptyCloseDate", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> opptyCloseDate;
    @XmlElementRef(name = "opptyCreatedDate", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> opptyCreatedDate;
    @XmlElementRef(name = "opptyId", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opptyId;
    @XmlElementRef(name = "opptyName", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opptyName;
    @XmlElementRef(name = "opptyStage", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> opptyStage;
    @XmlElementRef(name = "Owner", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> owner;
    @XmlElementRef(name = "postalCode", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> postalCode;
    @XmlElementRef(name = "products", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> products;
    @XmlElement(name = "QualAttrs", nillable = true)
    protected List<QualificationAttr> qualAttrs;
    @XmlElementRef(name = "serviceLocAddress", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocAddress;
    @XmlElementRef(name = "serviceLocAddressLine2", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocAddressLine2;
    @XmlElementRef(name = "serviceLocCity", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocCity;
    @XmlElementRef(name = "serviceLocCountry", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocCountry;
    @XmlElementRef(name = "serviceLocLatitude", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> serviceLocLatitude;
    @XmlElementRef(name = "serviceLocLongitude", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> serviceLocLongitude;
    @XmlElement(nillable = true)
    protected List<ServiceLocationData> serviceLocLst;
    @XmlElementRef(name = "serviceLocState", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocState;
    @XmlElementRef(name = "totalMRC", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> totalMRC;

    /**
     * Gets the value of the businessName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getBusinessName() {
        return businessName;
    }

    /**
     * Sets the value of the businessName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setBusinessName(JAXBElement<String> value) {
        this.businessName = value;
    }

    /**
     * Gets the value of the forecastCategory property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getForecastCategory() {
        return forecastCategory;
    }

    /**
     * Sets the value of the forecastCategory property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setForecastCategory(JAXBElement<String> value) {
        this.forecastCategory = value;
    }

    /**
     * Gets the value of the industry property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getIndustry() {
        return industry;
    }

    /**
     * Sets the value of the industry property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setIndustry(JAXBElement<String> value) {
        this.industry = value;
    }

    /**
     * Gets the value of the opportunityUrl property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getOpportunityUrl() {
        return opportunityUrl;
    }

    /**
     * Sets the value of the opportunityUrl property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setOpportunityUrl(JAXBElement<String> value) {
        this.opportunityUrl = value;
    }

    /**
     * Gets the value of the opptyCloseDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getOpptyCloseDate() {
        return opptyCloseDate;
    }

    /**
     * Sets the value of the opptyCloseDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}
     *
     */
    public void setOpptyCloseDate(JAXBElement<XMLGregorianCalendar> value) {
        this.opptyCloseDate = value;
    }

    /**
     * Gets the value of the opptyCreatedDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getOpptyCreatedDate() {
        return opptyCreatedDate;
    }

    /**
     * Sets the value of the opptyCreatedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}
     *
     */
    public void setOpptyCreatedDate(JAXBElement<XMLGregorianCalendar> value) {
        this.opptyCreatedDate = value;
    }

    /**
     * Gets the value of the opptyId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getOpptyId() {
        return opptyId;
    }

    /**
     * Sets the value of the opptyId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setOpptyId(JAXBElement<String> value) {
        this.opptyId = value;
    }

    /**
     * Gets the value of the opptyName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getOpptyName() {
        return opptyName;
    }

    /**
     * Sets the value of the opptyName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setOpptyName(JAXBElement<String> value) {
        this.opptyName = value;
    }

    /**
     * Gets the value of the opptyStage property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getOpptyStage() {
        return opptyStage;
    }

    /**
     * Sets the value of the opptyStage property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setOpptyStage(JAXBElement<String> value) {
        this.opptyStage = value;
    }

    /**
     * Gets the value of the owner property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setOwner(JAXBElement<String> value) {
        this.owner = value;
    }

    /**
     * Gets the value of the postalCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPostalCode() {
        return postalCode;
    }

    /**
     * Sets the value of the postalCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPostalCode(JAXBElement<String> value) {
        this.postalCode = value;
    }

    /**
     * Gets the value of the products property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setProducts(JAXBElement<String> value) {
        this.products = value;
    }

    /**
     * Gets the value of the qualAttrs property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualAttrs property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualAttrs().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualificationAttr }
     *
     *
     */
    public List<QualificationAttr> getQualAttrs() {
        if (qualAttrs == null) {
            qualAttrs = new ArrayList<QualificationAttr>();
        }
        return this.qualAttrs;
    }

    /**
     * Gets the value of the serviceLocAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getServiceLocAddress() {
        return serviceLocAddress;
    }

    /**
     * Sets the value of the serviceLocAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setServiceLocAddress(JAXBElement<String> value) {
        this.serviceLocAddress = value;
    }

    /**
     * Gets the value of the serviceLocAddressLine2 property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getServiceLocAddressLine2() {
        return serviceLocAddressLine2;
    }

    /**
     * Sets the value of the serviceLocAddressLine2 property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setServiceLocAddressLine2(JAXBElement<String> value) {
        this.serviceLocAddressLine2 = value;
    }

    /**
     * Gets the value of the serviceLocCity property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getServiceLocCity() {
        return serviceLocCity;
    }

    /**
     * Sets the value of the serviceLocCity property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setServiceLocCity(JAXBElement<String> value) {
        this.serviceLocCity = value;
    }

    /**
     * Gets the value of the serviceLocCountry property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getServiceLocCountry() {
        return serviceLocCountry;
    }

    /**
     * Sets the value of the serviceLocCountry property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setServiceLocCountry(JAXBElement<String> value) {
        this.serviceLocCountry = value;
    }

    /**
     * Gets the value of the serviceLocLatitude property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public JAXBElement<BigDecimal> getServiceLocLatitude() {
        return serviceLocLatitude;
    }

    /**
     * Sets the value of the serviceLocLatitude property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public void setServiceLocLatitude(JAXBElement<BigDecimal> value) {
        this.serviceLocLatitude = value;
    }

    /**
     * Gets the value of the serviceLocLongitude property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public JAXBElement<BigDecimal> getServiceLocLongitude() {
        return serviceLocLongitude;
    }

    /**
     * Sets the value of the serviceLocLongitude property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public void setServiceLocLongitude(JAXBElement<BigDecimal> value) {
        this.serviceLocLongitude = value;
    }

    /**
     * Gets the value of the serviceLocLst property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceLocLst property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceLocLst().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceLocationData }
     *
     *
     */
    public List<ServiceLocationData> getServiceLocLst() {
        if (serviceLocLst == null) {
            serviceLocLst = new ArrayList<ServiceLocationData>();
        }
        return this.serviceLocLst;
    }

    /**
     * Gets the value of the serviceLocState property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getServiceLocState() {
        return serviceLocState;
    }

    /**
     * Sets the value of the serviceLocState property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setServiceLocState(JAXBElement<String> value) {
        this.serviceLocState = value;
    }

    /**
     * Gets the value of the totalMRC property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public JAXBElement<BigDecimal> getTotalMRC() {
        return totalMRC;
    }

    /**
     * Sets the value of the totalMRC property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public void setTotalMRC(JAXBElement<BigDecimal> value) {
        this.totalMRC = value;
    }

}
