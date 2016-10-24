package com.centurylink.pctl.mod.cart.domain.cart;
import com.centurylink.pctl.mod.cart.domain.user.User;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.*;
import java.util.List;

/**
 * Created by nagavenkatakirang on 24-10-2016.
 */
@Document(collection = "cart_event")
public class CartEvent {


    @Id
    private String id;
    //@Enumerated(EnumType.STRING)

    private CartEventType cartEventType;
    private String productId;
    private Integer quantity;
    private List<LineItem> lineItems;
    private User user;
    private Contact contact;
    private String cartState;
    private List<Location> locations;



    public List<Location> getLocations() {
        return locations;
    }

    public void setLocations(List<Location> locations) {
        this.locations = locations;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public String getCartState() {
        return cartState;
    }

    public void setCartState(String cartState) {
        this.cartState = cartState;
    }



    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }





    public CartEvent() {
    }

    public CartEvent(CartEventType cartEventType, User user) {
        this.cartEventType = cartEventType;
        this.user = user;
    }

    public CartEvent(CartEventType cartEventType, User user, String productId, Integer quantity) {
        this.cartEventType = cartEventType;
        this.user= user;
        this.productId = productId;
        this.quantity = quantity;
    }


    @Id
 //   @GeneratedValue(strategy = GenerationType.AUTO)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CartEventType getCartEventType() {
        return cartEventType;
    }

    public void setCartEventType(CartEventType cartEventType) {
        this.cartEventType = cartEventType;
    }


    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }


}
