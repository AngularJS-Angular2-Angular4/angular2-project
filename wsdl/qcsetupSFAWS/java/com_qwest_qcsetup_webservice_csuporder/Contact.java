
package java.com_qwest_qcsetup_webservice_csuporder;

import java.com_qwest_qcsetup.TN;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Contact complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Contact">
 *   &lt;complexContent>
 *     &lt;extension base="{java:com.qwest.qcsetup.webservice.csupOrder.bo}BaseView">
 *       &lt;sequence>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fax" type="{java:com.qwest.qcsetup.bo}TN"/>
 *         &lt;element name="faxIDDCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="iddFaxNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iddPagerNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iddPhoneNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iddPhoneNumberExtn" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pager" type="{java:com.qwest.qcsetup.bo}TN"/>
 *         &lt;element name="pagerIDDCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pagerPin" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phone" type="{java:com.qwest.qcsetup.bo}TN"/>
 *         &lt;element name="phoneExtension" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="phoneIDDCd" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Contact", propOrder = {
    "country",
    "email",
    "fax",
    "faxIDDCd",
    "iddFaxNumber",
    "iddPagerNumber",
    "iddPhoneNumber",
    "iddPhoneNumberExtn",
    "name",
    "pager",
    "pagerIDDCd",
    "pagerPin",
    "phone",
    "phoneExtension",
    "phoneIDDCd"
})
public class Contact
    extends BaseView
{

    @XmlElement(required = true, nillable = true)
    protected String country;
    @XmlElement(required = true, nillable = true)
    protected String email;
    @XmlElement(required = true, nillable = true)
    protected TN fax;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer faxIDDCd;
    @XmlElement(required = true, nillable = true)
    protected String iddFaxNumber;
    @XmlElement(required = true, nillable = true)
    protected String iddPagerNumber;
    @XmlElement(required = true, nillable = true)
    protected String iddPhoneNumber;
    @XmlElement(required = true, nillable = true)
    protected String iddPhoneNumberExtn;
    @XmlElement(required = true, nillable = true)
    protected String name;
    @XmlElement(required = true, nillable = true)
    protected TN pager;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer pagerIDDCd;
    @XmlElement(required = true, nillable = true)
    protected String pagerPin;
    @XmlElement(required = true, nillable = true)
    protected TN phone;
    @XmlElement(required = true, nillable = true)
    protected String phoneExtension;
    @XmlElement(required = true, type = Integer.class, nillable = true)
    protected Integer phoneIDDCd;

    /**
     * Gets the value of the country property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the fax property.
     * 
     * @return
     *     possible object is
     *     {@link TN }
     *     
     */
    public TN getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     * 
     * @param value
     *     allowed object is
     *     {@link TN }
     *     
     */
    public void setFax(TN value) {
        this.fax = value;
    }

    /**
     * Gets the value of the faxIDDCd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getFaxIDDCd() {
        return faxIDDCd;
    }

    /**
     * Sets the value of the faxIDDCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setFaxIDDCd(Integer value) {
        this.faxIDDCd = value;
    }

    /**
     * Gets the value of the iddFaxNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIddFaxNumber() {
        return iddFaxNumber;
    }

    /**
     * Sets the value of the iddFaxNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIddFaxNumber(String value) {
        this.iddFaxNumber = value;
    }

    /**
     * Gets the value of the iddPagerNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIddPagerNumber() {
        return iddPagerNumber;
    }

    /**
     * Sets the value of the iddPagerNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIddPagerNumber(String value) {
        this.iddPagerNumber = value;
    }

    /**
     * Gets the value of the iddPhoneNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIddPhoneNumber() {
        return iddPhoneNumber;
    }

    /**
     * Sets the value of the iddPhoneNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIddPhoneNumber(String value) {
        this.iddPhoneNumber = value;
    }

    /**
     * Gets the value of the iddPhoneNumberExtn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIddPhoneNumberExtn() {
        return iddPhoneNumberExtn;
    }

    /**
     * Sets the value of the iddPhoneNumberExtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIddPhoneNumberExtn(String value) {
        this.iddPhoneNumberExtn = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the pager property.
     * 
     * @return
     *     possible object is
     *     {@link TN }
     *     
     */
    public TN getPager() {
        return pager;
    }

    /**
     * Sets the value of the pager property.
     * 
     * @param value
     *     allowed object is
     *     {@link TN }
     *     
     */
    public void setPager(TN value) {
        this.pager = value;
    }

    /**
     * Gets the value of the pagerIDDCd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPagerIDDCd() {
        return pagerIDDCd;
    }

    /**
     * Sets the value of the pagerIDDCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPagerIDDCd(Integer value) {
        this.pagerIDDCd = value;
    }

    /**
     * Gets the value of the pagerPin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPagerPin() {
        return pagerPin;
    }

    /**
     * Sets the value of the pagerPin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPagerPin(String value) {
        this.pagerPin = value;
    }

    /**
     * Gets the value of the phone property.
     * 
     * @return
     *     possible object is
     *     {@link TN }
     *     
     */
    public TN getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     * 
     * @param value
     *     allowed object is
     *     {@link TN }
     *     
     */
    public void setPhone(TN value) {
        this.phone = value;
    }

    /**
     * Gets the value of the phoneExtension property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneExtension() {
        return phoneExtension;
    }

    /**
     * Sets the value of the phoneExtension property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneExtension(String value) {
        this.phoneExtension = value;
    }

    /**
     * Gets the value of the phoneIDDCd property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getPhoneIDDCd() {
        return phoneIDDCd;
    }

    /**
     * Sets the value of the phoneIDDCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setPhoneIDDCd(Integer value) {
        this.phoneIDDCd = value;
    }

}
