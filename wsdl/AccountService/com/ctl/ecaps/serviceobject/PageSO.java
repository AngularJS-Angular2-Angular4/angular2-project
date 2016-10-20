
package com.ctl.ecaps.serviceobject;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PageSO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PageSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="blockSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sortData" type="{http://ecaps.ctl.com/serviceObject}SortSO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="startIndex" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PageSO", propOrder = {
    "blockSize",
    "sortData",
    "startIndex"
})
public class PageSO {

    protected int blockSize;
    @XmlElement(nillable = true)
    protected List<SortSO> sortData;
    protected int startIndex;

    /**
     * Gets the value of the blockSize property.
     * 
     */
    public int getBlockSize() {
        return blockSize;
    }

    /**
     * Sets the value of the blockSize property.
     * 
     */
    public void setBlockSize(int value) {
        this.blockSize = value;
    }

    /**
     * Gets the value of the sortData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SortSO }
     * 
     * 
     */
    public List<SortSO> getSortData() {
        if (sortData == null) {
            sortData = new ArrayList<SortSO>();
        }
        return this.sortData;
    }

    /**
     * Gets the value of the startIndex property.
     * 
     */
    public int getStartIndex() {
        return startIndex;
    }

    /**
     * Sets the value of the startIndex property.
     * 
     */
    public void setStartIndex(int value) {
        this.startIndex = value;
    }

}
