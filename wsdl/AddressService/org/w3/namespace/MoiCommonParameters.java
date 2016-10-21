
package org.w3.namespace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for moiCommonParameters complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="moiCommonParameters">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errorCode" type="{http://www.w3.org/namespace/}errorCode" minOccurs="0"/>
 *         &lt;element name="errorMessageText" type="{http://www.w3.org/namespace/}errorMessageText" minOccurs="0"/>
 *         &lt;element name="moiErrorSub" type="{http://www.w3.org/namespace/}moiErrorSub" minOccurs="0"/>
 *         &lt;element name="returnIndicator" type="{http://www.w3.org/namespace/}returnIndicator" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "moiCommonParameters", propOrder = {
    "errorCode",
    "errorMessageText",
    "moiErrorSub",
    "returnIndicator"
})
public class MoiCommonParameters {

    @XmlElementRef(name = "errorCode", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrorCode> errorCode;
    @XmlElementRef(name = "errorMessageText", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ErrorMessageText> errorMessageText;
    @XmlElementRef(name = "moiErrorSub", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<MoiErrorSub> moiErrorSub;
    @XmlElementRef(name = "returnIndicator", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ReturnIndicator> returnIndicator;

    /**
     * Gets the value of the errorCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ErrorCode }{@code >}
     *
     */
    public JAXBElement<ErrorCode> getErrorCode() {
        return errorCode;
    }

    /**
     * Sets the value of the errorCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ErrorCode }{@code >}
     *
     */
    public void setErrorCode(JAXBElement<ErrorCode> value) {
        this.errorCode = value;
    }

    /**
     * Gets the value of the errorMessageText property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ErrorMessageText }{@code >}
     *
     */
    public JAXBElement<ErrorMessageText> getErrorMessageText() {
        return errorMessageText;
    }

    /**
     * Sets the value of the errorMessageText property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ErrorMessageText }{@code >}
     *
     */
    public void setErrorMessageText(JAXBElement<ErrorMessageText> value) {
        this.errorMessageText = value;
    }

    /**
     * Gets the value of the moiErrorSub property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MoiErrorSub }{@code >}
     *
     */
    public JAXBElement<MoiErrorSub> getMoiErrorSub() {
        return moiErrorSub;
    }

    /**
     * Sets the value of the moiErrorSub property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MoiErrorSub }{@code >}
     *
     */
    public void setMoiErrorSub(JAXBElement<MoiErrorSub> value) {
        this.moiErrorSub = value;
    }

    /**
     * Gets the value of the returnIndicator property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ReturnIndicator }{@code >}
     *
     */
    public JAXBElement<ReturnIndicator> getReturnIndicator() {
        return returnIndicator;
    }

    /**
     * Sets the value of the returnIndicator property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ReturnIndicator }{@code >}
     *
     */
    public void setReturnIndicator(JAXBElement<ReturnIndicator> value) {
        this.returnIndicator = value;
    }

}
