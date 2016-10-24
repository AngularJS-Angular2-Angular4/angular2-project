package com.centurylink.pctl.mod.cart.domain.cart;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

/**
 * Created by nagavenkatakirang on 21-10-2016.
 */
@Document(collection = "cart")
public class ShoppingCart implements Serializable
{
    @Id
    private String _id;

    private List<Location> locations;

    private List<LineItem> lineItems;

    private User user;

    private Contact contact;

    private String cartState;

    public List<Location> getLocations ()
    {
        return locations;
    }

    public void setLocations (List<Location> locations)
    {
        this.locations = locations;
    }

    public List<LineItem> getLineItems ()
    {
        return lineItems;
    }

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
}
