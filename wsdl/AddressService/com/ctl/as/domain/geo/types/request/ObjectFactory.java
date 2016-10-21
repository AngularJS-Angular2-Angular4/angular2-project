
package com.ctl.as.domain.geo.types.request;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.ctl.as.domain.geo.types.ArrayOfSourceSystem;
import com.ctl.as.domain.geo.types.ArrayOfSubAddressDesignator;
import com.ctl.as.domain.geo.types.InputAddress;
import com.ctl.as.domain.geo.types.ParsedStreetAddress;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.ctl.as.domain.geo.types.request package.
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

    private final static QName _GetServiceAddressLiveRequest_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "GetServiceAddressLiveRequest");
    private final static QName _AddressManagementRequest_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "AddressManagementRequest");
    private final static QName _GetParsedAddressRequest_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "GetParsedAddressRequest");
    private final static QName _GetServiceAddressRequest_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "GetServiceAddressRequest");
    private final static QName _ValidateCivicAddressProxyRequest_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "ValidateCivicAddressProxyRequest");
    private final static QName _ClcSearchResourceProxyRequest_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "ClcSearchResourceProxyRequest");
    private final static QName _GetSubAddressesRequest_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "GetSubAddressesRequest");
    private final static QName _IsThisAddressServiceableRequest_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "IsThisAddressServiceableRequest");
    private final static QName _SubscriberAddressInquiryProxyRequest_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "SubscriberAddressInquiryProxyRequest");
    private final static QName _GetSubAddressesRequestAddressId_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "AddressId");
    private final static QName _GetSubAddressesRequestSources_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "Sources");
    private final static QName _SubscriberAddressInquiryProxyRequestInputAddress_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "InputAddress");
    private final static QName _GetServiceAddressRequestSubAddressId_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "SubAddressId");
    private final static QName _GetServiceAddressRequestSourceSystemId_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "SourceSystemId");
    private final static QName _GetServiceAddressRequestSubAddress_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "SubAddress");
    private final static QName _GetServiceAddressRequestParsedSubAddress_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "ParsedSubAddress");
    private final static QName _GetParsedAddressRequestBaseAddressString_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "BaseAddressString");
    private final static QName _ValidateCivicAddressProxyRequestStateOrProvince_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "StateOrProvince");
    private final static QName _ValidateCivicAddressProxyRequestLocality_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "Locality");
    private final static QName _ValidateCivicAddressProxyRequestPostCode_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "PostCode");
    private final static QName _ValidateCivicAddressProxyRequestParsedStreetAddress_QNAME = new QName("http://geo.domain.as.ctl.com/Types/Request", "ParsedStreetAddress");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ctl.as.domain.geo.types.request
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClcSearchResourceProxyRequest }
     *
     */
    public ClcSearchResourceProxyRequest createClcSearchResourceProxyRequest() {
        return new ClcSearchResourceProxyRequest();
    }

    /**
     * Create an instance of {@link IsThisAddressServiceableRequest }
     *
     */
    public IsThisAddressServiceableRequest createIsThisAddressServiceableRequest() {
        return new IsThisAddressServiceableRequest();
    }

    /**
     * Create an instance of {@link GetServiceAddressRequest }
     *
     */
    public GetServiceAddressRequest createGetServiceAddressRequest() {
        return new GetServiceAddressRequest();
    }

    /**
     * Create an instance of {@link GetServiceAddressLiveRequest }
     *
     */
    public GetServiceAddressLiveRequest createGetServiceAddressLiveRequest() {
        return new GetServiceAddressLiveRequest();
    }

    /**
     * Create an instance of {@link SubscriberAddressInquiryProxyRequest }
     *
     */
    public SubscriberAddressInquiryProxyRequest createSubscriberAddressInquiryProxyRequest() {
        return new SubscriberAddressInquiryProxyRequest();
    }

    /**
     * Create an instance of {@link GetParsedAddressRequest }
     *
     */
    public GetParsedAddressRequest createGetParsedAddressRequest() {
        return new GetParsedAddressRequest();
    }

    /**
     * Create an instance of {@link GetSubAddressesRequest }
     *
     */
    public GetSubAddressesRequest createGetSubAddressesRequest() {
        return new GetSubAddressesRequest();
    }

    /**
     * Create an instance of {@link ValidateCivicAddressProxyRequest }
     *
     */
    public ValidateCivicAddressProxyRequest createValidateCivicAddressProxyRequest() {
        return new ValidateCivicAddressProxyRequest();
    }

    /**
     * Create an instance of {@link AddressManagementRequest }
     *
     */
    public AddressManagementRequest createAddressManagementRequest() {
        return new AddressManagementRequest();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GetServiceAddressLiveRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "GetServiceAddressLiveRequest")
    public JAXBElement<GetServiceAddressLiveRequest> createGetServiceAddressLiveRequest(GetServiceAddressLiveRequest value) {
        return new JAXBElement<GetServiceAddressLiveRequest>(_GetServiceAddressLiveRequest_QNAME, GetServiceAddressLiveRequest.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link AddressManagementRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "AddressManagementRequest")
    public JAXBElement<AddressManagementRequest> createAddressManagementRequest(AddressManagementRequest value) {
        return new JAXBElement<AddressManagementRequest>(_AddressManagementRequest_QNAME, AddressManagementRequest.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GetParsedAddressRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "GetParsedAddressRequest")
    public JAXBElement<GetParsedAddressRequest> createGetParsedAddressRequest(GetParsedAddressRequest value) {
        return new JAXBElement<GetParsedAddressRequest>(_GetParsedAddressRequest_QNAME, GetParsedAddressRequest.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GetServiceAddressRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "GetServiceAddressRequest")
    public JAXBElement<GetServiceAddressRequest> createGetServiceAddressRequest(GetServiceAddressRequest value) {
        return new JAXBElement<GetServiceAddressRequest>(_GetServiceAddressRequest_QNAME, GetServiceAddressRequest.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ValidateCivicAddressProxyRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "ValidateCivicAddressProxyRequest")
    public JAXBElement<ValidateCivicAddressProxyRequest> createValidateCivicAddressProxyRequest(ValidateCivicAddressProxyRequest value) {
        return new JAXBElement<ValidateCivicAddressProxyRequest>(_ValidateCivicAddressProxyRequest_QNAME, ValidateCivicAddressProxyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ClcSearchResourceProxyRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "ClcSearchResourceProxyRequest")
    public JAXBElement<ClcSearchResourceProxyRequest> createClcSearchResourceProxyRequest(ClcSearchResourceProxyRequest value) {
        return new JAXBElement<ClcSearchResourceProxyRequest>(_ClcSearchResourceProxyRequest_QNAME, ClcSearchResourceProxyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GetSubAddressesRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "GetSubAddressesRequest")
    public JAXBElement<GetSubAddressesRequest> createGetSubAddressesRequest(GetSubAddressesRequest value) {
        return new JAXBElement<GetSubAddressesRequest>(_GetSubAddressesRequest_QNAME, GetSubAddressesRequest.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link IsThisAddressServiceableRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "IsThisAddressServiceableRequest")
    public JAXBElement<IsThisAddressServiceableRequest> createIsThisAddressServiceableRequest(IsThisAddressServiceableRequest value) {
        return new JAXBElement<IsThisAddressServiceableRequest>(_IsThisAddressServiceableRequest_QNAME, IsThisAddressServiceableRequest.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link SubscriberAddressInquiryProxyRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "SubscriberAddressInquiryProxyRequest")
    public JAXBElement<SubscriberAddressInquiryProxyRequest> createSubscriberAddressInquiryProxyRequest(SubscriberAddressInquiryProxyRequest value) {
        return new JAXBElement<SubscriberAddressInquiryProxyRequest>(_SubscriberAddressInquiryProxyRequest_QNAME, SubscriberAddressInquiryProxyRequest.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "AddressId", scope = GetSubAddressesRequest.class)
    public JAXBElement<String> createGetSubAddressesRequestAddressId(String value) {
        return new JAXBElement<String>(_GetSubAddressesRequestAddressId_QNAME, String.class, GetSubAddressesRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSourceSystem }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "Sources", scope = GetSubAddressesRequest.class)
    public JAXBElement<ArrayOfSourceSystem> createGetSubAddressesRequestSources(ArrayOfSourceSystem value) {
        return new JAXBElement<ArrayOfSourceSystem>(_GetSubAddressesRequestSources_QNAME, ArrayOfSourceSystem.class, GetSubAddressesRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link InputAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "InputAddress", scope = SubscriberAddressInquiryProxyRequest.class)
    public JAXBElement<InputAddress> createSubscriberAddressInquiryProxyRequestInputAddress(InputAddress value) {
        return new JAXBElement<InputAddress>(_SubscriberAddressInquiryProxyRequestInputAddress_QNAME, InputAddress.class, SubscriberAddressInquiryProxyRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "SubAddressId", scope = GetServiceAddressRequest.class)
    public JAXBElement<String> createGetServiceAddressRequestSubAddressId(String value) {
        return new JAXBElement<String>(_GetServiceAddressRequestSubAddressId_QNAME, String.class, GetServiceAddressRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "SourceSystemId", scope = GetServiceAddressRequest.class)
    public JAXBElement<String> createGetServiceAddressRequestSourceSystemId(String value) {
        return new JAXBElement<String>(_GetServiceAddressRequestSourceSystemId_QNAME, String.class, GetServiceAddressRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "AddressId", scope = GetServiceAddressRequest.class)
    public JAXBElement<String> createGetServiceAddressRequestAddressId(String value) {
        return new JAXBElement<String>(_GetSubAddressesRequestAddressId_QNAME, String.class, GetServiceAddressRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "SubAddress", scope = GetServiceAddressRequest.class)
    public JAXBElement<String> createGetServiceAddressRequestSubAddress(String value) {
        return new JAXBElement<String>(_GetServiceAddressRequestSubAddress_QNAME, String.class, GetServiceAddressRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSubAddressDesignator }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "ParsedSubAddress", scope = GetServiceAddressRequest.class)
    public JAXBElement<ArrayOfSubAddressDesignator> createGetServiceAddressRequestParsedSubAddress(ArrayOfSubAddressDesignator value) {
        return new JAXBElement<ArrayOfSubAddressDesignator>(_GetServiceAddressRequestParsedSubAddress_QNAME, ArrayOfSubAddressDesignator.class, GetServiceAddressRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "BaseAddressString", scope = GetParsedAddressRequest.class)
    public JAXBElement<String> createGetParsedAddressRequestBaseAddressString(String value) {
        return new JAXBElement<String>(_GetParsedAddressRequestBaseAddressString_QNAME, String.class, GetParsedAddressRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "StateOrProvince", scope = ValidateCivicAddressProxyRequest.class)
    public JAXBElement<String> createValidateCivicAddressProxyRequestStateOrProvince(String value) {
        return new JAXBElement<String>(_ValidateCivicAddressProxyRequestStateOrProvince_QNAME, String.class, ValidateCivicAddressProxyRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "Locality", scope = ValidateCivicAddressProxyRequest.class)
    public JAXBElement<String> createValidateCivicAddressProxyRequestLocality(String value) {
        return new JAXBElement<String>(_ValidateCivicAddressProxyRequestLocality_QNAME, String.class, ValidateCivicAddressProxyRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "PostCode", scope = ValidateCivicAddressProxyRequest.class)
    public JAXBElement<String> createValidateCivicAddressProxyRequestPostCode(String value) {
        return new JAXBElement<String>(_ValidateCivicAddressProxyRequestPostCode_QNAME, String.class, ValidateCivicAddressProxyRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSubAddressDesignator }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "ParsedSubAddress", scope = ValidateCivicAddressProxyRequest.class)
    public JAXBElement<ArrayOfSubAddressDesignator> createValidateCivicAddressProxyRequestParsedSubAddress(ArrayOfSubAddressDesignator value) {
        return new JAXBElement<ArrayOfSubAddressDesignator>(_GetServiceAddressRequestParsedSubAddress_QNAME, ArrayOfSubAddressDesignator.class, ValidateCivicAddressProxyRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ParsedStreetAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "ParsedStreetAddress", scope = ValidateCivicAddressProxyRequest.class)
    public JAXBElement<ParsedStreetAddress> createValidateCivicAddressProxyRequestParsedStreetAddress(ParsedStreetAddress value) {
        return new JAXBElement<ParsedStreetAddress>(_ValidateCivicAddressProxyRequestParsedStreetAddress_QNAME, ParsedStreetAddress.class, ValidateCivicAddressProxyRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link InputAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "InputAddress", scope = ClcSearchResourceProxyRequest.class)
    public JAXBElement<InputAddress> createClcSearchResourceProxyRequestInputAddress(InputAddress value) {
        return new JAXBElement<InputAddress>(_SubscriberAddressInquiryProxyRequestInputAddress_QNAME, InputAddress.class, ClcSearchResourceProxyRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link InputAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "InputAddress", scope = IsThisAddressServiceableRequest.class)
    public JAXBElement<InputAddress> createIsThisAddressServiceableRequestInputAddress(InputAddress value) {
        return new JAXBElement<InputAddress>(_SubscriberAddressInquiryProxyRequestInputAddress_QNAME, InputAddress.class, IsThisAddressServiceableRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link InputAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/Types/Request", name = "InputAddress", scope = GetServiceAddressLiveRequest.class)
    public JAXBElement<InputAddress> createGetServiceAddressLiveRequestInputAddress(InputAddress value) {
        return new JAXBElement<InputAddress>(_SubscriberAddressInquiryProxyRequestInputAddress_QNAME, InputAddress.class, GetServiceAddressLiveRequest.class, value);
    }

}
