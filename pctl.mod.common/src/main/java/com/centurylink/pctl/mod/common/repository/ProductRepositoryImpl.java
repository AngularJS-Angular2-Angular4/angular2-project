package com.centurylink.pctl.repository;

import com.centurylink.pctl.model.entity.Product;
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


public class ProductRepositoryImpl implements ProductRepositoryCustom  {
    private final Logger log = LoggerFactory.getLogger(ProductRepositoryImpl.class);
    public static final String COLLECTION = "products";
    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Product findProductByFields(String productId, String... fields) {
        Query query = Query.query(Criteria.where("productId").is(productId));
        for(String field : fields) {
            query.fields().include(field);
        }

        Product resultProduct = mongoTemplate.findOne(query, Product.class, COLLECTION);
        return resultProduct;
    }

    public Page<Product> findProductsByProductType(String productType, Pageable pageable, String... fields) {
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

    }

    @Override
    public List<Product> findByVariantId(String id) {
        Query query = Query.query(Criteria.where("variants.variantId").is(id));
        query.fields().include("variants");

        List<Product> resultProduct = mongoTemplate.find(query,Product.class, COLLECTION);
        return resultProduct;
    }

}
