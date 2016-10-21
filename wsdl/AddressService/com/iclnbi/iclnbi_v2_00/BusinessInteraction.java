
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BusinessInteraction complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="BusinessInteraction">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Entity">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="interactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="interactionDateComplete" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="interactionStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BusinessInteractionComprisedOf" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfBusinessInteractionItem" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusinessInteraction", propOrder = {
    "id",
    "interactionDate",
    "interactionDateComplete",
    "interactionStatus",
    "businessInteractionComprisedOf"
})
public class BusinessInteraction
    extends Entity
{

    @XmlElementRef(name = "ID", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> id;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar interactionDate;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar interactionDateComplete;
    @XmlElementRef(name = "interactionStatus", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> interactionStatus;
    @XmlElementRef(name = "BusinessInteractionComprisedOf", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfBusinessInteractionItem> businessInteractionComprisedOf;

    /**
     * Gets the value of the id property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setID(JAXBElement<String> value) {
        this.id = value;
    }

    /**
     * Gets the value of the interactionDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getInteractionDate() {
        return interactionDate;
    }

    /**
     * Sets the value of the interactionDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public void setInteractionDate(XMLGregorianCalendar value) {
        this.interactionDate = value;
    }

    /**
     * Gets the value of the interactionDateComplete property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
          *
     */
    public XMLGregorianCalendar getInteractionDateComplete() {
        return interactionDateComplete;
    }

    /**
     * Sets the value of the interactionDateComplete property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
          *
          */
    public void setInteractionDateComplete(XMLGregorianCalendar value) {
        this.interactionDateComplete = value;
    }

    /**
     * Gets the value of the interactionStatus property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getInteractionStatus() {
        return interactionStatus;
    }

    /**
     * Sets the value of the interactionStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setInteractionStatus(JAXBElement<String> value) {
        this.interactionStatus = value;
    }

    /**
     * Gets the value of the businessInteractionComprisedOf property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfBusinessInteractionItem }{@code >}
     *
     */
    public JAXBElement<ArrayOfBusinessInteractionItem> getBusinessInteractionComprisedOf() {
        return businessInteractionComprisedOf;
    }

    /**
     * Sets the value of the businessInteractionComprisedOf property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfBusinessInteractionItem }{@code >}
     *
     */
    public void setBusinessInteractionComprisedOf(JAXBElement<ArrayOfBusinessInteractionItem> value) {
        this.businessInteractionComprisedOf = value;
    }

}
