
package org.w3.namespace;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FNIdentity complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FNIdentity">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProcessID" type="{http://www.w3.org/namespace/}ProcessID" minOccurs="0"/>
 *         &lt;element name="ProcessName" type="{http://www.w3.org/namespace/}ProcessName" minOccurs="0"/>
 *         &lt;element name="ActivityID" type="{http://www.w3.org/namespace/}ActivityID" minOccurs="0"/>
 *         &lt;element name="ActivityName" type="{http://www.w3.org/namespace/}ActivityName" minOccurs="0"/>
 *         &lt;element name="ActivityAppCode" type="{http://www.w3.org/namespace/}ActivityAppCode" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FNIdentity", propOrder = {
    "processID",
    "processName",
    "activityID",
    "activityName",
    "activityAppCode"
})
public class FNIdentity {

    @XmlElementRef(name = "ProcessID", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProcessID> processID;
    @XmlElementRef(name = "ProcessName", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ProcessName> processName;
    @XmlElementRef(name = "ActivityID", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ActivityID> activityID;
    @XmlElementRef(name = "ActivityName", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ActivityName> activityName;
    @XmlElementRef(name = "ActivityAppCode", namespace = "http://www.w3.org/namespace/", type = JAXBElement.class, required = false)
    protected JAXBElement<ActivityAppCode> activityAppCode;

    /**
     * Gets the value of the processID property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProcessID }{@code >}
     *
     */
    public JAXBElement<ProcessID> getProcessID() {
        return processID;
    }

    /**
     * Sets the value of the processID property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProcessID }{@code >}
     *
     */
    public void setProcessID(JAXBElement<ProcessID> value) {
        this.processID = value;
    }

    /**
     * Gets the value of the processName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProcessName }{@code >}
     *
     */
    public JAXBElement<ProcessName> getProcessName() {
        return processName;
    }

    /**
     * Sets the value of the processName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ProcessName }{@code >}
     *
     */
    public void setProcessName(JAXBElement<ProcessName> value) {
        this.processName = value;
    }

    /**
     * Gets the value of the activityID property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ActivityID }{@code >}
     *
     */
    public JAXBElement<ActivityID> getActivityID() {
        return activityID;
    }

    /**
     * Sets the value of the activityID property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ActivityID }{@code >}
     *
     */
    public void setActivityID(JAXBElement<ActivityID> value) {
        this.activityID = value;
    }

    /**
     * Gets the value of the activityName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ActivityName }{@code >}
     *
     */
    public JAXBElement<ActivityName> getActivityName() {
        return activityName;
    }

    /**
     * Sets the value of the activityName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ActivityName }{@code >}
     *
     */
    public void setActivityName(JAXBElement<ActivityName> value) {
        this.activityName = value;
    }

    /**
     * Gets the value of the activityAppCode property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ActivityAppCode }{@code >}
     *
     */
    public JAXBElement<ActivityAppCode> getActivityAppCode() {
        return activityAppCode;
    }

    /**
     * Sets the value of the activityAppCode property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ActivityAppCode }{@code >}
          *
     */
    public void setActivityAppCode(JAXBElement<ActivityAppCode> value) {
        this.activityAppCode = value;
    }

}
