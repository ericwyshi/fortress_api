//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2020.05.16 ʱ�� 12:15:46 AM CST 
//


package com.hybris.fortress.gensrc.memberqueryrequest;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>FtrCustomerType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FtrCustomerType">
 *   &lt;complexContent>
 *     &lt;extension base="{}CustomerType">
 *       &lt;sequence>
 *         &lt;element name="ProgramName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MemberPhase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileNumberLocal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobileNumberCountryCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BindCards" type="{}BindCardsType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FtrCustomerType", propOrder = {
    "programName",
    "memberPhase",
    "mobileNumberLocal",
    "mobileNumberCountryCode",
    "email",
    "bindCards"
})
public class FtrCustomerType
    extends CustomerType
{

    @XmlElement(name = "ProgramName")
    protected String programName;
    @XmlElement(name = "MemberPhase")
    protected String memberPhase;
    @XmlElement(name = "MobileNumberLocal")
    protected String mobileNumberLocal;
    @XmlElement(name = "MobileNumberCountryCode")
    protected String mobileNumberCountryCode;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "BindCards")
    protected BindCardsType bindCards;

    /**
     * ��ȡprogramName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProgramName() {
        return programName;
    }

    /**
     * ����programName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProgramName(String value) {
        this.programName = value;
    }

    /**
     * ��ȡmemberPhase���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberPhase() {
        return memberPhase;
    }

    /**
     * ����memberPhase���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberPhase(String value) {
        this.memberPhase = value;
    }

    /**
     * ��ȡmobileNumberLocal���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumberLocal() {
        return mobileNumberLocal;
    }

    /**
     * ����mobileNumberLocal���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumberLocal(String value) {
        this.mobileNumberLocal = value;
    }

    /**
     * ��ȡmobileNumberCountryCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobileNumberCountryCode() {
        return mobileNumberCountryCode;
    }

    /**
     * ����mobileNumberCountryCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobileNumberCountryCode(String value) {
        this.mobileNumberCountryCode = value;
    }

    /**
     * ��ȡemail���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmail() {
        return email;
    }

    /**
     * ����email���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmail(String value) {
        this.email = value;
    }

    /**
     * ��ȡbindCards���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BindCardsType }
     *     
     */
    public BindCardsType getBindCards() {
        return bindCards;
    }

    /**
     * ����bindCards���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BindCardsType }
     *     
     */
    public void setBindCards(BindCardsType value) {
        this.bindCards = value;
    }

}
