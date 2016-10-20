
package java.com_qwest_qcsetup_webservice_csuporder;

import java.com_qwest_qcsetup.Address;
import java.com_qwest_qcsetup.InvoiceOptions;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BillingAccount complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BillingAccount">
 *   &lt;complexContent>
 *     &lt;extension base="{java:com.qwest.qcsetup.webservice.csupOrder.bo}BaseView">
 *       &lt;sequence>
 *         &lt;element name="SIC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="accountAddress" type="{java:com.qwest.qcsetup.bo}Address"/>
 *         &lt;element name="accountContact" type="{java:com.qwest.qcsetup.webservice.csupOrder.bo}Contact"/>
 *         &lt;element name="accountingMethodCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billingAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="billingAddress" type="{java:com.qwest.qcsetup.bo}Address"/>
 *         &lt;element name="billingContact" type="{java:com.qwest.qcsetup.webservice.csupOrder.bo}Contact"/>
 *         &lt;element name="billingCycle" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="billingEntityCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="calnetAccount" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="calnetBillingCycleCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="calnetCustomerCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="calnetCustomerFullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerAccountEstablishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="customerActiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="customerType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="discountGroup" type="{java:com.qwest.qcsetup.webservice.csupOrder.bo}DiscountGroup"/>
 *         &lt;element name="invoiceOption" type="{java:com.qwest.qcsetup.bo}InvoiceOptions"/>
 *         &lt;element name="paymentMethodCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="productAccounts" type="{java:com.qwest.qcsetup.webservice.csupOrder.bo}ArrayOfProductAccount"/>
 *         &lt;element name="requestedBillingCycle" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="welcomeKitFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingAccount", propOrder = {
    "sic",
    "accountAddress",
    "accountContact",
    "accountingMethodCode",
    "billingAccountName",
    "billingAddress",
    "billingContact",
    "billingCycle",
    "billingEntityCode",
    "calnetAccount",
    "calnetBillingCycleCode",
    "calnetCustomerCode",
    "calnetCustomerFullName",
    "customerAccountEstablishDate",
    "customerActiveFlag",
    "customerType",
    "discountGroup",
    "invoiceOption",
    "paymentMethodCode",
    "productAccounts",
    "requestedBillingCycle",
    "welcomeKitFlag"
})
public class BillingAccount
    extends BaseView
{

    @XmlElement(name = "SIC", required = true, nillable = true)
    protected String sic;
    @XmlElement(required = true, nillable = true)
    protected Address accountAddress;
    @XmlElement(required = true, nillable = true)
    protected Contact accountContact;
    @XmlElement(required = true, nillable = true)
    protected String accountingMethodCode;
    @XmlElement(required = true, nillable = true)
    protected String billingAccountName;
    @XmlElement(required = true, nillable = true)
    protected Address billingAddress;
    @XmlElement(required = true, nillable = true)
    protected Contact billingContact;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long billingCycle;
    @XmlElement(required = true, nillable = true)
    protected String billingEntityCode;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean calnetAccount;
    @XmlElement(required = true, nillable = true)
    protected String calnetBillingCycleCode;
    @XmlElement(required = true, nillable = true)
    protected String calnetCustomerCode;
    @XmlElement(required = true, nillable = true)
    protected String calnetCustomerFullName;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customerAccountEstablishDate;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean customerActiveFlag;
    @XmlElement(required = true, nillable = true)
    protected String customerType;
    @XmlElement(required = true, nillable = true)
    protected DiscountGroup discountGroup;
    @XmlElement(required = true, nillable = true)
    protected InvoiceOptions invoiceOption;
    @XmlElement(required = true, nillable = true)
    protected String paymentMethodCode;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfProductAccount productAccounts;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long requestedBillingCycle;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean welcomeKitFlag;

    /**
     * Gets the value of the sic property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSIC() {
        return sic;
    }

    /**
     * Sets the value of the sic property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSIC(String value) {
        this.sic = value;
    }

    /**
     * Gets the value of the accountAddress property.
     *
     * @return
     *     possible object is
     *     {@link Address }
     *
     */
    public Address getAccountAddress() {
        return accountAddress;
    }

    /**
     * Sets the value of the accountAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link Address }
     *
     */
    public void setAccountAddress(Address value) {
        this.accountAddress = value;
    }

    /**
     * Gets the value of the accountContact property.
     *
     * @return
     *     possible object is
     *     {@link Contact }
     *
     */
    public Contact getAccountContact() {
        return accountContact;
    }

    /**
     * Sets the value of the accountContact property.
     *
     * @param value
     *     allowed object is
     *     {@link Contact }
     *
     */
    public void setAccountContact(Contact value) {
        this.accountContact = value;
    }

    /**
     * Gets the value of the accountingMethodCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAccountingMethodCode() {
        return accountingMethodCode;
    }

    /**
     * Sets the value of the accountingMethodCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAccountingMethodCode(String value) {
        this.accountingMethodCode = value;
    }

    /**
     * Gets the value of the billingAccountName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBillingAccountName() {
        return billingAccountName;
    }

    /**
     * Sets the value of the billingAccountName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBillingAccountName(String value) {
        this.billingAccountName = value;
    }

    /**
     * Gets the value of the billingAddress property.
     *
     * @return
     *     possible object is
     *     {@link Address }
     *
     */
    public Address getBillingAddress() {
        return billingAddress;
    }

    /**
     * Sets the value of the billingAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link Address }
     *
     */
    public void setBillingAddress(Address value) {
        this.billingAddress = value;
    }

    /**
     * Gets the value of the billingContact property.
     *
     * @return
     *     possible object is
     *     {@link Contact }
     *
     */
    public Contact getBillingContact() {
        return billingContact;
    }

    /**
     * Sets the value of the billingContact property.
     *
     * @param value
     *     allowed object is
     *     {@link Contact }
     *
     */
    public void setBillingContact(Contact value) {
        this.billingContact = value;
    }

    /**
     * Gets the value of the billingCycle property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getBillingCycle() {
        return billingCycle;
    }

    /**
     * Sets the value of the billingCycle property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setBillingCycle(Long value) {
        this.billingCycle = value;
    }

    /**
     * Gets the value of the billingEntityCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getBillingEntityCode() {
        return billingEntityCode;
    }

    /**
     * Sets the value of the billingEntityCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setBillingEntityCode(String value) {
        this.billingEntityCode = value;
    }

    /**
     * Gets the value of the calnetAccount property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isCalnetAccount() {
        return calnetAccount;
    }

    /**
     * Sets the value of the calnetAccount property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setCalnetAccount(Boolean value) {
        this.calnetAccount = value;
    }

    /**
     * Gets the value of the calnetBillingCycleCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCalnetBillingCycleCode() {
        return calnetBillingCycleCode;
    }

    /**
     * Sets the value of the calnetBillingCycleCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCalnetBillingCycleCode(String value) {
        this.calnetBillingCycleCode = value;
    }

    /**
     * Gets the value of the calnetCustomerCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCalnetCustomerCode() {
        return calnetCustomerCode;
    }

    /**
     * Sets the value of the calnetCustomerCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCalnetCustomerCode(String value) {
        this.calnetCustomerCode = value;
    }

    /**
     * Gets the value of the calnetCustomerFullName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCalnetCustomerFullName() {
        return calnetCustomerFullName;
    }

    /**
     * Sets the value of the calnetCustomerFullName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCalnetCustomerFullName(String value) {
        this.calnetCustomerFullName = value;
    }

    /**
     * Gets the value of the customerAccountEstablishDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCustomerAccountEstablishDate() {
        return customerAccountEstablishDate;
    }

    /**
     * Sets the value of the customerAccountEstablishDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public void setCustomerAccountEstablishDate(XMLGregorianCalendar value) {
        this.customerAccountEstablishDate = value;
    }

    /**
     * Gets the value of the customerActiveFlag property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isCustomerActiveFlag() {
        return customerActiveFlag;
    }

    /**
     * Sets the value of the customerActiveFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setCustomerActiveFlag(Boolean value) {
        this.customerActiveFlag = value;
    }

    /**
     * Gets the value of the customerType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCustomerType() {
        return customerType;
    }

    /**
     * Sets the value of the customerType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCustomerType(String value) {
        this.customerType = value;
    }

    /**
     * Gets the value of the discountGroup property.
     *
     * @return
     *     possible object is
     *     {@link DiscountGroup }
     *
     */
    public DiscountGroup getDiscountGroup() {
        return discountGroup;
    }

    /**
     * Sets the value of the discountGroup property.
     *
     * @param value
     *     allowed object is
     *     {@link DiscountGroup }
     *
     */
    public void setDiscountGroup(DiscountGroup value) {
        this.discountGroup = value;
    }

    /**
     * Gets the value of the invoiceOption property.
     *
     * @return
     *     possible object is
     *     {@link InvoiceOptions }
     *
     */
    public InvoiceOptions getInvoiceOption() {
        return invoiceOption;
    }

    /**
     * Sets the value of the invoiceOption property.
     *
     * @param value
     *     allowed object is
     *     {@link InvoiceOptions }
     *
     */
    public void setInvoiceOption(InvoiceOptions value) {
        this.invoiceOption = value;
    }

    /**
     * Gets the value of the paymentMethodCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPaymentMethodCode() {
        return paymentMethodCode;
    }

    /**
     * Sets the value of the paymentMethodCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPaymentMethodCode(String value) {
        this.paymentMethodCode = value;
    }

    /**
     * Gets the value of the productAccounts property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfProductAccount }
     *
     */
    public ArrayOfProductAccount getProductAccounts() {
        return productAccounts;
    }

    /**
     * Sets the value of the productAccounts property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfProductAccount }
     *
     */
    public void setProductAccounts(ArrayOfProductAccount value) {
        this.productAccounts = value;
    }

    /**
     * Gets the value of the requestedBillingCycle property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getRequestedBillingCycle() {
        return requestedBillingCycle;
    }

    /**
     * Sets the value of the requestedBillingCycle property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setRequestedBillingCycle(Long value) {
        this.requestedBillingCycle = value;
    }

    /**
     * Gets the value of the welcomeKitFlag property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isWelcomeKitFlag() {
        return welcomeKitFlag;
    }

    /**
     * Sets the value of the welcomeKitFlag property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setWelcomeKitFlag(Boolean value) {
        this.welcomeKitFlag = value;
    }

}
