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
 * <p>SegmentType complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="SegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="SegmentNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="SegmentName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SegmentStartDate" type="{}NillableSiebelDateType" minOccurs="0"/>
 *         &lt;element name="SegmentEndDate" type="{}NillableSiebelDateType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SegmentType", propOrder = {

})
public class SegmentType {

    @XmlElement(name = "SegmentNo", required = true)
    protected String segmentNo;
    @XmlElement(name = "SegmentName")
    protected String segmentName;
    @XmlElement(name = "SegmentStartDate")
    protected String segmentStartDate;
    @XmlElement(name = "SegmentEndDate")
    protected String segmentEndDate;

    /**
     * ��ȡsegmentNo���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentNo() {
        return segmentNo;
    }

    /**
     * ����segmentNo���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentNo(String value) {
        this.segmentNo = value;
    }

    /**
     * ��ȡsegmentName���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentName() {
        return segmentName;
    }

    /**
     * ����segmentName���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentName(String value) {
        this.segmentName = value;
    }

    /**
     * ��ȡsegmentStartDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentStartDate() {
        return segmentStartDate;
    }

    /**
     * ����segmentStartDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentStartDate(String value) {
        this.segmentStartDate = value;
    }

    /**
     * ��ȡsegmentEndDate���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSegmentEndDate() {
        return segmentEndDate;
    }

    /**
     * ����segmentEndDate���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSegmentEndDate(String value) {
        this.segmentEndDate = value;
    }

}
