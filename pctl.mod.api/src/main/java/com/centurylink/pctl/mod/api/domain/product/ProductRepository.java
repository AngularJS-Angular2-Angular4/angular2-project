package com.centurylink.pctl.mod.api.domain.product;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by begin on 10/04/2016.
 */
@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends MongoRepository<Product, String>, ProductRepositoryCustom{


    @Query(value = "{ 'productId' : ?0 }")
    public List<Product> findProductByProductId(String productId);

    @Query(value = "{ '_urnid' : ?0 }")
    List<Product> findProductsByUrnId(String urnId);


}

