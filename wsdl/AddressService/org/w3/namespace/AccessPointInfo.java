
package org.w3.namespace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for accessPointInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="accessPointInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accessPoint" type="{http://www.w3.org/namespace/}accessPoint" minOccurs="0"/>
 *         &lt;element name="dropType" type="{http://www.w3.org/namespace/}dropType" minOccurs="0"/>
 *         &lt;element name="dropSize" type="{http://www.w3.org/namespace/}dropSize" minOccurs="0"/>
 *         &lt;element name="protType" type="{http://www.w3.org/namespace/}protType" minOccurs="0"/>
 *         &lt;element name="protSize" type="{http://www.w3.org/namespace/}protSize" minOccurs="0"/>
 *         &lt;element name="term" type="{http://www.w3.org/namespace/}term" minOccurs="0"/>
 *         &lt;element name="broadbandDistance" type="{http://www.w3.org/namespace/}broadbandDistance" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "accessPointInfo", propOrder = {
    "accessPoint",
    "dropType",
    "dropSize",
    "protType",
    "protSize",
    "term",
    "broadbandDistance"
})
public class AccessPointInfo {

    @XmlElementRef(name = "accessPoint", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<AccessPoint> accessPoint;
    @XmlElementRef(name = "dropType", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<DropType> dropType;
    @XmlElementRef(name = "dropSize", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<DropSize> dropSize;
    @XmlElementRef(name = "protType", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProtType> protType;
    @XmlElementRef(name = "protSize", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProtSize> protSize;
    @XmlElementRef(name = "term", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<Term> term;
    @XmlElementRef(name = "broadbandDistance", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<BroadbandDistance> broadbandDistance;

    /**
     * Gets the value of the accessPoint property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AccessPoint }{@code >}
     *
     */
    public JAXBElement<AccessPoint> getAccessPoint() {
        return accessPoint;
    }

    /**
     * Sets the value of the accessPoint property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AccessPoint }{@code >}
     *
     */
    public void setAccessPoint(JAXBElement<AccessPoint> value) {
        this.accessPoint = value;
    }

    /**
     * Gets the value of the dropType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link DropType }{@code >}
     *
     */
    public JAXBElement<DropType> getDropType() {
        return dropType;
    }

    /**
     * Sets the value of the dropType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link DropType }{@code >}
     *
     */
    public void setDropType(JAXBElement<DropType> value) {
        this.dropType = value;
    }

    /**
     * Gets the value of the dropSize property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link DropSize }{@code >}
     *
     */
    public JAXBElement<DropSize> getDropSize() {
        return dropSize;
    }

    /**
     * Sets the value of the dropSize property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link DropSize }{@code >}
     *
     */
    public void setDropSize(JAXBElement<DropSize> value) {
        this.dropSize = value;
    }

    /**
     * Gets the value of the protType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProtType }{@code >}
     *
     */
    public JAXBElement<ProtType> getProtType() {
        return protType;
    }

    /**
     * Sets the value of the protType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProtType }{@code >}
     *
     */
    public void setProtType(JAXBElement<ProtType> value) {
        this.protType = value;
    }

    /**
     * Gets the value of the protSize property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProtSize }{@code >}
          *
     */
    public JAXBElement<ProtSize> getProtSize() {
        return protSize;
    }

    /**
     * Sets the value of the protSize property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProtSize }{@code >}
          *
          */
    public void setProtSize(JAXBElement<ProtSize> value) {
        this.protSize = value;
    }

    /**
     * Gets the value of the term property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Term }{@code >}
     *
          */
         public JAXBElement<Term> getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Term }{@code >}
     *
     */
         public void setTerm(JAXBElement<Term> value) {
        this.term = value;
    }

    /**
     * Gets the value of the broadbandDistance property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link BroadbandDistance }{@code >}
     *
          */
         public JAXBElement<BroadbandDistance> getBroadbandDistance() {
        return broadbandDistance;
    }

    /**
     * Sets the value of the broadbandDistance property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link BroadbandDistance }{@code >}
     *
     */
         public void setBroadbandDistance(JAXBElement<BroadbandDistance> value) {
        this.broadbandDistance = value;
    }

}
