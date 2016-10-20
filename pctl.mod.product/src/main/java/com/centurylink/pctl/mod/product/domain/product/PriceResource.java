package com.centurylink.pctl.mod.product.domain.product;


import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by begin.samuel on 10/14/2016.
 */


@Component
public class PriceResource implements ResourceProcessor<Resource<Price>> {

    @Override
    public Resource<Price> process(Resource<Price> resource) {
       // resource.add(new Link("/products/price/" + resource.getContent().getName(), "comments"));
        return resource;
    }

}
