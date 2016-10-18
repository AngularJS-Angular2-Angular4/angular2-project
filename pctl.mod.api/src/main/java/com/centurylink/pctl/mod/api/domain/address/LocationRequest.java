package com.centurylink.pctl.mod.api.domain.address;

/**
 * Created by haribabu.ka on 17-10-2016.
 */
public class LocationRequest {

    public Address serviceAddress;
    public Address shippingAddress;

    public LocationRequest() {
    }

    public LocationRequest(Address serviceAddress, Address shippingAddress) {
        this.serviceAddress = serviceAddress;
        this.shippingAddress = shippingAddress;
    }

    public void setServiceAddress(Address serviceAddress) {
        this.serviceAddress = serviceAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Address getServiceAddress() {
        return serviceAddress;
    }

    public Address getShippingAddress() {
        return shippingAddress;
    }


}
