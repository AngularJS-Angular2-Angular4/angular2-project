
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterConditionSO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FilterConditionSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conditionalOperator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="filter" type="{http://ecaps.ctl.com/serviceObject}FilterSO" minOccurs="0"/>
 *         &lt;element name="ignoreCase" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterConditionSO", propOrder = {
    "conditionalOperator",
    "filter",
    "ignoreCase"
})
public class FilterConditionSO {

    protected String conditionalOperator;
    protected FilterSO filter;
    protected Boolean ignoreCase;

    /**
     * Gets the value of the conditionalOperator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionalOperator() {
        return conditionalOperator;
    }

    /**
     * Sets the value of the conditionalOperator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionalOperator(String value) {
        this.conditionalOperator = value;
    }

    /**
     * Gets the value of the filter property.
     * 
     * @return
     *     possible object is
     *     {@link FilterSO }
     *     
     */
    public FilterSO getFilter() {
        return filter;
    }

    /**
     * Sets the value of the filter property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterSO }
     *     
     */
    public void setFilter(FilterSO value) {
        this.filter = value;
    }

    /**
     * Gets the value of the ignoreCase property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIgnoreCase() {
        return ignoreCase;
    }

    /**
     * Sets the value of the ignoreCase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreCase(Boolean value) {
        this.ignoreCase = value;
    }

}
