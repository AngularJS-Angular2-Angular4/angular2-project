package com.centurylink.pctl.mod.api.domain.product;

import com.centurylink.pctl.mod.api.controllers.rest.BlogPostRestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.*;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

/**
 * Created by begin.samuel on 10/5/2016.
 */
@Component
public class ProductPagedResource implements ResourceProcessor<PagedResources<Resource<Product>>> {


   @Override
    public PagedResources<Resource<Product>> process(PagedResources<Resource<Product>> productResources) {

       final Link priceLink = ControllerLinkBuilder.linkTo(methodOn(BlogPostRestController.class).deletePost(1L)).withRel("product-review");
       productResources.add(priceLink);
       return productResources;
    }


}

