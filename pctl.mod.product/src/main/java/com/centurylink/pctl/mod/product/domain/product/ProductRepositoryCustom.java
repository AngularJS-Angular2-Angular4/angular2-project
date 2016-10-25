package com.centurylink.pctl.mod.product.domain.product;

import com.centurylink.pctl.mod.core.model.product.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductRepositoryCustom   {
    Page<Product> findProductByFields(String productId, Pageable pageable, String... fields);
}
