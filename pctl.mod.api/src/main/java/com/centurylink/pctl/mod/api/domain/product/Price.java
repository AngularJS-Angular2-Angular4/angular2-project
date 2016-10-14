package com.centurylink.pctl.mod.api.domain.product;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

/**
 * Created by begin.samuel on 10/14/2016.
 */
@Document(collection="product_price")
public class Price extends ProductVariants implements Serializable {


    @Id
    private String _id;

    private String currency;

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }


    public String getCurrency() {
        return currency;
    }


    public void setCurrency(String currency) {
        this.currency = currency;
    }


    public List<PriceInfo> getPriceList() {
        return priceList;
    }

    public void setPriceList(List<PriceInfo> priceList) {
        this.priceList = priceList;
    }

    private List<PriceInfo> priceList;



}

