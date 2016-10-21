
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Entity complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Entity">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}RootEntity">
 *       &lt;sequence>
 *         &lt;element name="version" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firmwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="softwareVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EntityRecognizedUsing" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfEntityIdentification" minOccurs="0"/>
 *         &lt;element name="CompositeEntityRecognizedUsing" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfCompositeEntityIdentification" minOccurs="0"/>
 *         &lt;element name="Remarks" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfRemarks" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Entity", propOrder = {
    "version",
    "firmwareVersion",
    "softwareVersion",
    "entityRecognizedUsing",
    "compositeEntityRecognizedUsing",
    "remarks"
})
@XmlSeeAlso({
    Party.class,
    BandwidthProfile.class,
    CardOnCardDetails.class,
    MaintenanceEndPoint.class,
    AdministerResourceDetails.class,
    ResourceRelationship.class,
    OwnsResourceDetails.class,
    OwnsServiceDetails.class,
    LogicalPhysicalResource.class,
    BusinessInteraction.class,
    Priority.class,
    Place.class,
    ManagedEntity.class
})
public class Entity
    extends RootEntity
{

    @XmlElementRef(name = "version", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> version;
    @XmlElementRef(name = "firmwareVersion", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> firmwareVersion;
    @XmlElementRef(name = "softwareVersion", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> softwareVersion;
    @XmlElementRef(name = "EntityRecognizedUsing", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEntityIdentification> entityRecognizedUsing;
    @XmlElementRef(name = "CompositeEntityRecognizedUsing", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCompositeEntityIdentification> compositeEntityRecognizedUsing;
    @XmlElementRef(name = "Remarks", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfRemarks> remarks;

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setVersion(JAXBElement<String> value) {
        this.version = value;
    }

    /**
     * Gets the value of the firmwareVersion property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getFirmwareVersion() {
        return firmwareVersion;
    }

    /**
     * Sets the value of the firmwareVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setFirmwareVersion(JAXBElement<String> value) {
        this.firmwareVersion = value;
    }

    /**
     * Gets the value of the softwareVersion property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSoftwareVersion() {
        return softwareVersion;
    }

    /**
     * Sets the value of the softwareVersion property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSoftwareVersion(JAXBElement<String> value) {
        this.softwareVersion = value;
    }

    /**
     * Gets the value of the entityRecognizedUsing property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEntityIdentification }{@code >}
     *
     */
    public JAXBElement<ArrayOfEntityIdentification> getEntityRecognizedUsing() {
        return entityRecognizedUsing;
    }

    /**
     * Sets the value of the entityRecognizedUsing property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEntityIdentification }{@code >}
     *
     */
    public void setEntityRecognizedUsing(JAXBElement<ArrayOfEntityIdentification> value) {
        this.entityRecognizedUsing = value;
    }

    /**
     * Gets the value of the compositeEntityRecognizedUsing property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCompositeEntityIdentification }{@code >}
     *
     */
    public JAXBElement<ArrayOfCompositeEntityIdentification> getCompositeEntityRecognizedUsing() {
        return compositeEntityRecognizedUsing;
    }

    /**
     * Sets the value of the compositeEntityRecognizedUsing property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCompositeEntityIdentification }{@code >}
     *
     */
    public void setCompositeEntityRecognizedUsing(JAXBElement<ArrayOfCompositeEntityIdentification> value) {
        this.compositeEntityRecognizedUsing = value;
    }

    /**
     * Gets the value of the remarks property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfRemarks }{@code >}
          *
          */
    public JAXBElement<ArrayOfRemarks> getRemarks() {
        return remarks;
    }

    /**
     * Sets the value of the remarks property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfRemarks }{@code >}
     *
          */
         public void setRemarks(JAXBElement<ArrayOfRemarks> value) {
        this.remarks = value;
    }

}
