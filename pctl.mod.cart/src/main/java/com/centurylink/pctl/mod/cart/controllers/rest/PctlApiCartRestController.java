package com.centurylink.pctl.mod.cart.controllers.rest;



import com.centurylink.pctl.mod.cart.domain.cart.ShoppingCart;
import com.centurylink.pctl.mod.cart.domain.cart.ShoppingCartService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by nagavenkatakirang on 17-10-2016.
 */


@RequestMapping("/cart")
@Controller
public class PctlApiCartRestController {

    private static final Logger log = LoggerFactory.getLogger(PctlApiCartRestController.class);

    @Autowired
   public ShoppingCartService shoppingCartService;


    @RequestMapping(method = RequestMethod.POST, value = "/", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<ShoppingCart> addcart(@RequestBody ShoppingCart shoppingCart) {


        ShoppingCart response = shoppingCartService.initCart();

        return new ResponseEntity<ShoppingCart>(response, HttpStatus.ACCEPTED);
    }


    @RequestMapping(method = RequestMethod.POST, value = "/location", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<ShoppingCart> addLineItem(@RequestBody ShoppingCart shoppingCart) {

         String id ="";
        ShoppingCart response = shoppingCartService.getShoppingCart();
        shoppingCartService.addLocation(response.get_id(),shoppingCart.getLocations());
        return new ResponseEntity<ShoppingCart>(response, HttpStatus.ACCEPTED);
    }

}


/*



//@Transactional
//@RestController
@RequestMapping("/cart")
@Controller

public class PctlApiCartRestController {
    private static final Logger log = LoggerFactory.getLogger(PctlApiCartRestController.class);
   */
/* @Autowired
    private PctlApiCartService pctlApiCartService;
    @Autowired
    private JwtTokenUtil jwtTokenUtil;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Product> getProducts() {
        log.info("Getting LineItems in Cart");
        return Lists.newArrayList(pctlApiCartService.getAllProductsFromCart());
    }*//*

   public Cart myCart;
@Autowired
   public PctlApiCartService pctlApiCartService ;

    @RequestMapping(method = RequestMethod.POST, value = "/add", produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<CartResponse> add(@RequestBody LineItem lineItem) {
        log.debug(" controller entry");
        List<Product> response= null;
        log.debug(" controller end");
      //  return new ResponseEntity<CartResponse>(response,response.getResponse().getHttpStatus());
        return null;
    }
}
*/
