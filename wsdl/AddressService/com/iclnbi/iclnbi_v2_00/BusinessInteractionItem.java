
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BusinessInteractionItem complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BusinessInteractionItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="action" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessInteractionItemInvolves" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfBusinessInteractionRole" minOccurs="0"/>
 *         &lt;element name="BusinessInteractionItemInvolvesProduct" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfProduct" minOccurs="0"/>
 *         &lt;element name="BusinessInteractionItemInvolvesResource" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfResource" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessInteractionItem", propOrder = {
    "action",
    "businessInteractionItemInvolves",
    "businessInteractionItemInvolvesProduct",
    "businessInteractionItemInvolvesResource"
})
public class BusinessInteractionItem {

    @XmlElementRef(name = "action", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> action;
    @XmlElementRef(name = "BusinessInteractionItemInvolves", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBusinessInteractionRole> businessInteractionItemInvolves;
    @XmlElementRef(name = "BusinessInteractionItemInvolvesProduct", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfProduct> businessInteractionItemInvolvesProduct;
    @XmlElementRef(name = "BusinessInteractionItemInvolvesResource", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfResource> businessInteractionItemInvolvesResource;

    /**
     * Gets the value of the action property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAction() {
        return action;
    }

    /**
     * Sets the value of the action property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAction(JAXBElement<String> value) {
        this.action = value;
    }

    /**
     * Gets the value of the businessInteractionItemInvolves property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfBusinessInteractionRole }{@code >}
     *
     */
    public JAXBElement<ArrayOfBusinessInteractionRole> getBusinessInteractionItemInvolves() {
        return businessInteractionItemInvolves;
    }

    /**
     * Sets the value of the businessInteractionItemInvolves property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfBusinessInteractionRole }{@code >}
     *
     */
    public void setBusinessInteractionItemInvolves(JAXBElement<ArrayOfBusinessInteractionRole> value) {
        this.businessInteractionItemInvolves = value;
    }

    /**
     * Gets the value of the businessInteractionItemInvolvesProduct property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}
     *
     */
    public JAXBElement<ArrayOfProduct> getBusinessInteractionItemInvolvesProduct() {
        return businessInteractionItemInvolvesProduct;
    }

    /**
     * Sets the value of the businessInteractionItemInvolvesProduct property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfProduct }{@code >}
     *
     */
    public void setBusinessInteractionItemInvolvesProduct(JAXBElement<ArrayOfProduct> value) {
        this.businessInteractionItemInvolvesProduct = value;
    }

    /**
     * Gets the value of the businessInteractionItemInvolvesResource property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResource }{@code >}
     *
     */
    public JAXBElement<ArrayOfResource> getBusinessInteractionItemInvolvesResource() {
        return businessInteractionItemInvolvesResource;
    }

    /**
     * Sets the value of the businessInteractionItemInvolvesResource property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfResource }{@code >}
     *
     */
    public void setBusinessInteractionItemInvolvesResource(JAXBElement<ArrayOfResource> value) {
        this.businessInteractionItemInvolvesResource = value;
    }

}
