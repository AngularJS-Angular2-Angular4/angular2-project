
package com.qwest.xmlschema;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceStatusObject complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ServiceStatusObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ErrorCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ErrorStatus" type="{http://www.qwest.com/XMLSchema}ErrorStatus" minOccurs="0"/>
 *         &lt;element name="HostErrorList" type="{http://www.qwest.com/XMLSchema}ArrayOfServiceStatusObjectHostErrorList" minOccurs="0"/>
 *         &lt;element name="SeverityLevel" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceStatusObject", propOrder = {
    "errorCode",
    "errorMessage",
    "errorStatus",
    "hostErrorList",
    "severityLevel"
})
public class ServiceStatusObject {

    @XmlElementRef(name = "ErrorCode", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorCode;
    @XmlElementRef(name = "ErrorMessage", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<String> errorMessage;
    @XmlElement(name = "ErrorStatus")
    @XmlSchemaType(name = "string")
    protected ErrorStatus errorStatus;
    @XmlElementRef(name = "HostErrorList", namespace = "http://www.qwest.com/XMLSchema", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfServiceStatusObjectHostErrorList> hostErrorList;
    @XmlElement(name = "SeverityLevel")
    protected BigDecimal severityLevel;

    /**
     * Gets the value of the errorCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setErrorCode(JAXBElement<String> value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessage property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Sets the value of the errorMessage property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setErrorMessage(JAXBElement<String> value) {
        this.errorMessage = value;
    }

    /**
     * Gets the value of the errorStatus property.
     *
     * @return
     *     possible object is
     *     {@link ErrorStatus }
     *
     */
    public ErrorStatus getErrorStatus() {
        return errorStatus;
    }

    /**
     * Sets the value of the errorStatus property.
     *
     * @param value
     *     allowed object is
     *     {@link ErrorStatus }
     *
     */
    public void setErrorStatus(ErrorStatus value) {
        this.errorStatus = value;
    }

    /**
     * Gets the value of the hostErrorList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfServiceStatusObjectHostErrorList }{@code >}
     *
     */
    public JAXBElement<ArrayOfServiceStatusObjectHostErrorList> getHostErrorList() {
        return hostErrorList;
    }

    /**
     * Sets the value of the hostErrorList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfServiceStatusObjectHostErrorList }{@code >}
     *
     */
    public void setHostErrorList(JAXBElement<ArrayOfServiceStatusObjectHostErrorList> value) {
        this.hostErrorList = value;
    }

    /**
     * Gets the value of the severityLevel property.
     *
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *
     */
    public BigDecimal getSeverityLevel() {
        return severityLevel;
    }

    /**
     * Sets the value of the severityLevel property.
     *
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *
     */
    public void setSeverityLevel(BigDecimal value) {
        this.severityLevel = value;
    }

}
