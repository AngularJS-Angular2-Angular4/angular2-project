package com.centurylink.pctl.mod.cart.domain.ShoppingCart;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
/**
 * Created by nagavenkatakirang on 21-10-2016.
 */
@Document(collection = "cart_events")
public class CartEvent implements Serializable
{
    @Id
    private int id;
    private CartEventType cartEventType;
    private String userId;
    private String productId;
    private Integer quantity;

    public CartEvent() {

    }

    public CartEvent(int id, CartEventType cartEventType, String userId, String productId, Integer quantity) {
        this.id = id;
        this.cartEventType = cartEventType;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public CartEvent(CartEventType cartEventType, String userId) {
        this.cartEventType = cartEventType;
        this.userId = userId;
    }

    public CartEvent(CartEventType cartEventType, String userId, String productId, Integer quantity) {
        this.cartEventType = cartEventType;
        this.userId = userId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public int getId() {
        return id;// != null ? id.toHexString() : null;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CartEventType getCartEventType() {
        return cartEventType;
    }

    public void setCartEventType(CartEventType cartEventType) {
        this.cartEventType = cartEventType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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

    @Override
    public String toString() {
        return "CartEvent{" +
            "id=" + id +
            ", cartEventType=" + cartEventType +
            ", userId=" + userId +
            ", productId='" + productId + '\'' +
            ", quantity=" + quantity +
            '}';
    }
}
