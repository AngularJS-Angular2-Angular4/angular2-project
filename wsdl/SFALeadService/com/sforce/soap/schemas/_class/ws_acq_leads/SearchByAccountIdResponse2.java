
package com.sforce.soap.schemas._class.ws_acq_leads;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SearchByAccountIdResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SearchByAccountIdResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccountName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AccountSegmentCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CTLBillingAcctDetails" type="{http://soap.sforce.com/schemas/class/WS_ACQ_Leads}CTLBillingAccountDetails" minOccurs="0"/>
 *         &lt;element name="CustomerTBR" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="ErrorMsg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="isTooManyBAcctsExists" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MessageCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="NoOfBillingAccounts" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="QCBillingAcctDetails" type="{http://soap.sforce.com/schemas/class/WS_ACQ_Leads}QCBillingAccountDetails" minOccurs="0"/>
 *         &lt;element name="QCCBillingAcctDetails" type="{http://soap.sforce.com/schemas/class/WS_ACQ_Leads}QCCBillingAccountDetails" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchByAccountIdResponse", propOrder = {
    "accountName",
    "accountSegmentCode",
    "ctlBillingAcctDetails",
    "customerTBR",
    "errorMsg",
    "isTooManyBAcctsExists",
    "messageCode",
    "noOfBillingAccounts",
    "qcBillingAcctDetails",
    "qccBillingAcctDetails"
})
public class SearchByAccountIdResponse2 {

    @XmlElementRef(name = "AccountName", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountName;
    @XmlElementRef(name = "AccountSegmentCode", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> accountSegmentCode;
    @XmlElementRef(name = "CTLBillingAcctDetails", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<CTLBillingAccountDetails> ctlBillingAcctDetails;
    @XmlElementRef(name = "CustomerTBR", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> customerTBR;
    @XmlElementRef(name = "ErrorMsg", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMsg;
    @XmlElementRef(name = "isTooManyBAcctsExists", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<Boolean> isTooManyBAcctsExists;
    @XmlElementRef(name = "MessageCode", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> messageCode;
    @XmlElementRef(name = "NoOfBillingAccounts", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<BigDecimal> noOfBillingAccounts;
    @XmlElementRef(name = "QCBillingAcctDetails", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<QCBillingAccountDetails> qcBillingAcctDetails;
    @XmlElementRef(name = "QCCBillingAcctDetails", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<QCCBillingAccountDetails> qccBillingAcctDetails;

    /**
     * Gets the value of the accountName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAccountName() {
        return accountName;
    }

    /**
     * Sets the value of the accountName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAccountName(JAXBElement<String> value) {
        this.accountName = value;
    }

    /**
     * Gets the value of the accountSegmentCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAccountSegmentCode() {
        return accountSegmentCode;
    }

    /**
     * Sets the value of the accountSegmentCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAccountSegmentCode(JAXBElement<String> value) {
        this.accountSegmentCode = value;
    }

    /**
     * Gets the value of the ctlBillingAcctDetails property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CTLBillingAccountDetails }{@code >}
     *
     */
    public JAXBElement<CTLBillingAccountDetails> getCTLBillingAcctDetails() {
        return ctlBillingAcctDetails;
    }

    /**
     * Sets the value of the ctlBillingAcctDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CTLBillingAccountDetails }{@code >}
     *
     */
    public void setCTLBillingAcctDetails(JAXBElement<CTLBillingAccountDetails> value) {
        this.ctlBillingAcctDetails = value;
    }

    /**
     * Gets the value of the customerTBR property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public JAXBElement<BigDecimal> getCustomerTBR() {
        return customerTBR;
    }

    /**
     * Sets the value of the customerTBR property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public void setCustomerTBR(JAXBElement<BigDecimal> value) {
        this.customerTBR = value;
    }

    /**
     * Gets the value of the errorMsg property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getErrorMsg() {
        return errorMsg;
    }

    /**
     * Sets the value of the errorMsg property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setErrorMsg(JAXBElement<String> value) {
        this.errorMsg = value;
    }

    /**
     * Gets the value of the isTooManyBAcctsExists property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public JAXBElement<Boolean> getIsTooManyBAcctsExists() {
        return isTooManyBAcctsExists;
    }

    /**
     * Sets the value of the isTooManyBAcctsExists property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}
     *
     */
    public void setIsTooManyBAcctsExists(JAXBElement<Boolean> value) {
        this.isTooManyBAcctsExists = value;
    }

    /**
     * Gets the value of the messageCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getMessageCode() {
        return messageCode;
    }

    /**
     * Sets the value of the messageCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setMessageCode(JAXBElement<String> value) {
        this.messageCode = value;
    }

    /**
     * Gets the value of the noOfBillingAccounts property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public JAXBElement<BigDecimal> getNoOfBillingAccounts() {
        return noOfBillingAccounts;
    }

    /**
     * Sets the value of the noOfBillingAccounts property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}
     *
     */
    public void setNoOfBillingAccounts(JAXBElement<BigDecimal> value) {
        this.noOfBillingAccounts = value;
    }

    /**
     * Gets the value of the qcBillingAcctDetails property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link QCBillingAccountDetails }{@code >}
     *
     */
    public JAXBElement<QCBillingAccountDetails> getQCBillingAcctDetails() {
        return qcBillingAcctDetails;
    }

    /**
     * Sets the value of the qcBillingAcctDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link QCBillingAccountDetails }{@code >}
     *
     */
    public void setQCBillingAcctDetails(JAXBElement<QCBillingAccountDetails> value) {
        this.qcBillingAcctDetails = value;
    }

    /**
     * Gets the value of the qccBillingAcctDetails property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link QCCBillingAccountDetails }{@code >}
     *
     */
    public JAXBElement<QCCBillingAccountDetails> getQCCBillingAcctDetails() {
        return qccBillingAcctDetails;
    }

    /**
     * Sets the value of the qccBillingAcctDetails property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link QCCBillingAccountDetails }{@code >}
     *
     */
    public void setQCCBillingAcctDetails(JAXBElement<QCCBillingAccountDetails> value) {
        this.qccBillingAcctDetails = value;
    }

}
