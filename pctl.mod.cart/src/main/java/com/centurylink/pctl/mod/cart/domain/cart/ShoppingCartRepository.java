package com.centurylink.pctl.mod.cart.domain.cart;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by nagavenkatakirang on 21-10-2016.
 */

public interface ShoppingCartRepository extends MongoRepository<ShoppingCart, String> {


    public ShoppingCart findShoppingCartByCartState(String cartState);


}
