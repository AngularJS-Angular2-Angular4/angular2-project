
package com.iclnbi.iclnbi_v2_00;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfExchangeServiceArea complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfExchangeServiceArea">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExchangeServiceArea" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ExchangeServiceArea" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExchangeServiceArea", propOrder = {
    "exchangeServiceArea"
})
public class ArrayOfExchangeServiceArea {

    @XmlElement(name = "ExchangeServiceArea", nillable = true)
    protected List<ExchangeServiceArea> exchangeServiceArea;

    /**
     * Gets the value of the exchangeServiceArea property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangeServiceArea property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangeServiceArea().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExchangeServiceArea }
     * 
     * 
     */
    public List<ExchangeServiceArea> getExchangeServiceArea() {
        if (exchangeServiceArea == null) {
            exchangeServiceArea = new ArrayList<ExchangeServiceArea>();
        }
        return this.exchangeServiceArea;
    }

}
