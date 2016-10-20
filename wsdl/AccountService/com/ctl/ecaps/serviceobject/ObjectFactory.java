
package com.ctl.ecaps.serviceobject;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.ctl.ecaps.serviceobject package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FaultDetailSO_QNAME = new QName("http://ecaps.ctl.com/serviceObject", "FaultDetailSO");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ctl.ecaps.serviceobject
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FaultDetailSO }
     *
     */
    public FaultDetailSO createFaultDetailSO() {
        return new FaultDetailSO();
    }

    /**
     * Create an instance of {@link PageSO }
     *
     */
    public PageSO createPageSO() {
        return new PageSO();
    }

    /**
     * Create an instance of {@link AuthenticationSO }
     *
     */
    public AuthenticationSO createAuthenticationSO() {
        return new AuthenticationSO();
    }

    /**
     * Create an instance of {@link AccountStatusSO }
     *
     */
    public AccountStatusSO createAccountStatusSO() {
        return new AccountStatusSO();
    }

    /**
     * Create an instance of {@link DiscountGroupSO }
     *
     */
    public DiscountGroupSO createDiscountGroupSO() {
        return new DiscountGroupSO();
    }

    /**
     * Create an instance of {@link EntitledAccountSO }
     *
     */
    public EntitledAccountSO createEntitledAccountSO() {
        return new EntitledAccountSO();
    }

    /**
     * Create an instance of {@link EntitledAccountResponseSO }
     *
     */
    public EntitledAccountResponseSO createEntitledAccountResponseSO() {
        return new EntitledAccountResponseSO();
    }

    /**
     * Create an instance of {@link AccountRequestSO }
     *
     */
    public AccountRequestSO createAccountRequestSO() {
        return new AccountRequestSO();
    }

    /**
     * Create an instance of {@link RegAccountStatusSO }
     *
     */
    public RegAccountStatusSO createRegAccountStatusSO() {
        return new RegAccountStatusSO();
    }

    /**
     * Create an instance of {@link AccountSO }
     *
     */
    public AccountSO createAccountSO() {
        return new AccountSO();
    }

    /**
     * Create an instance of {@link WhslAcctAttributeSO }
     *
     */
    public WhslAcctAttributeSO createWhslAcctAttributeSO() {
        return new WhslAcctAttributeSO();
    }

    /**
     * Create an instance of {@link AccountFilterSO }
     *
     */
    public AccountFilterSO createAccountFilterSO() {
        return new AccountFilterSO();
    }

    /**
     * Create an instance of {@link FilterExpressionSO }
     *
     */
    public FilterExpressionSO createFilterExpressionSO() {
        return new FilterExpressionSO();
    }

    /**
     * Create an instance of {@link EntitlementSO }
     *
     */
    public EntitlementSO createEntitlementSO() {
        return new EntitlementSO();
    }

    /**
     * Create an instance of {@link SortSO }
     *
     */
    public SortSO createSortSO() {
        return new SortSO();
    }

    /**
     * Create an instance of {@link AccountMappingSO }
     *
     */
    public AccountMappingSO createAccountMappingSO() {
        return new AccountMappingSO();
    }

    /**
     * Create an instance of {@link FilterConditionSO }
     *
     */
    public FilterConditionSO createFilterConditionSO() {
        return new FilterConditionSO();
    }

    /**
     * Create an instance of {@link AccountResponseSO }
     *
     */
    public AccountResponseSO createAccountResponseSO() {
        return new AccountResponseSO();
    }

    /**
     * Create an instance of {@link AccountRefSO }
     *
     */
    public AccountRefSO createAccountRefSO() {
        return new AccountRefSO();
    }

    /**
     * Create an instance of {@link AccountDetailSO }
     *
     */
    public AccountDetailSO createAccountDetailSO() {
        return new AccountDetailSO();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link FaultDetailSO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ecaps.ctl.com/serviceObject", name = "FaultDetailSO")
    public JAXBElement<FaultDetailSO> createFaultDetailSO(FaultDetailSO value) {
        return new JAXBElement<FaultDetailSO>(_FaultDetailSO_QNAME, FaultDetailSO.class, null, value);
    }

}
