/**
 *
 */
package com.centurylink.pctl.mod.core.camel.service;

import com.centurylink.pctl.mod.core.camel.transformers.CDataTransformer;
import com.centurylink.pctl.mod.core.camel.transformers.PrintTransformer;
import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.impl.SimpleRegistry;

/**
 * @author s-arunkumar
 */

public abstract class AbstractCamelService implements ICamelService {

    protected CamelContext makeCamelContext() throws Exception {
        SimpleRegistry registry = new SimpleRegistry();
        registry.put("cdataTransformer", new CDataTransformer());
        registry.put("print", new PrintTransformer());
        CamelContext context = new DefaultCamelContext(registry);
        return context;
    }

}

