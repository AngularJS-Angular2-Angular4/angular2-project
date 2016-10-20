
package com.ctl.ecaps.service.enterpriseadmin;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for assignRespOrgIdsByRmcId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assignRespOrgIdsByRmcId">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rmcId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="respOrgIdList" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assignRespOrgIdsByRmcId", propOrder = {
    "rmcId",
    "respOrgIdList"
})
public class AssignRespOrgIdsByRmcId {

    @XmlElement(required = true)
    protected String rmcId;
    @XmlElement(required = true)
    protected List<String> respOrgIdList;

    /**
     * Gets the value of the rmcId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRmcId() {
        return rmcId;
    }

    /**
     * Sets the value of the rmcId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRmcId(String value) {
        this.rmcId = value;
    }

    /**
     * Gets the value of the respOrgIdList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the respOrgIdList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRespOrgIdList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRespOrgIdList() {
        if (respOrgIdList == null) {
            respOrgIdList = new ArrayList<String>();
        }
        return this.respOrgIdList;
    }

}
