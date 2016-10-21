
package com.ctl.as.domain.geo.v2.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CivicAddress complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CivicAddress">
 *   &lt;complexContent>
 *     &lt;extension base="{http://geo.domain.as.ctl.com/v2/Types}AmericanPropertyAddress">
 *       &lt;sequence>
 *         &lt;element name="Source" type="{http://geo.domain.as.ctl.com/v2/Types}CivicAddressSource" minOccurs="0"/>
 *         &lt;element name="StreetComponentsChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="StreetNameChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LocalityChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PostCodeChanged" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CivicAddress", propOrder = {
    "source",
    "streetComponentsChanged",
    "streetNameChanged",
    "localityChanged",
    "postCodeChanged"
})
public class CivicAddress
    extends AmericanPropertyAddress
{

    @XmlElement(name = "Source")
    @XmlSchemaType(name = "string")
    protected CivicAddressSource source;
    @XmlElement(name = "StreetComponentsChanged")
    protected Boolean streetComponentsChanged;
    @XmlElement(name = "StreetNameChanged")
    protected Boolean streetNameChanged;
    @XmlElement(name = "LocalityChanged")
    protected Boolean localityChanged;
    @XmlElement(name = "PostCodeChanged")
    protected Boolean postCodeChanged;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link CivicAddressSource }
     *     
     */
    public CivicAddressSource getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link CivicAddressSource }
     *     
     */
    public void setSource(CivicAddressSource value) {
        this.source = value;
    }

    /**
     * Gets the value of the streetComponentsChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStreetComponentsChanged() {
        return streetComponentsChanged;
    }

    /**
     * Sets the value of the streetComponentsChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStreetComponentsChanged(Boolean value) {
        this.streetComponentsChanged = value;
    }

    /**
     * Gets the value of the streetNameChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStreetNameChanged() {
        return streetNameChanged;
    }

    /**
     * Sets the value of the streetNameChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStreetNameChanged(Boolean value) {
        this.streetNameChanged = value;
    }

    /**
     * Gets the value of the localityChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLocalityChanged() {
        return localityChanged;
    }

    /**
     * Sets the value of the localityChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setLocalityChanged(Boolean value) {
        this.localityChanged = value;
    }

    /**
     * Gets the value of the postCodeChanged property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPostCodeChanged() {
        return postCodeChanged;
    }

    /**
     * Sets the value of the postCodeChanged property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPostCodeChanged(Boolean value) {
        this.postCodeChanged = value;
    }

}
