
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountRequestSO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountRequestSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="entitlement" type="{http://ecaps.ctl.com/serviceObject}EntitlementSO" minOccurs="0"/>
 *         &lt;element name="filterExpression" type="{http://ecaps.ctl.com/serviceObject}FilterExpressionSO" minOccurs="0"/>
 *         &lt;element name="pageData" type="{http://ecaps.ctl.com/serviceObject}PageSO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountRequestSO", propOrder = {
    "entitlement",
    "filterExpression",
    "pageData"
})
public class AccountRequestSO {

    protected EntitlementSO entitlement;
    protected FilterExpressionSO filterExpression;
    protected PageSO pageData;

    /**
     * Gets the value of the entitlement property.
     * 
     * @return
     *     possible object is
     *     {@link EntitlementSO }
     *     
     */
    public EntitlementSO getEntitlement() {
        return entitlement;
    }

    /**
     * Sets the value of the entitlement property.
     * 
     * @param value
     *     allowed object is
     *     {@link EntitlementSO }
     *     
     */
    public void setEntitlement(EntitlementSO value) {
        this.entitlement = value;
    }

    /**
     * Gets the value of the filterExpression property.
     * 
     * @return
     *     possible object is
     *     {@link FilterExpressionSO }
     *     
     */
    public FilterExpressionSO getFilterExpression() {
        return filterExpression;
    }

    /**
     * Sets the value of the filterExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link FilterExpressionSO }
     *     
     */
    public void setFilterExpression(FilterExpressionSO value) {
        this.filterExpression = value;
    }

    /**
     * Gets the value of the pageData property.
     * 
     * @return
     *     possible object is
     *     {@link PageSO }
     *     
     */
    public PageSO getPageData() {
        return pageData;
    }

    /**
     * Sets the value of the pageData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PageSO }
     *     
     */
    public void setPageData(PageSO value) {
        this.pageData = value;
    }

}
