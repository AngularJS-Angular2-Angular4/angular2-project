package com.centurylink.pctl.mod.product.domain.product;

/**
 * Created by begin.samuel on 10/14/2016.
 */
public class Terms {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    private String frequency;

    public String getShortCode() {
        return shortCode;
    }

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    private String shortCode;
}
