
package com.centurylink.pctl.mod.api.domain.address;


import com.centurylink.pctl.mod.api.domain.utils.Response;

/**
 * Created by haribabu.ka on 11-10-2016.
 */

public interface AddressService {

    public Response<LocationResponse> validate(LocationRequest locationRequest);
}




