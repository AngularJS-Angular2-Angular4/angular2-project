
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceRelationship complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ServiceRelationship">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RelationshipType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="RelatedService" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfService" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceRelationship", propOrder = {
    "relationshipType",
    "relatedService"
})
public class ServiceRelationship {

    @XmlElementRef(name = "RelationshipType", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> relationshipType;
    @XmlElementRef(name = "RelatedService", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfService> relatedService;

    /**
     * Gets the value of the relationshipType property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getRelationshipType() {
        return relationshipType;
    }

    /**
     * Sets the value of the relationshipType property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setRelationshipType(JAXBElement<String> value) {
        this.relationshipType = value;
    }

    /**
     * Gets the value of the relatedService property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfService }{@code >}
     *
     */
    public JAXBElement<ArrayOfService> getRelatedService() {
        return relatedService;
    }

    /**
     * Sets the value of the relatedService property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfService }{@code >}
     *
     */
    public void setRelatedService(JAXBElement<ArrayOfService> value) {
        this.relatedService = value;
    }

}
