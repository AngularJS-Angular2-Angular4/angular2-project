/**
 *
 */
package com.centurylink.pctl.mod.core.camel.factory;

import com.centurylink.pctl.mod.core.camel.service.ICamelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author s-arunkumar
 */
@Component
public class CamelServiceFactory {

    private static final Map<String, ICamelService> myServiceCache = new HashMap<>();
    @Autowired
    private List<ICamelService> services;

    public static ICamelService getService(String type) {
        ICamelService service = myServiceCache.get(type);
        if (service == null) throw new RuntimeException("Unknown service type: " + type);
        return service;
    }

    @PostConstruct
    private void initMyServiceCache() {
        for (ICamelService service : services) {
            myServiceCache.put(service.getType(), service);
        }
    }
}
