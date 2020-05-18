//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2020.05.16 ʱ�� 12:15:46 AM CST 
//


package com.hybris.fortress.gensrc.memberqueryrequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gensrc.request package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gensrc.request
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
     * Create an instance of {@link SiebelMessageRequestType }
     * 
     */
    public SiebelMessageRequestType createSiebelMessageRequestType() {
        return new SiebelMessageRequestType();
    }

    /**
     * Create an instance of {@link BodyType }
     * 
     */
    public BodyType createBodyType() {
        return new BodyType();
    }

    /**
     * Create an instance of {@link ErrorType }
     * 
     */
    public ErrorType createErrorType() {
        return new ErrorType();
    }

    /**
     * Create an instance of {@link BindCardsType }
     * 
     */
    public BindCardsType createBindCardsType() {
        return new BindCardsType();
    }

    /**
     * Create an instance of {@link HeaderRequestType }
     * 
     */
    public HeaderRequestType createHeaderRequestType() {
        return new HeaderRequestType();
    }

    /**
     * Create an instance of {@link Card }
     * 
     */
    public Card createCard() {
        return new Card();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link SiebelMessageRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "SiebelMessage")
    public JAXBElement<SiebelMessageRequestType> createSiebelMessage(SiebelMessageRequestType value) {
        return new JAXBElement<SiebelMessageRequestType>(_SiebelMessage_QNAME, SiebelMessageRequestType.class, null, value);
    }

}
