package com.centurylink.pctl.mod.core.camel.config;

import org.apache.commons.digester3.annotations.rules.BeanPropertySetter;
import org.apache.commons.digester3.annotations.rules.ObjectCreate;
import org.apache.commons.digester3.annotations.rules.SetProperty;

/**
 * @author s-arunkumar
 */
@ObjectCreate(pattern = "config/soapEndPoints/soapEndPoint")
public class SoapEndPoint {

    @SetProperty(attributeName = "id", pattern = "config/soapEndPoints/soapEndPoint")
    private String id;

    @BeanPropertySetter(pattern = "config/soapEndPoints/soapEndPoint/serviceName")
    private String serviceName;

    @BeanPropertySetter(pattern = "config/soapEndPoints/soapEndPoint/velocityTemplate")
    private String velocityTemplate;


    @BeanPropertySetter(pattern = "config/soapEndPoints/soapEndPoint/serviceEndPoint")
    private String serviceEndPoint;

    @BeanPropertySetter(pattern = "config/soapEndPoints/soapEndPoint/soapAction")
    private String soapAction;

    @BeanPropertySetter(pattern = "config/soapEndPoints/soapEndPoint/baseXPath")
    private String baseXPath;

    @BeanPropertySetter(pattern = "config/soapEndPoints/soapEndPoint/namespace")
    private String namespace;


    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the serviceName
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * @param serviceName the serviceName to set
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * @return the velocityTemplate
     */
    public String getVelocityTemplate() {
        return velocityTemplate;
    }

    /**
     * @param velocityTemplate the velocityTemplate to set
     */
    public void setVelocityTemplate(String velocityTemplate) {
        this.velocityTemplate = velocityTemplate;
    }


    /**
     * @return the serviceEndPoint
     */
    public String getServiceEndPoint() {
        return serviceEndPoint;
    }

    /**
     * @param serviceEndPoint the serviceEndPoint to set
     */
    public void setServiceEndPoint(String serviceEndPoint) {
        this.serviceEndPoint = serviceEndPoint;
    }

    /**
     * @return the soapAction
     */
    public String getSoapAction() {
        return soapAction;
    }

    /**
     * @param soapAction the soapAction to set
     */
    public void setSoapAction(String soapAction) {
        this.soapAction = soapAction;
    }

    /**
     * @return the baseXPath
     */
    public String getBaseXPath() {
        return baseXPath;
    }

    /**
     * @param baseXPath the baseXPath to set
     */
    public void setBaseXPath(String baseXPath) {
        this.baseXPath = baseXPath;
    }

    /**
     * @return the namespace
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * @param namespace the namespace to set
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "SoapEndPoint [id=" + id + ", serviceName=" + serviceName
            + ", velocityTemplate=" + velocityTemplate
            + ", serviceEndPoint=" + serviceEndPoint + ", soapAction="
            + soapAction + ", baseXPath=" + baseXPath + ", namespace="
            + namespace + "]";
    }


}
