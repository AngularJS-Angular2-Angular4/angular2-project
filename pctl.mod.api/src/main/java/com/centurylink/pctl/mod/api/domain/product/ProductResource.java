package com.centurylink.pctl.mod.api.domain.product;


import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by begin.samuel on 10/5/2016.
 */
@Component
public class ProductResource implements  ResourceProcessor<Resource<Product>> {

    @Override
    public Resource<Product> process(Resource<Product> resource) {
                resource.add(new Link("/products/" + resource.getContent().getName(), "comments"));
                return resource;
    }

}
