
package com.ctl.ecaps.serviceobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountResponseSO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountResponseSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accounts" type="{http://ecaps.ctl.com/serviceObject}AccountSO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="rowCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="totalRowCount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountResponseSO", propOrder = {
    "accounts",
    "rowCount",
    "totalRowCount"
})
public class AccountResponseSO {

    @XmlElement(nillable = true)
    protected List<AccountSO> accounts;
    protected int rowCount;
    protected int totalRowCount;

    /**
     * Gets the value of the accounts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accounts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccounts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountSO }
     * 
     * 
     */
    public List<AccountSO> getAccounts() {
        if (accounts == null) {
            accounts = new ArrayList<AccountSO>();
        }
        return this.accounts;
    }

    /**
     * Gets the value of the rowCount property.
     * 
     */
    public int getRowCount() {
        return rowCount;
    }

    /**
     * Sets the value of the rowCount property.
     * 
     */
    public void setRowCount(int value) {
        this.rowCount = value;
    }

    /**
     * Gets the value of the totalRowCount property.
     * 
     */
    public int getTotalRowCount() {
        return totalRowCount;
    }

    /**
     * Sets the value of the totalRowCount property.
     * 
     */
    public void setTotalRowCount(int value) {
        this.totalRowCount = value;
    }

}
