package com.centurylink.pctl.mod.cart.domain.cart;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.centurylink.pctl.mod.core.model.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.*;
import java.util.stream.Collectors;
//import reactor.core.publisher.Flux;
/**
 * Created by nagavenkatakirang on 21-10-2016.
 */
/**
 * The {@link ShoppingCart} object represents an aggregate of {@link CartEvent} that
 * represent actions taken by a user to add/remove/clear/checkout products from their
 * shopping cart
 */

public class ShoppingCart implements Serializable
{

    private String _id;

    private Map<String, Integer> productMap = new HashMap<>();

    private List<Location> locations;

    private List<LineItem> lineItems;

    private User user;

    private Contact contact;

    private String cartState;
    private Catalog catalog;

    public ShoppingCart(Catalog catalog) {
        this.catalog = catalog;
    }

    public List<Location> getLocations ()
    {
        return locations;
    }

    public void setLocations (List<Location> locations)
    {
        this.locations = locations;
    }

   /* public List<LineItem> getLineItems ()
    {
        return lineItems;
    }
*/
    public void setLineItems (List<LineItem> lineItems)
    {
        this.lineItems = lineItems;
    }

    public User getUser ()
    {
        return user;
    }

    public void setUser (User user)
    {
        this.user = user;
    }

    public Contact getContact ()
    {
        return contact;
    }

    public void setContact (Contact contact)
    {
        this.contact = contact;
    }

    public ShoppingCart(){
        lineItems=new ArrayList<>();
    }
    @Override
    public String toString()
    {
        return "ShoppingCart [locations = "+locations+", lineItems = "+lineItems+", user = "+user+", contact = "+contact+"]";
    }

    public String getCartState() {
        return cartState;
    }

    public void setCartState(String cartState) {
        this.cartState = cartState;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }
    @JsonIgnore
    public Map<String, Integer> getProductMap() {
        return productMap;
    }

    public void setProductMap(Map<String, Integer> productMap) {
        this.productMap = productMap;
    }
    @JsonIgnore
    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }
    /**
     * Get the line items from the aggregate of add cart events
     *
     * @return a new list of {@link LineItem} representing the state of the shopping cart
     * @throws Exception if a product in the cart could not be found in the catalog
     */
    public List<LineItem> getLineItems() throws Exception {
       lineItems=productMap.entrySet().stream().map(item ->
           new LineItem(item.getKey(), catalog.getProducts().stream()
            .filter(prd -> Objects.equals(prd.getProductId(), item.getKey()))
            .findFirst()
            .orElse(null),item.getValue()))
            .collect(Collectors.toList());
        if (lineItems.stream()
            .anyMatch(item -> item.getProduct() == null)) {
            throw new Exception("Product not found in catalog");
        }
        return lineItems;
    }
    /**
     * Incorporates a new {@link CartEvent} and updated the shopping cart
     *
     * @param cartEvent is the {@link CartEvent} that will alter the state of the cart
     * @return the state of the {@link ShoppingCart} after applying the new {@link CartEvent}
     */
   /* public ShoppingCart incorporate(CartEvent cartEvent) {
        // Remember that thing about safety properties in microservices?
        Flux<CartEventType> validCartEventTypes =
            Flux.fromStream(Stream.of(CartEventType.ADD_ITEM,
                CartEventType.REMOVE_ITEM));

        // The CartEvent's type must be either ADD_ITEM or REMOVE_ITEM
        if (validCartEventTypes.exists(cartEventType ->
            cartEvent.getCartEventType().equals(cartEventType)).get()) {
            // Update the aggregate view of each line item's quantity from the event type
            productMap.put(cartEvent.getProductId(),
                productMap.getOrDefault(cartEvent.getProductId(), 0) +
                    (cartEvent.getQuantity() * (cartEvent.getCartEventType()
                        .equals(CartEventType.ADD_ITEM) ? 1 : -1)));
        }

        // Return the updated state of the aggregate to the reactive stream's reduce method
        return this;
    }*/
    /**
     * Determines whether or not the {@link CartEvent} is a terminal event, causing the
     * stream to end while generating an aggregate {@link ShoppingCart}
     *
     * @param eventType is the {@link CartEventType} to evaluate
     * @return a flag indicating whether or not the event is terminal
     */
    public static Boolean isTerminal(CartEventType eventType) {
        return (eventType == CartEventType.CLEAR_CART || eventType == CartEventType.CHECKOUT);
    }

}
