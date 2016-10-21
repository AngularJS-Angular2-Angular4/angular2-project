
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Role complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Role">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}RootEntity">
 *       &lt;sequence>
 *         &lt;element name="roleCombination" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="roleSelectionMethod" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Role", propOrder = {
    "roleCombination",
    "roleSelectionMethod"
})
@XmlSeeAlso({
    EntityRole.class
})
public class Role
    extends RootEntity
{

    @XmlElementRef(name = "roleCombination", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<String> roleCombination;
    protected Integer roleSelectionMethod;

    /**
     * Gets the value of the roleCombination property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public JAXBElement<String> getRoleCombination() {
        return roleCombination;
    }

    /**
     * Sets the value of the roleCombination property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}
     *
     */
    public void setRoleCombination(JAXBElement<String> value) {
        this.roleCombination = value;
    }

    /**
     * Gets the value of the roleSelectionMethod property.
     *
     * @return
     *     possible object is
     *     {@link Integer }
     *
     */
    public Integer getRoleSelectionMethod() {
        return roleSelectionMethod;
    }

    /**
     * Sets the value of the roleSelectionMethod property.
     *
     * @param value
     *     allowed object is
     *     {@link Integer }
     *
     */
    public void setRoleSelectionMethod(Integer value) {
        this.roleSelectionMethod = value;
    }

}
