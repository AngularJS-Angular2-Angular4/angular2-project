
package com.centurylink.pctl.mod.address.domain.address;


import com.centurylink.pctl.mod.core.utils.Response;
import com.centurylink.pctl.mod.core.utils.StatusCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by haribabu.ka on 11-10-2016.
 */
@Component
public class AddressServiceImpl implements AddressService {

    private static final Logger log = LoggerFactory.getLogger(AddressServiceImpl.class);

  /*  @Value("${marshallerPath_}")
    private String marshallerPath_AddressValidation;
    @Value("${remoteUri_AddressValidation}")
    private String remoteUri_AddressValidation;
    @Value("${ActionEndPoint_CivicAddress}")
    private String ActionEndPoint_CivicAddress;
    @Value("${ActionEndPoint_PostalAddress}")
    private String ActionEndPoint_PostalAddress;*/

    public Response<LocationResponse> validate(LocationRequest locationRequest) {

        Response<LocationResponse> response = new Response<LocationResponse>();
        Response<Address> serviceAddressResponse = new Response<Address>();
        Response<Address> shippingAddressResponse = new Response<Address>();

        LocationResponse location  = new LocationResponse();
        if (locationRequest != null) {
            Address serviceAddress = locationRequest.getServiceAddress();
            Address shippingAddress = locationRequest.getShippingAddress();
            if (serviceAddress != null) {
                serviceAddressResponse.setStatus(StatusCode.E200);
                serviceAddressResponse.setContent(serviceAddress);
                location.setServiceAddress(serviceAddressResponse);
            } else {
                response.setStatus(StatusCode.C401);
            }
            if (shippingAddress != null) {
                shippingAddressResponse.setStatus(StatusCode.E200);
                shippingAddressResponse.setContent(shippingAddress);
                location.setShippingAddress(shippingAddressResponse);
            } else {
                if (response.getCode() != null) {
                    response.setStatus(StatusCode.C403);
                } else {
                    response.setStatus(StatusCode.C402);
                }
            }
        } else {
            response.setStatus(StatusCode.C403);
        }
        if (response.getCode()== null) {
            response.setStatus(StatusCode.E200);
        }
        response.setContent(location);
        return response;
    }



    /*
    public SoapClient soapClient;

    public AddressService(SoapClient soapClient) {
        this.soapClient = soapClient;
    }
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(marshallerPath_AddressValidation);
        log.info("marshaller contextpath for Address Validation"
            + marshaller.getContextPath());
        return marshaller;
    }
    public SoapClient soapClientAddress(Jaxb2Marshaller marshaller) {
        SoapClient client = new SoapClient();
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        client.setActionEndpoint(ActionEndPoint_CivicAddress);
        client.setRemoteUri(remoteUri_AddressValidation);
        log.info("soapClientAddress for Civic Address");
        return client;
    }

    public AddressService civicAddressService() {
        return new AddressService(soapClientAddress(marshaller()));
    }

    public SoapClient soapClientAddress(Jaxb2Marshaller marshaller) {
        SoapClient client = new SoapClient();
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        client.setActionEndpoint(ActionEndPoint_PostalAddress);
        client.setRemoteUri(remoteUri_AddressValidation);
        log.info("soapClientAddress for Postal Address");
        return client;
    }

    public AddressService postalAddressService() {
        return new AddressService(soapClientAddress(marshaller()));
    }
    public CivicAddressValidationResponse civicAddressValidation(Address address) {

        return soapClient.civicAddressValidation(address);
    }

    public PostalAddressValidationResponse postalAddressValidation(Address address) {

        return soapClient.postalAddressValidation(address);
    }
*/


}




