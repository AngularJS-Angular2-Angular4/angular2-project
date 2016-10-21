
package com.ctl.as.domain.geo.v2.types.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.ctl.as.domain.geo.v2.types.request package.
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

    private final static QName _PostalAddressValidationRequest_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Request", "PostalAddressValidationRequest");
    private final static QName _CivicAddressValidationRequest_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Request", "CivicAddressValidationRequest");
    private final static QName _PostalAddressValidationRequestPostCode_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Request", "PostCode");
    private final static QName _PostalAddressValidationRequestStateOrProvince_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Request", "StateOrProvince");
    private final static QName _PostalAddressValidationRequestLocality_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Request", "Locality");
    private final static QName _PostalAddressValidationRequestAddressLine1_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Request", "AddressLine1");
    private final static QName _PostalAddressValidationRequestAddressLine2_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Request", "AddressLine2");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ctl.as.domain.geo.v2.types.request
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CivicAddressValidationRequest }
     *
     */
    public CivicAddressValidationRequest createCivicAddressValidationRequest() {
        return new CivicAddressValidationRequest();
    }

    /**
     * Create an instance of {@link PostalAddressValidationRequest }
     *
     */
    public PostalAddressValidationRequest createPostalAddressValidationRequest() {
        return new PostalAddressValidationRequest();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link PostalAddressValidationRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", name = "PostalAddressValidationRequest")
    public JAXBElement<PostalAddressValidationRequest> createPostalAddressValidationRequest(PostalAddressValidationRequest value) {
        return new JAXBElement<PostalAddressValidationRequest>(_PostalAddressValidationRequest_QNAME, PostalAddressValidationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link CivicAddressValidationRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", name = "CivicAddressValidationRequest")
    public JAXBElement<CivicAddressValidationRequest> createCivicAddressValidationRequest(CivicAddressValidationRequest value) {
        return new JAXBElement<CivicAddressValidationRequest>(_CivicAddressValidationRequest_QNAME, CivicAddressValidationRequest.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", name = "PostCode", scope = PostalAddressValidationRequest.class)
    public JAXBElement<String> createPostalAddressValidationRequestPostCode(String value) {
        return new JAXBElement<String>(_PostalAddressValidationRequestPostCode_QNAME, String.class, PostalAddressValidationRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", name = "StateOrProvince", scope = PostalAddressValidationRequest.class)
    public JAXBElement<String> createPostalAddressValidationRequestStateOrProvince(String value) {
        return new JAXBElement<String>(_PostalAddressValidationRequestStateOrProvince_QNAME, String.class, PostalAddressValidationRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", name = "Locality", scope = PostalAddressValidationRequest.class)
    public JAXBElement<String> createPostalAddressValidationRequestLocality(String value) {
        return new JAXBElement<String>(_PostalAddressValidationRequestLocality_QNAME, String.class, PostalAddressValidationRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", name = "AddressLine1", scope = PostalAddressValidationRequest.class)
    public JAXBElement<String> createPostalAddressValidationRequestAddressLine1(String value) {
        return new JAXBElement<String>(_PostalAddressValidationRequestAddressLine1_QNAME, String.class, PostalAddressValidationRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", name = "AddressLine2", scope = PostalAddressValidationRequest.class)
    public JAXBElement<String> createPostalAddressValidationRequestAddressLine2(String value) {
        return new JAXBElement<String>(_PostalAddressValidationRequestAddressLine2_QNAME, String.class, PostalAddressValidationRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", name = "PostCode", scope = CivicAddressValidationRequest.class)
    public JAXBElement<String> createCivicAddressValidationRequestPostCode(String value) {
        return new JAXBElement<String>(_PostalAddressValidationRequestPostCode_QNAME, String.class, CivicAddressValidationRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", name = "StateOrProvince", scope = CivicAddressValidationRequest.class)
    public JAXBElement<String> createCivicAddressValidationRequestStateOrProvince(String value) {
        return new JAXBElement<String>(_PostalAddressValidationRequestStateOrProvince_QNAME, String.class, CivicAddressValidationRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", name = "Locality", scope = CivicAddressValidationRequest.class)
    public JAXBElement<String> createCivicAddressValidationRequestLocality(String value) {
        return new JAXBElement<String>(_PostalAddressValidationRequestLocality_QNAME, String.class, CivicAddressValidationRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Request", name = "AddressLine1", scope = CivicAddressValidationRequest.class)
    public JAXBElement<String> createCivicAddressValidationRequestAddressLine1(String value) {
        return new JAXBElement<String>(_PostalAddressValidationRequestAddressLine1_QNAME, String.class, CivicAddressValidationRequest.class, value);
    }

}
