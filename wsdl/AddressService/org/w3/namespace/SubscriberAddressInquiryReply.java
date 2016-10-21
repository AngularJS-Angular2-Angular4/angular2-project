
package org.w3.namespace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for subscriberAddressInquiryReply complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="subscriberAddressInquiryReply">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="moiCommonParameters" type="{http://www.w3.org/namespace/}moiCommonParameters" minOccurs="0"/>
 *         &lt;element name="inquiryInfo" type="{http://www.w3.org/namespace/}inquiryInfo" minOccurs="0"/>
 *         &lt;element name="updateInfo" type="{http://www.w3.org/namespace/}updateInfo" minOccurs="0"/>
 *         &lt;element name="protFirstAcptInd" type="{http://www.w3.org/namespace/}protFirstAcptInd" minOccurs="0"/>
 *         &lt;element name="protSecondAcptInd" type="{http://www.w3.org/namespace/}protSecondAcptInd" minOccurs="0"/>
 *         &lt;element name="protBroadbandInd" type="{http://www.w3.org/namespace/}protBroadbandInd" minOccurs="0"/>
 *         &lt;element name="protDropInfoInd" type="{http://www.w3.org/namespace/}protDropInfoInd" minOccurs="0"/>
 *         &lt;element name="moiSupplementaryParameters" type="{http://www.w3.org/namespace/}moiSupplementaryParameters" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "subscriberAddressInquiryReply", propOrder = {
    "moiCommonParameters",
    "inquiryInfo",
    "updateInfo",
    "protFirstAcptInd",
    "protSecondAcptInd",
    "protBroadbandInd",
    "protDropInfoInd",
    "moiSupplementaryParameters"
})
public class SubscriberAddressInquiryReply {

    @XmlElementRef(name = "moiCommonParameters", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<MoiCommonParameters> moiCommonParameters;
    @XmlElementRef(name = "inquiryInfo", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<InquiryInfo> inquiryInfo;
    @XmlElementRef(name = "updateInfo", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<UpdateInfo> updateInfo;
    @XmlElementRef(name = "protFirstAcptInd", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProtFirstAcptInd> protFirstAcptInd;
    @XmlElementRef(name = "protSecondAcptInd", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProtSecondAcptInd> protSecondAcptInd;
    @XmlElementRef(name = "protBroadbandInd", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProtBroadbandInd> protBroadbandInd;
    @XmlElementRef(name = "protDropInfoInd", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProtDropInfoInd> protDropInfoInd;
    @XmlElementRef(name = "moiSupplementaryParameters", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<MoiSupplementaryParameters> moiSupplementaryParameters;

    /**
     * Gets the value of the moiCommonParameters property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MoiCommonParameters }{@code >}
     *
     */
    public JAXBElement<MoiCommonParameters> getMoiCommonParameters() {
        return moiCommonParameters;
    }

    /**
     * Sets the value of the moiCommonParameters property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MoiCommonParameters }{@code >}
     *
     */
    public void setMoiCommonParameters(JAXBElement<MoiCommonParameters> value) {
        this.moiCommonParameters = value;
    }

    /**
     * Gets the value of the inquiryInfo property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link InquiryInfo }{@code >}
     *
     */
    public JAXBElement<InquiryInfo> getInquiryInfo() {
        return inquiryInfo;
    }

    /**
     * Sets the value of the inquiryInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link InquiryInfo }{@code >}
     *
     */
    public void setInquiryInfo(JAXBElement<InquiryInfo> value) {
        this.inquiryInfo = value;
    }

    /**
     * Gets the value of the updateInfo property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link UpdateInfo }{@code >}
     *
     */
    public JAXBElement<UpdateInfo> getUpdateInfo() {
        return updateInfo;
    }

    /**
     * Sets the value of the updateInfo property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link UpdateInfo }{@code >}
     *
     */
    public void setUpdateInfo(JAXBElement<UpdateInfo> value) {
        this.updateInfo = value;
    }

    /**
     * Gets the value of the protFirstAcptInd property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProtFirstAcptInd }{@code >}
     *
     */
    public JAXBElement<ProtFirstAcptInd> getProtFirstAcptInd() {
        return protFirstAcptInd;
    }

    /**
     * Sets the value of the protFirstAcptInd property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProtFirstAcptInd }{@code >}
     *
     */
    public void setProtFirstAcptInd(JAXBElement<ProtFirstAcptInd> value) {
        this.protFirstAcptInd = value;
    }

    /**
     * Gets the value of the protSecondAcptInd property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProtSecondAcptInd }{@code >}
     *
     */
    public JAXBElement<ProtSecondAcptInd> getProtSecondAcptInd() {
        return protSecondAcptInd;
    }

    /**
     * Sets the value of the protSecondAcptInd property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProtSecondAcptInd }{@code >}
     *
     */
    public void setProtSecondAcptInd(JAXBElement<ProtSecondAcptInd> value) {
        this.protSecondAcptInd = value;
    }

    /**
     * Gets the value of the protBroadbandInd property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProtBroadbandInd }{@code >}
     *
     */
    public JAXBElement<ProtBroadbandInd> getProtBroadbandInd() {
        return protBroadbandInd;
    }

    /**
     * Sets the value of the protBroadbandInd property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProtBroadbandInd }{@code >}
     *
     */
    public void setProtBroadbandInd(JAXBElement<ProtBroadbandInd> value) {
        this.protBroadbandInd = value;
    }

    /**
     * Gets the value of the protDropInfoInd property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProtDropInfoInd }{@code >}
     *
     */
    public JAXBElement<ProtDropInfoInd> getProtDropInfoInd() {
        return protDropInfoInd;
    }

    /**
     * Sets the value of the protDropInfoInd property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProtDropInfoInd }{@code >}
     *
     */
    public void setProtDropInfoInd(JAXBElement<ProtDropInfoInd> value) {
        this.protDropInfoInd = value;
    }

    /**
     * Gets the value of the moiSupplementaryParameters property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MoiSupplementaryParameters }{@code >}
     *
     */
    public JAXBElement<MoiSupplementaryParameters> getMoiSupplementaryParameters() {
        return moiSupplementaryParameters;
    }

    /**
     * Sets the value of the moiSupplementaryParameters property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MoiSupplementaryParameters }{@code >}
     *
     */
    public void setMoiSupplementaryParameters(JAXBElement<MoiSupplementaryParameters> value) {
        this.moiSupplementaryParameters = value;
    }

}
