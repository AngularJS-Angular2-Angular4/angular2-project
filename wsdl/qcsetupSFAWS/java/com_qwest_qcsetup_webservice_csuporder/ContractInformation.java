
package java.com_qwest_qcsetup_webservice_csuporder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ContractInformation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ContractInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{java:com.qwest.qcsetup.webservice.csupOrder.bo}BaseView">
 *       &lt;sequence>
 *         &lt;element name="brand" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="commitment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="contractId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="customerSignatoryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="customerSignedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="iLinkID" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="inRegionIndicator" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractInformation", propOrder = {
    "brand",
    "commitment",
    "contractId",
    "customerSignatoryName",
    "customerSignedDate",
    "iLinkID",
    "inRegionIndicator",
    "term"
})
public class ContractInformation
    extends BaseView
{

    @XmlElement(required = true, nillable = true)
    protected String brand;
    protected int commitment;
    protected long contractId;
    @XmlElement(required = true, nillable = true)
    protected String customerSignatoryName;
    @XmlElement(required = true, nillable = true)
    protected String customerSignedDate;
    protected long iLinkID;
    @XmlElement(required = true, nillable = true)
    protected String inRegionIndicator;
    protected int term;

    /**
     * Gets the value of the brand property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrand() {
        return brand;
    }

    /**
     * Sets the value of the brand property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrand(String value) {
        this.brand = value;
    }

    /**
     * Gets the value of the commitment property.
     * 
     */
    public int getCommitment() {
        return commitment;
    }

    /**
     * Sets the value of the commitment property.
     * 
     */
    public void setCommitment(int value) {
        this.commitment = value;
    }

    /**
     * Gets the value of the contractId property.
     * 
     */
    public long getContractId() {
        return contractId;
    }

    /**
     * Sets the value of the contractId property.
     * 
     */
    public void setContractId(long value) {
        this.contractId = value;
    }

    /**
     * Gets the value of the customerSignatoryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSignatoryName() {
        return customerSignatoryName;
    }

    /**
     * Sets the value of the customerSignatoryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSignatoryName(String value) {
        this.customerSignatoryName = value;
    }

    /**
     * Gets the value of the customerSignedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerSignedDate() {
        return customerSignedDate;
    }

    /**
     * Sets the value of the customerSignedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerSignedDate(String value) {
        this.customerSignedDate = value;
    }

    /**
     * Gets the value of the iLinkID property.
     * 
     */
    public long getILinkID() {
        return iLinkID;
    }

    /**
     * Sets the value of the iLinkID property.
     * 
     */
    public void setILinkID(long value) {
        this.iLinkID = value;
    }

    /**
     * Gets the value of the inRegionIndicator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInRegionIndicator() {
        return inRegionIndicator;
    }

    /**
     * Sets the value of the inRegionIndicator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInRegionIndicator(String value) {
        this.inRegionIndicator = value;
    }

    /**
     * Gets the value of the term property.
     * 
     */
    public int getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     */
    public void setTerm(int value) {
        this.term = value;
    }

}
