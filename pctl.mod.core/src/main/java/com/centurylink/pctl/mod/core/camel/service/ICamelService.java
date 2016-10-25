/**
 *
 */
package com.centurylink.pctl.mod.core.camel.service;

import com.centurylink.pctl.mod.core.camel.CamelException;
import org.springframework.stereotype.Component;

/**
 * @author s-arunkumar
 */
@Component
public interface ICamelService {

    public String getType();

    public void init() throws CamelException;

    public Object process(String id, Object body) throws CamelException;
}
