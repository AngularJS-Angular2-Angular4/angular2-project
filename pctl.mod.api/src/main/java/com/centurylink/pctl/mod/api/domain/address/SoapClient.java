/*

package com.centurylink.pctl.mod.api.domain.address;





import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class SoapClient extends WebServiceGatewaySupport {

    private static final Logger log = LoggerFactory.getLogger(SoapClient.class);

    // private static final Currency USD = "USD";

    private String remoteUri;
    private String actionEndpoint;

    public String getRemoteUri() {
        return remoteUri;
    }

    public void setRemoteUri(String remoteUri) {
        this.remoteUri = remoteUri;
    }

    public String getActionEndpoint() {
        return actionEndpoint;
    }

    public void setActionEndpoint(String actionEndpoint) {
        this.actionEndpoint = actionEndpoint;
    }


    public CivicAddressValidationResponse civicAddressValidation(Address address) {

        log.info("Civic Address Validation request");
        CivicAddressValidation request = new CivicAddressValidation();
        request.setClientId(address);
        request.setAddressLine(address.getAddress());
        request.setLocality(address.getLocationName());
        request.setStateOrProvince(address.getState());
        request.setPostCode(address.getZipCode());
        log.info("Civic Address Validation request");

        CivicAddressValidationResponse response = (CivicAddressValidationResponse) getWebServiceTemplate()
            .marshalSendAndReceive(this.remoteUri, request,
                new SoapActionCallback(this.actionEndpoint));
        log.info("Civic Address Validation response" + response.toString());
        return response;
    }
    public PostalAddressValidationResponse postalAddressValidation(Address address) {

        log.info("Postal Address Validation request");
        PostalAddressValidation request = new PostalAddressValidation();
        request.setClientId(address);
        request.setAddressLine(address.getAddress());
        request.setLocality(address.getLocationName());
        request.setStateOrProvince(address.getState());
        request.setPostCode(address.getZipCode());
        log.info("Postal Address Validation request");

        PostalAddressValidationResponse response = (PostalAddressValidationResponse) getWebServiceTemplate()
            .marshalSendAndReceive(this.remoteUri, request,
                new SoapActionCallback(this.actionEndpoint));
        log.info("Postal Address Validation response" + response.toString());
        return response;
    }

}




*/
