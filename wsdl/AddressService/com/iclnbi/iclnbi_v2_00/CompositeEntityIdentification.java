
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CompositeEntityIdentification complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="CompositeEntityIdentification">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}EntityIdentification">
 *       &lt;sequence>
 *         &lt;element name="CompositeEntityIdentityComposedOf" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfEntityIdentification" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompositeEntityIdentification", propOrder = {
    "compositeEntityIdentityComposedOf"
})
public class CompositeEntityIdentification
    extends EntityIdentification
{

    @XmlElementRef(name = "CompositeEntityIdentityComposedOf", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfEntityIdentification> compositeEntityIdentityComposedOf;

    /**
     * Gets the value of the compositeEntityIdentityComposedOf property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEntityIdentification }{@code >}
     *
     */
    public JAXBElement<ArrayOfEntityIdentification> getCompositeEntityIdentityComposedOf() {
        return compositeEntityIdentityComposedOf;
    }

    /**
     * Sets the value of the compositeEntityIdentityComposedOf property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfEntityIdentification }{@code >}
     *
     */
    public void setCompositeEntityIdentityComposedOf(JAXBElement<ArrayOfEntityIdentification> value) {
        this.compositeEntityIdentityComposedOf = value;
    }

}
