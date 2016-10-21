
package org.w3.namespace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taxJurisdiction complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="taxJurisdiction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxProvState" type="{http://www.w3.org/namespace/}taxProvState" minOccurs="0"/>
 *         &lt;element name="taxJurisdictionId" type="{http://www.w3.org/namespace/}taxJurisdictionId" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxJurisdiction", propOrder = {
    "taxProvState",
    "taxJurisdictionId"
})
public class TaxJurisdiction {

    @XmlElementRef(name = "taxProvState", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxProvState> taxProvState;
    @XmlElementRef(name = "taxJurisdictionId", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<TaxJurisdictionId> taxJurisdictionId;

    /**
     * Gets the value of the taxProvState property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TaxProvState }{@code >}
     *
     */
    public JAXBElement<TaxProvState> getTaxProvState() {
        return taxProvState;
    }

    /**
     * Sets the value of the taxProvState property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TaxProvState }{@code >}
     *
     */
    public void setTaxProvState(JAXBElement<TaxProvState> value) {
        this.taxProvState = value;
    }

    /**
     * Gets the value of the taxJurisdictionId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TaxJurisdictionId }{@code >}
     *
     */
    public JAXBElement<TaxJurisdictionId> getTaxJurisdictionId() {
        return taxJurisdictionId;
    }

    /**
     * Sets the value of the taxJurisdictionId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TaxJurisdictionId }{@code >}
     *
     */
    public void setTaxJurisdictionId(JAXBElement<TaxJurisdictionId> value) {
        this.taxJurisdictionId = value;
    }

}
