package com.centurylink.pctl.mod.cart.domain.ShoppingCart;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.stream.Stream;


/**
 * Created by nagavenkatakirang on 21-10-2016.
 */
@RepositoryRestResource(collectionResourceRel = "cart_events", path = "cart")
public interface CartEventRepository extends MongoRepository<CartEvent, Long> {
    //@Query(value = "{ 'id' : ?0 }")
    public Stream<CartEvent> getCartEventStreamByUserId(String id);
    /*@Query(value = "{ 'login' : ?0 }")
    public List getCartEventStreamByUserList(String login);*/
}
