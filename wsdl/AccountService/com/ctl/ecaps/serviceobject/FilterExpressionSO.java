
package com.ctl.ecaps.serviceobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FilterExpressionSO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FilterExpressionSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="conditions" type="{http://ecaps.ctl.com/serviceObject}FilterConditionSO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="expression" type="{http://ecaps.ctl.com/serviceObject}FilterExpressionSO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="operator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FilterExpressionSO", propOrder = {
    "conditions",
    "expression",
    "operator"
})
public class FilterExpressionSO {

    @XmlElement(nillable = true)
    protected List<FilterConditionSO> conditions;
    @XmlElement(nillable = true)
    protected List<FilterExpressionSO> expression;
    protected String operator;

    /**
     * Gets the value of the conditions property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the conditions property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConditions().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FilterConditionSO }
     *
     *
     */
    public List<FilterConditionSO> getConditions() {
        if (conditions == null) {
            conditions = new ArrayList<FilterConditionSO>();
        }
        return this.conditions;
    }

    /**
     * Gets the value of the expression property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the expression property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExpression().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.ctl.ecaps.serviceobject.FilterExpressionSO }
     *
     *
     */
    public List<FilterExpressionSO> getExpression() {
        if (expression == null) {
            expression = new ArrayList<FilterExpressionSO>();
        }
        return this.expression;
    }

    /**
     * Gets the value of the operator property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getOperator() {
        return operator;
    }

    /**
     * Sets the value of the operator property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setOperator(String value) {
        this.operator = value;
    }

}
