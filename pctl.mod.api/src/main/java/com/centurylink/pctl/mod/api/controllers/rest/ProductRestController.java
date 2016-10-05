package com.centurylink.pctl.mod.api.controllers.rest;


import com.centurylink.pctl.mod.api.domain.product.Product;
import com.centurylink.pctl.mod.api.domain.product.ProductRepository;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Begin Samuel
 */

@Transactional
@RestController
@RequestMapping("/products")
//@PreAuthorize(value = "hasRole('ROLE_USER')")
public class ProductRestController {

    private static final Logger log = LoggerFactory.getLogger(ProductRestController.class);

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    public void fillData() {
        log.info("PRE-Getting Products");
        Product product = new Product("SDWAN123", "SD WAN BASIC");
        productRepository.save(product);
        log.info(" Products count {} ",productRepository.findAll().size());
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Product> getProducts() {
        log.info("Getting Products");
        log.info(" Products count {} ",productRepository.findProductByProductId("sdwan1000").size());
        return Lists.newArrayList(productRepository.findAll());
    }
}
