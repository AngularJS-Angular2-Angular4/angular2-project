
package java.com_qwest_qcsetup;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TN complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NPA" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="NXX" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="line" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="originalNum" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="valid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TN", propOrder = {
    "npa",
    "nxx",
    "line",
    "originalNum",
    "valid"
})
public class TN {

    @XmlElement(name = "NPA", required = true, nillable = true)
    protected String npa;
    @XmlElement(name = "NXX", required = true, nillable = true)
    protected String nxx;
    @XmlElement(required = true, nillable = true)
    protected String line;
    @XmlElement(required = true, nillable = true)
    protected String originalNum;
    protected boolean valid;

    /**
     * Gets the value of the npa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPA() {
        return npa;
    }

    /**
     * Sets the value of the npa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPA(String value) {
        this.npa = value;
    }

    /**
     * Gets the value of the nxx property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNXX() {
        return nxx;
    }

    /**
     * Sets the value of the nxx property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNXX(String value) {
        this.nxx = value;
    }

    /**
     * Gets the value of the line property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLine() {
        return line;
    }

    /**
     * Sets the value of the line property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLine(String value) {
        this.line = value;
    }

    /**
     * Gets the value of the originalNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalNum() {
        return originalNum;
    }

    /**
     * Sets the value of the originalNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalNum(String value) {
        this.originalNum = value;
    }

    /**
     * Gets the value of the valid property.
     * 
     */
    public boolean isValid() {
        return valid;
    }

    /**
     * Sets the value of the valid property.
     * 
     */
    public void setValid(boolean value) {
        this.valid = value;
    }

}
