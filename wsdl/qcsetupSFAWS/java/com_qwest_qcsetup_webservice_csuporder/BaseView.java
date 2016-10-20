
package java.com_qwest_qcsetup_webservice_csuporder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BaseView complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseView">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseView")
@XmlSeeAlso({
    CreateOrderRequest.class,
    ResponseMessage.class,
    ContractInformation.class,
    Contact.class,
    BillingAccount.class,
    CreateOrderResponse.class,
    DiscountGroup.class,
    ProductAccount.class,
    SalesInformation.class
})
public class BaseView {


}
