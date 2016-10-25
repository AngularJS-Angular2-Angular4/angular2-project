package com.centurylink.pctl.mod.cart.domain.cart;


import com.centurylink.pctl.mod.cart.domain.user.UserRepository;
import com.centurylink.pctl.mod.core.model.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by nagavenkatakirang on 21-10-2016.
 */


@Service
public class ShoppingCartService {
public ShoppingCartService(){

}
    @Autowired
    CartEventRepository cartEventRepository;

    @Autowired
    UserRepository userRepository;


    //addLineItem

    public User getAuthenticatedUser(){
        return userRepository.findAll().get(0);
    }



    /**
     * Adds a shopping cart event for the authenticated user
     *
     * @param cartEvent is the event detailing the action performed by the user
     * @return a flag indicating whether the result was a success
     */
    public Boolean addCartEvent(CartEvent cartEvent) {
        User user=getAuthenticatedUser();
        if (user != null) {
            cartEvent.setUser(user);
            cartEventRepository.save(cartEvent);
        } else {
            return null;
        }
        return true;
    }

    public Boolean addCartEvent(CartEvent cartEvent, User user) {
        if (user != null) {
            cartEvent.setUser(user);
            cartEventRepository.save(cartEvent);
        } else {
            return null;
        }
        return true;
    }



    /**
     * Get the shopping cart for the currently authenticated user
     *
     * @return an aggregate object derived from events performed by the user
     * @throws Exception
     */
   /* public ShoppingCart getShoppingCart() throws Exception {
        User user = getAuthenticatedUser();
        ShoppingCart shoppingCart = null;
        if (user != null) {
            Catalog catalog = restTemplate.getForObject("http://catalog-service/v1/catalog", Catalog.class);
            shoppingCart = aggregateCartEvents(user, catalog);
        }
        return shoppingCart;
    }
    */

    /**
     * Aggregate the cart events of a user and return a {@link ShoppingCart} object
     *
     * @param user    is the user to retrieve the shopping cart for
     * @param catalog is the catalog used to generate the shopping cart
     * @return a shopping cart representing the aggregate state of the user's cart
     * @throws Exception
     */
    /*
    public ShoppingCart aggregateCartEvents(User user, Catalog catalog) throws Exception {
        Flux<CartEvent> cartEvents =
            Flux.fromStream(cartEventRepository.getCartEventStreamByUser(user.getId()));

        // Aggregate the state of the shopping cart
        ShoppingCart shoppingCart = cartEvents
            .takeWhile(cartEvent -> !ShoppingCart.isTerminal(cartEvent.getCartEventType()))
            .reduceWith(() -> new ShoppingCart(catalog), ShoppingCart::incorporate)
            .get();

        shoppingCart.getLineItems();

        return shoppingCart;
    }

*/

}
