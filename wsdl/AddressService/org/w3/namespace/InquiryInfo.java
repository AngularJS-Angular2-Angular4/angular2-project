
package org.w3.namespace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inquiryInfo complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="inquiryInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transTimeStamp" type="{http://www.w3.org/namespace/}transTimeStamp" minOccurs="0"/>
 *         &lt;element name="transUserId" type="{http://www.w3.org/namespace/}transUserId" minOccurs="0"/>
 *         &lt;element name="displayTransTime" type="{http://www.w3.org/namespace/}displayTransTime" minOccurs="0"/>
 *         &lt;element name="transactionCode" type="{http://www.w3.org/namespace/}transactionCode" minOccurs="0"/>
 *         &lt;element name="transactionDate" type="{http://www.w3.org/namespace/}transactionDate" minOccurs="0"/>
 *         &lt;element name="inSrNumber" type="{http://www.w3.org/namespace/}inSrNumber" minOccurs="0"/>
 *         &lt;element name="inOrderNumber" type="{http://www.w3.org/namespace/}inOrderNumber" minOccurs="0"/>
 *         &lt;element name="inDueDate" type="{http://www.w3.org/namespace/}inDueDate" minOccurs="0"/>
 *         &lt;element name="outSrNumber" type="{http://www.w3.org/namespace/}outSrNumber" minOccurs="0"/>
 *         &lt;element name="outOrderNumber" type="{http://www.w3.org/namespace/}outOrderNumber" minOccurs="0"/>
 *         &lt;element name="outDueDate" type="{http://www.w3.org/namespace/}outDueDate" minOccurs="0"/>
 *         &lt;element name="munCounty" type="{http://www.w3.org/namespace/}munCounty" minOccurs="0"/>
 *         &lt;element name="munCountyId" type="{http://www.w3.org/namespace/}munCountyId" minOccurs="0"/>
 *         &lt;element name="msagSourceId" type="{http://www.w3.org/namespace/}msagSourceId" minOccurs="0"/>
 *         &lt;element name="esn" type="{http://www.w3.org/namespace/}esn" minOccurs="0"/>
 *         &lt;element name="groupInUse" type="{http://www.w3.org/namespace/}ArrayOfgroupInUse" minOccurs="0"/>
 *         &lt;element name="udifInd" type="{http://www.w3.org/namespace/}udifInd" minOccurs="0"/>
 *         &lt;element name="canBeDeletedInd" type="{http://www.w3.org/namespace/}canBeDeletedInd" minOccurs="0"/>
 *         &lt;element name="soExistsInd" type="{http://www.w3.org/namespace/}soExistsInd" minOccurs="0"/>
 *         &lt;element name="lisInd" type="{http://www.w3.org/namespace/}lisInd" minOccurs="0"/>
 *         &lt;element name="additionalAcptsInd" type="{http://www.w3.org/namespace/}additionalAcptsInd" minOccurs="0"/>
 *         &lt;element name="protectionExistsInd" type="{http://www.w3.org/namespace/}protectionExistsInd" minOccurs="0"/>
 *         &lt;element name="broadbandExistsInd" type="{http://www.w3.org/namespace/}broadbandExistsInd" minOccurs="0"/>
 *         &lt;element name="dslRdgsExistInd" type="{http://www.w3.org/namespace/}dslRdgsExistInd" minOccurs="0"/>
 *         &lt;element name="nonMartensAddrInd" type="{http://www.w3.org/namespace/}nonMartensAddrInd" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inquiryInfo", propOrder = {
    "transTimeStamp",
    "transUserId",
    "displayTransTime",
    "transactionCode",
    "transactionDate",
    "inSrNumber",
    "inOrderNumber",
    "inDueDate",
    "outSrNumber",
    "outOrderNumber",
    "outDueDate",
    "munCounty",
    "munCountyId",
    "msagSourceId",
    "esn",
    "groupInUse",
    "udifInd",
    "canBeDeletedInd",
    "soExistsInd",
    "lisInd",
    "additionalAcptsInd",
    "protectionExistsInd",
    "broadbandExistsInd",
    "dslRdgsExistInd",
    "nonMartensAddrInd"
})
public class InquiryInfo {

    @XmlElementRef(name = "transTimeStamp", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<TransTimeStamp> transTimeStamp;
    @XmlElementRef(name = "transUserId", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<TransUserId> transUserId;
    @XmlElementRef(name = "displayTransTime", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<DisplayTransTime> displayTransTime;
    @XmlElementRef(name = "transactionCode", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<TransactionCode> transactionCode;
    @XmlElementRef(name = "transactionDate", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<TransactionDate> transactionDate;
    @XmlElementRef(name = "inSrNumber", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<InSrNumber> inSrNumber;
    @XmlElementRef(name = "inOrderNumber", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<InOrderNumber> inOrderNumber;
    @XmlElementRef(name = "inDueDate", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<InDueDate> inDueDate;
    @XmlElementRef(name = "outSrNumber", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<OutSrNumber> outSrNumber;
    @XmlElementRef(name = "outOrderNumber", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<OutOrderNumber> outOrderNumber;
    @XmlElementRef(name = "outDueDate", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<OutDueDate> outDueDate;
    @XmlElementRef(name = "munCounty", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<MunCounty> munCounty;
    @XmlElementRef(name = "munCountyId", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<MunCountyId> munCountyId;
    @XmlElementRef(name = "msagSourceId", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<MsagSourceId> msagSourceId;
    @XmlElementRef(name = "esn", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<Esn> esn;
    @XmlElementRef(name = "groupInUse", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfgroupInUse> groupInUse;
    @XmlElementRef(name = "udifInd", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<UdifInd> udifInd;
    @XmlElementRef(name = "canBeDeletedInd", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<CanBeDeletedInd> canBeDeletedInd;
    @XmlElementRef(name = "soExistsInd", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<SoExistsInd> soExistsInd;
    @XmlElementRef(name = "lisInd", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<LisInd> lisInd;
    @XmlElementRef(name = "additionalAcptsInd", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<AdditionalAcptsInd> additionalAcptsInd;
    @XmlElementRef(name = "protectionExistsInd", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProtectionExistsInd> protectionExistsInd;
    @XmlElementRef(name = "broadbandExistsInd", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<BroadbandExistsInd> broadbandExistsInd;
    @XmlElementRef(name = "dslRdgsExistInd", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<DslRdgsExistInd> dslRdgsExistInd;
    @XmlElementRef(name = "nonMartensAddrInd", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<NonMartensAddrInd> nonMartensAddrInd;

    /**
     * Gets the value of the transTimeStamp property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransTimeStamp }{@code >}
     *
     */
    public JAXBElement<TransTimeStamp> getTransTimeStamp() {
        return transTimeStamp;
    }

    /**
     * Sets the value of the transTimeStamp property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransTimeStamp }{@code >}
     *
     */
    public void setTransTimeStamp(JAXBElement<TransTimeStamp> value) {
        this.transTimeStamp = value;
    }

    /**
     * Gets the value of the transUserId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransUserId }{@code >}
     *
     */
    public JAXBElement<TransUserId> getTransUserId() {
        return transUserId;
    }

    /**
     * Sets the value of the transUserId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransUserId }{@code >}
     *
     */
    public void setTransUserId(JAXBElement<TransUserId> value) {
        this.transUserId = value;
    }

    /**
     * Gets the value of the displayTransTime property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link DisplayTransTime }{@code >}
     *
     */
    public JAXBElement<DisplayTransTime> getDisplayTransTime() {
        return displayTransTime;
    }

    /**
     * Sets the value of the displayTransTime property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link DisplayTransTime }{@code >}
     *
     */
    public void setDisplayTransTime(JAXBElement<DisplayTransTime> value) {
        this.displayTransTime = value;
    }

    /**
     * Gets the value of the transactionCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransactionCode }{@code >}
     *
     */
    public JAXBElement<TransactionCode> getTransactionCode() {
        return transactionCode;
    }

    /**
     * Sets the value of the transactionCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransactionCode }{@code >}
     *
     */
    public void setTransactionCode(JAXBElement<TransactionCode> value) {
        this.transactionCode = value;
    }

    /**
     * Gets the value of the transactionDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransactionDate }{@code >}
     *
     */
    public JAXBElement<TransactionDate> getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransactionDate }{@code >}
     *
     */
    public void setTransactionDate(JAXBElement<TransactionDate> value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the inSrNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link InSrNumber }{@code >}
     *
     */
    public JAXBElement<InSrNumber> getInSrNumber() {
        return inSrNumber;
    }

    /**
     * Sets the value of the inSrNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link InSrNumber }{@code >}
     *
     */
    public void setInSrNumber(JAXBElement<InSrNumber> value) {
        this.inSrNumber = value;
    }

    /**
     * Gets the value of the inOrderNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link InOrderNumber }{@code >}
     *
     */
    public JAXBElement<InOrderNumber> getInOrderNumber() {
        return inOrderNumber;
    }

    /**
     * Sets the value of the inOrderNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link InOrderNumber }{@code >}
     *
     */
    public void setInOrderNumber(JAXBElement<InOrderNumber> value) {
        this.inOrderNumber = value;
    }

    /**
     * Gets the value of the inDueDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link InDueDate }{@code >}
     *
     */
    public JAXBElement<InDueDate> getInDueDate() {
        return inDueDate;
    }

    /**
     * Sets the value of the inDueDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link InDueDate }{@code >}
     *
     */
    public void setInDueDate(JAXBElement<InDueDate> value) {
        this.inDueDate = value;
    }

    /**
     * Gets the value of the outSrNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OutSrNumber }{@code >}
     *
     */
    public JAXBElement<OutSrNumber> getOutSrNumber() {
        return outSrNumber;
    }

    /**
     * Sets the value of the outSrNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OutSrNumber }{@code >}
     *
     */
    public void setOutSrNumber(JAXBElement<OutSrNumber> value) {
        this.outSrNumber = value;
    }

    /**
     * Gets the value of the outOrderNumber property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OutOrderNumber }{@code >}
     *
     */
    public JAXBElement<OutOrderNumber> getOutOrderNumber() {
        return outOrderNumber;
    }

    /**
     * Sets the value of the outOrderNumber property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OutOrderNumber }{@code >}
     *
     */
    public void setOutOrderNumber(JAXBElement<OutOrderNumber> value) {
        this.outOrderNumber = value;
    }

    /**
     * Gets the value of the outDueDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OutDueDate }{@code >}
     *
     */
    public JAXBElement<OutDueDate> getOutDueDate() {
        return outDueDate;
    }

    /**
     * Sets the value of the outDueDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link OutDueDate }{@code >}
     *
     */
    public void setOutDueDate(JAXBElement<OutDueDate> value) {
        this.outDueDate = value;
    }

    /**
     * Gets the value of the munCounty property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MunCounty }{@code >}
     *
     */
    public JAXBElement<MunCounty> getMunCounty() {
        return munCounty;
    }

    /**
     * Sets the value of the munCounty property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MunCounty }{@code >}
     *
     */
    public void setMunCounty(JAXBElement<MunCounty> value) {
        this.munCounty = value;
    }

    /**
     * Gets the value of the munCountyId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MunCountyId }{@code >}
     *
     */
    public JAXBElement<MunCountyId> getMunCountyId() {
        return munCountyId;
    }

    /**
     * Sets the value of the munCountyId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MunCountyId }{@code >}
     *
     */
    public void setMunCountyId(JAXBElement<MunCountyId> value) {
        this.munCountyId = value;
    }

    /**
     * Gets the value of the msagSourceId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MsagSourceId }{@code >}
     *
     */
    public JAXBElement<MsagSourceId> getMsagSourceId() {
        return msagSourceId;
    }

    /**
     * Sets the value of the msagSourceId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link MsagSourceId }{@code >}
     *
     */
    public void setMsagSourceId(JAXBElement<MsagSourceId> value) {
        this.msagSourceId = value;
    }

    /**
     * Gets the value of the esn property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Esn }{@code >}
     *
     */
    public JAXBElement<Esn> getEsn() {
        return esn;
    }

    /**
     * Sets the value of the esn property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Esn }{@code >}
     *
     */
    public void setEsn(JAXBElement<Esn> value) {
        this.esn = value;
    }

    /**
     * Gets the value of the groupInUse property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfgroupInUse }{@code >}
     *
     */
    public JAXBElement<ArrayOfgroupInUse> getGroupInUse() {
        return groupInUse;
    }

    /**
     * Sets the value of the groupInUse property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfgroupInUse }{@code >}
     *
     */
    public void setGroupInUse(JAXBElement<ArrayOfgroupInUse> value) {
        this.groupInUse = value;
    }

    /**
     * Gets the value of the udifInd property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link UdifInd }{@code >}
     *
     */
    public JAXBElement<UdifInd> getUdifInd() {
        return udifInd;
    }

    /**
     * Sets the value of the udifInd property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link UdifInd }{@code >}
     *
     */
    public void setUdifInd(JAXBElement<UdifInd> value) {
        this.udifInd = value;
    }

    /**
     * Gets the value of the canBeDeletedInd property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CanBeDeletedInd }{@code >}
     *
     */
    public JAXBElement<CanBeDeletedInd> getCanBeDeletedInd() {
        return canBeDeletedInd;
    }

    /**
     * Sets the value of the canBeDeletedInd property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link CanBeDeletedInd }{@code >}
     *
     */
    public void setCanBeDeletedInd(JAXBElement<CanBeDeletedInd> value) {
        this.canBeDeletedInd = value;
    }

    /**
     * Gets the value of the soExistsInd property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SoExistsInd }{@code >}
     *
     */
    public JAXBElement<SoExistsInd> getSoExistsInd() {
        return soExistsInd;
    }

    /**
     * Sets the value of the soExistsInd property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link SoExistsInd }{@code >}
     *
     */
    public void setSoExistsInd(JAXBElement<SoExistsInd> value) {
        this.soExistsInd = value;
    }

    /**
     * Gets the value of the lisInd property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link LisInd }{@code >}
     *
     */
    public JAXBElement<LisInd> getLisInd() {
        return lisInd;
    }

    /**
     * Sets the value of the lisInd property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link LisInd }{@code >}
     *
     */
    public void setLisInd(JAXBElement<LisInd> value) {
        this.lisInd = value;
    }

    /**
     * Gets the value of the additionalAcptsInd property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AdditionalAcptsInd }{@code >}
     *
     */
    public JAXBElement<AdditionalAcptsInd> getAdditionalAcptsInd() {
        return additionalAcptsInd;
    }

    /**
     * Sets the value of the additionalAcptsInd property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link AdditionalAcptsInd }{@code >}
     *
     */
    public void setAdditionalAcptsInd(JAXBElement<AdditionalAcptsInd> value) {
        this.additionalAcptsInd = value;
    }

    /**
     * Gets the value of the protectionExistsInd property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProtectionExistsInd }{@code >}
     *
     */
    public JAXBElement<ProtectionExistsInd> getProtectionExistsInd() {
        return protectionExistsInd;
    }

    /**
     * Sets the value of the protectionExistsInd property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProtectionExistsInd }{@code >}
     *
     */
    public void setProtectionExistsInd(JAXBElement<ProtectionExistsInd> value) {
        this.protectionExistsInd = value;
    }

    /**
     * Gets the value of the broadbandExistsInd property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link BroadbandExistsInd }{@code >}
     *
     */
    public JAXBElement<BroadbandExistsInd> getBroadbandExistsInd() {
        return broadbandExistsInd;
    }

    /**
     * Sets the value of the broadbandExistsInd property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link BroadbandExistsInd }{@code >}
     *
     */
    public void setBroadbandExistsInd(JAXBElement<BroadbandExistsInd> value) {
        this.broadbandExistsInd = value;
    }

    /**
     * Gets the value of the dslRdgsExistInd property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link DslRdgsExistInd }{@code >}
     *
     */
    public JAXBElement<DslRdgsExistInd> getDslRdgsExistInd() {
        return dslRdgsExistInd;
    }

    /**
     * Sets the value of the dslRdgsExistInd property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link DslRdgsExistInd }{@code >}
     *
     */
    public void setDslRdgsExistInd(JAXBElement<DslRdgsExistInd> value) {
        this.dslRdgsExistInd = value;
    }

    /**
     * Gets the value of the nonMartensAddrInd property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link NonMartensAddrInd }{@code >}
     *
     */
    public JAXBElement<NonMartensAddrInd> getNonMartensAddrInd() {
        return nonMartensAddrInd;
    }

    /**
     * Sets the value of the nonMartensAddrInd property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link NonMartensAddrInd }{@code >}
     *
     */
    public void setNonMartensAddrInd(JAXBElement<NonMartensAddrInd> value) {
        this.nonMartensAddrInd = value;
    }

}
