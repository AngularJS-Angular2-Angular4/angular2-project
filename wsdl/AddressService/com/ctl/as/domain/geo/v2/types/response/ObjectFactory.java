
package com.ctl.as.domain.geo.v2.types.response;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.ctl.as.domain.geo.types.ArrayOfError;
import com.ctl.as.domain.geo.types.ArrayOfSubAddress;
import com.ctl.as.domain.geo.types.GeoPoint;
import com.ctl.as.domain.geo.types.ResultColor;
import com.ctl.as.domain.geo.types.SearchResult;
import com.ctl.as.domain.geo.v2.types.ArrayOfCivicAddress;
import com.ctl.as.domain.geo.v2.types.ArrayOfPostalAddress;
import com.ctl.as.domain.geo.v2.types.ArrayOfServiceAddress;
import com.ctl.as.domain.geo.v2.types.ParsedAddress;
import com.iclnbi.iclnbi_v2_00.SearchResourceResponse1;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import com.qwest.xmlschema.ValidateCivicAddressResponse;
import org.w3.namespace.SubscriberAddressInquiryReply;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.ctl.as.domain.geo.v2.types.response package.
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

    private final static QName _AddressManagementResponse_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "AddressManagementResponse");
    private final static QName _IsThisAddressServiceableResponse_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "IsThisAddressServiceableResponse");
    private final static QName _CivicAddressValidationResponse_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "CivicAddressValidationResponse");
    private final static QName _PostalAddressValidationResponse_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "PostalAddressValidationResponse");
    private final static QName _GetParsedAddressResponse_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "GetParsedAddressResponse");
    private final static QName _GetServiceAddressLiveResponse_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "GetServiceAddressLiveResponse");
    private final static QName _GetServiceAddressResponse_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "GetServiceAddressResponse");
    private final static QName _ClcSearchResourceProxyResponse_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "ClcSearchResourceProxyResponse");
    private final static QName _ValidateCivicAddressProxyResponse_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "ValidateCivicAddressProxyResponse");
    private final static QName _GetSubAddressesResponse_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "GetSubAddressesResponse");
    private final static QName _SubscriberAddressInquiryProxyResponse_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "SubscriberAddressInquiryProxyResponse");
    private final static QName _IsThisAddressServiceableResponseErrors_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "Errors");
    private final static QName _IsThisAddressServiceableResponseServiceAddresses_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "ServiceAddresses");
    private final static QName _IsThisAddressServiceableResponseRelatedAddresses_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "RelatedAddresses");
    private final static QName _IsThisAddressServiceableResponseResult_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "Result");
    private final static QName _SubscriberAddressInquiryProxyResponseSubscriberAddressInquiryReply_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "SubscriberAddressInquiryReply");
    private final static QName _GetParsedAddressResponseParsedAddress_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "ParsedAddress");
    private final static QName _ClcSearchResourceProxyResponseSearchResourceResponse_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "SearchResourceResponse");
    private final static QName _CivicAddressValidationResponseGeoPoint_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "GeoPoint");
    private final static QName _CivicAddressValidationResponseCensusMatchLevel_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "CensusMatchLevel");
    private final static QName _CivicAddressValidationResponsePostalDirectoryMatchLevel_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "PostalDirectoryMatchLevel");
    private final static QName _CivicAddressValidationResponseDataMessages_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "DataMessages");
    private final static QName _CivicAddressValidationResponseDeliveryConfirmationCode_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "DeliveryConfirmationCode");
    private final static QName _CivicAddressValidationResponseCivicAddresses_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "CivicAddresses");
    private final static QName _CivicAddressValidationResponseMetropolitanStatisticalArea_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "MetropolitanStatisticalArea");
    private final static QName _CivicAddressValidationResponseCounty_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "County");
    private final static QName _ValidateCivicAddressProxyResponseValidateCivicAddressResponse_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "ValidateCivicAddressResponse");
    private final static QName _GetSubAddressesResponseSubAddresses_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "SubAddresses");
    private final static QName _PostalAddressValidationResponsePostalRecordType_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "PostalRecordType");
    private final static QName _PostalAddressValidationResponsePostalAddresses_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types/Response", "PostalAddresses");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ctl.as.domain.geo.v2.types.response
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetSubAddressesResponse }
     *
     */
    public GetSubAddressesResponse createGetSubAddressesResponse() {
        return new GetSubAddressesResponse();
    }

    /**
     * Create an instance of {@link GetParsedAddressResponse }
     *
     */
    public GetParsedAddressResponse createGetParsedAddressResponse() {
        return new GetParsedAddressResponse();
    }

    /**
     * Create an instance of {@link IsThisAddressServiceableResponse }
     *
     */
    public IsThisAddressServiceableResponse createIsThisAddressServiceableResponse() {
        return new IsThisAddressServiceableResponse();
    }

    /**
     * Create an instance of {@link ValidateCivicAddressProxyResponse }
     *
     */
    public ValidateCivicAddressProxyResponse createValidateCivicAddressProxyResponse() {
        return new ValidateCivicAddressProxyResponse();
    }

    /**
     * Create an instance of {@link SubscriberAddressInquiryProxyResponse }
     *
     */
    public SubscriberAddressInquiryProxyResponse createSubscriberAddressInquiryProxyResponse() {
        return new SubscriberAddressInquiryProxyResponse();
    }

    /**
     * Create an instance of {@link CivicAddressValidationResponse }
     *
     */
    public CivicAddressValidationResponse createCivicAddressValidationResponse() {
        return new CivicAddressValidationResponse();
    }

    /**
     * Create an instance of {@link PostalAddressValidationResponse }
     *
     */
    public PostalAddressValidationResponse createPostalAddressValidationResponse() {
        return new PostalAddressValidationResponse();
    }

    /**
     * Create an instance of {@link GetServiceAddressLiveResponse }
     *
     */
    public GetServiceAddressLiveResponse createGetServiceAddressLiveResponse() {
        return new GetServiceAddressLiveResponse();
    }

    /**
     * Create an instance of {@link ClcSearchResourceProxyResponse }
     *
     */
    public ClcSearchResourceProxyResponse createClcSearchResourceProxyResponse() {
        return new ClcSearchResourceProxyResponse();
    }

    /**
     * Create an instance of {@link GetServiceAddressResponse }
     *
     */
    public GetServiceAddressResponse createGetServiceAddressResponse() {
        return new GetServiceAddressResponse();
    }

    /**
     * Create an instance of {@link AddressManagementResponse }
     *
     */
    public AddressManagementResponse createAddressManagementResponse() {
        return new AddressManagementResponse();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link AddressManagementResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "AddressManagementResponse")
    public JAXBElement<AddressManagementResponse> createAddressManagementResponse(AddressManagementResponse value) {
        return new JAXBElement<AddressManagementResponse>(_AddressManagementResponse_QNAME, AddressManagementResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link IsThisAddressServiceableResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "IsThisAddressServiceableResponse")
    public JAXBElement<IsThisAddressServiceableResponse> createIsThisAddressServiceableResponse(IsThisAddressServiceableResponse value) {
        return new JAXBElement<IsThisAddressServiceableResponse>(_IsThisAddressServiceableResponse_QNAME, IsThisAddressServiceableResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link CivicAddressValidationResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "CivicAddressValidationResponse")
    public JAXBElement<CivicAddressValidationResponse> createCivicAddressValidationResponse(CivicAddressValidationResponse value) {
        return new JAXBElement<CivicAddressValidationResponse>(_CivicAddressValidationResponse_QNAME, CivicAddressValidationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link PostalAddressValidationResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "PostalAddressValidationResponse")
    public JAXBElement<PostalAddressValidationResponse> createPostalAddressValidationResponse(PostalAddressValidationResponse value) {
        return new JAXBElement<PostalAddressValidationResponse>(_PostalAddressValidationResponse_QNAME, PostalAddressValidationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GetParsedAddressResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "GetParsedAddressResponse")
    public JAXBElement<GetParsedAddressResponse> createGetParsedAddressResponse(GetParsedAddressResponse value) {
        return new JAXBElement<GetParsedAddressResponse>(_GetParsedAddressResponse_QNAME, GetParsedAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GetServiceAddressLiveResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "GetServiceAddressLiveResponse")
    public JAXBElement<GetServiceAddressLiveResponse> createGetServiceAddressLiveResponse(GetServiceAddressLiveResponse value) {
        return new JAXBElement<GetServiceAddressLiveResponse>(_GetServiceAddressLiveResponse_QNAME, GetServiceAddressLiveResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GetServiceAddressResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "GetServiceAddressResponse")
    public JAXBElement<GetServiceAddressResponse> createGetServiceAddressResponse(GetServiceAddressResponse value) {
        return new JAXBElement<GetServiceAddressResponse>(_GetServiceAddressResponse_QNAME, GetServiceAddressResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ClcSearchResourceProxyResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "ClcSearchResourceProxyResponse")
    public JAXBElement<ClcSearchResourceProxyResponse> createClcSearchResourceProxyResponse(ClcSearchResourceProxyResponse value) {
        return new JAXBElement<ClcSearchResourceProxyResponse>(_ClcSearchResourceProxyResponse_QNAME, ClcSearchResourceProxyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ValidateCivicAddressProxyResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "ValidateCivicAddressProxyResponse")
    public JAXBElement<ValidateCivicAddressProxyResponse> createValidateCivicAddressProxyResponse(ValidateCivicAddressProxyResponse value) {
        return new JAXBElement<ValidateCivicAddressProxyResponse>(_ValidateCivicAddressProxyResponse_QNAME, ValidateCivicAddressProxyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GetSubAddressesResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "GetSubAddressesResponse")
    public JAXBElement<GetSubAddressesResponse> createGetSubAddressesResponse(GetSubAddressesResponse value) {
        return new JAXBElement<GetSubAddressesResponse>(_GetSubAddressesResponse_QNAME, GetSubAddressesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link SubscriberAddressInquiryProxyResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "SubscriberAddressInquiryProxyResponse")
    public JAXBElement<SubscriberAddressInquiryProxyResponse> createSubscriberAddressInquiryProxyResponse(SubscriberAddressInquiryProxyResponse value) {
        return new JAXBElement<SubscriberAddressInquiryProxyResponse>(_SubscriberAddressInquiryProxyResponse_QNAME, SubscriberAddressInquiryProxyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfError }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "Errors", scope = IsThisAddressServiceableResponse.class)
    public JAXBElement<ArrayOfError> createIsThisAddressServiceableResponseErrors(ArrayOfError value) {
        return new JAXBElement<ArrayOfError>(_IsThisAddressServiceableResponseErrors_QNAME, ArrayOfError.class, IsThisAddressServiceableResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfServiceAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "ServiceAddresses", scope = IsThisAddressServiceableResponse.class)
    public JAXBElement<ArrayOfServiceAddress> createIsThisAddressServiceableResponseServiceAddresses(ArrayOfServiceAddress value) {
        return new JAXBElement<ArrayOfServiceAddress>(_IsThisAddressServiceableResponseServiceAddresses_QNAME, ArrayOfServiceAddress.class, IsThisAddressServiceableResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfServiceAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "RelatedAddresses", scope = IsThisAddressServiceableResponse.class)
    public JAXBElement<ArrayOfServiceAddress> createIsThisAddressServiceableResponseRelatedAddresses(ArrayOfServiceAddress value) {
        return new JAXBElement<ArrayOfServiceAddress>(_IsThisAddressServiceableResponseRelatedAddresses_QNAME, ArrayOfServiceAddress.class, IsThisAddressServiceableResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ResultColor }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "Result", scope = IsThisAddressServiceableResponse.class)
    public JAXBElement<ResultColor> createIsThisAddressServiceableResponseResult(ResultColor value) {
        return new JAXBElement<ResultColor>(_IsThisAddressServiceableResponseResult_QNAME, ResultColor.class, IsThisAddressServiceableResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfError }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "Errors", scope = SubscriberAddressInquiryProxyResponse.class)
    public JAXBElement<ArrayOfError> createSubscriberAddressInquiryProxyResponseErrors(ArrayOfError value) {
        return new JAXBElement<ArrayOfError>(_IsThisAddressServiceableResponseErrors_QNAME, ArrayOfError.class, SubscriberAddressInquiryProxyResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link SubscriberAddressInquiryReply }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "SubscriberAddressInquiryReply", scope = SubscriberAddressInquiryProxyResponse.class)
    public JAXBElement<SubscriberAddressInquiryReply> createSubscriberAddressInquiryProxyResponseSubscriberAddressInquiryReply(SubscriberAddressInquiryReply value) {
        return new JAXBElement<SubscriberAddressInquiryReply>(_SubscriberAddressInquiryProxyResponseSubscriberAddressInquiryReply_QNAME, SubscriberAddressInquiryReply.class, SubscriberAddressInquiryProxyResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfError }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "Errors", scope = GetParsedAddressResponse.class)
    public JAXBElement<ArrayOfError> createGetParsedAddressResponseErrors(ArrayOfError value) {
        return new JAXBElement<ArrayOfError>(_IsThisAddressServiceableResponseErrors_QNAME, ArrayOfError.class, GetParsedAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ParsedAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "ParsedAddress", scope = GetParsedAddressResponse.class)
    public JAXBElement<ParsedAddress> createGetParsedAddressResponseParsedAddress(ParsedAddress value) {
        return new JAXBElement<ParsedAddress>(_GetParsedAddressResponseParsedAddress_QNAME, ParsedAddress.class, GetParsedAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfError }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "Errors", scope = GetServiceAddressLiveResponse.class)
    public JAXBElement<ArrayOfError> createGetServiceAddressLiveResponseErrors(ArrayOfError value) {
        return new JAXBElement<ArrayOfError>(_IsThisAddressServiceableResponseErrors_QNAME, ArrayOfError.class, GetServiceAddressLiveResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfServiceAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "ServiceAddresses", scope = GetServiceAddressLiveResponse.class)
    public JAXBElement<ArrayOfServiceAddress> createGetServiceAddressLiveResponseServiceAddresses(ArrayOfServiceAddress value) {
        return new JAXBElement<ArrayOfServiceAddress>(_IsThisAddressServiceableResponseServiceAddresses_QNAME, ArrayOfServiceAddress.class, GetServiceAddressLiveResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link SearchResult }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "Result", scope = GetServiceAddressLiveResponse.class)
    public JAXBElement<SearchResult> createGetServiceAddressLiveResponseResult(SearchResult value) {
        return new JAXBElement<SearchResult>(_IsThisAddressServiceableResponseResult_QNAME, SearchResult.class, GetServiceAddressLiveResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfError }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "Errors", scope = ClcSearchResourceProxyResponse.class)
    public JAXBElement<ArrayOfError> createClcSearchResourceProxyResponseErrors(ArrayOfError value) {
        return new JAXBElement<ArrayOfError>(_IsThisAddressServiceableResponseErrors_QNAME, ArrayOfError.class, ClcSearchResourceProxyResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link SearchResourceResponse1 }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "SearchResourceResponse", scope = ClcSearchResourceProxyResponse.class)
    public JAXBElement<SearchResourceResponse1> createClcSearchResourceProxyResponseSearchResourceResponse(SearchResourceResponse1 value) {
        return new JAXBElement<SearchResourceResponse1>(_ClcSearchResourceProxyResponseSearchResourceResponse_QNAME, SearchResourceResponse1 .class, ClcSearchResourceProxyResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfError }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "Errors", scope = GetServiceAddressResponse.class)
    public JAXBElement<ArrayOfError> createGetServiceAddressResponseErrors(ArrayOfError value) {
        return new JAXBElement<ArrayOfError>(_IsThisAddressServiceableResponseErrors_QNAME, ArrayOfError.class, GetServiceAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfServiceAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "ServiceAddresses", scope = GetServiceAddressResponse.class)
    public JAXBElement<ArrayOfServiceAddress> createGetServiceAddressResponseServiceAddresses(ArrayOfServiceAddress value) {
        return new JAXBElement<ArrayOfServiceAddress>(_IsThisAddressServiceableResponseServiceAddresses_QNAME, ArrayOfServiceAddress.class, GetServiceAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfServiceAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "RelatedAddresses", scope = GetServiceAddressResponse.class)
    public JAXBElement<ArrayOfServiceAddress> createGetServiceAddressResponseRelatedAddresses(ArrayOfServiceAddress value) {
        return new JAXBElement<ArrayOfServiceAddress>(_IsThisAddressServiceableResponseRelatedAddresses_QNAME, ArrayOfServiceAddress.class, GetServiceAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link SearchResult }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "Result", scope = GetServiceAddressResponse.class)
    public JAXBElement<SearchResult> createGetServiceAddressResponseResult(SearchResult value) {
        return new JAXBElement<SearchResult>(_IsThisAddressServiceableResponseResult_QNAME, SearchResult.class, GetServiceAddressResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfError }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "Errors", scope = CivicAddressValidationResponse.class)
    public JAXBElement<ArrayOfError> createCivicAddressValidationResponseErrors(ArrayOfError value) {
        return new JAXBElement<ArrayOfError>(_IsThisAddressServiceableResponseErrors_QNAME, ArrayOfError.class, CivicAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GeoPoint }{@code >}}
          *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "GeoPoint", scope = CivicAddressValidationResponse.class)
    public JAXBElement<GeoPoint> createCivicAddressValidationResponseGeoPoint(GeoPoint value) {
        return new JAXBElement<GeoPoint>(_CivicAddressValidationResponseGeoPoint_QNAME, GeoPoint.class, CivicAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
          *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "CensusMatchLevel", scope = CivicAddressValidationResponse.class)
    public JAXBElement<String> createCivicAddressValidationResponseCensusMatchLevel(String value) {
        return new JAXBElement<String>(_CivicAddressValidationResponseCensusMatchLevel_QNAME, String.class, CivicAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
          *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "PostalDirectoryMatchLevel", scope = CivicAddressValidationResponse.class)
    public JAXBElement<String> createCivicAddressValidationResponsePostalDirectoryMatchLevel(String value) {
        return new JAXBElement<String>(_CivicAddressValidationResponsePostalDirectoryMatchLevel_QNAME, String.class, CivicAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "DataMessages", scope = CivicAddressValidationResponse.class)
    public JAXBElement<ArrayOfstring> createCivicAddressValidationResponseDataMessages(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_CivicAddressValidationResponseDataMessages_QNAME, ArrayOfstring.class, CivicAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
          *
          */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "DeliveryConfirmationCode", scope = CivicAddressValidationResponse.class)
    public JAXBElement<String> createCivicAddressValidationResponseDeliveryConfirmationCode(String value) {
        return new JAXBElement<String>(_CivicAddressValidationResponseDeliveryConfirmationCode_QNAME, String.class, CivicAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCivicAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "CivicAddresses", scope = CivicAddressValidationResponse.class)
    public JAXBElement<ArrayOfCivicAddress> createCivicAddressValidationResponseCivicAddresses(ArrayOfCivicAddress value) {
        return new JAXBElement<ArrayOfCivicAddress>(_CivicAddressValidationResponseCivicAddresses_QNAME, ArrayOfCivicAddress.class, CivicAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
          *
          */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "MetropolitanStatisticalArea", scope = CivicAddressValidationResponse.class)
    public JAXBElement<String> createCivicAddressValidationResponseMetropolitanStatisticalArea(String value) {
        return new JAXBElement<String>(_CivicAddressValidationResponseMetropolitanStatisticalArea_QNAME, String.class, CivicAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
          *
          */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "County", scope = CivicAddressValidationResponse.class)
    public JAXBElement<String> createCivicAddressValidationResponseCounty(String value) {
        return new JAXBElement<String>(_CivicAddressValidationResponseCounty_QNAME, String.class, CivicAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ResultColor }{@code >}}
          *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "Result", scope = CivicAddressValidationResponse.class)
    public JAXBElement<ResultColor> createCivicAddressValidationResponseResult(ResultColor value) {
        return new JAXBElement<ResultColor>(_IsThisAddressServiceableResponseResult_QNAME, ResultColor.class, CivicAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ValidateCivicAddressResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "ValidateCivicAddressResponse", scope = ValidateCivicAddressProxyResponse.class)
    public JAXBElement<ValidateCivicAddressResponse> createValidateCivicAddressProxyResponseValidateCivicAddressResponse(ValidateCivicAddressResponse value) {
        return new JAXBElement<ValidateCivicAddressResponse>(_ValidateCivicAddressProxyResponseValidateCivicAddressResponse_QNAME, ValidateCivicAddressResponse.class, ValidateCivicAddressProxyResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfError }{@code >}}
          *
          */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "Errors", scope = ValidateCivicAddressProxyResponse.class)
    public JAXBElement<ArrayOfError> createValidateCivicAddressProxyResponseErrors(ArrayOfError value) {
        return new JAXBElement<ArrayOfError>(_IsThisAddressServiceableResponseErrors_QNAME, ArrayOfError.class, ValidateCivicAddressProxyResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfError }{@code >}}
          *
          */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "Errors", scope = GetSubAddressesResponse.class)
    public JAXBElement<ArrayOfError> createGetSubAddressesResponseErrors(ArrayOfError value) {
        return new JAXBElement<ArrayOfError>(_IsThisAddressServiceableResponseErrors_QNAME, ArrayOfError.class, GetSubAddressesResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSubAddress }{@code >}}
          *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "SubAddresses", scope = GetSubAddressesResponse.class)
    public JAXBElement<ArrayOfSubAddress> createGetSubAddressesResponseSubAddresses(ArrayOfSubAddress value) {
        return new JAXBElement<ArrayOfSubAddress>(_GetSubAddressesResponseSubAddresses_QNAME, ArrayOfSubAddress.class, GetSubAddressesResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link SearchResult }{@code >}}
          *
          */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "Result", scope = GetSubAddressesResponse.class)
    public JAXBElement<SearchResult> createGetSubAddressesResponseResult(SearchResult value) {
        return new JAXBElement<SearchResult>(_IsThisAddressServiceableResponseResult_QNAME, SearchResult.class, GetSubAddressesResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfError }{@code >}}
          *
          */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "Errors", scope = PostalAddressValidationResponse.class)
    public JAXBElement<ArrayOfError> createPostalAddressValidationResponseErrors(ArrayOfError value) {
        return new JAXBElement<ArrayOfError>(_IsThisAddressServiceableResponseErrors_QNAME, ArrayOfError.class, PostalAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GeoPoint }{@code >}}
     *
          */
         @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "GeoPoint", scope = PostalAddressValidationResponse.class)
    public JAXBElement<GeoPoint> createPostalAddressValidationResponseGeoPoint(GeoPoint value) {
        return new JAXBElement<GeoPoint>(_CivicAddressValidationResponseGeoPoint_QNAME, GeoPoint.class, PostalAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
          */
         @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "PostalDirectoryMatchLevel", scope = PostalAddressValidationResponse.class)
    public JAXBElement<String> createPostalAddressValidationResponsePostalDirectoryMatchLevel(String value) {
        return new JAXBElement<String>(_CivicAddressValidationResponsePostalDirectoryMatchLevel_QNAME, String.class, PostalAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
         @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "PostalRecordType", scope = PostalAddressValidationResponse.class)
    public JAXBElement<String> createPostalAddressValidationResponsePostalRecordType(String value) {
        return new JAXBElement<String>(_PostalAddressValidationResponsePostalRecordType_QNAME, String.class, PostalAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     *
          */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "DataMessages", scope = PostalAddressValidationResponse.class)
    public JAXBElement<ArrayOfstring> createPostalAddressValidationResponseDataMessages(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_CivicAddressValidationResponseDataMessages_QNAME, ArrayOfstring.class, PostalAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
         @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "DeliveryConfirmationCode", scope = PostalAddressValidationResponse.class)
    public JAXBElement<String> createPostalAddressValidationResponseDeliveryConfirmationCode(String value) {
        return new JAXBElement<String>(_CivicAddressValidationResponseDeliveryConfirmationCode_QNAME, String.class, PostalAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPostalAddress }{@code >}}
          *
          */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "PostalAddresses", scope = PostalAddressValidationResponse.class)
    public JAXBElement<ArrayOfPostalAddress> createPostalAddressValidationResponsePostalAddresses(ArrayOfPostalAddress value) {
        return new JAXBElement<ArrayOfPostalAddress>(_PostalAddressValidationResponsePostalAddresses_QNAME, ArrayOfPostalAddress.class, PostalAddressValidationResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ResultColor }{@code >}}
     *
          */
         @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types/Response", name = "Result", scope = PostalAddressValidationResponse.class)
    public JAXBElement<ResultColor> createPostalAddressValidationResponseResult(ResultColor value) {
        return new JAXBElement<ResultColor>(_IsThisAddressServiceableResponseResult_QNAME, ResultColor.class, PostalAddressValidationResponse.class, value);
    }

}
