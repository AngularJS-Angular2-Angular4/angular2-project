/**
 *
 */
package com.centurylink.pctl.mod.core.camel.routebuilders;

import com.centurylink.pctl.mod.core.camel.config.SoapEndPoint;
import org.apache.camel.builder.xml.Namespaces;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * @author s-arunkumar
 */
@Component
public class SOAPCamelRouteBuilder extends AbstractRouteBuilder {

    private static final Logger logger = Logger
        .getLogger(SOAPCamelRouteBuilder.class);


    @Override
    public void configure() throws Exception {

        for (SoapEndPoint endPoint : bindingConfig().getSoapEndPoints()) {
            logger.info("createRouteBuilder" + endPoint.getServiceName() + endPoint);
            from("direct:" + endPoint.getId())
                .to("velocity:" + endPoint.getVelocityTemplate())
                .to("spring-ws:" + endPoint.getServiceEndPoint()
                    + "?soapAction=" + endPoint.getSoapAction())
                .transform()
                .xpath(endPoint.getBaseXPath(),
                    new Namespaces("n", endPoint.getNamespace()))
                .transform().method("cdataTransformer");
        }
    }


}
