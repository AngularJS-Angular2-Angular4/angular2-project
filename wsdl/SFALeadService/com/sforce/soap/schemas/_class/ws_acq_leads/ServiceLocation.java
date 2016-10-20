
package com.sforce.soap.schemas._class.ws_acq_leads;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceLocation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ServiceLocation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddressID" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="AddrLine1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddrLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="City" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactTN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="H" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Latitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Longitude" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrimaryTN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Products" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="QualAttrs" type="{http://soap.sforce.com/schemas/class/WS_ACQ_Leads}QualificationAttr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ServiceLocationId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SwcCLLI" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SwcNPA" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SwcNXX" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="V" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceLocation", propOrder = {
    "addressID",
    "addrLine1",
    "addrLine2",
    "city",
    "comments",
    "contactTN",
    "country",
    "email",
    "fName",
    "h",
    "latitude",
    "lName",
    "longitude",
    "name",
    "primaryTN",
    "products",
    "qualAttrs",
    "serviceLocationId",
    "source",
    "state",
    "swcCLLI",
    "swcNPA",
    "swcNXX",
    "v",
    "zip"
})
public class ServiceLocation {

    @XmlElementRef(name = "AddressID", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<Double> addressID;
    @XmlElementRef(name = "AddrLine1", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addrLine1;
    @XmlElementRef(name = "AddrLine2", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addrLine2;
    @XmlElementRef(name = "City", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> city;
    @XmlElementRef(name = "Comments", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> comments;
    @XmlElementRef(name = "ContactTN", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> contactTN;
    @XmlElementRef(name = "Country", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> country;
    @XmlElementRef(name = "Email", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> email;
    @XmlElementRef(name = "FName", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fName;
    @XmlElementRef(name = "H", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> h;
    @XmlElementRef(name = "Latitude", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> latitude;
    @XmlElementRef(name = "LName", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> lName;
    @XmlElementRef(name = "Longitude", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> longitude;
    @XmlElementRef(name = "name", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElementRef(name = "PrimaryTN", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> primaryTN;
    @XmlElementRef(name = "Products", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> products;
    @XmlElement(name = "QualAttrs", nillable = true)
    protected List<QualificationAttr> qualAttrs;
    @XmlElementRef(name = "ServiceLocationId", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> serviceLocationId;
    @XmlElementRef(name = "Source", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> source;
    @XmlElementRef(name = "State", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> state;
    @XmlElementRef(name = "SwcCLLI", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> swcCLLI;
    @XmlElementRef(name = "SwcNPA", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> swcNPA;
    @XmlElementRef(name = "SwcNXX", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> swcNXX;
    @XmlElementRef(name = "V", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> v;
    @XmlElementRef(name = "Zip", namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zip;

    /**
     * Gets the value of the addressID property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Double }{@code >}
     *
     */
    public JAXBElement<Double> getAddressID() {
        return addressID;
    }

    /**
     * Sets the value of the addressID property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link Double }{@code >}
     *
     */
    public void setAddressID(JAXBElement<Double> value) {
        this.addressID = value;
    }

    /**
     * Gets the value of the addrLine1 property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAddrLine1() {
        return addrLine1;
    }

    /**
     * Sets the value of the addrLine1 property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAddrLine1(JAXBElement<String> value) {
        this.addrLine1 = value;
    }

    /**
     * Gets the value of the addrLine2 property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getAddrLine2() {
        return addrLine2;
    }

    /**
     * Sets the value of the addrLine2 property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setAddrLine2(JAXBElement<String> value) {
        this.addrLine2 = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCity(JAXBElement<String> value) {
        this.city = value;
    }

    /**
     * Gets the value of the comments property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getComments() {
        return comments;
    }

    /**
     * Sets the value of the comments property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setComments(JAXBElement<String> value) {
        this.comments = value;
    }

    /**
     * Gets the value of the contactTN property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getContactTN() {
        return contactTN;
    }

    /**
     * Sets the value of the contactTN property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setContactTN(JAXBElement<String> value) {
        this.contactTN = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setCountry(JAXBElement<String> value) {
        this.country = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getEmail() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setEmail(JAXBElement<String> value) {
        this.email = value;
    }

    /**
     * Gets the value of the fName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getFName() {
        return fName;
    }

    /**
     * Sets the value of the fName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setFName(JAXBElement<String> value) {
        this.fName = value;
    }

    /**
     * Gets the value of the h property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getH() {
        return h;
    }

    /**
     * Sets the value of the h property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setH(JAXBElement<String> value) {
        this.h = value;
    }

    /**
     * Gets the value of the latitude property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLatitude() {
        return latitude;
    }

    /**
     * Sets the value of the latitude property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLatitude(JAXBElement<String> value) {
        this.latitude = value;
    }

    /**
     * Gets the value of the lName property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLName() {
        return lName;
    }

    /**
     * Sets the value of the lName property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLName(JAXBElement<String> value) {
        this.lName = value;
    }

    /**
     * Gets the value of the longitude property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getLongitude() {
        return longitude;
    }

    /**
     * Sets the value of the longitude property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setLongitude(JAXBElement<String> value) {
        this.longitude = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the primaryTN property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getPrimaryTN() {
        return primaryTN;
    }

    /**
     * Sets the value of the primaryTN property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setPrimaryTN(JAXBElement<String> value) {
        this.primaryTN = value;
    }

    /**
     * Gets the value of the products property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getProducts() {
        return products;
    }

    /**
     * Sets the value of the products property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setProducts(JAXBElement<String> value) {
        this.products = value;
    }

    /**
     * Gets the value of the qualAttrs property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the qualAttrs property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQualAttrs().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QualificationAttr }
     *
     *
     */
    public List<QualificationAttr> getQualAttrs() {
        if (qualAttrs == null) {
            qualAttrs = new ArrayList<QualificationAttr>();
        }
        return this.qualAttrs;
    }

    /**
     * Gets the value of the serviceLocationId property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getServiceLocationId() {
        return serviceLocationId;
    }

    /**
     * Sets the value of the serviceLocationId property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setServiceLocationId(JAXBElement<String> value) {
        this.serviceLocationId = value;
    }

    /**
     * Gets the value of the source property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSource(JAXBElement<String> value) {
        this.source = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setState(JAXBElement<String> value) {
        this.state = value;
    }

    /**
     * Gets the value of the swcCLLI property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSwcCLLI() {
        return swcCLLI;
    }

    /**
     * Sets the value of the swcCLLI property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSwcCLLI(JAXBElement<String> value) {
        this.swcCLLI = value;
    }

    /**
     * Gets the value of the swcNPA property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSwcNPA() {
        return swcNPA;
    }

    /**
     * Sets the value of the swcNPA property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSwcNPA(JAXBElement<String> value) {
        this.swcNPA = value;
    }

    /**
     * Gets the value of the swcNXX property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getSwcNXX() {
        return swcNXX;
    }

    /**
     * Sets the value of the swcNXX property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setSwcNXX(JAXBElement<String> value) {
        this.swcNXX = value;
    }

    /**
     * Gets the value of the v property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getV() {
        return v;
    }

    /**
     * Sets the value of the v property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setV(JAXBElement<String> value) {
        this.v = value;
    }

    /**
     * Gets the value of the zip property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setZip(JAXBElement<String> value) {
        this.zip = value;
    }

}
