//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.15 at 04:54:07 PM GMT+08:00 
//


package com.hybris.fortress.gensrc;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}AbstractCustomer"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BodyType", propOrder = {
    "abstractCustomer"
})
public class BodyType {

    @XmlElementRef(name = "AbstractCustomer", type = JAXBElement.class)
    protected JAXBElement<?> abstractCustomer;

    /**
     * Gets the value of the abstractCustomer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FtrCustomerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public JAXBElement<?> getAbstractCustomer() {
        return abstractCustomer;
    }

    /**
     * Sets the value of the abstractCustomer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FtrCustomerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link CustomerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link Object }{@code >}
     *     
     */
    public void setAbstractCustomer(JAXBElement<?> value) {
        this.abstractCustomer = value;
    }

}