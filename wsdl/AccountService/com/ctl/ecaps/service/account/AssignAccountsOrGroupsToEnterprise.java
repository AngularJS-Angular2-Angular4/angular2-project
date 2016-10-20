
package com.ctl.ecaps.service.account;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ctl.ecaps.serviceobject.AccountRefSO;


/**
 * <p>Java class for assignAccountsOrGroupsToEnterprise complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignAccountsOrGroupsToEnterprise">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="enterpriseId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="accounts" type="{http://ecaps.ctl.com/serviceObject}AccountRefSO" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignAccountsOrGroupsToEnterprise", propOrder = {
    "enterpriseId",
    "accounts"
})
public class AssignAccountsOrGroupsToEnterprise {

    protected long enterpriseId;
    @XmlElement(required = true)
    protected List<AccountRefSO> accounts;

    /**
     * Gets the value of the enterpriseId property.
     * 
     */
    public long getEnterpriseId() {
        return enterpriseId;
    }

    /**
     * Sets the value of the enterpriseId property.
     * 
     */
    public void setEnterpriseId(long value) {
        this.enterpriseId = value;
    }

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
     * {@link AccountRefSO }
     * 
     * 
     */
    public List<AccountRefSO> getAccounts() {
        if (accounts == null) {
            accounts = new ArrayList<AccountRefSO>();
        }
        return this.accounts;
    }

}
