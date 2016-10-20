
package java.com_qwest_qcsetup_webservice_csuporder;

import java.com_qwest_qcsetup.Address;
import java.com_qwest_qcsetup.TN;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CreateOrderRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CreateOrderRequest">
 *   &lt;complexContent>
 *     &lt;extension base="{java:com.qwest.qcsetup.webservice.csupOrder.bo}BaseView">
 *       &lt;sequence>
 *         &lt;element name="billingAccounts" type="{java:com.qwest.qcsetup.webservice.csupOrder.bo}ArrayOfBillingAccount"/>
 *         &lt;element name="btn" type="{java:com.qwest.qcsetup.bo}TN"/>
 *         &lt;element name="businessProcessType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="contractInfo" type="{java:com.qwest.qcsetup.webservice.csupOrder.bo}ContractInformation"/>
 *         &lt;element name="cuid" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerAddress" type="{java:com.qwest.qcsetup.bo}Address"/>
 *         &lt;element name="customerHubId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="existingCustomer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="mainFax" type="{java:com.qwest.qcsetup.bo}TN"/>
 *         &lt;element name="opportunityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="orderInitiatorName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="processType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="projectId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="qcid" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="salesChannelId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salesInformation" type="{java:com.qwest.qcsetup.webservice.csupOrder.bo}SalesInformation"/>
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOrderRequest", propOrder = {
    "billingAccounts",
    "btn",
    "businessProcessType",
    "contractInfo",
    "cuid",
    "customerAddress",
    "customerHubId",
    "customerName",
    "existingCustomer",
    "mainFax",
    "opportunityId",
    "orderInitiatorName",
    "processType",
    "projectId",
    "qcid",
    "salesChannelId",
    "salesInformation",
    "taskId"
})
public class CreateOrderRequest
    extends BaseView
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfBillingAccount billingAccounts;
    @XmlElement(required = true, nillable = true)
    protected TN btn;
    @XmlElement(required = true, nillable = true)
    protected String businessProcessType;
    @XmlElement(required = true, nillable = true)
    protected ContractInformation contractInfo;
    @XmlElement(required = true, nillable = true)
    protected String cuid;
    @XmlElement(required = true, nillable = true)
    protected Address customerAddress;
    @XmlElement(required = true, nillable = true)
    protected String customerHubId;
    @XmlElement(required = true, nillable = true)
    protected String customerName;
    @XmlElement(required = true, nillable = true)
    protected String existingCustomer;
    @XmlElement(required = true, nillable = true)
    protected TN mainFax;
    protected long opportunityId;
    @XmlElement(required = true, nillable = true)
    protected String orderInitiatorName;
    @XmlElement(required = true, nillable = true)
    protected String processType;
    protected long projectId;
    protected long qcid;
    @XmlElement(required = true, nillable = true)
    protected String salesChannelId;
    @XmlElement(required = true, nillable = true)
    protected SalesInformation salesInformation;
    protected long taskId;

    /**
     * Gets the value of the billingAccounts property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBillingAccount }
     *     
     */
    public ArrayOfBillingAccount getBillingAccounts() {
        return billingAccounts;
    }

    /**
     * Sets the value of the billingAccounts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBillingAccount }
     *     
     */
    public void setBillingAccounts(ArrayOfBillingAccount value) {
        this.billingAccounts = value;
    }

    /**
     * Gets the value of the btn property.
     * 
     * @return
     *     possible object is
     *     {@link TN }
     *     
     */
    public TN getBtn() {
        return btn;
    }

    /**
     * Sets the value of the btn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TN }
     *     
     */
    public void setBtn(TN value) {
        this.btn = value;
    }

    /**
     * Gets the value of the businessProcessType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessProcessType() {
        return businessProcessType;
    }

    /**
     * Sets the value of the businessProcessType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessProcessType(String value) {
        this.businessProcessType = value;
    }

    /**
     * Gets the value of the contractInfo property.
     * 
     * @return
     *     possible object is
     *     {@link ContractInformation }
     *     
     */
    public ContractInformation getContractInfo() {
        return contractInfo;
    }

    /**
     * Sets the value of the contractInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractInformation }
     *     
     */
    public void setContractInfo(ContractInformation value) {
        this.contractInfo = value;
    }

    /**
     * Gets the value of the cuid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuid() {
        return cuid;
    }

    /**
     * Sets the value of the cuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuid(String value) {
        this.cuid = value;
    }

    /**
     * Gets the value of the customerAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getCustomerAddress() {
        return customerAddress;
    }

    /**
     * Sets the value of the customerAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setCustomerAddress(Address value) {
        this.customerAddress = value;
    }

    /**
     * Gets the value of the customerHubId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerHubId() {
        return customerHubId;
    }

    /**
     * Sets the value of the customerHubId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerHubId(String value) {
        this.customerHubId = value;
    }

    /**
     * Gets the value of the customerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * Sets the value of the customerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerName(String value) {
        this.customerName = value;
    }

    /**
     * Gets the value of the existingCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistingCustomer() {
        return existingCustomer;
    }

    /**
     * Sets the value of the existingCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistingCustomer(String value) {
        this.existingCustomer = value;
    }

    /**
     * Gets the value of the mainFax property.
     * 
     * @return
     *     possible object is
     *     {@link TN }
     *     
     */
    public TN getMainFax() {
        return mainFax;
    }

    /**
     * Sets the value of the mainFax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TN }
     *     
     */
    public void setMainFax(TN value) {
        this.mainFax = value;
    }

    /**
     * Gets the value of the opportunityId property.
     * 
     */
    public long getOpportunityId() {
        return opportunityId;
    }

    /**
     * Sets the value of the opportunityId property.
     * 
     */
    public void setOpportunityId(long value) {
        this.opportunityId = value;
    }

    /**
     * Gets the value of the orderInitiatorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderInitiatorName() {
        return orderInitiatorName;
    }

    /**
     * Sets the value of the orderInitiatorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderInitiatorName(String value) {
        this.orderInitiatorName = value;
    }

    /**
     * Gets the value of the processType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessType() {
        return processType;
    }

    /**
     * Sets the value of the processType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessType(String value) {
        this.processType = value;
    }

    /**
     * Gets the value of the projectId property.
     * 
     */
    public long getProjectId() {
        return projectId;
    }

    /**
     * Sets the value of the projectId property.
     * 
     */
    public void setProjectId(long value) {
        this.projectId = value;
    }

    /**
     * Gets the value of the qcid property.
     * 
     */
    public long getQcid() {
        return qcid;
    }

    /**
     * Sets the value of the qcid property.
     * 
     */
    public void setQcid(long value) {
        this.qcid = value;
    }

    /**
     * Gets the value of the salesChannelId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesChannelId() {
        return salesChannelId;
    }

    /**
     * Sets the value of the salesChannelId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesChannelId(String value) {
        this.salesChannelId = value;
    }

    /**
     * Gets the value of the salesInformation property.
     * 
     * @return
     *     possible object is
     *     {@link SalesInformation }
     *     
     */
    public SalesInformation getSalesInformation() {
        return salesInformation;
    }

    /**
     * Sets the value of the salesInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SalesInformation }
     *     
     */
    public void setSalesInformation(SalesInformation value) {
        this.salesInformation = value;
    }

    /**
     * Gets the value of the taskId property.
     * 
     */
    public long getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     * 
     */
    public void setTaskId(long value) {
        this.taskId = value;
    }

}
