package com.centurylink.pctl.mod.cart.controllers.rest;



import com.centurylink.pctl.mod.cart.domain.cart.CartEvent;
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
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by nagavenkatakirang on 17-10-2016.
 */


@RequestMapping("/cart")
@RestController
public class PctlApiCartRestController {

    private static final Logger log = LoggerFactory.getLogger(PctlApiCartRestController.class);

    @Autowired
    public ShoppingCartService shoppingCartService;



    @Autowired
    public PctlApiCartRestController(ShoppingCartService shoppingCartService){
        this.shoppingCartService=shoppingCartService;

    }




    @RequestMapping(path = "/events", method = RequestMethod.POST)
    public ResponseEntity addCartEvent(@RequestBody CartEvent cartEvent) throws Exception {

        return Optional.ofNullable(shoppingCartService.addCartEvent(cartEvent))
            .map(event -> new ResponseEntity(HttpStatus.NO_CONTENT))
            .orElseThrow(() -> new Exception("Could not find shopping cart"));
    }


   /* @RequestMapping(path = "/cart", method = RequestMethod.GET)
    public ResponseEntity getCart() throws Exception {
        return Optional.ofNullable(shoppingCartService.getShoppingCart())
            .map(cart -> new ResponseEntity<>(cart, HttpStatus.OK))
            .orElseThrow(() -> new Exception("Could not find shopping cart"));
    }*/

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
