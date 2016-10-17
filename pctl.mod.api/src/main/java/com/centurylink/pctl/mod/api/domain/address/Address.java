package com.centurylink.pctl.mod.api.domain.address;

import com.centurylink.pctl.mod.api.domain.utils.Response;
import com.centurylink.pctl.mod.api.domain.utils.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by haribabu.ka on 13-10-2016.
 */
public  class Address {

    private String locationName;
    private String address;
    private String street;
    private String country;
    private String city;
    private String state;
    private String zipCode;


    private Response response;

    public Address() {

    }


    public Address(String locationName, String address, String street, String country, String city, String state, String zipCode) {

        this.locationName = locationName;
        this.address = address;
        this.street = street;
        this.country = country;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;

    }


    public void setResponse(StatusCode response) {
        this.response = new Response(response.getCode(),response.getMessage(), response.getHttpStatus());
    }

    public Address(String locationName, String address, String street, String country, String city, String state, String zipCode, AddressType addressType, Address serviceAddress, Response response) {
        this(locationName, address, street, country, city, state, zipCode);
        this.response = response;
    }

    public Response getResponse() {
        return response;
    }



    public String getLocationName() {
        return locationName;
    }

    public String getAddress() {
        return address;
    }

    public String getStreet() {
        return street;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }


}
