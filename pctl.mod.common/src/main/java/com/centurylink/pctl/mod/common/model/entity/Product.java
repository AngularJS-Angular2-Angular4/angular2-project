package com.centurylink.pctl.mod.common.model.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * Created by begin.samuel on 10/4/2016.
 */

@Document(collection = "products")
public class Product implements Serializable {


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Id
    private String _id;
    private String  name;
    private String  productId;

    public Product(){

    }

}
