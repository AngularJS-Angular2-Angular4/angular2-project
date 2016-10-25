package com.centurylink.pctl.mod.product.domain.product;


import com.centurylink.pctl.mod.core.model.product.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by begin on 10/04/2016.
 */
@RepositoryRestResource(collectionResourceRel = "products", path = "products")
public interface ProductRepository extends MongoRepository<Product, String>, ProductRepositoryCustom{


    @Query(value = "{ 'productId' : ?0 }")
    public List<Product> findProductByProductId(String productId);

    @Query(value = "{ 'urnid' : ?0 }")
    List<Product> findProductsByUrnId(String urnId);


}

