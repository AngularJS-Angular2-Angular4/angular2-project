
package org.w3.namespace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transactionDate complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="transactionDate">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="transactionMonth" type="{http://www.w3.org/namespace/}transactionMonth" minOccurs="0"/>
 *         &lt;element name="transactionDay" type="{http://www.w3.org/namespace/}transactionDay" minOccurs="0"/>
 *         &lt;element name="transactionYear" type="{http://www.w3.org/namespace/}transactionYear" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transactionDate", propOrder = {
    "transactionMonth",
    "transactionDay",
    "transactionYear"
})
public class TransactionDate {

    @XmlElementRef(name = "transactionMonth", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<TransactionMonth> transactionMonth;
    @XmlElementRef(name = "transactionDay", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<TransactionDay> transactionDay;
    @XmlElementRef(name = "transactionYear", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<TransactionYear> transactionYear;

    /**
     * Gets the value of the transactionMonth property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransactionMonth }{@code >}
     *
     */
    public JAXBElement<TransactionMonth> getTransactionMonth() {
        return transactionMonth;
    }

    /**
     * Sets the value of the transactionMonth property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransactionMonth }{@code >}
     *
     */
    public void setTransactionMonth(JAXBElement<TransactionMonth> value) {
        this.transactionMonth = value;
    }

    /**
     * Gets the value of the transactionDay property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransactionDay }{@code >}
     *
     */
    public JAXBElement<TransactionDay> getTransactionDay() {
        return transactionDay;
    }

    /**
     * Sets the value of the transactionDay property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransactionDay }{@code >}
     *
     */
    public void setTransactionDay(JAXBElement<TransactionDay> value) {
        this.transactionDay = value;
    }

    /**
     * Gets the value of the transactionYear property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransactionYear }{@code >}
     *
     */
    public JAXBElement<TransactionYear> getTransactionYear() {
        return transactionYear;
    }

    /**
     * Sets the value of the transactionYear property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link TransactionYear }{@code >}
     *
     */
    public void setTransactionYear(JAXBElement<TransactionYear> value) {
        this.transactionYear = value;
    }

}
