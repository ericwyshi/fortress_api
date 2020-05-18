//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2020.05.16 ʱ�� 12:16:14 AM CST 
//


package com.hybris.fortress.gensrc.memberqueryresponse;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ContactType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="ContactType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SuppressFTRSMS" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="SuppressFTREmail" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="SuppressFTRDM" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="SuppressPNSSMS" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="SuppressPNSEmail" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="SuppressPNSDM" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="SuppressWTCSMS" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="SuppressWTCEmail" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="SuppressWTCDM" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContactType", propOrder = {
    "suppressFTRSMS",
    "suppressFTREmail",
    "suppressFTRDM",
    "suppressPNSSMS",
    "suppressPNSEmail",
    "suppressPNSDM",
    "suppressWTCSMS",
    "suppressWTCEmail",
    "suppressWTCDM",
    "occupation"
})
public class ContactType {

    @XmlElement(name = "SuppressFTRSMS")
    protected String suppressFTRSMS;
    @XmlElement(name = "SuppressFTREmail")
    protected String suppressFTREmail;
    @XmlElement(name = "SuppressFTRDM")
    protected String suppressFTRDM;
    @XmlElement(name = "SuppressPNSSMS")
    protected String suppressPNSSMS;
    @XmlElement(name = "SuppressPNSEmail")
    protected String suppressPNSEmail;
    @XmlElement(name = "SuppressPNSDM")
    protected String suppressPNSDM;
    @XmlElement(name = "SuppressWTCSMS")
    protected String suppressWTCSMS;
    @XmlElement(name = "SuppressWTCEmail")
    protected String suppressWTCEmail;
    @XmlElement(name = "SuppressWTCDM")
    protected String suppressWTCDM;
    @XmlElement(name = "Occupation")
    protected String occupation;

    /**
     * ��ȡsuppressFTRSMS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressFTRSMS() {
        return suppressFTRSMS;
    }

    /**
     * ����suppressFTRSMS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressFTRSMS(String value) {
        this.suppressFTRSMS = value;
    }

    /**
     * ��ȡsuppressFTREmail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressFTREmail() {
        return suppressFTREmail;
    }

    /**
     * ����suppressFTREmail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressFTREmail(String value) {
        this.suppressFTREmail = value;
    }

    /**
     * ��ȡsuppressFTRDM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressFTRDM() {
        return suppressFTRDM;
    }

    /**
     * ����suppressFTRDM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressFTRDM(String value) {
        this.suppressFTRDM = value;
    }

    /**
     * ��ȡsuppressPNSSMS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressPNSSMS() {
        return suppressPNSSMS;
    }

    /**
     * ����suppressPNSSMS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressPNSSMS(String value) {
        this.suppressPNSSMS = value;
    }

    /**
     * ��ȡsuppressPNSEmail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressPNSEmail() {
        return suppressPNSEmail;
    }

    /**
     * ����suppressPNSEmail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressPNSEmail(String value) {
        this.suppressPNSEmail = value;
    }

    /**
     * ��ȡsuppressPNSDM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressPNSDM() {
        return suppressPNSDM;
    }

    /**
     * ����suppressPNSDM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressPNSDM(String value) {
        this.suppressPNSDM = value;
    }

    /**
     * ��ȡsuppressWTCSMS���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressWTCSMS() {
        return suppressWTCSMS;
    }

    /**
     * ����suppressWTCSMS���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressWTCSMS(String value) {
        this.suppressWTCSMS = value;
    }

    /**
     * ��ȡsuppressWTCEmail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressWTCEmail() {
        return suppressWTCEmail;
    }

    /**
     * ����suppressWTCEmail���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressWTCEmail(String value) {
        this.suppressWTCEmail = value;
    }

    /**
     * ��ȡsuppressWTCDM���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSuppressWTCDM() {
        return suppressWTCDM;
    }

    /**
     * ����suppressWTCDM���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSuppressWTCDM(String value) {
        this.suppressWTCDM = value;
    }

    /**
     * ��ȡoccupation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOccupation() {
        return occupation;
    }

    /**
     * ����occupation���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOccupation(String value) {
        this.occupation = value;
    }

}
