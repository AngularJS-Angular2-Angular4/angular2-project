
package com.qwest.xmlschema;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SchemaVersionT complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SchemaVersionT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MajorVersionNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MinorVersionNumber" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="TargetXSDName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SchemaVersionT", propOrder = {
    "majorVersionNumber",
    "minorVersionNumber",
    "targetXSDName"
})
public class SchemaVersionT {

    @XmlElement(name = "MajorVersionNumber")
    protected BigDecimal majorVersionNumber;
    @XmlElement(name = "MinorVersionNumber")
    protected BigDecimal minorVersionNumber;
    @XmlElementRef(name = "TargetXSDName", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> targetXSDName;

    /**
     * Gets the value of the majorVersionNumber property.
     *
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *
     */
    public BigDecimal getMajorVersionNumber() {
        return majorVersionNumber;
    }

    /**
     * Sets the value of the majorVersionNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *
     */
    public void setMajorVersionNumber(BigDecimal value) {
        this.majorVersionNumber = value;
    }

    /**
     * Gets the value of the minorVersionNumber property.
     *
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
          *
     */
    public BigDecimal getMinorVersionNumber() {
        return minorVersionNumber;
    }

    /**
     * Sets the value of the minorVersionNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *
          */
    public void setMinorVersionNumber(BigDecimal value) {
        this.minorVersionNumber = value;
    }

    /**
     * Gets the value of the targetXSDName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getTargetXSDName() {
        return targetXSDName;
    }

    /**
     * Sets the value of the targetXSDName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setTargetXSDName(JAXBElement<String> value) {
        this.targetXSDName = value;
    }

}
