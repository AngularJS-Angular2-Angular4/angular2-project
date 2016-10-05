package com.centurylink.pctl.mod.api.domain.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductRepositoryCustom   {
    Product findProductByFields(String productId, String... fields);
    Page<Product> findProductsByProductType(String productType, Pageable pageable, String... fields);
    List<Product> findByVariantId(String id);
}
