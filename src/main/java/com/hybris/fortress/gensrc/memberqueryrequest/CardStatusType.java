//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2020.05.16 ʱ�� 12:15:46 AM CST 
//


package com.hybris.fortress.gensrc.memberqueryrequest;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CardStatusType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="CardStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Cancelled"/>
 *     &lt;enumeration value="Damaged"/>
 *     &lt;enumeration value="In Progress"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="Issued"/>
 *     &lt;enumeration value="Lost/Stolen"/>
 *     &lt;enumeration value="Printed"/>
 *     &lt;enumeration value="To Be Delivered"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardStatusType")
@XmlEnum
public enum CardStatusType {

    @XmlEnumValue("Cancelled")
    CANCELLED("Cancelled"),
    @XmlEnumValue("Damaged")
    DAMAGED("Damaged"),
    @XmlEnumValue("In Progress")
    IN_PROGRESS("In Progress"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("Issued")
    ISSUED("Issued"),
    @XmlEnumValue("Lost/Stolen")
    LOST_STOLEN("Lost/Stolen"),
    @XmlEnumValue("Printed")
    PRINTED("Printed"),
    @XmlEnumValue("To Be Delivered")
    TO_BE_DELIVERED("To Be Delivered");
    private final String value;

    CardStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardStatusType fromValue(String v) {
        for (CardStatusType c: CardStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
