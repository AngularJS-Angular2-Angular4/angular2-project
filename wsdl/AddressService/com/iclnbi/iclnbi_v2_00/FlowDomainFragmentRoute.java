
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FlowDomainFragmentRoute complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="FlowDomainFragmentRoute">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="actualState" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ActualState" minOccurs="0"/>
 *         &lt;element name="containedMfdfrList" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfMatrixFlowDomainFragment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlowDomainFragmentRoute", propOrder = {
    "actualState",
    "containedMfdfrList"
})
public class FlowDomainFragmentRoute {

    @XmlSchemaType(name = "string")
    protected ActualState actualState;
    @XmlElementRef(name = "containedMfdfrList", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfMatrixFlowDomainFragment> containedMfdfrList;

    /**
     * Gets the value of the actualState property.
     *
     * @return
     *     possible object is
     *     {@link ActualState }
     *
     */
    public ActualState getActualState() {
        return actualState;
    }

    /**
     * Sets the value of the actualState property.
     *
     * @param value
     *     allowed object is
     *     {@link ActualState }
     *
     */
    public void setActualState(ActualState value) {
        this.actualState = value;
    }

    /**
     * Gets the value of the containedMfdfrList property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfMatrixFlowDomainFragment }{@code >}
     *
     */
    public JAXBElement<ArrayOfMatrixFlowDomainFragment> getContainedMfdfrList() {
        return containedMfdfrList;
    }

    /**
     * Sets the value of the containedMfdfrList property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfMatrixFlowDomainFragment }{@code >}
     *
     */
    public void setContainedMfdfrList(JAXBElement<ArrayOfMatrixFlowDomainFragment> value) {
        this.containedMfdfrList = value;
    }

}
