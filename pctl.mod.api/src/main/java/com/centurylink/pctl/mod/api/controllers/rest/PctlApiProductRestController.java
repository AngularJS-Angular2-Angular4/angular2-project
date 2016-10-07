package com.centurylink.pctl.mod.api.controllers.rest;


import com.centurylink.pctl.mod.api.domain.product.PctlApiProductService;
import com.centurylink.pctl.mod.api.domain.product.Product;
import com.centurylink.pctl.mod.api.domain.security.utils.JwtTokenUtil;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Begin Samuel
 */

@Transactional
@RestController
@RequestMapping("/products")
public class PctlApiProductRestController {

    private static final Logger log = LoggerFactory.getLogger(PctlApiProductRestController.class);

    @Autowired
    private PctlApiProductService pctlApiProductService;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;



    @RequestMapping(value = "/", method = RequestMethod.GET)
   // @PreAuthorize("hasRole('ADMIN')")
    public List<Product> getProducts() {
        log.info("Getting Products");
        log.info(" Products count {} ",pctlApiProductService.findProductByProductId("sdwan1000").size());
        return Lists.newArrayList(pctlApiProductService.findAll());
    }




}
