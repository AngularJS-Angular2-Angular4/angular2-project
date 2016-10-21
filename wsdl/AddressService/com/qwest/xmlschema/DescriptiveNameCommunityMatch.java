
package com.qwest.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * <p>Java class for DescriptiveNameCommunityMatch complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DescriptiveNameCommunityMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Community" type="{http://www.qwest.com/XMLSchema}ArrayOfCommunityT" minOccurs="0"/>
 *         &lt;element name="DescriptiveName" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DescriptiveNameCommunityMatch", propOrder = {
    "community",
    "descriptiveName"
})
public class DescriptiveNameCommunityMatch {

    @XmlElementRef(name = "Community", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfCommunityT> community;
    @XmlElementRef(name = "DescriptiveName", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> descriptiveName;

    /**
     * Gets the value of the community property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCommunityT }{@code >}
     *
     */
    public JAXBElement<ArrayOfCommunityT> getCommunity() {
        return community;
    }

    /**
     * Sets the value of the community property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCommunityT }{@code >}
     *
     */
    public void setCommunity(JAXBElement<ArrayOfCommunityT> value) {
        this.community = value;
    }

    /**
     * Gets the value of the descriptiveName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public JAXBElement<ArrayOfstring> getDescriptiveName() {
        return descriptiveName;
    }

    /**
     * Sets the value of the descriptiveName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *
     */
    public void setDescriptiveName(JAXBElement<ArrayOfstring> value) {
        this.descriptiveName = value;
    }

}
