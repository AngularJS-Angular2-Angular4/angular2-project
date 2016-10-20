
package java.com_qwest_qcsetup_webservice_csuporder;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SalesInformation complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="SalesInformation">
 *   &lt;complexContent>
 *     &lt;extension base="{java:com.qwest.qcsetup.webservice.csupOrder.bo}BaseView">
 *       &lt;sequence>
 *         &lt;element name="channelId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="cie" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ibuCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="meteredOrderRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nonCommissionableRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="nonMeteredOrderRevenue" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="primarySalesRepId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="primarySalesRepName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="roleName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salesAgentId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salesOfficeDesc" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salesOpportunityId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="salesSupportId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salesSupportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="salesSupportRVPName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shareRepId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="shareRepName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="sicCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SalesInformation", propOrder = {
    "channelId",
    "cie",
    "ibuCode",
    "meteredOrderRevenue",
    "nonCommissionableRevenue",
    "nonMeteredOrderRevenue",
    "primarySalesRepId",
    "primarySalesRepName",
    "roleName",
    "salesAgentId",
    "salesOfficeDesc",
    "salesOpportunityId",
    "salesSupportId",
    "salesSupportName",
    "salesSupportRVPName",
    "shareRepId",
    "shareRepName",
    "sicCode"
})
public class SalesInformation
    extends BaseView
{

    @XmlElement(required = true, nillable = true)
    protected String channelId;
    @XmlElement(required = true, nillable = true)
    protected String cie;
    @XmlElement(required = true, nillable = true)
    protected String ibuCode;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal meteredOrderRevenue;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal nonCommissionableRevenue;
    @XmlElement(required = true, nillable = true)
    protected BigDecimal nonMeteredOrderRevenue;
    @XmlElement(required = true, nillable = true)
    protected String primarySalesRepId;
    @XmlElement(required = true, nillable = true)
    protected String primarySalesRepName;
    @XmlElement(required = true, nillable = true)
    protected String roleName;
    @XmlElement(required = true, nillable = true)
    protected String salesAgentId;
    @XmlElement(required = true, nillable = true)
    protected String salesOfficeDesc;
    @XmlElement(required = true, type = Long.class, nillable = true)
    protected Long salesOpportunityId;
    @XmlElement(required = true, nillable = true)
    protected String salesSupportId;
    @XmlElement(required = true, nillable = true)
    protected String salesSupportName;
    @XmlElement(required = true, nillable = true)
    protected String salesSupportRVPName;
    @XmlElement(required = true, nillable = true)
    protected String shareRepId;
    @XmlElement(required = true, nillable = true)
    protected String shareRepName;
    @XmlElement(required = true, nillable = true)
    protected String sicCode;

    /**
     * Gets the value of the channelId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * Sets the value of the channelId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setChannelId(String value) {
        this.channelId = value;
    }

    /**
     * Gets the value of the cie property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getCie() {
        return cie;
    }

    /**
     * Sets the value of the cie property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setCie(String value) {
        this.cie = value;
    }

    /**
     * Gets the value of the ibuCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getIbuCode() {
        return ibuCode;
    }

    /**
     * Sets the value of the ibuCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setIbuCode(String value) {
        this.ibuCode = value;
    }

    /**
     * Gets the value of the meteredOrderRevenue property.
     *
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *
     */
    public BigDecimal getMeteredOrderRevenue() {
        return meteredOrderRevenue;
    }

    /**
     * Sets the value of the meteredOrderRevenue property.
     *
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *
     */
    public void setMeteredOrderRevenue(BigDecimal value) {
        this.meteredOrderRevenue = value;
    }

    /**
     * Gets the value of the nonCommissionableRevenue property.
     *
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *
     */
    public BigDecimal getNonCommissionableRevenue() {
        return nonCommissionableRevenue;
    }

    /**
     * Sets the value of the nonCommissionableRevenue property.
     *
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *
     */
    public void setNonCommissionableRevenue(BigDecimal value) {
        this.nonCommissionableRevenue = value;
    }

    /**
     * Gets the value of the nonMeteredOrderRevenue property.
     *
     * @return
     *     possible object is
     *     {@link java.math.BigDecimal }
     *
     */
    public BigDecimal getNonMeteredOrderRevenue() {
        return nonMeteredOrderRevenue;
    }

    /**
     * Sets the value of the nonMeteredOrderRevenue property.
     *
     * @param value
     *     allowed object is
     *     {@link java.math.BigDecimal }
     *
     */
    public void setNonMeteredOrderRevenue(BigDecimal value) {
        this.nonMeteredOrderRevenue = value;
    }

    /**
     * Gets the value of the primarySalesRepId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrimarySalesRepId() {
        return primarySalesRepId;
    }

    /**
     * Sets the value of the primarySalesRepId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrimarySalesRepId(String value) {
        this.primarySalesRepId = value;
    }

    /**
     * Gets the value of the primarySalesRepName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getPrimarySalesRepName() {
        return primarySalesRepName;
    }

    /**
     * Sets the value of the primarySalesRepName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setPrimarySalesRepName(String value) {
        this.primarySalesRepName = value;
    }

    /**
     * Gets the value of the roleName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setRoleName(String value) {
        this.roleName = value;
    }

    /**
     * Gets the value of the salesAgentId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSalesAgentId() {
        return salesAgentId;
    }

    /**
     * Sets the value of the salesAgentId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSalesAgentId(String value) {
        this.salesAgentId = value;
    }

    /**
     * Gets the value of the salesOfficeDesc property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSalesOfficeDesc() {
        return salesOfficeDesc;
    }

    /**
     * Sets the value of the salesOfficeDesc property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSalesOfficeDesc(String value) {
        this.salesOfficeDesc = value;
    }

    /**
     * Gets the value of the salesOpportunityId property.
     *
     * @return
     *     possible object is
     *     {@link Long }
     *
     */
    public Long getSalesOpportunityId() {
        return salesOpportunityId;
    }

    /**
     * Sets the value of the salesOpportunityId property.
     *
     * @param value
     *     allowed object is
     *     {@link Long }
     *
     */
    public void setSalesOpportunityId(Long value) {
        this.salesOpportunityId = value;
    }

    /**
     * Gets the value of the salesSupportId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSalesSupportId() {
        return salesSupportId;
    }

    /**
     * Sets the value of the salesSupportId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSalesSupportId(String value) {
        this.salesSupportId = value;
    }

    /**
     * Gets the value of the salesSupportName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSalesSupportName() {
        return salesSupportName;
    }

    /**
     * Sets the value of the salesSupportName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSalesSupportName(String value) {
        this.salesSupportName = value;
    }

    /**
     * Gets the value of the salesSupportRVPName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSalesSupportRVPName() {
        return salesSupportRVPName;
    }

    /**
     * Sets the value of the salesSupportRVPName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSalesSupportRVPName(String value) {
        this.salesSupportRVPName = value;
    }

    /**
     * Gets the value of the shareRepId property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShareRepId() {
        return shareRepId;
    }

    /**
     * Sets the value of the shareRepId property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShareRepId(String value) {
        this.shareRepId = value;
    }

    /**
     * Gets the value of the shareRepName property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getShareRepName() {
        return shareRepName;
    }

    /**
     * Sets the value of the shareRepName property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setShareRepName(String value) {
        this.shareRepName = value;
    }

    /**
     * Gets the value of the sicCode property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getSicCode() {
        return sicCode;
    }

    /**
     * Sets the value of the sicCode property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setSicCode(String value) {
        this.sicCode = value;
    }

}
