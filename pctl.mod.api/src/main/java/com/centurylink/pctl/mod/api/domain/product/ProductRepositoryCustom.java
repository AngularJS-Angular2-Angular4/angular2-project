package com.centurylink.pctl.mod.api.domain.product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductRepositoryCustom   {
    Page<Product> findProductByFields(String productId, Pageable pageable, String... fields);
}
