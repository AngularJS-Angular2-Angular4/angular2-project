
package com.ctl.as.domain.geo.v2.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.ctl.as.domain.geo.types.AddressAttributes;
import com.ctl.as.domain.geo.types.ArrayOfGeoPoint;
import com.ctl.as.domain.geo.types.ArrayOfSubAddressDesignator;
import com.ctl.as.domain.geo.types.SubAddressDesignator;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.ctl.as.domain.geo.v2.types package.
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

    private final static QName _ArrayOfPostalAddress_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "ArrayOfPostalAddress");
    private final static QName _ServiceAddress_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "ServiceAddress");
    private final static QName _ParsedAddress_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "ParsedAddress");
    private final static QName _CivicAddress_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "CivicAddress");
    private final static QName _AmericanPropertyAddress_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "AmericanPropertyAddress");
    private final static QName _ArrayOfServiceAddress_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "ArrayOfServiceAddress");
    private final static QName _CivicAddressSource_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "CivicAddressSource");
    private final static QName _ArrayOfCivicAddress_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "ArrayOfCivicAddress");
    private final static QName _GeoPointSource_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "GeoPointSource");
    private final static QName _PostalAddress_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "PostalAddress");
    private final static QName _ServiceAddressSubAddressDesignators_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "SubAddressDesignators");
    private final static QName _ServiceAddressFullName_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "FullName");
    private final static QName _ServiceAddressIsAddressFromLiveLookup_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "IsAddressFromLiveLookup");
    private final static QName _ServiceAddressSubAddressId_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "SubAddressId");
    private final static QName _ServiceAddressGeoPoints_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "GeoPoints");
    private final static QName _ServiceAddressSourceSystemId_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "SourceSystemId");
    private final static QName _ServiceAddressAddressId_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "AddressId");
    private final static QName _ServiceAddressSubAddress_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "SubAddress");
    private final static QName _ServiceAddressName_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "Name");
    private final static QName _ServiceAddressAttributes_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "Attributes");
    private final static QName _ServiceAddressDataMessages_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "DataMessages");
    private final static QName _AmericanPropertyAddressStreetNrLastSuffix_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "StreetNrLastSuffix");
    private final static QName _AmericanPropertyAddressStreetNameSuffix_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "StreetNameSuffix");
    private final static QName _AmericanPropertyAddressStreetAddress_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "StreetAddress");
    private final static QName _AmericanPropertyAddressPostCode_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "PostCode");
    private final static QName _AmericanPropertyAddressStreetNrLastPrefix_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "StreetNrLastPrefix");
    private final static QName _AmericanPropertyAddressCountry_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "Country");
    private final static QName _AmericanPropertyAddressStreetNrFirstSuffix_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "StreetNrFirstSuffix");
    private final static QName _AmericanPropertyAddressStreetNrFirst_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "StreetNrFirst");
    private final static QName _AmericanPropertyAddressLocality_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "Locality");
    private final static QName _AmericanPropertyAddressStreetNrLast_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "StreetNrLast");
    private final static QName _AmericanPropertyAddressStateOrProvince_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "StateOrProvince");
    private final static QName _AmericanPropertyAddressStreetName_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "StreetName");
    private final static QName _AmericanPropertyAddressStreetNamePrefix_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "StreetNamePrefix");
    private final static QName _AmericanPropertyAddressStreetType_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "StreetType");
    private final static QName _AmericanPropertyAddressStreetNrFirstPrefix_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "StreetNrFirstPrefix");
    private final static QName _AmericanPropertyAddressStreetSuffix_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "StreetSuffix");
    private final static QName _PostalAddressPostalPreferredLocalityName_QNAME = new QName("http://geo.domain.as.ctl.com/v2/Types", "PostalPreferredLocalityName");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ctl.as.domain.geo.v2.types
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PostalAddress }
     *
     */
    public PostalAddress createPostalAddress() {
        return new PostalAddress();
    }

    /**
     * Create an instance of {@link ArrayOfCivicAddress }
     *
     */
    public ArrayOfCivicAddress createArrayOfCivicAddress() {
        return new ArrayOfCivicAddress();
    }

    /**
     * Create an instance of {@link CivicAddress }
     *
     */
    public CivicAddress createCivicAddress() {
        return new CivicAddress();
    }

    /**
     * Create an instance of {@link ServiceAddress }
     *
     */
    public ServiceAddress createServiceAddress() {
        return new ServiceAddress();
    }

    /**
     * Create an instance of {@link ArrayOfPostalAddress }
     *
     */
    public ArrayOfPostalAddress createArrayOfPostalAddress() {
        return new ArrayOfPostalAddress();
    }

    /**
     * Create an instance of {@link AmericanPropertyAddress }
     *
     */
    public AmericanPropertyAddress createAmericanPropertyAddress() {
        return new AmericanPropertyAddress();
    }

    /**
     * Create an instance of {@link ArrayOfServiceAddress }
     *
     */
    public ArrayOfServiceAddress createArrayOfServiceAddress() {
        return new ArrayOfServiceAddress();
    }

    /**
     * Create an instance of {@link ParsedAddress }
     *
     */
    public ParsedAddress createParsedAddress() {
        return new ParsedAddress();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfPostalAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "ArrayOfPostalAddress")
    public JAXBElement<ArrayOfPostalAddress> createArrayOfPostalAddress(ArrayOfPostalAddress value) {
        return new JAXBElement<ArrayOfPostalAddress>(_ArrayOfPostalAddress_QNAME, ArrayOfPostalAddress.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ServiceAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "ServiceAddress")
    public JAXBElement<ServiceAddress> createServiceAddress(ServiceAddress value) {
        return new JAXBElement<ServiceAddress>(_ServiceAddress_QNAME, ServiceAddress.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ParsedAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "ParsedAddress")
    public JAXBElement<ParsedAddress> createParsedAddress(ParsedAddress value) {
        return new JAXBElement<ParsedAddress>(_ParsedAddress_QNAME, ParsedAddress.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link CivicAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "CivicAddress")
    public JAXBElement<CivicAddress> createCivicAddress(CivicAddress value) {
        return new JAXBElement<CivicAddress>(_CivicAddress_QNAME, CivicAddress.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link AmericanPropertyAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "AmericanPropertyAddress")
    public JAXBElement<AmericanPropertyAddress> createAmericanPropertyAddress(AmericanPropertyAddress value) {
        return new JAXBElement<AmericanPropertyAddress>(_AmericanPropertyAddress_QNAME, AmericanPropertyAddress.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfServiceAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "ArrayOfServiceAddress")
    public JAXBElement<ArrayOfServiceAddress> createArrayOfServiceAddress(ArrayOfServiceAddress value) {
        return new JAXBElement<ArrayOfServiceAddress>(_ArrayOfServiceAddress_QNAME, ArrayOfServiceAddress.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link CivicAddressSource }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "CivicAddressSource")
    public JAXBElement<CivicAddressSource> createCivicAddressSource(CivicAddressSource value) {
        return new JAXBElement<CivicAddressSource>(_CivicAddressSource_QNAME, CivicAddressSource.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfCivicAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "ArrayOfCivicAddress")
    public JAXBElement<ArrayOfCivicAddress> createArrayOfCivicAddress(ArrayOfCivicAddress value) {
        return new JAXBElement<ArrayOfCivicAddress>(_ArrayOfCivicAddress_QNAME, ArrayOfCivicAddress.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link GeoPointSource }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "GeoPointSource")
    public JAXBElement<GeoPointSource> createGeoPointSource(GeoPointSource value) {
        return new JAXBElement<GeoPointSource>(_GeoPointSource_QNAME, GeoPointSource.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link PostalAddress }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "PostalAddress")
    public JAXBElement<PostalAddress> createPostalAddress(PostalAddress value) {
        return new JAXBElement<PostalAddress>(_PostalAddress_QNAME, PostalAddress.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfSubAddressDesignator }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "SubAddressDesignators", scope = ServiceAddress.class)
    public JAXBElement<ArrayOfSubAddressDesignator> createServiceAddressSubAddressDesignators(ArrayOfSubAddressDesignator value) {
        return new JAXBElement<ArrayOfSubAddressDesignator>(_ServiceAddressSubAddressDesignators_QNAME, ArrayOfSubAddressDesignator.class, ServiceAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "FullName", scope = ServiceAddress.class)
    public JAXBElement<String> createServiceAddressFullName(String value) {
        return new JAXBElement<String>(_ServiceAddressFullName_QNAME, String.class, ServiceAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "IsAddressFromLiveLookup", scope = ServiceAddress.class)
    public JAXBElement<Boolean> createServiceAddressIsAddressFromLiveLookup(Boolean value) {
        return new JAXBElement<Boolean>(_ServiceAddressIsAddressFromLiveLookup_QNAME, Boolean.class, ServiceAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "SubAddressId", scope = ServiceAddress.class)
    public JAXBElement<String> createServiceAddressSubAddressId(String value) {
        return new JAXBElement<String>(_ServiceAddressSubAddressId_QNAME, String.class, ServiceAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfGeoPoint }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "GeoPoints", scope = ServiceAddress.class)
    public JAXBElement<ArrayOfGeoPoint> createServiceAddressGeoPoints(ArrayOfGeoPoint value) {
        return new JAXBElement<ArrayOfGeoPoint>(_ServiceAddressGeoPoints_QNAME, ArrayOfGeoPoint.class, ServiceAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "SourceSystemId", scope = ServiceAddress.class)
    public JAXBElement<String> createServiceAddressSourceSystemId(String value) {
        return new JAXBElement<String>(_ServiceAddressSourceSystemId_QNAME, String.class, ServiceAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "AddressId", scope = ServiceAddress.class)
    public JAXBElement<String> createServiceAddressAddressId(String value) {
        return new JAXBElement<String>(_ServiceAddressAddressId_QNAME, String.class, ServiceAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "SubAddress", scope = ServiceAddress.class)
    public JAXBElement<String> createServiceAddressSubAddress(String value) {
        return new JAXBElement<String>(_ServiceAddressSubAddress_QNAME, String.class, ServiceAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "Name", scope = ServiceAddress.class)
    public JAXBElement<String> createServiceAddressName(String value) {
        return new JAXBElement<String>(_ServiceAddressName_QNAME, String.class, ServiceAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link AddressAttributes }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "Attributes", scope = ServiceAddress.class)
    public JAXBElement<AddressAttributes> createServiceAddressAttributes(AddressAttributes value) {
        return new JAXBElement<AddressAttributes>(_ServiceAddressAttributes_QNAME, AddressAttributes.class, ServiceAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfstring }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "DataMessages", scope = ServiceAddress.class)
    public JAXBElement<ArrayOfstring> createServiceAddressDataMessages(ArrayOfstring value) {
        return new JAXBElement<ArrayOfstring>(_ServiceAddressDataMessages_QNAME, ArrayOfstring.class, ServiceAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "StreetNrLastSuffix", scope = AmericanPropertyAddress.class)
    public JAXBElement<String> createAmericanPropertyAddressStreetNrLastSuffix(String value) {
        return new JAXBElement<String>(_AmericanPropertyAddressStreetNrLastSuffix_QNAME, String.class, AmericanPropertyAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "StreetNameSuffix", scope = AmericanPropertyAddress.class)
    public JAXBElement<String> createAmericanPropertyAddressStreetNameSuffix(String value) {
        return new JAXBElement<String>(_AmericanPropertyAddressStreetNameSuffix_QNAME, String.class, AmericanPropertyAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "StreetAddress", scope = AmericanPropertyAddress.class)
    public JAXBElement<String> createAmericanPropertyAddressStreetAddress(String value) {
        return new JAXBElement<String>(_AmericanPropertyAddressStreetAddress_QNAME, String.class, AmericanPropertyAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "PostCode", scope = AmericanPropertyAddress.class)
    public JAXBElement<String> createAmericanPropertyAddressPostCode(String value) {
        return new JAXBElement<String>(_AmericanPropertyAddressPostCode_QNAME, String.class, AmericanPropertyAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "StreetNrLastPrefix", scope = AmericanPropertyAddress.class)
    public JAXBElement<String> createAmericanPropertyAddressStreetNrLastPrefix(String value) {
        return new JAXBElement<String>(_AmericanPropertyAddressStreetNrLastPrefix_QNAME, String.class, AmericanPropertyAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "Country", scope = AmericanPropertyAddress.class)
    public JAXBElement<String> createAmericanPropertyAddressCountry(String value) {
        return new JAXBElement<String>(_AmericanPropertyAddressCountry_QNAME, String.class, AmericanPropertyAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "StreetNrFirstSuffix", scope = AmericanPropertyAddress.class)
    public JAXBElement<String> createAmericanPropertyAddressStreetNrFirstSuffix(String value) {
        return new JAXBElement<String>(_AmericanPropertyAddressStreetNrFirstSuffix_QNAME, String.class, AmericanPropertyAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "StreetNrFirst", scope = AmericanPropertyAddress.class)
    public JAXBElement<String> createAmericanPropertyAddressStreetNrFirst(String value) {
        return new JAXBElement<String>(_AmericanPropertyAddressStreetNrFirst_QNAME, String.class, AmericanPropertyAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
          *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "Locality", scope = AmericanPropertyAddress.class)
    public JAXBElement<String> createAmericanPropertyAddressLocality(String value) {
        return new JAXBElement<String>(_AmericanPropertyAddressLocality_QNAME, String.class, AmericanPropertyAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
          *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "StreetNrLast", scope = AmericanPropertyAddress.class)
    public JAXBElement<String> createAmericanPropertyAddressStreetNrLast(String value) {
        return new JAXBElement<String>(_AmericanPropertyAddressStreetNrLast_QNAME, String.class, AmericanPropertyAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
          *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "StateOrProvince", scope = AmericanPropertyAddress.class)
    public JAXBElement<String> createAmericanPropertyAddressStateOrProvince(String value) {
        return new JAXBElement<String>(_AmericanPropertyAddressStateOrProvince_QNAME, String.class, AmericanPropertyAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
          *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "StreetName", scope = AmericanPropertyAddress.class)
    public JAXBElement<String> createAmericanPropertyAddressStreetName(String value) {
        return new JAXBElement<String>(_AmericanPropertyAddressStreetName_QNAME, String.class, AmericanPropertyAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
          *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "StreetNamePrefix", scope = AmericanPropertyAddress.class)
    public JAXBElement<String> createAmericanPropertyAddressStreetNamePrefix(String value) {
        return new JAXBElement<String>(_AmericanPropertyAddressStreetNamePrefix_QNAME, String.class, AmericanPropertyAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
          *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "StreetType", scope = AmericanPropertyAddress.class)
    public JAXBElement<String> createAmericanPropertyAddressStreetType(String value) {
        return new JAXBElement<String>(_AmericanPropertyAddressStreetType_QNAME, String.class, AmericanPropertyAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
          *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "StreetNrFirstPrefix", scope = AmericanPropertyAddress.class)
    public JAXBElement<String> createAmericanPropertyAddressStreetNrFirstPrefix(String value) {
        return new JAXBElement<String>(_AmericanPropertyAddressStreetNrFirstPrefix_QNAME, String.class, AmericanPropertyAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
          *
          */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "StreetSuffix", scope = AmericanPropertyAddress.class)
    public JAXBElement<String> createAmericanPropertyAddressStreetSuffix(String value) {
        return new JAXBElement<String>(_AmericanPropertyAddressStreetSuffix_QNAME, String.class, AmericanPropertyAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link SubAddressDesignator }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "SubAddress", scope = PostalAddress.class)
    public JAXBElement<SubAddressDesignator> createPostalAddressSubAddress(SubAddressDesignator value) {
        return new JAXBElement<SubAddressDesignator>(_ServiceAddressSubAddress_QNAME, SubAddressDesignator.class, PostalAddress.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
          *
          */
    @XmlElementDecl(namespace = "http://geo.domain.as.ctl.com/v2/Types", name = "PostalPreferredLocalityName", scope = PostalAddress.class)
    public JAXBElement<String> createPostalAddressPostalPreferredLocalityName(String value) {
        return new JAXBElement<String>(_PostalAddressPostalPreferredLocalityName_QNAME, String.class, PostalAddress.class, value);
    }

}
