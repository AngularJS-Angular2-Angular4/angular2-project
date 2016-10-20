
package java.com_qwest_qcsetup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceOptions complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceOptions">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GFExclusion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="LATASummary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NPASortOrder" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PACNameOption" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PACSummary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accessLineCharge" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="areaCodeSummary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerAccountId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="highCallVolume" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="highCallVolumeThreshold" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceGroupId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="invoiceGroupOwnerFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="longDuration" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="longDurationCallsThresholds" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="longDurationCallsThresholdsThreshold" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="noOfInvoiceCopies" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="oneCardPerSheet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="onePACPerSheet" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="printCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="printOrientation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="reportIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ringToLevel" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceDetail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="serviceSummary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="stateSummary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="topCity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="topCityThreshold" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="totalUsage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="twelveMonthReviewOfSpending" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="unansweredCall" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usageSummary" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="usageSuppression" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="yourAccountBalance" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceOptions", propOrder = {
    "gfExclusion",
    "lataSummary",
    "npaSortOrder",
    "pacNameOption",
    "pacSummary",
    "accessLineCharge",
    "areaCodeSummary",
    "currency",
    "customerAccountId",
    "highCallVolume",
    "highCallVolumeThreshold",
    "invoiceGroupId",
    "invoiceGroupOwnerFlag",
    "longDuration",
    "longDurationCallsThresholds",
    "longDurationCallsThresholdsThreshold",
    "noOfInvoiceCopies",
    "oneCardPerSheet",
    "onePACPerSheet",
    "orderId",
    "printCode",
    "printOrientation",
    "reportIndex",
    "ringToLevel",
    "serviceDetail",
    "serviceSummary",
    "stateSummary",
    "topCity",
    "topCityThreshold",
    "totalUsage",
    "twelveMonthReviewOfSpending",
    "unansweredCall",
    "usageSummary",
    "usageSuppression",
    "yourAccountBalance"
})
public class InvoiceOptions {

    @XmlElement(name = "GFExclusion", required = true, nillable = true)
    protected String gfExclusion;
    @XmlElement(name = "LATASummary", required = true, nillable = true)
    protected String lataSummary;
    @XmlElement(name = "NPASortOrder", required = true, nillable = true)
    protected String npaSortOrder;
    @XmlElement(name = "PACNameOption", required = true, nillable = true)
    protected String pacNameOption;
    @XmlElement(name = "PACSummary", required = true, nillable = true)
    protected String pacSummary;
    @XmlElement(required = true, nillable = true)
    protected String accessLineCharge;
    @XmlElement(required = true, nillable = true)
    protected String areaCodeSummary;
    @XmlElement(required = true, nillable = true)
    protected String currency;
    @XmlElement(required = true, nillable = true)
    protected String customerAccountId;
    @XmlElement(required = true, nillable = true)
    protected String highCallVolume;
    @XmlElement(required = true, nillable = true)
    protected String highCallVolumeThreshold;
    @XmlElement(required = true, nillable = true)
    protected String invoiceGroupId;
    protected boolean invoiceGroupOwnerFlag;
    @XmlElement(required = true, nillable = true)
    protected String longDuration;
    @XmlElement(required = true, nillable = true)
    protected String longDurationCallsThresholds;
    @XmlElement(required = true, nillable = true)
    protected String longDurationCallsThresholdsThreshold;
    @XmlElement(required = true, nillable = true)
    protected String noOfInvoiceCopies;
    @XmlElement(required = true, nillable = true)
    protected String oneCardPerSheet;
    @XmlElement(required = true, nillable = true)
    protected String onePACPerSheet;
    @XmlElement(required = true, nillable = true)
    protected String orderId;
    @XmlElement(required = true, nillable = true)
    protected String printCode;
    @XmlElement(required = true, nillable = true)
    protected String printOrientation;
    @XmlElement(required = true, nillable = true)
    protected String reportIndex;
    @XmlElement(required = true, nillable = true)
    protected String ringToLevel;
    @XmlElement(required = true, nillable = true)
    protected String serviceDetail;
    @XmlElement(required = true, nillable = true)
    protected String serviceSummary;
    @XmlElement(required = true, nillable = true)
    protected String stateSummary;
    @XmlElement(required = true, nillable = true)
    protected String topCity;
    @XmlElement(required = true, nillable = true)
    protected String topCityThreshold;
    @XmlElement(required = true, nillable = true)
    protected String totalUsage;
    @XmlElement(required = true, nillable = true)
    protected String twelveMonthReviewOfSpending;
    @XmlElement(required = true, nillable = true)
    protected String unansweredCall;
    @XmlElement(required = true, nillable = true)
    protected String usageSummary;
    @XmlElement(required = true, nillable = true)
    protected String usageSuppression;
    @XmlElement(required = true, nillable = true)
    protected String yourAccountBalance;

    /**
     * Gets the value of the gfExclusion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGFExclusion() {
        return gfExclusion;
    }

    /**
     * Sets the value of the gfExclusion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGFExclusion(String value) {
        this.gfExclusion = value;
    }

    /**
     * Gets the value of the lataSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLATASummary() {
        return lataSummary;
    }

    /**
     * Sets the value of the lataSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLATASummary(String value) {
        this.lataSummary = value;
    }

    /**
     * Gets the value of the npaSortOrder property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPASortOrder() {
        return npaSortOrder;
    }

    /**
     * Sets the value of the npaSortOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPASortOrder(String value) {
        this.npaSortOrder = value;
    }

    /**
     * Gets the value of the pacNameOption property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACNameOption() {
        return pacNameOption;
    }

    /**
     * Sets the value of the pacNameOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACNameOption(String value) {
        this.pacNameOption = value;
    }

    /**
     * Gets the value of the pacSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPACSummary() {
        return pacSummary;
    }

    /**
     * Sets the value of the pacSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPACSummary(String value) {
        this.pacSummary = value;
    }

    /**
     * Gets the value of the accessLineCharge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccessLineCharge() {
        return accessLineCharge;
    }

    /**
     * Sets the value of the accessLineCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccessLineCharge(String value) {
        this.accessLineCharge = value;
    }

    /**
     * Gets the value of the areaCodeSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaCodeSummary() {
        return areaCodeSummary;
    }

    /**
     * Sets the value of the areaCodeSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaCodeSummary(String value) {
        this.areaCodeSummary = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
    }

    /**
     * Gets the value of the customerAccountId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerAccountId() {
        return customerAccountId;
    }

    /**
     * Sets the value of the customerAccountId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerAccountId(String value) {
        this.customerAccountId = value;
    }

    /**
     * Gets the value of the highCallVolume property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighCallVolume() {
        return highCallVolume;
    }

    /**
     * Sets the value of the highCallVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighCallVolume(String value) {
        this.highCallVolume = value;
    }

    /**
     * Gets the value of the highCallVolumeThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHighCallVolumeThreshold() {
        return highCallVolumeThreshold;
    }

    /**
     * Sets the value of the highCallVolumeThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHighCallVolumeThreshold(String value) {
        this.highCallVolumeThreshold = value;
    }

    /**
     * Gets the value of the invoiceGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceGroupId() {
        return invoiceGroupId;
    }

    /**
     * Sets the value of the invoiceGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceGroupId(String value) {
        this.invoiceGroupId = value;
    }

    /**
     * Gets the value of the invoiceGroupOwnerFlag property.
     * 
     */
    public boolean isInvoiceGroupOwnerFlag() {
        return invoiceGroupOwnerFlag;
    }

    /**
     * Sets the value of the invoiceGroupOwnerFlag property.
     * 
     */
    public void setInvoiceGroupOwnerFlag(boolean value) {
        this.invoiceGroupOwnerFlag = value;
    }

    /**
     * Gets the value of the longDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDuration() {
        return longDuration;
    }

    /**
     * Sets the value of the longDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDuration(String value) {
        this.longDuration = value;
    }

    /**
     * Gets the value of the longDurationCallsThresholds property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDurationCallsThresholds() {
        return longDurationCallsThresholds;
    }

    /**
     * Sets the value of the longDurationCallsThresholds property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDurationCallsThresholds(String value) {
        this.longDurationCallsThresholds = value;
    }

    /**
     * Gets the value of the longDurationCallsThresholdsThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongDurationCallsThresholdsThreshold() {
        return longDurationCallsThresholdsThreshold;
    }

    /**
     * Sets the value of the longDurationCallsThresholdsThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongDurationCallsThresholdsThreshold(String value) {
        this.longDurationCallsThresholdsThreshold = value;
    }

    /**
     * Gets the value of the noOfInvoiceCopies property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoOfInvoiceCopies() {
        return noOfInvoiceCopies;
    }

    /**
     * Sets the value of the noOfInvoiceCopies property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoOfInvoiceCopies(String value) {
        this.noOfInvoiceCopies = value;
    }

    /**
     * Gets the value of the oneCardPerSheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOneCardPerSheet() {
        return oneCardPerSheet;
    }

    /**
     * Sets the value of the oneCardPerSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOneCardPerSheet(String value) {
        this.oneCardPerSheet = value;
    }

    /**
     * Gets the value of the onePACPerSheet property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOnePACPerSheet() {
        return onePACPerSheet;
    }

    /**
     * Sets the value of the onePACPerSheet property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOnePACPerSheet(String value) {
        this.onePACPerSheet = value;
    }

    /**
     * Gets the value of the orderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderId(String value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the printCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintCode() {
        return printCode;
    }

    /**
     * Sets the value of the printCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintCode(String value) {
        this.printCode = value;
    }

    /**
     * Gets the value of the printOrientation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrintOrientation() {
        return printOrientation;
    }

    /**
     * Sets the value of the printOrientation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrintOrientation(String value) {
        this.printOrientation = value;
    }

    /**
     * Gets the value of the reportIndex property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportIndex() {
        return reportIndex;
    }

    /**
     * Sets the value of the reportIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportIndex(String value) {
        this.reportIndex = value;
    }

    /**
     * Gets the value of the ringToLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingToLevel() {
        return ringToLevel;
    }

    /**
     * Sets the value of the ringToLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingToLevel(String value) {
        this.ringToLevel = value;
    }

    /**
     * Gets the value of the serviceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceDetail() {
        return serviceDetail;
    }

    /**
     * Sets the value of the serviceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceDetail(String value) {
        this.serviceDetail = value;
    }

    /**
     * Gets the value of the serviceSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceSummary() {
        return serviceSummary;
    }

    /**
     * Sets the value of the serviceSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceSummary(String value) {
        this.serviceSummary = value;
    }

    /**
     * Gets the value of the stateSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateSummary() {
        return stateSummary;
    }

    /**
     * Sets the value of the stateSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateSummary(String value) {
        this.stateSummary = value;
    }

    /**
     * Gets the value of the topCity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopCity() {
        return topCity;
    }

    /**
     * Sets the value of the topCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopCity(String value) {
        this.topCity = value;
    }

    /**
     * Gets the value of the topCityThreshold property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTopCityThreshold() {
        return topCityThreshold;
    }

    /**
     * Sets the value of the topCityThreshold property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTopCityThreshold(String value) {
        this.topCityThreshold = value;
    }

    /**
     * Gets the value of the totalUsage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalUsage() {
        return totalUsage;
    }

    /**
     * Sets the value of the totalUsage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalUsage(String value) {
        this.totalUsage = value;
    }

    /**
     * Gets the value of the twelveMonthReviewOfSpending property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTwelveMonthReviewOfSpending() {
        return twelveMonthReviewOfSpending;
    }

    /**
     * Sets the value of the twelveMonthReviewOfSpending property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTwelveMonthReviewOfSpending(String value) {
        this.twelveMonthReviewOfSpending = value;
    }

    /**
     * Gets the value of the unansweredCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnansweredCall() {
        return unansweredCall;
    }

    /**
     * Sets the value of the unansweredCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnansweredCall(String value) {
        this.unansweredCall = value;
    }

    /**
     * Gets the value of the usageSummary property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageSummary() {
        return usageSummary;
    }

    /**
     * Sets the value of the usageSummary property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageSummary(String value) {
        this.usageSummary = value;
    }

    /**
     * Gets the value of the usageSuppression property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsageSuppression() {
        return usageSuppression;
    }

    /**
     * Sets the value of the usageSuppression property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsageSuppression(String value) {
        this.usageSuppression = value;
    }

    /**
     * Gets the value of the yourAccountBalance property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYourAccountBalance() {
        return yourAccountBalance;
    }

    /**
     * Sets the value of the yourAccountBalance property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYourAccountBalance(String value) {
        this.yourAccountBalance = value;
    }

}
