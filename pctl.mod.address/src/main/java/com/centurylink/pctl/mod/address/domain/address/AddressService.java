
package com.centurylink.pctl.mod.address.domain.address;


import com.centurylink.pctl.mod.core.utils.Response;

/**
 * Created by haribabu.ka on 11-10-2016.
 */

public interface AddressService {

    public Response<LocationResponse> validate(LocationRequest locationRequest);
}




