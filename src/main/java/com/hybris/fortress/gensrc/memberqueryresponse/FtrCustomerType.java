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
 * <p>FtrCustomerType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="FtrCustomerType">
 *   &lt;complexContent>
 *     &lt;extension base="{}CustomerType">
 *       &lt;sequence>
 *         &lt;element name="EmailVerificationFlag" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="EShopperFTRFlag" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="NewsletterSubscriberFTRFlag" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="MemberPhase" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastTierChgAmt" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="Contact" type="{}ContactType" minOccurs="0"/>
 *         &lt;element name="Accounts" type="{}AccountsType" minOccurs="0"/>
 *         &lt;element name="TierStartDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TierEndDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ConAttribs" type="{}ConAttribsType" minOccurs="0"/>
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
    "emailVerificationFlag",
    "eShopperFTRFlag",
    "newsletterSubscriberFTRFlag",
    "memberPhase",
    "lastTierChgAmt",
    "contact",
    "accounts",
    "tierStartDate",
    "tierEndDate",
    "conAttribs"
})
public class FtrCustomerType
    extends CustomerType
{

    @XmlElement(name = "EmailVerificationFlag")
    protected String emailVerificationFlag;
    @XmlElement(name = "EShopperFTRFlag")
    protected String eShopperFTRFlag;
    @XmlElement(name = "NewsletterSubscriberFTRFlag")
    protected String newsletterSubscriberFTRFlag;
    @XmlElement(name = "MemberPhase")
    protected String memberPhase;
    @XmlElement(name = "LastTierChgAmt")
    protected Double lastTierChgAmt;
    @XmlElement(name = "Contact")
    protected ContactType contact;
    @XmlElement(name = "Accounts")
    protected AccountsType accounts;
    @XmlElement(name = "TierStartDate")
    protected String tierStartDate;
    @XmlElement(name = "TierEndDate")
    protected String tierEndDate;
    @XmlElement(name = "ConAttribs")
    protected ConAttribsType conAttribs;

    /**
     * ��ȡemailVerificationFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailVerificationFlag() {
        return emailVerificationFlag;
    }

    /**
     * ����emailVerificationFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailVerificationFlag(String value) {
        this.emailVerificationFlag = value;
    }

    /**
     * ��ȡeShopperFTRFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEShopperFTRFlag() {
        return eShopperFTRFlag;
    }

    /**
     * ����eShopperFTRFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEShopperFTRFlag(String value) {
        this.eShopperFTRFlag = value;
    }

    /**
     * ��ȡnewsletterSubscriberFTRFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNewsletterSubscriberFTRFlag() {
        return newsletterSubscriberFTRFlag;
    }

    /**
     * ����newsletterSubscriberFTRFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNewsletterSubscriberFTRFlag(String value) {
        this.newsletterSubscriberFTRFlag = value;
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
     * ��ȡlastTierChgAmt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLastTierChgAmt() {
        return lastTierChgAmt;
    }

    /**
     * ����lastTierChgAmt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLastTierChgAmt(Double value) {
        this.lastTierChgAmt = value;
    }

    /**
     * ��ȡcontact���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getContact() {
        return contact;
    }

    /**
     * ����contact���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setContact(ContactType value) {
        this.contact = value;
    }

    /**
     * ��ȡaccounts���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AccountsType }
     *     
     */
    public AccountsType getAccounts() {
        return accounts;
    }

    /**
     * ����accounts���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AccountsType }
     *     
     */
    public void setAccounts(AccountsType value) {
        this.accounts = value;
    }

    /**
     * ��ȡtierStartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierStartDate() {
        return tierStartDate;
    }

    /**
     * ����tierStartDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierStartDate(String value) {
        this.tierStartDate = value;
    }

    /**
     * ��ȡtierEndDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTierEndDate() {
        return tierEndDate;
    }

    /**
     * ����tierEndDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTierEndDate(String value) {
        this.tierEndDate = value;
    }

    /**
     * ��ȡconAttribs���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ConAttribsType }
     *     
     */
    public ConAttribsType getConAttribs() {
        return conAttribs;
    }

    /**
     * ����conAttribs���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ConAttribsType }
     *     
     */
    public void setConAttribs(ConAttribsType value) {
        this.conAttribs = value;
    }

}
