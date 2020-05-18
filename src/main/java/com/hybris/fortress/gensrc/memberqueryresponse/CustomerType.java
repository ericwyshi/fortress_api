//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2020.05.16 ʱ�� 12:16:14 AM CST 
//


package com.hybris.fortress.gensrc.memberqueryresponse;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomerType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="CustomerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MemberNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ExternalCustomerId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="JobTitle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EmployeeFlag" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="EmployeeNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Gender" type="{}NillableGenderType" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{}NillableSiebelDateType" minOccurs="0"/>
 *         &lt;element name="MaritalStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PointValue" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="GoldCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine2" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine3" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine4" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine5" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine6" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressLine7" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ZipcodeExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Town" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="District" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MetroArea" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CrossStreet" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="County" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Province" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="State" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Country" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AddressInvalidFlag" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Phone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MobilePhone" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BlockedFlag" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="InactiveFlag" type="{}NillableBooleanType" minOccurs="0"/>
 *         &lt;element name="AnonymousFlag" type="{}NillableBooleanType" minOccurs="0"/>
 *         &lt;element name="ExternMailFlag" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="ExternEmailFlag" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="ExternSmsFlag" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="InternMailFlag" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="InternEmailFlag" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="InternSmsFlag" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="PrivacyAgreeFlag" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="ReceivePromotionFlag" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="IntialMailFlag" type="{}NillableBooleanType" minOccurs="0"/>
 *         &lt;element name="MailVerificationFlag" type="{}NillableBooleanType" minOccurs="0"/>
 *         &lt;element name="LanguageCode" type="{}NillableLanguageCodeType" minOccurs="0"/>
 *         &lt;element name="VatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IssuedStore" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PointsReconciled" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="PointsWaiting" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *         &lt;element name="StartDate" type="{}NillableSiebelDateTimeType" minOccurs="0"/>
 *         &lt;element name="AccrualStartDate" type="{}NillableSiebelDateType" minOccurs="0"/>
 *         &lt;element name="LastUpdatedDate" type="{}NillableSiebelDateType" minOccurs="0"/>
 *         &lt;element name="EnrollmentChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ActivationChannel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ApprovalDate" type="{}NillableSiebelDateType" minOccurs="0"/>
 *         &lt;element name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SalesValueToGetCheque" type="{http://www.w3.org/2001/XMLSchema}float" minOccurs="0"/>
 *         &lt;element name="PointsToGetCheque" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="LastAccrualTxnDate" type="{}NillableSiebelDateType" minOccurs="0"/>
 *         &lt;element name="Pareto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ParetoTendency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastTxnDate" type="{}NillableSiebelDateType" minOccurs="0"/>
 *         &lt;element name="LastRedemptionDate" type="{}NillableSiebelDateType" minOccurs="0"/>
 *         &lt;element name="ChildNum" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PersonalIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HouseholdIncome" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PassportNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherLanguageLastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="OtherLanguageFirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Education" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Occupation" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Race" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PrefCommMethod" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MemberStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MemberSubStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CardStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ReceivePartnerPromotionFlag" type="{}BooleanType" minOccurs="0"/>
 *         &lt;element name="Segments" type="{}SegmentsType"/>
 *         &lt;element name="Attributes" type="{}AttributesType"/>
 *         &lt;element name="Children" type="{}ChildrenType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomerType", propOrder = {
    "memberNumber",
    "cardNumber",
    "externalCustomerId",
    "personalTitle",
    "jobTitle",
    "employeeFlag",
    "employeeNumber",
    "personalID",
    "gender",
    "lastName",
    "middleName",
    "firstName",
    "birthDate",
    "maritalStatus",
    "pointValue",
    "goldCode",
    "addressNumber",
    "addressLine",
    "addressLine2",
    "addressLine3",
    "addressLine4",
    "addressLine5",
    "addressLine6",
    "addressLine7",
    "zipCode",
    "zipcodeExt",
    "town",
    "district",
    "metroArea",
    "crossStreet",
    "county",
    "province",
    "state",
    "country",
    "addressInvalidFlag",
    "email",
    "phone",
    "mobilePhone",
    "blockedFlag",
    "inactiveFlag",
    "anonymousFlag",
    "externMailFlag",
    "externEmailFlag",
    "externSmsFlag",
    "internMailFlag",
    "internEmailFlag",
    "internSmsFlag",
    "privacyAgreeFlag",
    "receivePromotionFlag",
    "intialMailFlag",
    "mailVerificationFlag",
    "languageCode",
    "vatNumber",
    "issuedStore",
    "pointsReconciled",
    "pointsWaiting",
    "startDate",
    "accrualStartDate",
    "lastUpdatedDate",
    "enrollmentChannel",
    "activationChannel",
    "approvalDate",
    "currencyCode",
    "salesValueToGetCheque",
    "pointsToGetCheque",
    "lastAccrualTxnDate",
    "pareto",
    "paretoTendency",
    "cardType",
    "lastTxnDate",
    "lastRedemptionDate",
    "childNum",
    "personalIncome",
    "householdIncome",
    "passportNumber",
    "otherLanguageLastName",
    "otherLanguageFirstName",
    "education",
    "occupation",
    "race",
    "prefCommMethod",
    "memberStatus",
    "memberSubStatus",
    "cardStatus",
    "receivePartnerPromotionFlag",
    "segments",
    "attributes",
    "children"
})
@XmlSeeAlso({
    FtrCustomerType.class
})
public class CustomerType {

    @XmlElement(name = "MemberNumber")
    protected String memberNumber;
    @XmlElement(name = "CardNumber")
    protected String cardNumber;
    @XmlElement(name = "ExternalCustomerId")
    protected String externalCustomerId;
    @XmlElement(name = "PersonalTitle")
    protected String personalTitle;
    @XmlElement(name = "JobTitle")
    protected String jobTitle;
    @XmlElement(name = "EmployeeFlag")
    protected String employeeFlag;
    @XmlElement(name = "EmployeeNumber")
    protected String employeeNumber;
    @XmlElement(name = "PersonalID")
    protected String personalID;
    @XmlElement(name = "Gender")
    protected String gender;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "MiddleName")
    protected String middleName;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "BirthDate")
    protected String birthDate;
    @XmlElement(name = "MaritalStatus")
    protected String maritalStatus;
    @XmlElement(name = "PointValue")
    protected BigInteger pointValue;
    @XmlElement(name = "GoldCode")
    protected String goldCode;
    @XmlElement(name = "AddressNumber")
    protected String addressNumber;
    @XmlElement(name = "AddressLine")
    protected String addressLine;
    @XmlElement(name = "AddressLine2")
    protected String addressLine2;
    @XmlElement(name = "AddressLine3")
    protected String addressLine3;
    @XmlElement(name = "AddressLine4")
    protected String addressLine4;
    @XmlElement(name = "AddressLine5")
    protected String addressLine5;
    @XmlElement(name = "AddressLine6")
    protected String addressLine6;
    @XmlElement(name = "AddressLine7")
    protected String addressLine7;
    @XmlElement(name = "ZipCode")
    protected String zipCode;
    @XmlElement(name = "ZipcodeExt")
    protected String zipcodeExt;
    @XmlElement(name = "Town")
    protected String town;
    @XmlElement(name = "District")
    protected String district;
    @XmlElement(name = "MetroArea")
    protected String metroArea;
    @XmlElement(name = "CrossStreet")
    protected String crossStreet;
    @XmlElement(name = "County")
    protected String county;
    @XmlElement(name = "Province")
    protected String province;
    @XmlElement(name = "State")
    protected String state;
    @XmlElement(name = "Country")
    protected String country;
    @XmlElement(name = "AddressInvalidFlag")
    protected String addressInvalidFlag;
    @XmlElement(name = "Email")
    protected String email;
    @XmlElement(name = "Phone")
    protected String phone;
    @XmlElement(name = "MobilePhone")
    protected String mobilePhone;
    @XmlElement(name = "BlockedFlag")
    protected String blockedFlag;
    @XmlElement(name = "InactiveFlag")
    protected String inactiveFlag;
    @XmlElement(name = "AnonymousFlag")
    protected String anonymousFlag;
    @XmlElement(name = "ExternMailFlag")
    protected String externMailFlag;
    @XmlElement(name = "ExternEmailFlag")
    protected String externEmailFlag;
    @XmlElement(name = "ExternSmsFlag")
    protected String externSmsFlag;
    @XmlElement(name = "InternMailFlag")
    protected String internMailFlag;
    @XmlElement(name = "InternEmailFlag")
    protected String internEmailFlag;
    @XmlElement(name = "InternSmsFlag")
    protected String internSmsFlag;
    @XmlElement(name = "PrivacyAgreeFlag")
    protected String privacyAgreeFlag;
    @XmlElement(name = "ReceivePromotionFlag")
    protected String receivePromotionFlag;
    @XmlElement(name = "IntialMailFlag")
    protected String intialMailFlag;
    @XmlElement(name = "MailVerificationFlag")
    protected String mailVerificationFlag;
    @XmlElement(name = "LanguageCode")
    protected String languageCode;
    @XmlElement(name = "VatNumber")
    protected String vatNumber;
    @XmlElement(name = "IssuedStore")
    protected String issuedStore;
    @XmlElement(name = "PointsReconciled")
    protected BigInteger pointsReconciled;
    @XmlElement(name = "PointsWaiting")
    protected BigInteger pointsWaiting;
    @XmlElement(name = "StartDate")
    protected String startDate;
    @XmlElement(name = "AccrualStartDate")
    protected String accrualStartDate;
    @XmlElement(name = "LastUpdatedDate")
    protected String lastUpdatedDate;
    @XmlElement(name = "EnrollmentChannel")
    protected String enrollmentChannel;
    @XmlElement(name = "ActivationChannel")
    protected String activationChannel;
    @XmlElement(name = "ApprovalDate")
    protected String approvalDate;
    @XmlElement(name = "CurrencyCode")
    protected String currencyCode;
    @XmlElement(name = "SalesValueToGetCheque")
    protected Float salesValueToGetCheque;
    @XmlElement(name = "PointsToGetCheque")
    protected BigDecimal pointsToGetCheque;
    @XmlElement(name = "LastAccrualTxnDate")
    protected String lastAccrualTxnDate;
    @XmlElement(name = "Pareto")
    protected String pareto;
    @XmlElement(name = "ParetoTendency")
    protected String paretoTendency;
    @XmlElement(name = "CardType")
    protected String cardType;
    @XmlElement(name = "LastTxnDate")
    protected String lastTxnDate;
    @XmlElement(name = "LastRedemptionDate")
    protected String lastRedemptionDate;
    @XmlElement(name = "ChildNum")
    protected String childNum;
    @XmlElement(name = "PersonalIncome")
    protected String personalIncome;
    @XmlElement(name = "HouseholdIncome")
    protected String householdIncome;
    @XmlElement(name = "PassportNumber")
    protected String passportNumber;
    @XmlElement(name = "OtherLanguageLastName")
    protected String otherLanguageLastName;
    @XmlElement(name = "OtherLanguageFirstName")
    protected String otherLanguageFirstName;
    @XmlElement(name = "Education")
    protected String education;
    @XmlElement(name = "Occupation")
    protected String occupation;
    @XmlElement(name = "Race")
    protected String race;
    @XmlElement(name = "PrefCommMethod")
    protected String prefCommMethod;
    @XmlElement(name = "MemberStatus")
    protected String memberStatus;
    @XmlElement(name = "MemberSubStatus")
    protected String memberSubStatus;
    @XmlElement(name = "CardStatus")
    protected String cardStatus;
    @XmlElement(name = "ReceivePartnerPromotionFlag")
    protected String receivePartnerPromotionFlag;
    @XmlElement(name = "Segments", required = true)
    protected SegmentsType segments;
    @XmlElement(name = "Attributes", required = true)
    protected AttributesType attributes;
    @XmlElement(name = "Children", required = true)
    protected ChildrenType children;

    /**
     * ��ȡmemberNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberNumber() {
        return memberNumber;
    }

    /**
     * ����memberNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberNumber(String value) {
        this.memberNumber = value;
    }

    /**
     * ��ȡcardNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * ����cardNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * ��ȡexternalCustomerId���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternalCustomerId() {
        return externalCustomerId;
    }

    /**
     * ����externalCustomerId���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternalCustomerId(String value) {
        this.externalCustomerId = value;
    }

    /**
     * ��ȡpersonalTitle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalTitle() {
        return personalTitle;
    }

    /**
     * ����personalTitle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalTitle(String value) {
        this.personalTitle = value;
    }

    /**
     * ��ȡjobTitle���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * ����jobTitle���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJobTitle(String value) {
        this.jobTitle = value;
    }

    /**
     * ��ȡemployeeFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeFlag() {
        return employeeFlag;
    }

    /**
     * ����employeeFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeFlag(String value) {
        this.employeeFlag = value;
    }

    /**
     * ��ȡemployeeNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmployeeNumber() {
        return employeeNumber;
    }

    /**
     * ����employeeNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmployeeNumber(String value) {
        this.employeeNumber = value;
    }

    /**
     * ��ȡpersonalID���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalID() {
        return personalID;
    }

    /**
     * ����personalID���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalID(String value) {
        this.personalID = value;
    }

    /**
     * ��ȡgender���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * ����gender���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
    }

    /**
     * ��ȡlastName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * ����lastName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * ��ȡmiddleName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMiddleName() {
        return middleName;
    }

    /**
     * ����middleName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMiddleName(String value) {
        this.middleName = value;
    }

    /**
     * ��ȡfirstName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * ����firstName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * ��ȡbirthDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * ����birthDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBirthDate(String value) {
        this.birthDate = value;
    }

    /**
     * ��ȡmaritalStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * ����maritalStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaritalStatus(String value) {
        this.maritalStatus = value;
    }

    /**
     * ��ȡpointValue���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointValue() {
        return pointValue;
    }

    /**
     * ����pointValue���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointValue(BigInteger value) {
        this.pointValue = value;
    }

    /**
     * ��ȡgoldCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoldCode() {
        return goldCode;
    }

    /**
     * ����goldCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoldCode(String value) {
        this.goldCode = value;
    }

    /**
     * ��ȡaddressNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressNumber() {
        return addressNumber;
    }

    /**
     * ����addressNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressNumber(String value) {
        this.addressNumber = value;
    }

    /**
     * ��ȡaddressLine���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine() {
        return addressLine;
    }

    /**
     * ����addressLine���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine(String value) {
        this.addressLine = value;
    }

    /**
     * ��ȡaddressLine2���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * ����addressLine2���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine2(String value) {
        this.addressLine2 = value;
    }

    /**
     * ��ȡaddressLine3���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine3() {
        return addressLine3;
    }

    /**
     * ����addressLine3���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine3(String value) {
        this.addressLine3 = value;
    }

    /**
     * ��ȡaddressLine4���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine4() {
        return addressLine4;
    }

    /**
     * ����addressLine4���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine4(String value) {
        this.addressLine4 = value;
    }

    /**
     * ��ȡaddressLine5���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine5() {
        return addressLine5;
    }

    /**
     * ����addressLine5���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine5(String value) {
        this.addressLine5 = value;
    }

    /**
     * ��ȡaddressLine6���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine6() {
        return addressLine6;
    }

    /**
     * ����addressLine6���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine6(String value) {
        this.addressLine6 = value;
    }

    /**
     * ��ȡaddressLine7���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressLine7() {
        return addressLine7;
    }

    /**
     * ����addressLine7���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressLine7(String value) {
        this.addressLine7 = value;
    }

    /**
     * ��ȡzipCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * ����zipCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipCode(String value) {
        this.zipCode = value;
    }

    /**
     * ��ȡzipcodeExt���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZipcodeExt() {
        return zipcodeExt;
    }

    /**
     * ����zipcodeExt���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZipcodeExt(String value) {
        this.zipcodeExt = value;
    }

    /**
     * ��ȡtown���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTown() {
        return town;
    }

    /**
     * ����town���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTown(String value) {
        this.town = value;
    }

    /**
     * ��ȡdistrict���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistrict() {
        return district;
    }

    /**
     * ����district���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistrict(String value) {
        this.district = value;
    }

    /**
     * ��ȡmetroArea���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMetroArea() {
        return metroArea;
    }

    /**
     * ����metroArea���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMetroArea(String value) {
        this.metroArea = value;
    }

    /**
     * ��ȡcrossStreet���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCrossStreet() {
        return crossStreet;
    }

    /**
     * ����crossStreet���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCrossStreet(String value) {
        this.crossStreet = value;
    }

    /**
     * ��ȡcounty���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCounty() {
        return county;
    }

    /**
     * ����county���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCounty(String value) {
        this.county = value;
    }

    /**
     * ��ȡprovince���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProvince() {
        return province;
    }

    /**
     * ����province���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProvince(String value) {
        this.province = value;
    }

    /**
     * ��ȡstate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getState() {
        return state;
    }

    /**
     * ����state���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setState(String value) {
        this.state = value;
    }

    /**
     * ��ȡcountry���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountry() {
        return country;
    }

    /**
     * ����country���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountry(String value) {
        this.country = value;
    }

    /**
     * ��ȡaddressInvalidFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressInvalidFlag() {
        return addressInvalidFlag;
    }

    /**
     * ����addressInvalidFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressInvalidFlag(String value) {
        this.addressInvalidFlag = value;
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
     * ��ȡphone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone() {
        return phone;
    }

    /**
     * ����phone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone(String value) {
        this.phone = value;
    }

    /**
     * ��ȡmobilePhone���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    /**
     * ����mobilePhone���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMobilePhone(String value) {
        this.mobilePhone = value;
    }

    /**
     * ��ȡblockedFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBlockedFlag() {
        return blockedFlag;
    }

    /**
     * ����blockedFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBlockedFlag(String value) {
        this.blockedFlag = value;
    }

    /**
     * ��ȡinactiveFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInactiveFlag() {
        return inactiveFlag;
    }

    /**
     * ����inactiveFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInactiveFlag(String value) {
        this.inactiveFlag = value;
    }

    /**
     * ��ȡanonymousFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnonymousFlag() {
        return anonymousFlag;
    }

    /**
     * ����anonymousFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnonymousFlag(String value) {
        this.anonymousFlag = value;
    }

    /**
     * ��ȡexternMailFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternMailFlag() {
        return externMailFlag;
    }

    /**
     * ����externMailFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternMailFlag(String value) {
        this.externMailFlag = value;
    }

    /**
     * ��ȡexternEmailFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternEmailFlag() {
        return externEmailFlag;
    }

    /**
     * ����externEmailFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternEmailFlag(String value) {
        this.externEmailFlag = value;
    }

    /**
     * ��ȡexternSmsFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExternSmsFlag() {
        return externSmsFlag;
    }

    /**
     * ����externSmsFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExternSmsFlag(String value) {
        this.externSmsFlag = value;
    }

    /**
     * ��ȡinternMailFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternMailFlag() {
        return internMailFlag;
    }

    /**
     * ����internMailFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternMailFlag(String value) {
        this.internMailFlag = value;
    }

    /**
     * ��ȡinternEmailFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternEmailFlag() {
        return internEmailFlag;
    }

    /**
     * ����internEmailFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternEmailFlag(String value) {
        this.internEmailFlag = value;
    }

    /**
     * ��ȡinternSmsFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInternSmsFlag() {
        return internSmsFlag;
    }

    /**
     * ����internSmsFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInternSmsFlag(String value) {
        this.internSmsFlag = value;
    }

    /**
     * ��ȡprivacyAgreeFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivacyAgreeFlag() {
        return privacyAgreeFlag;
    }

    /**
     * ����privacyAgreeFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivacyAgreeFlag(String value) {
        this.privacyAgreeFlag = value;
    }

    /**
     * ��ȡreceivePromotionFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivePromotionFlag() {
        return receivePromotionFlag;
    }

    /**
     * ����receivePromotionFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivePromotionFlag(String value) {
        this.receivePromotionFlag = value;
    }

    /**
     * ��ȡintialMailFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntialMailFlag() {
        return intialMailFlag;
    }

    /**
     * ����intialMailFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntialMailFlag(String value) {
        this.intialMailFlag = value;
    }

    /**
     * ��ȡmailVerificationFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMailVerificationFlag() {
        return mailVerificationFlag;
    }

    /**
     * ����mailVerificationFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMailVerificationFlag(String value) {
        this.mailVerificationFlag = value;
    }

    /**
     * ��ȡlanguageCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguageCode() {
        return languageCode;
    }

    /**
     * ����languageCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguageCode(String value) {
        this.languageCode = value;
    }

    /**
     * ��ȡvatNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVatNumber() {
        return vatNumber;
    }

    /**
     * ����vatNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVatNumber(String value) {
        this.vatNumber = value;
    }

    /**
     * ��ȡissuedStore���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuedStore() {
        return issuedStore;
    }

    /**
     * ����issuedStore���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuedStore(String value) {
        this.issuedStore = value;
    }

    /**
     * ��ȡpointsReconciled���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointsReconciled() {
        return pointsReconciled;
    }

    /**
     * ����pointsReconciled���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointsReconciled(BigInteger value) {
        this.pointsReconciled = value;
    }

    /**
     * ��ȡpointsWaiting���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPointsWaiting() {
        return pointsWaiting;
    }

    /**
     * ����pointsWaiting���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPointsWaiting(BigInteger value) {
        this.pointsWaiting = value;
    }

    /**
     * ��ȡstartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * ����startDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStartDate(String value) {
        this.startDate = value;
    }

    /**
     * ��ȡaccrualStartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccrualStartDate() {
        return accrualStartDate;
    }

    /**
     * ����accrualStartDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccrualStartDate(String value) {
        this.accrualStartDate = value;
    }

    /**
     * ��ȡlastUpdatedDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    /**
     * ����lastUpdatedDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastUpdatedDate(String value) {
        this.lastUpdatedDate = value;
    }

    /**
     * ��ȡenrollmentChannel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnrollmentChannel() {
        return enrollmentChannel;
    }

    /**
     * ����enrollmentChannel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnrollmentChannel(String value) {
        this.enrollmentChannel = value;
    }

    /**
     * ��ȡactivationChannel���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActivationChannel() {
        return activationChannel;
    }

    /**
     * ����activationChannel���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActivationChannel(String value) {
        this.activationChannel = value;
    }

    /**
     * ��ȡapprovalDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApprovalDate() {
        return approvalDate;
    }

    /**
     * ����approvalDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApprovalDate(String value) {
        this.approvalDate = value;
    }

    /**
     * ��ȡcurrencyCode���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * ����currencyCode���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
    }

    /**
     * ��ȡsalesValueToGetCheque���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getSalesValueToGetCheque() {
        return salesValueToGetCheque;
    }

    /**
     * ����salesValueToGetCheque���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setSalesValueToGetCheque(Float value) {
        this.salesValueToGetCheque = value;
    }

    /**
     * ��ȡpointsToGetCheque���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPointsToGetCheque() {
        return pointsToGetCheque;
    }

    /**
     * ����pointsToGetCheque���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPointsToGetCheque(BigDecimal value) {
        this.pointsToGetCheque = value;
    }

    /**
     * ��ȡlastAccrualTxnDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastAccrualTxnDate() {
        return lastAccrualTxnDate;
    }

    /**
     * ����lastAccrualTxnDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastAccrualTxnDate(String value) {
        this.lastAccrualTxnDate = value;
    }

    /**
     * ��ȡpareto���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPareto() {
        return pareto;
    }

    /**
     * ����pareto���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPareto(String value) {
        this.pareto = value;
    }

    /**
     * ��ȡparetoTendency���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParetoTendency() {
        return paretoTendency;
    }

    /**
     * ����paretoTendency���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParetoTendency(String value) {
        this.paretoTendency = value;
    }

    /**
     * ��ȡcardType���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * ����cardType���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * ��ȡlastTxnDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastTxnDate() {
        return lastTxnDate;
    }

    /**
     * ����lastTxnDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastTxnDate(String value) {
        this.lastTxnDate = value;
    }

    /**
     * ��ȡlastRedemptionDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastRedemptionDate() {
        return lastRedemptionDate;
    }

    /**
     * ����lastRedemptionDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastRedemptionDate(String value) {
        this.lastRedemptionDate = value;
    }

    /**
     * ��ȡchildNum���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChildNum() {
        return childNum;
    }

    /**
     * ����childNum���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChildNum(String value) {
        this.childNum = value;
    }

    /**
     * ��ȡpersonalIncome���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPersonalIncome() {
        return personalIncome;
    }

    /**
     * ����personalIncome���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPersonalIncome(String value) {
        this.personalIncome = value;
    }

    /**
     * ��ȡhouseholdIncome���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHouseholdIncome() {
        return householdIncome;
    }

    /**
     * ����householdIncome���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHouseholdIncome(String value) {
        this.householdIncome = value;
    }

    /**
     * ��ȡpassportNumber���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassportNumber() {
        return passportNumber;
    }

    /**
     * ����passportNumber���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassportNumber(String value) {
        this.passportNumber = value;
    }

    /**
     * ��ȡotherLanguageLastName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherLanguageLastName() {
        return otherLanguageLastName;
    }

    /**
     * ����otherLanguageLastName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherLanguageLastName(String value) {
        this.otherLanguageLastName = value;
    }

    /**
     * ��ȡotherLanguageFirstName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOtherLanguageFirstName() {
        return otherLanguageFirstName;
    }

    /**
     * ����otherLanguageFirstName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOtherLanguageFirstName(String value) {
        this.otherLanguageFirstName = value;
    }

    /**
     * ��ȡeducation���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEducation() {
        return education;
    }

    /**
     * ����education���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEducation(String value) {
        this.education = value;
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

    /**
     * ��ȡrace���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRace() {
        return race;
    }

    /**
     * ����race���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRace(String value) {
        this.race = value;
    }

    /**
     * ��ȡprefCommMethod���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrefCommMethod() {
        return prefCommMethod;
    }

    /**
     * ����prefCommMethod���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrefCommMethod(String value) {
        this.prefCommMethod = value;
    }

    /**
     * ��ȡmemberStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberStatus() {
        return memberStatus;
    }

    /**
     * ����memberStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberStatus(String value) {
        this.memberStatus = value;
    }

    /**
     * ��ȡmemberSubStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMemberSubStatus() {
        return memberSubStatus;
    }

    /**
     * ����memberSubStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMemberSubStatus(String value) {
        this.memberSubStatus = value;
    }

    /**
     * ��ȡcardStatus���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardStatus() {
        return cardStatus;
    }

    /**
     * ����cardStatus���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardStatus(String value) {
        this.cardStatus = value;
    }

    /**
     * ��ȡreceivePartnerPromotionFlag���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivePartnerPromotionFlag() {
        return receivePartnerPromotionFlag;
    }

    /**
     * ����receivePartnerPromotionFlag���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivePartnerPromotionFlag(String value) {
        this.receivePartnerPromotionFlag = value;
    }

    /**
     * ��ȡsegments���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link SegmentsType }
     *     
     */
    public SegmentsType getSegments() {
        return segments;
    }

    /**
     * ����segments���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentsType }
     *     
     */
    public void setSegments(SegmentsType value) {
        this.segments = value;
    }

    /**
     * ��ȡattributes���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link AttributesType }
     *     
     */
    public AttributesType getAttributes() {
        return attributes;
    }

    /**
     * ����attributes���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link AttributesType }
     *     
     */
    public void setAttributes(AttributesType value) {
        this.attributes = value;
    }

    /**
     * ��ȡchildren���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link ChildrenType }
     *     
     */
    public ChildrenType getChildren() {
        return children;
    }

    /**
     * ����children���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link ChildrenType }
     *     
     */
    public void setChildren(ChildrenType value) {
        this.children = value;
    }

}
