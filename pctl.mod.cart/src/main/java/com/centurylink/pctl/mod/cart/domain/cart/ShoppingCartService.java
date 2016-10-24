package com.centurylink.pctl.mod.cart.domain.cart;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nagavenkatakirang on 21-10-2016.
 */
@Service
public class ShoppingCartService {

    @Autowired
    ShoppingCartRepository shoppingCartRepository;


    public ShoppingCart getShoppingCart(){

        return shoppingCartRepository.findShoppingCartByCartState("active");

    }


    public ShoppingCart initCart(){

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setCartState("active");
        return shoppingCartRepository.save(shoppingCart);

    }

    public void addLocation(String cartId, List<Location> location){

        ShoppingCart shoppingCart = shoppingCartRepository.findOne(cartId);
        shoppingCart.setLocations(location);
        shoppingCartRepository.save(shoppingCart);
    }

    public void addLineItem(String cartId, LineItem lineItem){

        ShoppingCart shoppingCart = shoppingCartRepository.findOne(cartId);
        List<LineItem> lineItems = new ArrayList<LineItem>();
        lineItems.add(lineItem);
        shoppingCart.setLineItems(lineItems);
        shoppingCartRepository.save(shoppingCart);
    }


}
