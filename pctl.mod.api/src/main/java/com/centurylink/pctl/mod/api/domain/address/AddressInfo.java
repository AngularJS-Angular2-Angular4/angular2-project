
package com.centurylink.pctl.mod.api.domain.address;

import com.centurylink.pctl.mod.api.domain.utils.StatusCode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
//import org.springframework.oxm.jaxb.Jaxb2Marshaller;


/**
 * Created by haribabu.ka on 11-10-2016.
 */

public class AddressInfo {

    private static final Logger log = LoggerFactory.getLogger(AddressInfo.class);

    @Value("${marshallerPath_}")
    private String marshallerPath_AddressValidation;
    @Value("${remoteUri_AddressValidation}")
    private String remoteUri_AddressValidation;
    @Value("${ActionEndPoint_CivicAddress}")
    private String ActionEndPoint_CivicAddress;
    @Value("${ActionEndPoint_PostalAddress}")
    private String ActionEndPoint_PostalAddress;

  /*  public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath(marshallerPath_AddressValidation);
        log.info("marshaller contextpath for Address Validation"
            + marshaller.getContextPath());
        return marshaller;
    }*/


    public static LocationResponse validate(LocationRequest locationRequest) {

        LocationResponse response = new LocationResponse();
        Address serviceAddress = locationRequest.getServiceAddress();
        Address shippingAddress = locationRequest.getShippingAddress();
        if (serviceAddress != null) {
            serviceAddress.setResponse(StatusCode.E200);
            response.setServiceAddress(serviceAddress);
        } else {
            response.setResponse(StatusCode.E401);
        }
        if (shippingAddress != null) {
            shippingAddress.setResponse(StatusCode.E200);
            response.setShippingAddress(shippingAddress);
        } else {
            if (response.getResponse() != null) {
                response.setResponse(StatusCode.E403);
            } else {
                response.setResponse(StatusCode.E402);
            }
        }
        if (response.getResponse() == null) {
            response.setResponse(StatusCode.E200);
        }
        return response;
    }

}





/*
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
    }*/



