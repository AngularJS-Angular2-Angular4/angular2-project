package com.centurylink.pctl.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by begin on 10/04/2016.
 */
@Repository
public interface ProductRepository extends MongoRepository<Product, String>,ProductRepositoryCustom{


    @Query(value = "{ 'productId' : ?0 }")
    public List<Product> findProductsByProductId(String productId);

    @Query(value = "{ '_urnid' : ?0 }")
    List<Product> findProductsByUrnId(String supplementTkey);


}

