
package org.w3.namespace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for displayTransTime complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="displayTransTime">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionHour" type="{http://www.w3.org/namespace/}transactionHour" minOccurs="0"/>
 *         &lt;element name="transactionMinute" type="{http://www.w3.org/namespace/}transactionMinute" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "displayTransTime", propOrder = {
    "transactionHour",
    "transactionMinute"
})
public class DisplayTransTime {

    @XmlElementRef(name = "transactionHour", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<TransactionHour> transactionHour;
    @XmlElementRef(name = "transactionMinute", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<TransactionMinute> transactionMinute;

    /**
     * Gets the value of the transactionHour property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransactionHour }{@code >}
     *
     */
    public JAXBElement<TransactionHour> getTransactionHour() {
        return transactionHour;
    }

    /**
     * Sets the value of the transactionHour property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransactionHour }{@code >}
     *
     */
    public void setTransactionHour(JAXBElement<TransactionHour> value) {
        this.transactionHour = value;
    }

    /**
     * Gets the value of the transactionMinute property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransactionMinute }{@code >}
     *
     */
    public JAXBElement<TransactionMinute> getTransactionMinute() {
        return transactionMinute;
    }

    /**
     * Sets the value of the transactionMinute property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransactionMinute }{@code >}
     *
     */
    public void setTransactionMinute(JAXBElement<TransactionMinute> value) {
        this.transactionMinute = value;
    }

}
