package com.centurylink.pctl.mod.product.controllers.rest;


import com.centurylink.pctl.mod.product.domain.product.PctlApiProductService;
import com.centurylink.pctl.mod.product.domain.product.Price;
import com.centurylink.pctl.mod.product.domain.product.Product;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Begin Samuel
 */

@Transactional
@RestController
@RequestMapping("/products")
public class PctlProductRestController {

    private static final Logger log = LoggerFactory.getLogger(PctlProductRestController.class);

    @Autowired
    private PctlApiProductService pctlApiProductService;

  //  @Autowired
  //  private JwtTokenUtil jwtTokenUtil;



    @RequestMapping(value = "/", method = RequestMethod.GET)
   // @PreAuthorize("hasRole('ADMIN')")
    public List<Product> getProducts() {
        log.info("Getting Products");
        log.info(" Products count {} ",pctlApiProductService.findProductByProductId("sdwan1000").size());
        return Lists.newArrayList(pctlApiProductService.findAll());
    }


    @RequestMapping(value = "/price/", method = RequestMethod.GET)
    public List<Price> getAllProductPrice() {
        log.info("Getting Price");
        log.info(" Price count {} ",pctlApiProductService.findAllPrice().size());
        return Lists.newArrayList(pctlApiProductService.findAllPrice());
    }

    @RequestMapping(value = "/price/{variantId}", method = RequestMethod.GET)
    public List<Price> getPriceByVariantId(@PathVariable("variantId") String variantId) {
        log.info("Getting Price");
        log.info(" Price count {} ",pctlApiProductService.findAllPriceByVariantId(variantId));
        return Lists.newArrayList(pctlApiProductService.findAllPriceByVariantId(variantId));
    }


}
