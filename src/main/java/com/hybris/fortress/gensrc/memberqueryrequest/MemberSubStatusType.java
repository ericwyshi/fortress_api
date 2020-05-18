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
 * <p>MemberSubStatusType�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * <p>
 * <pre>
 * &lt;simpleType name="MemberSubStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="In Progress"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="Merged"/>
 *     &lt;enumeration value="Registered"/>
 *     &lt;enumeration value="Registering"/>
 *     &lt;enumeration value="Under-Investigation"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MemberSubStatusType")
@XmlEnum
public enum MemberSubStatusType {

    @XmlEnumValue("In Progress")
    IN_PROGRESS("In Progress"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("Merged")
    MERGED("Merged"),
    @XmlEnumValue("Registered")
    REGISTERED("Registered"),
    @XmlEnumValue("Registering")
    REGISTERING("Registering"),
    @XmlEnumValue("Under-Investigation")
    UNDER_INVESTIGATION("Under-Investigation");
    private final String value;

    MemberSubStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MemberSubStatusType fromValue(String v) {
        for (MemberSubStatusType c: MemberSubStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
