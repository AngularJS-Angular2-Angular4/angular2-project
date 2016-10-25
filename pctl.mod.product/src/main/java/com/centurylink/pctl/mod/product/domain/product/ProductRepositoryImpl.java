package com.centurylink.pctl.mod.product.domain.product;

import com.centurylink.pctl.mod.core.model.product.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;


public class ProductRepositoryImpl implements ProductRepositoryCustom {
    private final Logger log = LoggerFactory.getLogger(ProductRepositoryImpl.class);
    public static final String COLLECTION = "products";
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Page<Product> findProductByFields(String productId, Pageable pageable, String... fields) {
        Query query = new Query().with(pageable);
        query.addCriteria(Criteria.where("productId").is(productId));

        if(null != fields) {
            for (String field : fields) {
                query.fields().include(field);
            }
        }


        if(null == pageable.getSort()) {
            query.with(new Sort(Sort.Direction.DESC, "updatedAt"));
        }

        List<Product> products = mongoTemplate.find(query, Product.class);
        long count = mongoTemplate.count(query, Product.class);
        Page<Product> page = new PageImpl<>(products, pageable, count);

        return page;

    }

  /*  public Page<Product> findProductsByProductType(String productType, Pageable pageable, String... fields) {
        Query query = new Query().with(pageable);
        query.addCriteria(Criteria.where("productType").is(productType));

        if(null != fields) {
            for (String field : fields) {
                query.fields().include(field);
            }
        }


        if(null == pageable.getSort()) {
            query.with(new Sort(Sort.Direction.DESC, "updatedAt"));
        }

        List<Product> products = mongoTemplate.find(query, Product.class);
        long count = mongoTemplate.count(query, Product.class);
        Page<Product> page = new PageImpl<>(products, pageable, count);

        return page;

    }*/


    /*public List<Product> findByProductsByVariantsVariantId(String id) {
        Query query = Query.query(Criteria.where("productVariants[].variantId").is(id));
        query.fields().include("productVariants");

        List<Product> resultProduct = mongoTemplate.find(query,Product.class, COLLECTION);
        return resultProduct;
    }*/

}
