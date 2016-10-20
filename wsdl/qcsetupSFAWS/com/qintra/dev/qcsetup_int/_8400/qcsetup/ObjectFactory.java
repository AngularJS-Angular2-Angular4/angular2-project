
package com.qintra.dev.qcsetup_int._8400.qcsetup;

import java.com_qwest_qcsetup_webservice_csuporder.CreateOrderRequest;
import java.com_qwest_qcsetup_webservice_csuporder.CreateOrderResponse;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.qintra.dev.qcsetup_int._8400.qcsetup package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateOrderResponse_QNAME = new QName("http://qcsetup-int.dev.qintra.com:8400/qcsetup", "createOrderResponse");
    private final static QName _CreateOrder_QNAME = new QName("http://qcsetup-int.dev.qintra.com:8400/qcsetup", "createOrder");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.qintra.dev.qcsetup_int._8400.qcsetup
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link CreateOrderResponse }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://qcsetup-int.dev.qintra.com:8400/qcsetup", name = "createOrderResponse")
    public JAXBElement<CreateOrderResponse> createCreateOrderResponse(CreateOrderResponse value) {
        return new JAXBElement<CreateOrderResponse>(_CreateOrderResponse_QNAME, CreateOrderResponse.class, null, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link CreateOrderRequest }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://qcsetup-int.dev.qintra.com:8400/qcsetup", name = "createOrder")
    public JAXBElement<CreateOrderRequest> createCreateOrder(CreateOrderRequest value) {
        return new JAXBElement<CreateOrderRequest>(_CreateOrder_QNAME, CreateOrderRequest.class, null, value);
    }

}
