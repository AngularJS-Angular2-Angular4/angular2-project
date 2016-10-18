package com.centurylink.pctl.mod.api.domain.address;

import com.centurylink.pctl.mod.api.domain.utils.Response;
import com.centurylink.pctl.mod.api.domain.utils.StatusCode;

/**
 * Created by haribabu.ka on 17-10-2016.
 */
public class LocationResponse {

    public Response<Address> serviceAddress;
    public Response<Address> shippingAddress;

    public void setServiceAddress(Response<Address> serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public void setShippingAddress(Response<Address> shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Response<Address> getShippingAddress() {
        return shippingAddress;
    }

    public Response<Address> getServiceAddress() {
        return serviceAddress;
    }

}
