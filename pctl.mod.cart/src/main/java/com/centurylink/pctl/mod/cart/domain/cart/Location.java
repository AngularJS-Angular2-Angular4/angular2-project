package com.centurylink.pctl.mod.cart.domain.cart;

/**
 * Created by nagavenkatakirang on 21-10-2016.
 */
public class Location
{
    private String address;

    private String zipcode;

    private String street;

    private String state;

    private String locationName;

    private String city;

    private String country;

    public String getAddress ()
    {
        return address;
    }

    public void setAddress (String address)
    {
        this.address = address;
    }

    public String getZipcode ()
    {
        return zipcode;
    }

    public void setZipcode (String zipcode)
    {
        this.zipcode = zipcode;
    }

    public String getStreet ()
    {
        return street;
    }

    public void setStreet (String street)
    {
        this.street = street;
    }

    public String getState ()
    {
        return state;
    }

    public void setState (String state)
    {
        this.state = state;
    }

    public String getLocationName ()
    {
        return locationName;
    }

    public void setLocationName (String locationName)
    {
        this.locationName = locationName;
    }

    public String getCity ()
    {
        return city;
    }

    public void setCity (String city)
    {
        this.city = city;
    }

    public String getCountry ()
    {
        return country;
    }

    public void setCountry (String country)
    {
        this.country = country;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [address = "+address+", zipcode = "+zipcode+", street = "+street+", state = "+state+", locationName = "+locationName+", city = "+city+", country = "+country+"]";
    }
}

