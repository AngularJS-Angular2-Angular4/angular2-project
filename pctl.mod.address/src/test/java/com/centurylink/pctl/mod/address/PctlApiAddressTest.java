
package com.centurylink.pctl.mod.address;

import com.centurylink.pctl.mod.address.domain.address.Address;
import com.centurylink.pctl.mod.address.domain.address.AddressService;
import com.centurylink.pctl.mod.address.domain.address.LocationRequest;
import com.centurylink.pctl.mod.address.domain.address.LocationResponse;
import com.centurylink.pctl.mod.core.utils.Response;
import com.centurylink.pctl.mod.core.utils.StatusCode;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;


@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class PctlApiAddressTest {

    @Autowired
    private AddressService addressService;


    @Test
    public void validateNull() {
        Response<LocationResponse> respo = addressService.validate(null);
        Assert.assertNotNull(respo);
        Assert.assertNotNull(respo.getContent());
        Assert.assertNotNull(respo.getCode());
        Assert.assertNotNull(respo.getMessage());
        Assert.assertNotNull(respo.getHttpStatus());
        Assert.assertEquals(StatusCode.C403.getCode(), respo.getCode());
    }

    @Test
    public void validateEmptyObject() {
        Response<LocationResponse> respo = addressService.validate(new LocationRequest());
        Assert.assertNotNull(respo);
        Assert.assertNotNull(respo.getContent());
        Assert.assertNotNull(respo.getCode());
        Assert.assertNotNull(respo.getMessage());
        Assert.assertNotNull(respo.getHttpStatus());
        Assert.assertEquals(StatusCode.C403.getCode(), respo.getCode());
    }


    @Test
    public void validateEmptyServiceAdd() {
        LocationRequest locationRequest = new LocationRequest();
        Address address = new Address();
        locationRequest.setServiceAddress(address);
        Response<LocationResponse> respo = addressService.validate(locationRequest);
        Assert.assertNotNull(respo);
        Assert.assertNotNull(respo.getContent());
        Assert.assertNotNull(respo.getCode());
        Assert.assertNotNull(respo.getMessage());
        Assert.assertNotNull(respo.getHttpStatus());
        Assert.assertEquals(StatusCode.C401.getCode(), respo.getCode());
    }

    @Test
    public void validateEmptyShippingAdd() {
        LocationRequest locationRequest = new LocationRequest();
        Address address = new Address();
        locationRequest.setShippingAddress(address);
        Response<LocationResponse> respo = addressService.validate(locationRequest);
        Assert.assertNotNull(respo);
        Assert.assertNotNull(respo.getContent());
        Assert.assertNotNull(respo.getCode());
        Assert.assertNotNull(respo.getMessage());
        Assert.assertNotNull(respo.getHttpStatus());
        Assert.assertEquals(StatusCode.C402.getCode(), respo.getCode());
    }

    @Test
    public void validateCorrectAdd() {
        LocationRequest locationRequest = new LocationRequest();
        Address address = new Address();
        locationRequest.setShippingAddress(address);
        locationRequest.setServiceAddress(address);
        Response<LocationResponse> respo = addressService.validate(locationRequest);
        Assert.assertNotNull(respo);
        Assert.assertNotNull(respo.getContent());
        Assert.assertNotNull(respo.getCode());
        Assert.assertNotNull(respo.getMessage());
        Assert.assertNotNull(respo.getHttpStatus());
        Assert.assertEquals(StatusCode.E200.getCode(), respo.getCode());
    }
}

