package com.centurylink.pctl.mod.api.domain.address;

import com.centurylink.pctl.mod.api.domain.utils.Response;
import com.centurylink.pctl.mod.api.domain.utils.StatusCode;

/**
 * Created by haribabu.ka on 17-10-2016.
 */
public class LocationResponse extends LocationRequest {

    private Response response;

    public void setServiceAddress(Address serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public void setResponse(StatusCode response) {
        this.response = new Response(response.getCode(), response.getMessage(), response.getHttpStatus());
    }

    @Override
    public Address getShippingAddress() {
        return shippingAddress;
    }

    @Override
    public Address getServiceAddress() {
        return serviceAddress;
    }

    public Response getResponse() {
        return response;
    }


}
