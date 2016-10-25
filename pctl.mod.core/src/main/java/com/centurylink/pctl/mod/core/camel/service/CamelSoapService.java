/**
 *
 */
package com.centurylink.pctl.mod.core.camel.service;

import com.centurylink.pctl.mod.core.camel.CamelException;
import com.centurylink.pctl.mod.core.camel.factory.MessageTypeEnum;
import com.centurylink.pctl.mod.core.camel.routebuilders.SOAPCamelRouteBuilder;
import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author s-arunkumar
 */
@Component
public class CamelSoapService extends AbstractCamelService {

    private static final Logger logger = Logger
        .getLogger(CamelSoapService.class);


    @Autowired
    private SOAPCamelRouteBuilder factory;

    private CamelContext context;

    @Override
    public Object process(String id, Object body) throws CamelException {
        Object response = null;
        if (context == null) {
            throw new CamelException("Not Inited");
        }
        try {
            ProducerTemplate template = context.createProducerTemplate();
            response = template.requestBody("direct:" + id, body);
        } finally {
            // context.stop();
        }
        return response;
    }

    @Override
    public String getType() {
        return MessageTypeEnum.SOAP.name();
    }

    @Override
    @PostConstruct
    public void init() throws CamelException {
        if (context == null) {
            try {
                context = makeCamelContext();
                context.addRoutes(factory);
                context.start();
            } catch (Exception e) {
                CamelException camel = new CamelException(e, "Init Camel");
                camel.setSourceException(e);
                throw camel;
            }
        } else {
            logger.debug("Using Existing Context");
        }
    }

}
