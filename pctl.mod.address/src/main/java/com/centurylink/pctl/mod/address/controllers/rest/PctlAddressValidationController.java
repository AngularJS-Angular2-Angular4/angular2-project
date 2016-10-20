
package com.centurylink.pctl.mod.address.controllers.rest;

import com.centurylink.pctl.mod.address.domain.address.*;
import com.centurylink.pctl.mod.address.domain.utils.Response;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by haribabu.ka on 10-10-2016.
 */

@RequestMapping("/address")
@Controller
public class PctlAddressValidationController {

    private static final Logger log = LoggerFactory.getLogger(PctlAddressValidationController.class);

    @Autowired
    public AddressService addressService;

    @RequestMapping(method = RequestMethod.POST, value = "/validation", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<Response<LocationResponse>> validateAddress(@RequestBody LocationRequest locationRequest) {
        Response<LocationResponse> response = addressService.validate(locationRequest);
        return new ResponseEntity<Response<LocationResponse>>(response, response.getHttpStatus());
    }
}

