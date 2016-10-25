package com.centurylink.pctl.mod.cart.domain.cart;


import com.centurylink.pctl.mod.core.model.product.Product;

/**
 * Created by nagavenkatakirang on 21-10-2016.
 */
public class LineItem
{
    public LineItem(){

    }

    Product product;
    private Integer quantity;

    private String productId;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    public LineItem(String productId, Product product, Integer quantity) {
        this.productId = productId;
        this.product = product;
        this.quantity = quantity;
    }


    public Integer getQuantity ()
    {
        return quantity;
    }

    public void setQuantity (Integer quantity)
    {
        this.quantity = quantity;
    }

    public String getProductId ()
    {
        return productId;
    }

    public void setProductId (String productId)
    {
        this.productId = productId;
    }

    @Override
    public String toString()
    {
        return "LineItems [quantity = "+quantity+", productId = "+productId+"]";
    }
}

