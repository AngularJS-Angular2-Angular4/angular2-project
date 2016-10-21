
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TerminationPoint complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="TerminationPoint">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ManagedTransmissionEntity">
 *       &lt;sequence>
 *         &lt;element name="direction" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}Directionality" minOccurs="0"/>
 *         &lt;element name="tpProtectionAssociation" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}TerminationPointProtectionAssociation" minOccurs="0"/>
 *         &lt;element name="isEdgePoint" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="isEquipmentProtected" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="egressTmdState" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}TransmissionDescriptorState" minOccurs="0"/>
 *         &lt;element name="ingressTmdState" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}TransmissionDescriptorState" minOccurs="0"/>
 *         &lt;element name="AssociatedWith" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}TerminationPoint" minOccurs="0"/>
 *         &lt;element name="AccessPointAddress" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfAmericanPropertyAddress" minOccurs="0"/>
 *         &lt;element name="vendorTPName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="typeOfTP" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="endPointLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ingressQoSBandwidth" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCoSBundle" minOccurs="0"/>
 *         &lt;element name="egressQoSBandwidth" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCoSBundle" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TerminationPoint", propOrder = {
    "direction",
    "tpProtectionAssociation",
    "isEdgePoint",
    "isEquipmentProtected",
    "egressTmdState",
    "ingressTmdState",
    "associatedWith",
    "accessPointAddress",
    "vendorTPName",
    "typeOfTP",
    "endPointLabel",
    "ingressQoSBandwidth",
    "egressQoSBandwidth"
})
@XmlSeeAlso({
    ConnectionTerminationPoint.class
})
public class TerminationPoint
    extends ManagedTransmissionEntity
{

    @XmlSchemaType(name = "string")
    protected Directionality direction;
    @XmlSchemaType(name = "string")
    protected TerminationPointProtectionAssociation tpProtectionAssociation;
    protected Boolean isEdgePoint;
    protected Boolean isEquipmentProtected;
    @XmlSchemaType(name = "string")
    protected TransmissionDescriptorState egressTmdState;
    @XmlSchemaType(name = "string")
    protected TransmissionDescriptorState ingressTmdState;
    @XmlElementRef(name = "AssociatedWith", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<TerminationPoint> associatedWith;
    @XmlElementRef(name = "AccessPointAddress", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAmericanPropertyAddress> accessPointAddress;
    @XmlElementRef(name = "vendorTPName", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> vendorTPName;
    protected Integer typeOfTP;
    @XmlElementRef(name = "endPointLabel", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> endPointLabel;
    @XmlElementRef(name = "ingressQoSBandwidth", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCoSBundle> ingressQoSBandwidth;
    @XmlElementRef(name = "egressQoSBandwidth", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCoSBundle> egressQoSBandwidth;

    /**
     * Gets the value of the direction property.
     *
     * @return
     *     possible object is
     *     {@link Directionality }
     *
     */
    public Directionality getDirection() {
        return direction;
    }

    /**
     * Sets the value of the direction property.
     *
     * @param value
     *     allowed object is
     *     {@link Directionality }
     *
     */
    public void setDirection(Directionality value) {
        this.direction = value;
    }

    /**
     * Gets the value of the tpProtectionAssociation property.
     *
     * @return
     *     possible object is
     *     {@link TerminationPointProtectionAssociation }
     *
     */
    public TerminationPointProtectionAssociation getTpProtectionAssociation() {
        return tpProtectionAssociation;
    }

    /**
     * Sets the value of the tpProtectionAssociation property.
     *
     * @param value
     *     allowed object is
     *     {@link TerminationPointProtectionAssociation }
     *
     */
    public void setTpProtectionAssociation(TerminationPointProtectionAssociation value) {
        this.tpProtectionAssociation = value;
    }

    /**
     * Gets the value of the isEdgePoint property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsEdgePoint() {
        return isEdgePoint;
    }

    /**
     * Sets the value of the isEdgePoint property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsEdgePoint(Boolean value) {
        this.isEdgePoint = value;
    }

    /**
     * Gets the value of the isEquipmentProtected property.
     *
     * @return
     *     possible object is
     *     {@link Boolean }
     *
     */
    public Boolean isIsEquipmentProtected() {
        return isEquipmentProtected;
    }

    /**
     * Sets the value of the isEquipmentProtected property.
     *
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *
     */
    public void setIsEquipmentProtected(Boolean value) {
        this.isEquipmentProtected = value;
    }

    /**
     * Gets the value of the egressTmdState property.
     *
     * @return
     *     possible object is
     *     {@link TransmissionDescriptorState }
     *
     */
    public TransmissionDescriptorState getEgressTmdState() {
        return egressTmdState;
    }

    /**
     * Sets the value of the egressTmdState property.
     *
     * @param value
     *     allowed object is
     *     {@link TransmissionDescriptorState }
     *
     */
    public void setEgressTmdState(TransmissionDescriptorState value) {
        this.egressTmdState = value;
    }

    /**
     * Gets the value of the ingressTmdState property.
     *
     * @return
     *     possible object is
     *     {@link TransmissionDescriptorState }
     *
     */
    public TransmissionDescriptorState getIngressTmdState() {
        return ingressTmdState;
    }

    /**
     * Sets the value of the ingressTmdState property.
     *
     * @param value
     *     allowed object is
     *     {@link TransmissionDescriptorState }
     *
     */
    public void setIngressTmdState(TransmissionDescriptorState value) {
        this.ingressTmdState = value;
    }

    /**
     * Gets the value of the associatedWith property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.iclnbi.iclnbi_v2_00.TerminationPoint }{@code >}
     *
     */
    public JAXBElement<TerminationPoint> getAssociatedWith() {
        return associatedWith;
    }

    /**
     * Sets the value of the associatedWith property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link com.iclnbi.iclnbi_v2_00.TerminationPoint }{@code >}
          *
     */
    public void setAssociatedWith(JAXBElement<TerminationPoint> value) {
        this.associatedWith = value;
    }

    /**
     * Gets the value of the accessPointAddress property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAmericanPropertyAddress }{@code >}
     *
          */
         public JAXBElement<ArrayOfAmericanPropertyAddress> getAccessPointAddress() {
        return accessPointAddress;
    }

    /**
     * Sets the value of the accessPointAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfAmericanPropertyAddress }{@code >}
     *
     */
         public void setAccessPointAddress(JAXBElement<ArrayOfAmericanPropertyAddress> value) {
        this.accessPointAddress = value;
    }

    /**
     * Gets the value of the vendorTPName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVendorTPName() {
        return vendorTPName;
    }

    /**
     * Sets the value of the vendorTPName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVendorTPName(JAXBElement<String> value) {
        this.vendorTPName = value;
    }

    /**
     * Gets the value of the typeOfTP property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getTypeOfTP() {
        return typeOfTP;
    }

    /**
     * Sets the value of the typeOfTP property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setTypeOfTP(Integer value) {
        this.typeOfTP = value;
    }

    /**
     * Gets the value of the endPointLabel property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getEndPointLabel() {
            return endPointLabel;
    }

    /**
     * Sets the value of the endPointLabel property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setEndPointLabel(JAXBElement<String> value) {
            this.endPointLabel = value;
    }

    /**
     * Gets the value of the ingressQoSBandwidth property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCoSBundle }{@code >}
     *
     */
    public JAXBElement<ArrayOfCoSBundle> getIngressQoSBandwidth() {
        return ingressQoSBandwidth;
    }

    /**
     * Sets the value of the ingressQoSBandwidth property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCoSBundle }{@code >}
     *
     */
    public void setIngressQoSBandwidth(JAXBElement<ArrayOfCoSBundle> value) {
        this.ingressQoSBandwidth = value;
    }

    /**
     * Gets the value of the egressQoSBandwidth property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCoSBundle }{@code >}
     *
     */
    public JAXBElement<ArrayOfCoSBundle> getEgressQoSBandwidth() {
            return egressQoSBandwidth;
    }

    /**
     * Sets the value of the egressQoSBandwidth property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCoSBundle }{@code >}
     *
     */
    public void setEgressQoSBandwidth(JAXBElement<ArrayOfCoSBundle> value) {
            this.egressQoSBandwidth = value;
    }

}
