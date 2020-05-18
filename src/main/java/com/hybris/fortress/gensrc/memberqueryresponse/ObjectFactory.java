//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2020.05.16 ʱ�� 12:16:14 AM CST 
//


package com.hybris.fortress.gensrc.memberqueryresponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gensrc.response package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AbstractCustomer_QNAME = new QName("", "AbstractCustomer");
    private final static QName _Customer_QNAME = new QName("", "Customer");
    private final static QName _FtrCustomer_QNAME = new QName("", "FtrCustomer");
    private final static QName _SiebelMessage_QNAME = new QName("", "SiebelMessage");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gensrc.response
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CustomerType }
     * 
     */
    public CustomerType createCustomerType() {
        return new CustomerType();
    }

    /**
     * Create an instance of {@link FtrCustomerType }
     * 
     */
    public FtrCustomerType createFtrCustomerType() {
        return new FtrCustomerType();
    }

    /**
     * Create an instance of {@link SiebelMessageResponseType }
     * 
     */
    public SiebelMessageResponseType createSiebelMessageResponseType() {
        return new SiebelMessageResponseType();
    }

    /**
     * Create an instance of {@link ContactType }
     * 
     */
    public ContactType createContactType() {
        return new ContactType();
    }

    /**
     * Create an instance of {@link AccountsType }
     * 
     */
    public AccountsType createAccountsType() {
        return new AccountsType();
    }

    /**
     * Create an instance of {@link ChildrenType }
     * 
     */
    public ChildrenType createChildrenType() {
        return new ChildrenType();
    }

    /**
     * Create an instance of {@link BodyType }
     * 
     */
    public BodyType createBodyType() {
        return new BodyType();
    }

    /**
     * Create an instance of {@link ChildType }
     * 
     */
    public ChildType createChildType() {
        return new ChildType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link AttributeType }
     * 
     */
    public AttributeType createAttributeType() {
        return new AttributeType();
    }

    /**
     * Create an instance of {@link HeaderResponseType }
     * 
     */
    public HeaderResponseType createHeaderResponseType() {
        return new HeaderResponseType();
    }

    /**
     * Create an instance of {@link AccountType }
     * 
     */
    public AccountType createAccountType() {
        return new AccountType();
    }

    /**
     * Create an instance of {@link SegmentsType }
     * 
     */
    public SegmentsType createSegmentsType() {
        return new SegmentsType();
    }

    /**
     * Create an instance of {@link SegmentType }
     * 
     */
    public SegmentType createSegmentType() {
        return new SegmentType();
    }

    /**
     * Create an instance of {@link ConAttrib }
     * 
     */
    public ConAttrib createConAttrib() {
        return new ConAttrib();
    }

    /**
     * Create an instance of {@link ConAttribsType }
     * 
     */
    public ConAttribsType createConAttribsType() {
        return new ConAttribsType();
    }

    /**
     * Create an instance of {@link AttributesType }
     * 
     */
    public AttributesType createAttributesType() {
        return new AttributesType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "AbstractCustomer")
    public JAXBElement<Object> createAbstractCustomer(Object value) {
        return new JAXBElement<Object>(_AbstractCustomer_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "Customer", substitutionHeadNamespace = "", substitutionHeadName = "AbstractCustomer")
    public JAXBElement<CustomerType> createCustomer(CustomerType value) {
        return new JAXBElement<CustomerType>(_Customer_QNAME, CustomerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FtrCustomerType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "FtrCustomer", substitutionHeadNamespace = "", substitutionHeadName = "Customer")
    public JAXBElement<FtrCustomerType> createFtrCustomer(FtrCustomerType value) {
        return new JAXBElement<FtrCustomerType>(_FtrCustomer_QNAME, FtrCustomerType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SiebelMessageResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SiebelMessage")
    public JAXBElement<SiebelMessageResponseType> createSiebelMessage(SiebelMessageResponseType value) {
        return new JAXBElement<SiebelMessageResponseType>(_SiebelMessage_QNAME, SiebelMessageResponseType.class, null, value);
    }

}