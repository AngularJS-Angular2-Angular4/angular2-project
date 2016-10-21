
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Slot complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Slot">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}HolderAtomic">
 *       &lt;sequence>
 *         &lt;element name="hasAdapter" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="slotNumber" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="slotPurpose" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="purposeDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SlotInSlot" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Slot" minOccurs="0"/>
 *         &lt;element name="HasCard" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Card" minOccurs="0"/>
 *         &lt;element name="AllowableCard" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCard" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Slot", propOrder = {
    "hasAdapter",
    "slotNumber",
    "slotPurpose",
    "purposeDescription",
    "slotInSlot",
    "hasCard",
    "allowableCard"
})
public class Slot
    extends HolderAtomic
{

    protected Boolean hasAdapter;
    protected Integer slotNumber;
    protected Integer slotPurpose;
    @XmlElementRef(name = "purposeDescription", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> purposeDescription;
    @XmlElementRef(name = "SlotInSlot", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Slot> slotInSlot;
    @XmlElementRef(name = "HasCard", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<Card> hasCard;
    @XmlElementRef(name = "AllowableCard", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCard> allowableCard;

    /**
     * Gets the value of the hasAdapter property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isHasAdapter() {
        return hasAdapter;
    }

    /**
     * Sets the value of the hasAdapter property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setHasAdapter(Boolean value) {
        this.hasAdapter = value;
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
     * Gets the value of the slotPurpose property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getSlotPurpose() {
        return slotPurpose;
    }

    /**
     * Sets the value of the slotPurpose property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setSlotPurpose(Integer value) {
        this.slotPurpose = value;
    }

    /**
     * Gets the value of the purposeDescription property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPurposeDescription() {
        return purposeDescription;
    }

    /**
     * Sets the value of the purposeDescription property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPurposeDescription(JAXBElement<String> value) {
        this.purposeDescription = value;
    }

    /**
     * Gets the value of the slotInSlot property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.iclnbi.iclnbi_v2_00.Slot }{@code >}
     *
     */
         public JAXBElement<Slot> getSlotInSlot() {
        return slotInSlot;
    }

    /**
     * Sets the value of the slotInSlot property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.iclnbi.iclnbi_v2_00.Slot }{@code >}
     *
     */
    public void setSlotInSlot(JAXBElement<Slot> value) {
        this.slotInSlot = value;
    }

    /**
     * Gets the value of the hasCard property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Card }{@code >}
     *
          */
         public JAXBElement<Card> getHasCard() {
        return hasCard;
    }

    /**
     * Sets the value of the hasCard property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Card }{@code >}
     *
     */
         public void setHasCard(JAXBElement<Card> value) {
        this.hasCard = value;
    }

    /**
     * Gets the value of the allowableCard property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCard }{@code >}
     *
     */
         public JAXBElement<ArrayOfCard> getAllowableCard() {
        return allowableCard;
    }

    /**
     * Sets the value of the allowableCard property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCard }{@code >}
     *
     */
    public void setAllowableCard(JAXBElement<ArrayOfCard> value) {
        this.allowableCard = value;
    }

}
