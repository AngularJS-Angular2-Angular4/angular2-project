
package java.com_qwest_qcsetup_webservice_csuporder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DiscountGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DiscountGroup">
 *   &lt;complexContent>
 *     &lt;extension base="{java:com.qwest.qcsetup.webservice.csupOrder.bo}BaseView">
 *       &lt;sequence>
 *         &lt;element name="activeDiscountGroupFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="discountGroupId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="discountGroupName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="discountGroupOwnerFlag" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="discountGroupType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscountGroup", propOrder = {
    "activeDiscountGroupFlag",
    "discountGroupId",
    "discountGroupName",
    "discountGroupOwnerFlag",
    "discountGroupType"
})
public class DiscountGroup
    extends BaseView
{

    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean activeDiscountGroupFlag;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long discountGroupId;
    @XmlElement(required = true, nillable = true)
    protected String discountGroupName;
    @XmlElement(required = true, type = Boolean.class, nillable = true)
    protected Boolean discountGroupOwnerFlag;
    @XmlElement(required = true, nillable = true)
    protected String discountGroupType;

    /**
     * Gets the value of the activeDiscountGroupFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isActiveDiscountGroupFlag() {
        return activeDiscountGroupFlag;
    }

    /**
     * Sets the value of the activeDiscountGroupFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setActiveDiscountGroupFlag(Boolean value) {
        this.activeDiscountGroupFlag = value;
    }

    /**
     * Gets the value of the discountGroupId property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getDiscountGroupId() {
        return discountGroupId;
    }

    /**
     * Sets the value of the discountGroupId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setDiscountGroupId(Long value) {
        this.discountGroupId = value;
    }

    /**
     * Gets the value of the discountGroupName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountGroupName() {
        return discountGroupName;
    }

    /**
     * Sets the value of the discountGroupName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountGroupName(String value) {
        this.discountGroupName = value;
    }

    /**
     * Gets the value of the discountGroupOwnerFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDiscountGroupOwnerFlag() {
        return discountGroupOwnerFlag;
    }

    /**
     * Sets the value of the discountGroupOwnerFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDiscountGroupOwnerFlag(Boolean value) {
        this.discountGroupOwnerFlag = value;
    }

    /**
     * Gets the value of the discountGroupType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiscountGroupType() {
        return discountGroupType;
    }

    /**
     * Sets the value of the discountGroupType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiscountGroupType(String value) {
        this.discountGroupType = value;
    }

}
