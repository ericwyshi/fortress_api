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
 * <p>PrefCommMethodType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="PrefCommMethodType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Email"/>
 *     &lt;enumeration value="Mail"/>
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="Home Phone"/>
 *     &lt;enumeration value="Mobile"/>
 *     &lt;enumeration value="Pager"/>
 *     &lt;enumeration value="Work Phone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PrefCommMethodType")
@XmlEnum
public enum PrefCommMethodType {

    @XmlEnumValue("Email")
    EMAIL("Email"),
    @XmlEnumValue("Mail")
    MAIL("Mail"),
    SMS("SMS"),
    @XmlEnumValue("Home Phone")
    HOME_PHONE("Home Phone"),
    @XmlEnumValue("Mobile")
    MOBILE("Mobile"),
    @XmlEnumValue("Pager")
    PAGER("Pager"),
    @XmlEnumValue("Work Phone")
    WORK_PHONE("Work Phone");
    private final String value;

    PrefCommMethodType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PrefCommMethodType fromValue(String v) {
        for (PrefCommMethodType c: PrefCommMethodType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
