
package com.centurylink.pctl.mod.api.controllers.rest;

import com.centurylink.pctl.mod.api.domain.address.AddressInfo;
import com.centurylink.pctl.mod.api.domain.address.LocationRequest;
import com.centurylink.pctl.mod.api.domain.address.LocationResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    public AddressInfo addressInfo;

    @RequestMapping(method = RequestMethod.POST, value = "/validation", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<LocationResponse> validateAddress(@RequestBody LocationRequest locationRequest) {

        LocationResponse response = addressInfo.validate(locationRequest);

        return new ResponseEntity<LocationResponse>(response, response.getResponse().getHttpStatus());
    }

}

