
package java.com_qwest_qcsetup_webservice_csuporder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResponseMessage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseMessage">
 *   &lt;complexContent>
 *     &lt;extension base="{java:com.qwest.qcsetup.webservice.csupOrder.bo}BaseView">
 *       &lt;sequence>
 *         &lt;element name="messageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="messageDescription" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseMessage", propOrder = {
    "messageCode",
    "messageDescription"
})
public class ResponseMessage
    extends BaseView
{

    @XmlElement(required = true, nillable = true)
    protected String messageCode;
    @XmlElement(required = true, nillable = true)
    protected String messageDescription;

    /**
     * Gets the value of the messageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Sets the value of the messageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCode(String value) {
        this.messageCode = value;
    }

    /**
     * Gets the value of the messageDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageDescription() {
        return messageDescription;
    }

    /**
     * Sets the value of the messageDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageDescription(String value) {
        this.messageDescription = value;
    }

}
