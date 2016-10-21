
package com.iclnbi.iclnbi_v2_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Flow complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Flow">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}LogicalResource">
 *       &lt;sequence>
 *         &lt;element name="FlowDomain" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfFlowDomain" minOccurs="0"/>
 *         &lt;element name="LinkFlow" type="{http://www.ICLNBI.com/ICLNBI_V2.00.xsd}ArrayOfFlowDomainFragment" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Flow", propOrder = {
    "flowDomain",
    "linkFlow"
})
public class Flow
    extends LogicalResource
{

    @XmlElementRef(name = "FlowDomain", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFlowDomain> flowDomain;
    @XmlElementRef(name = "LinkFlow", namespace = "http://www.ICLNBI.com/ICLNBI_V2.00.xsd", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFlowDomainFragment> linkFlow;

    /**
     * Gets the value of the flowDomain property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfFlowDomain }{@code >}
     *
     */
    public JAXBElement<ArrayOfFlowDomain> getFlowDomain() {
        return flowDomain;
    }

    /**
     * Sets the value of the flowDomain property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfFlowDomain }{@code >}
     *
     */
    public void setFlowDomain(JAXBElement<ArrayOfFlowDomain> value) {
        this.flowDomain = value;
    }

    /**
     * Gets the value of the linkFlow property.
     *
     * @return
     *     possible object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfFlowDomainFragment }{@code >}
     *
     */
    public JAXBElement<ArrayOfFlowDomainFragment> getLinkFlow() {
        return linkFlow;
    }

    /**
     * Sets the value of the linkFlow property.
     *
     * @param value
     *     allowed object is
     *     {@link javax.xml.bind.JAXBElement }{@code <}{@link ArrayOfFlowDomainFragment }{@code >}
     *
     */
    public void setLinkFlow(JAXBElement<ArrayOfFlowDomainFragment> value) {
        this.linkFlow = value;
    }

}
