
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
     * Create an instance of {@link UserCheckRequestSO }
     *
     */
    public UserCheckRequestSO createUserCheckRequestSO() {
        return new UserCheckRequestSO();
    }

    /**
     * Create an instance of {@link UsernameCheckResultSO }
     *
     */
    public UsernameCheckResultSO createUsernameCheckResultSO() {
        return new UsernameCheckResultSO();
    }

    /**
     * Create an instance of {@link AuthenticationSO }
     *
     */
    public AuthenticationSO createAuthenticationSO() {
        return new AuthenticationSO();
    }

    /**
     * Create an instance of {@link EnterpriseSO }
     *
     */
    public EnterpriseSO createEnterpriseSO() {
        return new EnterpriseSO();
    }

    /**
     * Create an instance of {@link UserDetailSO }
     *
     */
    public UserDetailSO createUserDetailSO() {
        return new UserDetailSO();
    }

    /**
     * Create an instance of {@link UserPictureSO }
     *
     */
    public UserPictureSO createUserPictureSO() {
        return new UserPictureSO();
    }

    /**
     * Create an instance of {@link UserSO }
     *
     */
    public UserSO createUserSO() {
        return new UserSO();
    }

    /**
     * Create an instance of {@link UserFilterCriteriaSO }
     *
     */
    public UserFilterCriteriaSO createUserFilterCriteriaSO() {
        return new UserFilterCriteriaSO();
    }

    /**
     * Create an instance of {@link UserEnterpriseDataSO }
     *
     */
    public UserEnterpriseDataSO createUserEnterpriseDataSO() {
        return new UserEnterpriseDataSO();
    }

    /**
     * Create an instance of {@link UserInfoSO }
     *
     */
    public UserInfoSO createUserInfoSO() {
        return new UserInfoSO();
    }

    /**
     * Create an instance of {@link EnterpriseAliasSO }
     *
     */
    public EnterpriseAliasSO createEnterpriseAliasSO() {
        return new EnterpriseAliasSO();
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
