
package com.ctl.as.domain.geo.v2;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.ctl.as.domain.geo.types.request.ClcSearchResourceProxyRequest;


/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="request" type="{http://geo.domain.as.ctl.com/Types/Request}ClcSearchResourceProxyRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request"
})
@XmlRootElement(name = "ClcSearchResourceProxy")
public class ClcSearchResourceProxy {

    @XmlElementRef(name = "request", namespace = "http://geo.domain.as.ctl.com/v2", type = JAXBElement.class, required = false)
    protected JAXBElement<ClcSearchResourceProxyRequest> request;

    /**
     * Gets the value of the request property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ClcSearchResourceProxyRequest }{@code >}
     *
     */
    public JAXBElement<ClcSearchResourceProxyRequest> getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ClcSearchResourceProxyRequest }{@code >}
     *
     */
    public void setRequest(JAXBElement<ClcSearchResourceProxyRequest> value) {
        this.request = value;
    }

}
