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
 * <p>PersonalTitleType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="PersonalTitleType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Dr."/>
 *     &lt;enumeration value="Miss"/>
 *     &lt;enumeration value="Mr."/>
 *     &lt;enumeration value="Mrs."/>
 *     &lt;enumeration value="Ms."/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PersonalTitleType")
@XmlEnum
public enum PersonalTitleType {

    @XmlEnumValue("Dr.")
    DR("Dr."),
    @XmlEnumValue("Miss")
    MISS("Miss"),
    @XmlEnumValue("Mr.")
    MR("Mr."),
    @XmlEnumValue("Mrs.")
    MRS("Mrs."),
    @XmlEnumValue("Ms.")
    MS("Ms.");
    private final String value;

    PersonalTitleType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PersonalTitleType fromValue(String v) {
        for (PersonalTitleType c: PersonalTitleType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
