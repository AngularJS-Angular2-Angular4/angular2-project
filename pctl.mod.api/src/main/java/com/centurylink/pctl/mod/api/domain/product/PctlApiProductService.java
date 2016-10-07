package com.centurylink.pctl.mod.api.domain.product;

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


    public List<Product> findProductByProductId(String productId){
        return productRepository.findProductByProductId(productId);
    }

    public List<Product> findProductsByUrnId(String urnId){
        return productRepository.findProductsByUrnId(urnId);
    }

    public List<Product> findAll(){
        return productRepository.findAll();
    }


}
