package com.centurylink.pctl.mod.cart.controllers.rest;
//**** This is for my Cart
//import com.centurylink.pctl.mod.cart.domain.cart.*; //don't delete


//THIS IS FOR SHOPPING CART
import com.centurylink.pctl.mod.cart.domain.ShoppingCart.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * Created by nagavenkatakirang on 17-10-2016.
 */


@RequestMapping("/cart")
@RestController
public class PctlApiCartRestController {
    private static final Logger log = LoggerFactory.getLogger(PctlApiCartRestController.class);
    /*@Autowired
    public ShoppingCartService shoppingCartService;
    @Autowired
    CartEventRepository cartEventRepository;
    @Autowired
    public PctlApiCartRestController(ShoppingCartService shoppingCartService){
        this.shoppingCartService=shoppingCartService;
    }
    @RequestMapping(path = "/events", method = RequestMethod.POST)
    public ResponseEntity addCartEvent(@RequestBody CartEvent cartEvent) throws Exception {

        return Optional.ofNullable(shoppingCartService.addCartEvent(cartEvent))
            .map(event -> new ResponseEntity(HttpStatus.OK))
            .orElseThrow(() -> new Exception("Could not find shopping cart"));
    }
    @RequestMapping(path = "/getCart", method = RequestMethod.GET)
    public ResponseEntity getCart() throws Exception {
        return Optional.ofNullable(shoppingCartService.getShoppingCart())
            .map(cart -> new ResponseEntity<>(cart, HttpStatus.OK))
            .orElseThrow(() -> new Exception("Could not find shopping cart"));
    }

    @RequestMapping(path = "/getCTLCart", method = RequestMethod.GET)
    public ResponseEntity getCTLCart() throws Exception {
        return Optional.ofNullable(shoppingCartService.getCTLCart())
            .map(cart -> new ResponseEntity<>(cart, HttpStatus.OK))
            .orElseThrow(() -> new Exception("Could not find shopping cart"));
    }
    @RequestMapping(path = "/getAggregateCart", method = RequestMethod.GET)
    public String getAggregateCart() throws Exception {
        return (shoppingCartService.getShoppingCart().getProductMap().toString());
          *//*  .map(cart -> new ResponseEntity<>(cart, HttpStatus.OK))
            .orElseThrow(() -> new Exception("Could not find shopping cart"));*//*
    }*/

    //THIS CODE IS FOR SHOPPING CART
    @Autowired
    public com.centurylink.pctl.mod.cart.domain.ShoppingCart.ShoppingCartServiceV1 shoppingCartService;
   /* @Autowired
    public com.centurylink.pctl.mod.cart.domain.ShoppingCart.CartEventRepository cartEventRepository;*/
    @Autowired
    public PctlApiCartRestController(ShoppingCartServiceV1 shoppingCartService){
        this.shoppingCartService=shoppingCartService;
    }


    @RequestMapping(path = "/events", method = RequestMethod.POST)
    public ResponseEntity addCartEvent(@RequestBody CartEvent cartEvent) throws Exception {
        return Optional.ofNullable(shoppingCartService.addCartEvent(cartEvent))
            .map(event -> new ResponseEntity(HttpStatus.NO_CONTENT))
            .orElseThrow(() -> new Exception("Could not find shopping cart"));
    }

    @RequestMapping(path = "/cart", method = RequestMethod.GET)
    public ResponseEntity getCart() throws Exception {
        return Optional.ofNullable(shoppingCartService.getShoppingCart())
            .map(cart -> new ResponseEntity<>(cart, HttpStatus.OK))
            .orElseThrow(() -> new Exception("Could not find shopping cart"));
    }
}


