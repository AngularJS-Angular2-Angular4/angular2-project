package com.centurylink.pctl.mod.product.domain.product;

import com.centurylink.pctl.mod.core.model.product.Price;
import com.centurylink.pctl.mod.core.model.product.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by begin.samuel on 10/7/2016.
 */
@Service
public class PctlApiProductService {

    private final Logger log = LoggerFactory.getLogger(PctlApiProductService.class);

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PriceRepository priceRepository;


    public List<Product> findProductByProductId(String productId){
        return productRepository.findProductByProductId(productId);
    }

    public List<Product> findProductsByUrnId(String urnId){
        return productRepository.findProductsByUrnId(urnId);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }

    public List<Price> findPriceByProductId(String productId){
        return priceRepository.findPriceByProductId(productId);
    }

    public List<Price> findAllPrice(){
        return priceRepository.findAll();
    }

    public List<Price> findAllPriceByVariantId(String variantId){
        return priceRepository.findPriceByVarintId(variantId);
    }

}
