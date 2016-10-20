
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountFieldsT.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountFieldsT">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="accountId"/>
 *     &lt;enumeration value="accountSystemCode"/>
 *     &lt;enumeration value="accountName"/>
 *     &lt;enumeration value="accountChannelId"/>
 *     &lt;enumeration value="accountTypeCode"/>
 *     &lt;enumeration value="subAccountGroupId"/>
 *     &lt;enumeration value="subAccountTypeCode"/>
 *     &lt;enumeration value="statusCode"/>
 *     &lt;enumeration value="disconnectDate"/>
 *     &lt;enumeration value="ctaId"/>
 *     &lt;enumeration value="discountGroupId"/>
 *     &lt;enumeration value="salesRepId"/>
 *     &lt;enumeration value="sourceSystemCode"/>
 *     &lt;enumeration value="sourceSystem"/>
 *     &lt;enumeration value="accountMarketUnitId"/>
 *     &lt;enumeration value="accountAliasName"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AccountFieldsT")
@XmlEnum
public enum AccountFieldsT {

    @XmlEnumValue("accountId")
    ACCOUNT_ID("accountId"),
    @XmlEnumValue("accountSystemCode")
    ACCOUNT_SYSTEM_CODE("accountSystemCode"),
    @XmlEnumValue("accountName")
    ACCOUNT_NAME("accountName"),
    @XmlEnumValue("accountChannelId")
    ACCOUNT_CHANNEL_ID("accountChannelId"),
    @XmlEnumValue("accountTypeCode")
    ACCOUNT_TYPE_CODE("accountTypeCode"),
    @XmlEnumValue("subAccountGroupId")
    SUB_ACCOUNT_GROUP_ID("subAccountGroupId"),
    @XmlEnumValue("subAccountTypeCode")
    SUB_ACCOUNT_TYPE_CODE("subAccountTypeCode"),
    @XmlEnumValue("statusCode")
    STATUS_CODE("statusCode"),
    @XmlEnumValue("disconnectDate")
    DISCONNECT_DATE("disconnectDate"),
    @XmlEnumValue("ctaId")
    CTA_ID("ctaId"),
    @XmlEnumValue("discountGroupId")
    DISCOUNT_GROUP_ID("discountGroupId"),
    @XmlEnumValue("salesRepId")
    SALES_REP_ID("salesRepId"),
    @XmlEnumValue("sourceSystemCode")
    SOURCE_SYSTEM_CODE("sourceSystemCode"),
    @XmlEnumValue("sourceSystem")
    SOURCE_SYSTEM("sourceSystem"),
    @XmlEnumValue("accountMarketUnitId")
    ACCOUNT_MARKET_UNIT_ID("accountMarketUnitId"),
    @XmlEnumValue("accountAliasName")
    ACCOUNT_ALIAS_NAME("accountAliasName");
    private final String value;

    AccountFieldsT(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AccountFieldsT fromValue(String v) {
        for (AccountFieldsT c: AccountFieldsT.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
