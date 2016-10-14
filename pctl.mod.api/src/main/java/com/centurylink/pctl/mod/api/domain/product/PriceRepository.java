package com.centurylink.pctl.mod.api.domain.product;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by begin.samuel on 10/14/2016.
 */

@RepositoryRestResource(collectionResourceRel = "price", path = "products")
public interface PriceRepository extends MongoRepository<Price, String>{


    @Query(value = "{ 'productId' : ?0 }")
    public List<Price> findPriceByProductId(String productId);

    @Query(value = "{ 'variantId' : ?0 }")
    public List<Price> findPriceByVarintId(String variantId);

}
