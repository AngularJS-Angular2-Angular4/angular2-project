
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardOnCardDetails complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CardOnCardDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Entity">
 *       &lt;sequence>
 *         &lt;element name="isPluggable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="slotNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="portNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Card" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCard" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardOnCardDetails", propOrder = {
    "isPluggable",
    "slotNumber",
    "portNumber",
    "card"
})
public class CardOnCardDetails
    extends Entity
{

    protected Boolean isPluggable;
    protected Integer slotNumber;
    @XmlElementRef(name = "portNumber", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> portNumber;
    @XmlElementRef(name = "Card", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCard> card;

    /**
     * Gets the value of the isPluggable property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsPluggable() {
        return isPluggable;
    }

    /**
     * Sets the value of the isPluggable property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsPluggable(Boolean value) {
        this.isPluggable = value;
    }

    /**
     * Gets the value of the slotNumber property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getSlotNumber() {
        return slotNumber;
    }

    /**
     * Sets the value of the slotNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setSlotNumber(Integer value) {
        this.slotNumber = value;
    }

    /**
     * Gets the value of the portNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPortNumber() {
        return portNumber;
    }

    /**
     * Sets the value of the portNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPortNumber(JAXBElement<String> value) {
        this.portNumber = value;
    }

    /**
     * Gets the value of the card property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCard }{@code >}
     *
     */
    public JAXBElement<ArrayOfCard> getCard() {
        return card;
    }

    /**
     * Sets the value of the card property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCard }{@code >}
     *
     */
    public void setCard(JAXBElement<ArrayOfCard> value) {
        this.card = value;
    }

}
