
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for UserSO complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="UserSO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="address2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="city" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="createdDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="emailAddress" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailAddressOnRecord" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="emailModifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="fax" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="firstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="middleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="mobilePhoneUS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="modifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="nightPhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nightPhoneUS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="notificationPref" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pager" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="pagerUS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="phoneUS" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="realm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="state" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userId" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="userSetupDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="userType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="username" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="zip" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserSO", propOrder = {
    "address1",
    "address2",
    "city",
    "country",
    "createdDate",
    "emailAddress",
    "emailAddressOnRecord",
    "emailModifiedDate",
    "fax",
    "firstName",
    "lastName",
    "middleName",
    "mobilePhone",
    "mobilePhoneUS",
    "modifiedDate",
    "nightPhone",
    "nightPhoneUS",
    "notificationPref",
    "pager",
    "pagerUS",
    "phone",
    "phoneExt",
    "phoneUS",
    "realm",
    "state",
    "status",
    "timezone",
    "userId",
    "userSetupDate",
    "userType",
    "username",
    "zip"
})
public class UserSO {

    protected String address1;
    protected String address2;
    protected String city;
    protected String country;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createdDate;
    protected String emailAddress;
    protected String emailAddressOnRecord;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar emailModifiedDate;
    protected String fax;
    protected String firstName;
    protected String lastName;
    protected String middleName;
    protected String mobilePhone;
    protected boolean mobilePhoneUS;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar modifiedDate;
    protected String nightPhone;
    protected boolean nightPhoneUS;
    protected String notificationPref;
    protected String pager;
    protected boolean pagerUS;
    protected String phone;
    protected String phoneExt;
    protected boolean phoneUS;
    protected String realm;
    protected String state;
    protected boolean status;
    protected Long timezone;
    protected Long userId;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar userSetupDate;
    protected String userType;
    protected String username;
    protected String zip;

    /**
     * Gets the value of the address1 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * Sets the value of the address1 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

    /**
     * Gets the value of the address2 property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * Sets the value of the address2 property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setAddress2(String value) {
        this.address2 = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCity() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCity(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCountry() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the createdDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public void setCreatedDate(XMLGregorianCalendar value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the emailAddress property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the value of the emailAddress property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmailAddress(String value) {
        this.emailAddress = value;
    }

    /**
     * Gets the value of the emailAddressOnRecord property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getEmailAddressOnRecord() {
        return emailAddressOnRecord;
    }

    /**
     * Sets the value of the emailAddressOnRecord property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setEmailAddressOnRecord(String value) {
        this.emailAddressOnRecord = value;
    }

    /**
     * Gets the value of the emailModifiedDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getEmailModifiedDate() {
        return emailModifiedDate;
    }

    /**
     * Sets the value of the emailModifiedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public void setEmailModifiedDate(XMLGregorianCalendar value) {
        this.emailModifiedDate = value;
    }

    /**
     * Gets the value of the fax property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFax() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFax(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the firstName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the middleName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * Sets the value of the middleName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * Gets the value of the mobilePhone property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * Sets the value of the mobilePhone property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * Gets the value of the mobilePhoneUS property.
     *
     */
    public boolean isMobilePhoneUS() {
        return mobilePhoneUS;
    }

    /**
     * Sets the value of the mobilePhoneUS property.
     *
     */
    public void setMobilePhoneUS(boolean value) {
        this.mobilePhoneUS = value;
    }

    /**
     * Gets the value of the modifiedDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getModifiedDate() {
        return modifiedDate;
    }

    /**
     * Sets the value of the modifiedDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public void setModifiedDate(XMLGregorianCalendar value) {
        this.modifiedDate = value;
    }

    /**
     * Gets the value of the nightPhone property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNightPhone() {
        return nightPhone;
    }

    /**
     * Sets the value of the nightPhone property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNightPhone(String value) {
        this.nightPhone = value;
    }

    /**
     * Gets the value of the nightPhoneUS property.
     *
     */
    public boolean isNightPhoneUS() {
        return nightPhoneUS;
    }

    /**
     * Sets the value of the nightPhoneUS property.
     *
     */
    public void setNightPhoneUS(boolean value) {
        this.nightPhoneUS = value;
    }

    /**
     * Gets the value of the notificationPref property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNotificationPref() {
        return notificationPref;
    }

    /**
     * Sets the value of the notificationPref property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNotificationPref(String value) {
        this.notificationPref = value;
    }

    /**
     * Gets the value of the pager property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPager() {
        return pager;
    }

    /**
     * Sets the value of the pager property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPager(String value) {
        this.pager = value;
    }

    /**
     * Gets the value of the pagerUS property.
     *
     */
    public boolean isPagerUS() {
        return pagerUS;
    }

    /**
     * Sets the value of the pagerUS property.
     *
     */
    public void setPagerUS(boolean value) {
        this.pagerUS = value;
    }

    /**
     * Gets the value of the phone property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhone() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the phoneExt property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPhoneExt() {
        return phoneExt;
    }

    /**
     * Sets the value of the phoneExt property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPhoneExt(String value) {
        this.phoneExt = value;
    }

    /**
     * Gets the value of the phoneUS property.
     *
     */
    public boolean isPhoneUS() {
        return phoneUS;
    }

    /**
     * Sets the value of the phoneUS property.
     *
     */
    public void setPhoneUS(boolean value) {
        this.phoneUS = value;
    }

    /**
     * Gets the value of the realm property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRealm() {
        return realm;
    }

    /**
     * Sets the value of the realm property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRealm(String value) {
        this.realm = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getState() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the status property.
     *
     */
    public boolean isStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     */
    public void setStatus(boolean value) {
        this.status = value;
    }

    /**
     * Gets the value of the timezone property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getTimezone() {
        return timezone;
    }

    /**
     * Sets the value of the timezone property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setTimezone(Long value) {
        this.timezone = value;
    }

    /**
     * Gets the value of the userId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * Sets the value of the userId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setUserId(Long value) {
        this.userId = value;
    }

    /**
     * Gets the value of the userSetupDate property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getUserSetupDate() {
        return userSetupDate;
    }

    /**
     * Sets the value of the userSetupDate property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.datatype.XMLGregorianCalendar }
     *
     */
    public void setUserSetupDate(XMLGregorianCalendar value) {
        this.userSetupDate = value;
    }

    /**
     * Gets the value of the userType property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Sets the value of the userType property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUserType(String value) {
        this.userType = value;
    }

    /**
     * Gets the value of the username property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getUsername() {
        return username;
    }

    /**
     * Sets the value of the username property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setUsername(String value) {
        this.username = value;
    }

    /**
     * Gets the value of the zip property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getZip() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setZip(String value) {
        this.zip = value;
    }

}
