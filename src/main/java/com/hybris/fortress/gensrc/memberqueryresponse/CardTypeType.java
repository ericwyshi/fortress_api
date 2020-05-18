//
// ���ļ����� JavaTM Architecture for XML Binding (JAXB) ����ʵ�� v2.2.8-b130911.1802 ���ɵ�
// ����� <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �����±���Դģʽʱ, �Դ��ļ��������޸Ķ�����ʧ��
// ����ʱ��: 2020.05.16 ʱ�� 12:16:14 AM CST 
//


package com.hybris.fortress.gensrc.memberqueryresponse;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CardTypeType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="CardTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Gold"/>
 *     &lt;enumeration value="Platinum"/>
 *     &lt;enumeration value="Regular"/>
 *     &lt;enumeration value="Silver"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardTypeType")
@XmlEnum
public enum CardTypeType {

    @XmlEnumValue("Gold")
    GOLD("Gold"),
    @XmlEnumValue("Platinum")
    PLATINUM("Platinum"),
    @XmlEnumValue("Regular")
    REGULAR("Regular"),
    @XmlEnumValue("Silver")
    SILVER("Silver");
    private final String value;

    CardTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CardTypeType fromValue(String v) {
        for (CardTypeType c: CardTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
