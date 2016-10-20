
package com.sforce.soap.schemas._class.ws_acq_leads;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CompanyQualifiedLocTntResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CompanyQualifiedLocTntResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company_Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Company_Qualified_Location" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Est_Competitor_Contract_Expiration_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Est_Data_Spend" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Est_EmpNo" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Est_ITSpend" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Est_Total_Telco_Spend" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Est_Voice_Spend" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Last_Verification_Date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="Last_Verified_ByUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Related_Customer_Account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Remaining_Contract_with_Competitor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIC_Division" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SIC_Major_Group" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Tenant_Status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TenantId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompanyQualifiedLocTntResponse", propOrder = {
    "comments",
    "companyName",
    "companyQualifiedLocation",
    "estCompetitorContractExpirationDate",
    "estDataSpend",
    "estEmpNo",
    "estITSpend",
    "estTotalTelcoSpend",
    "estVoiceSpend",
    "lastVerificationDate",
    "lastVerifiedByUser",
    "relatedCustomerAccount",
    "remainingContractWithCompetitor",
    "sicDivision",
    "sicMajorGroup",
    "tenantStatus",
    "tenantId"
})
public class CompanyQualifiedLocTntResponse {

    @XmlElementRef(name = "Comments", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "Company_Name", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyName;
    @XmlElementRef(name = "Company_Qualified_Location", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> companyQualifiedLocation;
    @XmlElementRef(name = "Est_Competitor_Contract_Expiration_Date", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> estCompetitorContractExpirationDate;
    @XmlElementRef(name = "Est_Data_Spend", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> estDataSpend;
    @XmlElementRef(name = "Est_EmpNo", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> estEmpNo;
    @XmlElementRef(name = "Est_ITSpend", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> estITSpend;
    @XmlElementRef(name = "Est_Total_Telco_Spend", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> estTotalTelcoSpend;
    @XmlElementRef(name = "Est_Voice_Spend", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> estVoiceSpend;
    @XmlElementRef(name = "Last_Verification_Date", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<XMLGregorianCalendar> lastVerificationDate;
    @XmlElementRef(name = "Last_Verified_ByUser", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lastVerifiedByUser;
    @XmlElementRef(name = "Related_Customer_Account", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relatedCustomerAccount;
    @XmlElementRef(name = "Remaining_Contract_with_Competitor", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> remainingContractWithCompetitor;
    @XmlElementRef(name = "SIC_Division", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sicDivision;
    @XmlElementRef(name = "SIC_Major_Group", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> sicMajorGroup;
    @XmlElementRef(name = "Tenant_Status", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tenantStatus;
    @XmlElementRef(name = "TenantId", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> tenantId;

    /**
     * Gets the value of the comments property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setComments(JAXBElement<String> value) {
        this.comments = value;
    }

    /**
     * Gets the value of the companyName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCompanyName() {
        return companyName;
    }

    /**
     * Sets the value of the companyName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCompanyName(JAXBElement<String> value) {
        this.companyName = value;
    }

    /**
     * Gets the value of the companyQualifiedLocation property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCompanyQualifiedLocation() {
        return companyQualifiedLocation;
    }

    /**
     * Sets the value of the companyQualifiedLocation property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCompanyQualifiedLocation(JAXBElement<String> value) {
        this.companyQualifiedLocation = value;
    }

    /**
     * Gets the value of the estCompetitorContractExpirationDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getEstCompetitorContractExpirationDate() {
        return estCompetitorContractExpirationDate;
    }

    /**
     * Sets the value of the estCompetitorContractExpirationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}
     *
     */
    public void setEstCompetitorContractExpirationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.estCompetitorContractExpirationDate = value;
    }

    /**
     * Gets the value of the estDataSpend property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public JAXBElement<BigDecimal> getEstDataSpend() {
        return estDataSpend;
    }

    /**
     * Sets the value of the estDataSpend property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public void setEstDataSpend(JAXBElement<BigDecimal> value) {
        this.estDataSpend = value;
    }

    /**
     * Gets the value of the estEmpNo property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public JAXBElement<BigDecimal> getEstEmpNo() {
        return estEmpNo;
    }

    /**
     * Sets the value of the estEmpNo property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public void setEstEmpNo(JAXBElement<BigDecimal> value) {
        this.estEmpNo = value;
    }

    /**
     * Gets the value of the estITSpend property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public JAXBElement<BigDecimal> getEstITSpend() {
        return estITSpend;
    }

    /**
     * Sets the value of the estITSpend property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public void setEstITSpend(JAXBElement<BigDecimal> value) {
        this.estITSpend = value;
    }

    /**
     * Gets the value of the estTotalTelcoSpend property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public JAXBElement<BigDecimal> getEstTotalTelcoSpend() {
        return estTotalTelcoSpend;
    }

    /**
     * Sets the value of the estTotalTelcoSpend property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public void setEstTotalTelcoSpend(JAXBElement<BigDecimal> value) {
        this.estTotalTelcoSpend = value;
    }

    /**
     * Gets the value of the estVoiceSpend property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public JAXBElement<BigDecimal> getEstVoiceSpend() {
        return estVoiceSpend;
    }

    /**
     * Sets the value of the estVoiceSpend property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public void setEstVoiceSpend(JAXBElement<BigDecimal> value) {
        this.estVoiceSpend = value;
    }

    /**
     * Gets the value of the lastVerificationDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}
     *
     */
    public JAXBElement<XMLGregorianCalendar> getLastVerificationDate() {
        return lastVerificationDate;
    }

    /**
     * Sets the value of the lastVerificationDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}
     *
     */
    public void setLastVerificationDate(JAXBElement<XMLGregorianCalendar> value) {
        this.lastVerificationDate = value;
    }

    /**
     * Gets the value of the lastVerifiedByUser property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLastVerifiedByUser() {
        return lastVerifiedByUser;
    }

    /**
     * Sets the value of the lastVerifiedByUser property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLastVerifiedByUser(JAXBElement<String> value) {
        this.lastVerifiedByUser = value;
    }

    /**
     * Gets the value of the relatedCustomerAccount property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getRelatedCustomerAccount() {
        return relatedCustomerAccount;
    }

    /**
     * Sets the value of the relatedCustomerAccount property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setRelatedCustomerAccount(JAXBElement<String> value) {
        this.relatedCustomerAccount = value;
    }

    /**
     * Gets the value of the remainingContractWithCompetitor property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getRemainingContractWithCompetitor() {
        return remainingContractWithCompetitor;
    }

    /**
     * Sets the value of the remainingContractWithCompetitor property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setRemainingContractWithCompetitor(JAXBElement<String> value) {
        this.remainingContractWithCompetitor = value;
    }

    /**
     * Gets the value of the sicDivision property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSICDivision() {
        return sicDivision;
    }

    /**
     * Sets the value of the sicDivision property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSICDivision(JAXBElement<String> value) {
        this.sicDivision = value;
    }

    /**
     * Gets the value of the sicMajorGroup property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSICMajorGroup() {
        return sicMajorGroup;
    }

    /**
     * Sets the value of the sicMajorGroup property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSICMajorGroup(JAXBElement<String> value) {
        this.sicMajorGroup = value;
    }

    /**
     * Gets the value of the tenantStatus property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTenantStatus() {
        return tenantStatus;
    }

    /**
     * Sets the value of the tenantStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTenantStatus(JAXBElement<String> value) {
        this.tenantStatus = value;
    }

    /**
     * Gets the value of the tenantId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTenantId() {
        return tenantId;
    }

    /**
     * Sets the value of the tenantId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTenantId(JAXBElement<String> value) {
        this.tenantId = value;
    }

}
