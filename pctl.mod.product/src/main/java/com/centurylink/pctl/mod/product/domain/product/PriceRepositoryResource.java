package com.centurylink.pctl.mod.product.domain.product;

import com.centurylink.pctl.mod.core.model.product.Price;
import com.centurylink.pctl.mod.product.controllers.rest.PctlProductRestController;
import org.springframework.data.rest.webmvc.RepositoryLinksResource;
import org.springframework.hateoas.ResourceProcessor;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.stereotype.Component;

/**
 * Created by begin.samuel on 10/14/2016.
 */


@Component
public class PriceRepositoryResource implements ResourceProcessor<RepositoryLinksResource> {

    @Override
    public RepositoryLinksResource process(RepositoryLinksResource resource) {
        resource.add(ControllerLinkBuilder.linkTo(PctlProductRestController.class).withRel("products"));
        addActionLinks(resource,null);

        return resource;
    }



    private void addActionLinks(final RepositoryLinksResource resource, final Price entity) {
    }


}
