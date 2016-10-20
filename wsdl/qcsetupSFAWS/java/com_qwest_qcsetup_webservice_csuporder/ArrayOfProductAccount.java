
package java.com_qwest_qcsetup_webservice_csuporder;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfProductAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfProductAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProductAccount" type="{java:com.qwest.qcsetup.webservice.csupOrder.bo}ProductAccount" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfProductAccount", propOrder = {
    "productAccount"
})
public class ArrayOfProductAccount {

    @XmlElement(name = "ProductAccount", nillable = true)
    protected List<ProductAccount> productAccount;

    /**
     * Gets the value of the productAccount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the productAccount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProductAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProductAccount }
     * 
     * 
     */
    public List<ProductAccount> getProductAccount() {
        if (productAccount == null) {
            productAccount = new ArrayList<ProductAccount>();
        }
        return this.productAccount;
    }

}
