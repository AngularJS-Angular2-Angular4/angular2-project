
package java.com_qwest_qcsetup_webservice_csuporder;

import java.com_qwest_qcsetup.Address;
import java.language_builtins.ArrayOfString;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProductAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductAccount">
 *   &lt;complexContent>
 *     &lt;extension base="{java:com.qwest.qcsetup.webservice.csupOrder.bo}BaseView">
 *       &lt;sequence>
 *         &lt;element name="contractInformation" type="{java:com.qwest.qcsetup.webservice.csupOrder.bo}ContractInformation"/>
 *         &lt;element name="offerManagementRequestIds" type="{java:language_builtins.lang}ArrayOfString"/>
 *         &lt;element name="productAccountAddress" type="{java:com.qwest.qcsetup.bo}Address"/>
 *         &lt;element name="productAccountContact" type="{java:com.qwest.qcsetup.webservice.csupOrder.bo}Contact"/>
 *         &lt;element name="productAccountName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="promoCodes" type="{java:language_builtins.lang}ArrayOfString"/>
 *         &lt;element name="sameAsAccountAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="sameAsBillingAddress" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductAccount", propOrder = {
    "contractInformation",
    "offerManagementRequestIds",
    "productAccountAddress",
    "productAccountContact",
    "productAccountName",
    "promoCodes",
    "sameAsAccountAddress",
    "sameAsBillingAddress"
})
public class ProductAccount
    extends BaseView
{

    @XmlElement(required = true, nillable = true)
    protected ContractInformation contractInformation;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString offerManagementRequestIds;
    @XmlElement(required = true, nillable = true)
    protected Address productAccountAddress;
    @XmlElement(required = true, nillable = true)
    protected Contact productAccountContact;
    @XmlElement(required = true, nillable = true)
    protected String productAccountName;
    @XmlElement(required = true, nillable = true)
    protected ArrayOfString promoCodes;
    protected boolean sameAsAccountAddress;
    protected boolean sameAsBillingAddress;

    /**
     * Gets the value of the contractInformation property.
     * 
     * @return
     *     possible object is
     *     {@link ContractInformation }
     *     
     */
    public ContractInformation getContractInformation() {
        return contractInformation;
    }

    /**
     * Sets the value of the contractInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractInformation }
     *     
     */
    public void setContractInformation(ContractInformation value) {
        this.contractInformation = value;
    }

    /**
     * Gets the value of the offerManagementRequestIds property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getOfferManagementRequestIds() {
        return offerManagementRequestIds;
    }

    /**
     * Sets the value of the offerManagementRequestIds property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setOfferManagementRequestIds(ArrayOfString value) {
        this.offerManagementRequestIds = value;
    }

    /**
     * Gets the value of the productAccountAddress property.
     * 
     * @return
     *     possible object is
     *     {@link Address }
     *     
     */
    public Address getProductAccountAddress() {
        return productAccountAddress;
    }

    /**
     * Sets the value of the productAccountAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link Address }
     *     
     */
    public void setProductAccountAddress(Address value) {
        this.productAccountAddress = value;
    }

    /**
     * Gets the value of the productAccountContact property.
     * 
     * @return
     *     possible object is
     *     {@link Contact }
     *     
     */
    public Contact getProductAccountContact() {
        return productAccountContact;
    }

    /**
     * Sets the value of the productAccountContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link Contact }
     *     
     */
    public void setProductAccountContact(Contact value) {
        this.productAccountContact = value;
    }

    /**
     * Gets the value of the productAccountName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductAccountName() {
        return productAccountName;
    }

    /**
     * Sets the value of the productAccountName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductAccountName(String value) {
        this.productAccountName = value;
    }

    /**
     * Gets the value of the promoCodes property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfString }
     *     
     */
    public ArrayOfString getPromoCodes() {
        return promoCodes;
    }

    /**
     * Sets the value of the promoCodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfString }
     *     
     */
    public void setPromoCodes(ArrayOfString value) {
        this.promoCodes = value;
    }

    /**
     * Gets the value of the sameAsAccountAddress property.
     * 
     */
    public boolean isSameAsAccountAddress() {
        return sameAsAccountAddress;
    }

    /**
     * Sets the value of the sameAsAccountAddress property.
     * 
     */
    public void setSameAsAccountAddress(boolean value) {
        this.sameAsAccountAddress = value;
    }

    /**
     * Gets the value of the sameAsBillingAddress property.
     * 
     */
    public boolean isSameAsBillingAddress() {
        return sameAsBillingAddress;
    }

    /**
     * Sets the value of the sameAsBillingAddress property.
     * 
     */
    public void setSameAsBillingAddress(boolean value) {
        this.sameAsBillingAddress = value;
    }

}
