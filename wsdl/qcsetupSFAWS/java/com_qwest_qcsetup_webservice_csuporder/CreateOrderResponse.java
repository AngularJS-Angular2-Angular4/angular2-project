
package java.com_qwest_qcsetup_webservice_csuporder;

import java.language_builtins.ArrayOfString;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for CreateOrderResponse complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CreateOrderResponse">
 *   &lt;complexContent>
 *     &lt;extension base="{java:com.qwest.qcsetup.webservice.csupOrder.bo}BaseView">
 *       &lt;sequence>
 *         &lt;element name="billingAccounts" type="{java:language_builtins.lang}ArrayOfString"/>
 *         &lt;element name="customerAccountEstablishDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="customerActiveFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="orionOrderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="responseMessages" type="{java:com.qwest.qcsetup.webservice.csupOrder.bo}ArrayOfResponseMessage"/>
 *         &lt;element name="statusCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taskId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="userDefinedAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateOrderResponse", propOrder = {
    "billingAccounts",
    "customerAccountEstablishDate",
    "customerActiveFlag",
    "description",
    "orderId",
    "orionOrderId",
    "responseMessages",
    "statusCode",
    "taskId",
    "userDefinedAccountName"
})
public class CreateOrderResponse
    extends BaseView
{

    @XmlElement(required = true, nillable = true)
    protected ArrayOfString billingAccounts;
    @XmlElement(required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar customerAccountEstablishDate;
    protected boolean customerActiveFlag;
    @XmlElement(required = true, nillable = true)
    protected String description;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long orderId;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long orionOrderId;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfResponseMessage responseMessages;
    @XmlElement(required = true, nillable = true)
    protected String statusCode;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long taskId;
    @XmlElement(required = true, nillable = true)
    protected String userDefinedAccountName;

    /**
     * Gets the value of the billingAccounts property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *
     */
    public ArrayOfString getBillingAccounts() {
        return billingAccounts;
    }

    /**
     * Sets the value of the billingAccounts property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *
     */
    public void setBillingAccounts(ArrayOfString value) {
        this.billingAccounts = value;
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
     */
    public boolean isCustomerActiveFlag() {
        return customerActiveFlag;
    }

    /**
     * Sets the value of the customerActiveFlag property.
     *
     */
    public void setCustomerActiveFlag(boolean value) {
        this.customerActiveFlag = value;
    }

    /**
     * Gets the value of the description property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the orderId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setOrderId(Long value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the orionOrderId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getOrionOrderId() {
        return orionOrderId;
    }

    /**
     * Sets the value of the orionOrderId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setOrionOrderId(Long value) {
        this.orionOrderId = value;
    }

    /**
     * Gets the value of the responseMessages property.
     *
     * @return
     *     possible object is
     *     {@link ArrayOfResponseMessage }
     *
     */
    public ArrayOfResponseMessage getResponseMessages() {
        return responseMessages;
    }

    /**
     * Sets the value of the responseMessages property.
     *
     * @param value
     *     allowed object is
     *     {@link ArrayOfResponseMessage }
     *
     */
    public void setResponseMessages(ArrayOfResponseMessage value) {
        this.responseMessages = value;
    }

    /**
     * Gets the value of the statusCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setStatusCode(String value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the taskId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * Sets the value of the taskId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setTaskId(Long value) {
        this.taskId = value;
    }

    /**
     * Gets the value of the userDefinedAccountName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserDefinedAccountName() {
        return userDefinedAccountName;
    }

    /**
     * Sets the value of the userDefinedAccountName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserDefinedAccountName(String value) {
        this.userDefinedAccountName = value;
    }

}
