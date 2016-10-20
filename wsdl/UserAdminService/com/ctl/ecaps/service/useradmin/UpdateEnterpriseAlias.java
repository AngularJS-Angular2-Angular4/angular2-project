
package com.ctl.ecaps.service.useradmin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.ctl.ecaps.serviceobject.EnterpriseAliasSO;


/**
 * <p>Java class for updateEnterpriseAlias complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateEnterpriseAlias">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="enterpriseAlias" type="{http://ecaps.ctl.com/serviceObject}EnterpriseAliasSO" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateEnterpriseAlias", propOrder = {
    "userId",
    "enterpriseAlias"
})
public class UpdateEnterpriseAlias {

    protected long userId;
    @XmlElement(required = true)
    protected List<EnterpriseAliasSO> enterpriseAlias;

    /**
     * Gets the value of the userId property.
     * 
     */
    public long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     * 
     */
    public void setUserId(long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the enterpriseAlias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the enterpriseAlias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEnterpriseAlias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EnterpriseAliasSO }
     * 
     * 
     */
    public List<EnterpriseAliasSO> getEnterpriseAlias() {
        if (enterpriseAlias == null) {
            enterpriseAlias = new ArrayList<EnterpriseAliasSO>();
        }
        return this.enterpriseAlias;
    }

}
