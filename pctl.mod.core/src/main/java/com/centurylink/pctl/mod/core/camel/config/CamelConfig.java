package com.centurylink.pctl.mod.core.camel.config;

import org.apache.commons.digester3.annotations.rules.ObjectCreate;
import org.apache.commons.digester3.annotations.rules.SetNext;

import java.util.ArrayList;
import java.util.List;

@ObjectCreate(pattern = "config")
public class CamelConfig {

    private List<SoapEndPoint> soapEndPoints = new ArrayList<>();

    @SetNext(SoapEndPoint.class)
    public void addSoapEndPoints(SoapEndPoint consumer) {
        soapEndPoints.add(consumer);
    }


    public List<SoapEndPoint> getSoapEndPoints() {
        return soapEndPoints;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        return true;
    }


    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "CamelConfig [soapEndPoints=" + soapEndPoints + "]";
    }

}
