
package com.qwest.xmlschema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfVideoConnectionT complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfVideoConnectionT">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VideoConnectionT" type="{http://www.qwest.com/XMLSchema}VideoConnectionT" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVideoConnectionT", propOrder = {
    "videoConnectionT"
})
public class ArrayOfVideoConnectionT {

    @XmlElement(name = "VideoConnectionT", nillable = true)
    protected List<VideoConnectionT> videoConnectionT;

    /**
     * Gets the value of the videoConnectionT property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the videoConnectionT property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideoConnectionT().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VideoConnectionT }
     * 
     * 
     */
    public List<VideoConnectionT> getVideoConnectionT() {
        if (videoConnectionT == null) {
            videoConnectionT = new ArrayList<VideoConnectionT>();
        }
        return this.videoConnectionT;
    }

}
