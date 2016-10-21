
package com.ctl.as.domain.geo.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.ctl.as.domain.geo.types.request.ClcSearchResourceProxyRequest;
import com.ctl.as.domain.geo.types.request.GetParsedAddressRequest;
import com.ctl.as.domain.geo.types.request.GetServiceAddressLiveRequest;
import com.ctl.as.domain.geo.types.request.GetServiceAddressRequest;
import com.ctl.as.domain.geo.types.request.GetSubAddressesRequest;
import com.ctl.as.domain.geo.types.request.IsThisAddressServiceableRequest;
import com.ctl.as.domain.geo.types.request.SubscriberAddressInquiryProxyRequest;
import com.ctl.as.domain.geo.types.request.ValidateCivicAddressProxyRequest;
import com.ctl.as.domain.geo.v2.types.request.CivicAddressValidationRequest;
import com.ctl.as.domain.geo.v2.types.request.PostalAddressValidationRequest;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.ctl.as.domain.geo.v2 package.
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

    private final static QName _GetSubAddressesResponseGetSubAddressesResult_QNAME = new QName("http://geo.domain.as.ctl.com/v2", "GetSubAddressesResult");
    private final static QName _GetServiceAddressLiveRequest_QNAME = new QName("http://geo.domain.as.ctl.com/v2", "request");
    private final static QName _ValidateCivicAddressProxyResponseValidateCivicAddressProxyResult_QNAME = new QName("http://geo.domain.as.ctl.com/v2", "ValidateCivicAddressProxyResult");
    private final static QName _ClcSearchResourceProxyResponseClcSearchResourceProxyResult_QNAME = new QName("http://geo.domain.as.ctl.com/v2", "ClcSearchResourceProxyResult");
    private final static QName _CivicAddressValidationResponseCivicAddressValidationResult_QNAME = new QName("http://geo.domain.as.ctl.com/v2", "CivicAddressValidationResult");
    private final static QName _GetServiceAddressResponseGetServiceAddressResult_QNAME = new QName("http://geo.domain.as.ctl.com/v2", "GetServiceAddressResult");
    private final static QName _SubscriberAddressInquiryProxyResponseSubscriberAddressInquiryProxyResult_QNAME = new QName("http://geo.domain.as.ctl.com/v2", "SubscriberAddressInquiryProxyResult");
    private final static QName _IsThisAddressServiceableResponseIsThisAddressServiceableResult_QNAME = new QName("http://geo.domain.as.ctl.com/v2", "IsThisAddressServiceableResult");
    private final static QName _PostalAddressValidationResponsePostalAddressValidationResult_QNAME = new QName("http://geo.domain.as.ctl.com/v2", "PostalAddressValidationResult");
    private final static QName _GetParsedAddressResponseGetParsedAddressResult_QNAME = new QName("http://geo.domain.as.ctl.com/v2", "GetParsedAddressResult");
    private final static QName _GetServiceAddressLiveResponseGetServiceAddressLiveResult_QNAME = new QName("http://geo.domain.as.ctl.com/v2", "GetServiceAddressLiveResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ctl.as.domain.geo.v2
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ClcSearchResourceProxy }
     *
     */
    public ClcSearchResourceProxy createClcSearchResourceProxy() {
        return new ClcSearchResourceProxy();
    }

    /**
     * Create an instance of {@link IsThisAddressServiceable }
     *
     */
    public IsThisAddressServiceable createIsThisAddressServiceable() {
        return new IsThisAddressServiceable();
    }

    /**
     * Create an instance of {@link com.ctl.as.domain.geo.v2.GetSubAddressesResponse }
     *
     */
    public com.ctl.as.domain.geo.v2.GetSubAddressesResponse createGetSubAddressesResponse() {
        return new com.ctl.as.domain.geo.v2.GetSubAddressesResponse();
    }

    /**
     * Create an instance of {@link GetServiceAddress }
     *
     */
    public GetServiceAddress createGetServiceAddress() {
        return new GetServiceAddress();
    }

    /**
     * Create an instance of {@link com.ctl.as.domain.geo.v2.GetParsedAddressResponse }
     *
     */
    public com.ctl.as.domain.geo.v2.GetParsedAddressResponse createGetParsedAddressResponse() {
        return new com.ctl.as.domain.geo.v2.GetParsedAddressResponse();
    }

    /**
     * Create an instance of {@link CivicAddressValidation }
     *
     */
    public CivicAddressValidation createCivicAddressValidation() {
        return new CivicAddressValidation();
    }

    /**
     * Create an instance of {@link com.ctl.as.domain.geo.v2.IsThisAddressServiceableResponse }
     *
     */
    public com.ctl.as.domain.geo.v2.IsThisAddressServiceableResponse createIsThisAddressServiceableResponse() {
        return new com.ctl.as.domain.geo.v2.IsThisAddressServiceableResponse();
    }

    /**
     * Create an instance of {@link PostalAddressValidation }
     *
     */
    public PostalAddressValidation createPostalAddressValidation() {
        return new PostalAddressValidation();
    }

    /**
     * Create an instance of {@link GetServiceAddressLive }
     *
     */
    public GetServiceAddressLive createGetServiceAddressLive() {
        return new GetServiceAddressLive();
    }

    /**
     * Create an instance of {@link com.ctl.as.domain.geo.v2.ValidateCivicAddressProxyResponse }
     *
     */
    public com.ctl.as.domain.geo.v2.ValidateCivicAddressProxyResponse createValidateCivicAddressProxyResponse() {
        return new com.ctl.as.domain.geo.v2.ValidateCivicAddressProxyResponse();
    }

    /**
     * Create an instance of {@link SubscriberAddressInquiryProxy }
     *
     */
    public SubscriberAddressInquiryProxy createSubscriberAddressInquiryProxy() {
        return new SubscriberAddressInquiryProxy();
    }

    /**
     * Create an instance of {@link com.ctl.as.domain.geo.v2.SubscriberAddressInquiryProxyResponse }
     *
     */
    public com.ctl.as.domain.geo.v2.SubscriberAddressInquiryProxyResponse createSubscriberAddressInquiryProxyResponse() {
        return new com.ctl.as.domain.geo.v2.SubscriberAddressInquiryProxyResponse();
    }

    /**
     * Create an instance of {@link GetParsedAddress }
     *
     */
    public GetParsedAddress createGetParsedAddress() {
        return new GetParsedAddress();
    }

    /**
     * Create an instance of {@link com.ctl.as.domain.geo.v2.CivicAddressValidationResponse }
     *
     */
    public com.ctl.as.domain.geo.v2.CivicAddressValidationResponse createCivicAddressValidationResponse() {
        return new com.ctl.as.domain.geo.v2.CivicAddressValidationResponse();
    }

    /**
     * Create an instance of {@link com.ctl.as.domain.geo.v2.PostalAddressValidationResponse }
     *
     */
    public com.ctl.as.domain.geo.v2.PostalAddressValidationResponse createPostalAddressValidationResponse() {
        return new com.ctl.as.domain.geo.v2.PostalAddressValidationResponse();
    }

    /**
     * Create an instance of {@link GetSubAddresses }
     *
     */
    public GetSubAddresses createGetSubAddresses() {
        return new GetSubAddresses();
    }

    /**
     * Create an instance of {@link com.ctl.as.domain.geo.v2.GetServiceAddressLiveResponse }
     *
     */
    public com.ctl.as.domain.geo.v2.GetServiceAddressLiveResponse createGetServiceAddressLiveResponse() {
        return new com.ctl.as.domain.geo.v2.GetServiceAddressLiveResponse();
    }

    /**
     * Create an instance of {@link com.ctl.as.domain.geo.v2.ClcSearchResourceProxyResponse }
     *
     */
    public com.ctl.as.domain.geo.v2.ClcSearchResourceProxyResponse createClcSearchResourceProxyResponse() {
        return new com.ctl.as.domain.geo.v2.ClcSearchResourceProxyResponse();
    }

    /**
     * Create an instance of {@link ValidateCivicAddressProxy }
     *
     */
    public ValidateCivicAddressProxy createValidateCivicAddressProxy() {
        return new ValidateCivicAddressProxy();
    }

    /**
     * Create an instance of {@link com.ctl.as.domain.geo.v2.GetServiceAddressResponse }
     *
     */
    public com.ctl.as.domain.geo.v2.GetServiceAddressResponse createGetServiceAddressResponse() {
        return new com.ctl.as.domain.geo.v2.GetServiceAddressResponse();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.ctl.as.domain.geo.v2.types.response.GetSubAddressesResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "GetSubAddressesResult", scope = com.ctl.as.domain.geo.v2.GetSubAddressesResponse.class)
    public JAXBElement<com.ctl.as.domain.geo.v2.types.response.GetSubAddressesResponse> createGetSubAddressesResponseGetSubAddressesResult(com.ctl.as.domain.geo.v2.types.response.GetSubAddressesResponse value) {
        return new JAXBElement<com.ctl.as.domain.geo.v2.types.response.GetSubAddressesResponse>(_GetSubAddressesResponseGetSubAddressesResult_QNAME, com.ctl.as.domain.geo.v2.types.response.GetSubAddressesResponse.class, com.ctl.as.domain.geo.v2.GetSubAddressesResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GetServiceAddressLiveRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "request", scope = GetServiceAddressLive.class)
    public JAXBElement<GetServiceAddressLiveRequest> createGetServiceAddressLiveRequest(GetServiceAddressLiveRequest value) {
        return new JAXBElement<GetServiceAddressLiveRequest>(_GetServiceAddressLiveRequest_QNAME, GetServiceAddressLiveRequest.class, GetServiceAddressLive.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.ctl.as.domain.geo.v2.types.response.ValidateCivicAddressProxyResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "ValidateCivicAddressProxyResult", scope = com.ctl.as.domain.geo.v2.ValidateCivicAddressProxyResponse.class)
    public JAXBElement<com.ctl.as.domain.geo.v2.types.response.ValidateCivicAddressProxyResponse> createValidateCivicAddressProxyResponseValidateCivicAddressProxyResult(com.ctl.as.domain.geo.v2.types.response.ValidateCivicAddressProxyResponse value) {
        return new JAXBElement<com.ctl.as.domain.geo.v2.types.response.ValidateCivicAddressProxyResponse>(_ValidateCivicAddressProxyResponseValidateCivicAddressProxyResult_QNAME, com.ctl.as.domain.geo.v2.types.response.ValidateCivicAddressProxyResponse.class, com.ctl.as.domain.geo.v2.ValidateCivicAddressProxyResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.ctl.as.domain.geo.v2.types.response.ClcSearchResourceProxyResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "ClcSearchResourceProxyResult", scope = com.ctl.as.domain.geo.v2.ClcSearchResourceProxyResponse.class)
    public JAXBElement<com.ctl.as.domain.geo.v2.types.response.ClcSearchResourceProxyResponse> createClcSearchResourceProxyResponseClcSearchResourceProxyResult(com.ctl.as.domain.geo.v2.types.response.ClcSearchResourceProxyResponse value) {
        return new JAXBElement<com.ctl.as.domain.geo.v2.types.response.ClcSearchResourceProxyResponse>(_ClcSearchResourceProxyResponseClcSearchResourceProxyResult_QNAME, com.ctl.as.domain.geo.v2.types.response.ClcSearchResourceProxyResponse.class, com.ctl.as.domain.geo.v2.ClcSearchResourceProxyResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.ctl.as.domain.geo.v2.types.response.CivicAddressValidationResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "CivicAddressValidationResult", scope = com.ctl.as.domain.geo.v2.CivicAddressValidationResponse.class)
    public JAXBElement<com.ctl.as.domain.geo.v2.types.response.CivicAddressValidationResponse> createCivicAddressValidationResponseCivicAddressValidationResult(com.ctl.as.domain.geo.v2.types.response.CivicAddressValidationResponse value) {
        return new JAXBElement<com.ctl.as.domain.geo.v2.types.response.CivicAddressValidationResponse>(_CivicAddressValidationResponseCivicAddressValidationResult_QNAME, com.ctl.as.domain.geo.v2.types.response.CivicAddressValidationResponse.class, com.ctl.as.domain.geo.v2.CivicAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.ctl.as.domain.geo.v2.types.response.GetServiceAddressResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "GetServiceAddressResult", scope = com.ctl.as.domain.geo.v2.GetServiceAddressResponse.class)
    public JAXBElement<com.ctl.as.domain.geo.v2.types.response.GetServiceAddressResponse> createGetServiceAddressResponseGetServiceAddressResult(com.ctl.as.domain.geo.v2.types.response.GetServiceAddressResponse value) {
        return new JAXBElement<com.ctl.as.domain.geo.v2.types.response.GetServiceAddressResponse>(_GetServiceAddressResponseGetServiceAddressResult_QNAME, com.ctl.as.domain.geo.v2.types.response.GetServiceAddressResponse.class, com.ctl.as.domain.geo.v2.GetServiceAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link CivicAddressValidationRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "request", scope = CivicAddressValidation.class)
    public JAXBElement<CivicAddressValidationRequest> createCivicAddressValidationRequest(CivicAddressValidationRequest value) {
        return new JAXBElement<CivicAddressValidationRequest>(_GetServiceAddressLiveRequest_QNAME, CivicAddressValidationRequest.class, CivicAddressValidation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ValidateCivicAddressProxyRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "request", scope = ValidateCivicAddressProxy.class)
    public JAXBElement<ValidateCivicAddressProxyRequest> createValidateCivicAddressProxyRequest(ValidateCivicAddressProxyRequest value) {
        return new JAXBElement<ValidateCivicAddressProxyRequest>(_GetServiceAddressLiveRequest_QNAME, ValidateCivicAddressProxyRequest.class, ValidateCivicAddressProxy.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.ctl.as.domain.geo.v2.types.response.SubscriberAddressInquiryProxyResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "SubscriberAddressInquiryProxyResult", scope = com.ctl.as.domain.geo.v2.SubscriberAddressInquiryProxyResponse.class)
    public JAXBElement<com.ctl.as.domain.geo.v2.types.response.SubscriberAddressInquiryProxyResponse> createSubscriberAddressInquiryProxyResponseSubscriberAddressInquiryProxyResult(com.ctl.as.domain.geo.v2.types.response.SubscriberAddressInquiryProxyResponse value) {
        return new JAXBElement<com.ctl.as.domain.geo.v2.types.response.SubscriberAddressInquiryProxyResponse>(_SubscriberAddressInquiryProxyResponseSubscriberAddressInquiryProxyResult_QNAME, com.ctl.as.domain.geo.v2.types.response.SubscriberAddressInquiryProxyResponse.class, com.ctl.as.domain.geo.v2.SubscriberAddressInquiryProxyResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ClcSearchResourceProxyRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "request", scope = ClcSearchResourceProxy.class)
    public JAXBElement<ClcSearchResourceProxyRequest> createClcSearchResourceProxyRequest(ClcSearchResourceProxyRequest value) {
        return new JAXBElement<ClcSearchResourceProxyRequest>(_GetServiceAddressLiveRequest_QNAME, ClcSearchResourceProxyRequest.class, ClcSearchResourceProxy.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link IsThisAddressServiceableRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "request", scope = IsThisAddressServiceable.class)
    public JAXBElement<IsThisAddressServiceableRequest> createIsThisAddressServiceableRequest(IsThisAddressServiceableRequest value) {
        return new JAXBElement<IsThisAddressServiceableRequest>(_GetServiceAddressLiveRequest_QNAME, IsThisAddressServiceableRequest.class, IsThisAddressServiceable.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link SubscriberAddressInquiryProxyRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "request", scope = SubscriberAddressInquiryProxy.class)
    public JAXBElement<SubscriberAddressInquiryProxyRequest> createSubscriberAddressInquiryProxyRequest(SubscriberAddressInquiryProxyRequest value) {
        return new JAXBElement<SubscriberAddressInquiryProxyRequest>(_GetServiceAddressLiveRequest_QNAME, SubscriberAddressInquiryProxyRequest.class, SubscriberAddressInquiryProxy.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.ctl.as.domain.geo.v2.types.response.IsThisAddressServiceableResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "IsThisAddressServiceableResult", scope = com.ctl.as.domain.geo.v2.IsThisAddressServiceableResponse.class)
    public JAXBElement<com.ctl.as.domain.geo.v2.types.response.IsThisAddressServiceableResponse> createIsThisAddressServiceableResponseIsThisAddressServiceableResult(com.ctl.as.domain.geo.v2.types.response.IsThisAddressServiceableResponse value) {
        return new JAXBElement<com.ctl.as.domain.geo.v2.types.response.IsThisAddressServiceableResponse>(_IsThisAddressServiceableResponseIsThisAddressServiceableResult_QNAME, com.ctl.as.domain.geo.v2.types.response.IsThisAddressServiceableResponse.class, com.ctl.as.domain.geo.v2.IsThisAddressServiceableResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GetServiceAddressRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "request", scope = GetServiceAddress.class)
    public JAXBElement<GetServiceAddressRequest> createGetServiceAddressRequest(GetServiceAddressRequest value) {
        return new JAXBElement<GetServiceAddressRequest>(_GetServiceAddressLiveRequest_QNAME, GetServiceAddressRequest.class, GetServiceAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link PostalAddressValidationRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "request", scope = PostalAddressValidation.class)
    public JAXBElement<PostalAddressValidationRequest> createPostalAddressValidationRequest(PostalAddressValidationRequest value) {
        return new JAXBElement<PostalAddressValidationRequest>(_GetServiceAddressLiveRequest_QNAME, PostalAddressValidationRequest.class, PostalAddressValidation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.ctl.as.domain.geo.v2.types.response.PostalAddressValidationResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "PostalAddressValidationResult", scope = com.ctl.as.domain.geo.v2.PostalAddressValidationResponse.class)
    public JAXBElement<com.ctl.as.domain.geo.v2.types.response.PostalAddressValidationResponse> createPostalAddressValidationResponsePostalAddressValidationResult(com.ctl.as.domain.geo.v2.types.response.PostalAddressValidationResponse value) {
        return new JAXBElement<com.ctl.as.domain.geo.v2.types.response.PostalAddressValidationResponse>(_PostalAddressValidationResponsePostalAddressValidationResult_QNAME, com.ctl.as.domain.geo.v2.types.response.PostalAddressValidationResponse.class, com.ctl.as.domain.geo.v2.PostalAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GetSubAddressesRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "request", scope = GetSubAddresses.class)
    public JAXBElement<GetSubAddressesRequest> createGetSubAddressesRequest(GetSubAddressesRequest value) {
        return new JAXBElement<GetSubAddressesRequest>(_GetServiceAddressLiveRequest_QNAME, GetSubAddressesRequest.class, GetSubAddresses.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GetParsedAddressRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "request", scope = GetParsedAddress.class)
    public JAXBElement<GetParsedAddressRequest> createGetParsedAddressRequest(GetParsedAddressRequest value) {
        return new JAXBElement<GetParsedAddressRequest>(_GetServiceAddressLiveRequest_QNAME, GetParsedAddressRequest.class, GetParsedAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.ctl.as.domain.geo.v2.types.response.GetParsedAddressResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "GetParsedAddressResult", scope = com.ctl.as.domain.geo.v2.GetParsedAddressResponse.class)
    public JAXBElement<com.ctl.as.domain.geo.v2.types.response.GetParsedAddressResponse> createGetParsedAddressResponseGetParsedAddressResult(com.ctl.as.domain.geo.v2.types.response.GetParsedAddressResponse value) {
        return new JAXBElement<com.ctl.as.domain.geo.v2.types.response.GetParsedAddressResponse>(_GetParsedAddressResponseGetParsedAddressResult_QNAME, com.ctl.as.domain.geo.v2.types.response.GetParsedAddressResponse.class, com.ctl.as.domain.geo.v2.GetParsedAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link com.ctl.as.domain.geo.v2.types.response.GetServiceAddressLiveResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2", name = "GetServiceAddressLiveResult", scope = com.ctl.as.domain.geo.v2.GetServiceAddressLiveResponse.class)
    public JAXBElement<com.ctl.as.domain.geo.v2.types.response.GetServiceAddressLiveResponse> createGetServiceAddressLiveResponseGetServiceAddressLiveResult(com.ctl.as.domain.geo.v2.types.response.GetServiceAddressLiveResponse value) {
        return new JAXBElement<com.ctl.as.domain.geo.v2.types.response.GetServiceAddressLiveResponse>(_GetServiceAddressLiveResponseGetServiceAddressLiveResult_QNAME, com.ctl.as.domain.geo.v2.types.response.GetServiceAddressLiveResponse.class, com.ctl.as.domain.geo.v2.GetServiceAddressLiveResponse.class, value);
    }

}
