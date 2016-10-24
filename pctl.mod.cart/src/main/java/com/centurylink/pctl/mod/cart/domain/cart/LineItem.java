package com.centurylink.pctl.mod.cart.domain.cart;

/**
 * Created by nagavenkatakirang on 21-10-2016.
 */
public class LineItem
{
    private String quantity;

    private String productId;

    public String getQuantity ()
    {
        return quantity;
    }

    public void setQuantity (String quantity)
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

