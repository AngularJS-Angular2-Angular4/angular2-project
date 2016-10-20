
package com.ctl.ecaps.exceptions;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.ctl.ecaps.serviceobject.FaultDetailSO;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.ctl.ecaps.exceptions package.
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

    private final static QName _ServiceSystemException_QNAME = new QName("http://ecaps.ctl.com/exceptions", "ServiceSystemException");
    private final static QName _ServiceValidationException_QNAME = new QName("http://ecaps.ctl.com/exceptions", "ServiceValidationException");
    private final static QName _ServiceAuthorizationException_QNAME = new QName("http://ecaps.ctl.com/exceptions", "ServiceAuthorizationException");
    private final static QName _ServiceAuthenticationException_QNAME = new QName("http://ecaps.ctl.com/exceptions", "ServiceAuthenticationException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ctl.ecaps.exceptions
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link FaultDetailSO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ecaps.ctl.com/exceptions", name = "ServiceSystemException")
    public JAXBElement<FaultDetailSO> createServiceSystemException(FaultDetailSO value) {
        return new JAXBElement<FaultDetailSO>(_ServiceSystemException_QNAME, FaultDetailSO.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link FaultDetailSO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ecaps.ctl.com/exceptions", name = "ServiceValidationException")
    public JAXBElement<FaultDetailSO> createServiceValidationException(FaultDetailSO value) {
        return new JAXBElement<FaultDetailSO>(_ServiceValidationException_QNAME, FaultDetailSO.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link FaultDetailSO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ecaps.ctl.com/exceptions", name = "ServiceAuthorizationException")
    public JAXBElement<FaultDetailSO> createServiceAuthorizationException(FaultDetailSO value) {
        return new JAXBElement<FaultDetailSO>(_ServiceAuthorizationException_QNAME, FaultDetailSO.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link FaultDetailSO }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://ecaps.ctl.com/exceptions", name = "ServiceAuthenticationException")
    public JAXBElement<FaultDetailSO> createServiceAuthenticationException(FaultDetailSO value) {
        return new JAXBElement<FaultDetailSO>(_ServiceAuthenticationException_QNAME, FaultDetailSO.class, null, value);
    }

}
