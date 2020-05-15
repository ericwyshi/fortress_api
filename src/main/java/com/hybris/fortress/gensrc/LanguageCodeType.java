//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.05.15 at 04:54:07 PM GMT+08:00 
//


package com.hybris.fortress.gensrc;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LanguageCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LanguageCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ARA"/>
 *     &lt;enumeration value="CHS"/>
 *     &lt;enumeration value="CHT"/>
 *     &lt;enumeration value="CSY"/>
 *     &lt;enumeration value="DAN"/>
 *     &lt;enumeration value="DEU"/>
 *     &lt;enumeration value="ELL"/>
 *     &lt;enumeration value="ENG"/>
 *     &lt;enumeration value="ENU"/>
 *     &lt;enumeration value="ESN"/>
 *     &lt;enumeration value="ESP"/>
 *     &lt;enumeration value="FIN"/>
 *     &lt;enumeration value="FRA"/>
 *     &lt;enumeration value="FRB"/>
 *     &lt;enumeration value="HEB"/>
 *     &lt;enumeration value="ITA"/>
 *     &lt;enumeration value="JPN"/>
 *     &lt;enumeration value="KOR"/>
 *     &lt;enumeration value="NLD"/>
 *     &lt;enumeration value="PLK"/>
 *     &lt;enumeration value="PSE"/>
 *     &lt;enumeration value="PTB"/>
 *     &lt;enumeration value="PTG"/>
 *     &lt;enumeration value="RUS"/>
 *     &lt;enumeration value="SVE"/>
 *     &lt;enumeration value="THA"/>
 *     &lt;enumeration value="TRK"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "LanguageCodeType")
@XmlEnum
public enum LanguageCodeType {


    /**
     * Arabic (Saudi Arabia)
     * 
     */
    ARA,

    /**
     * Chinese (PRC)
     * 
     */
    CHS,

    /**
     * Chinese (Taiwan)
     * 
     */
    CHT,

    /**
     * Czech
     * 
     */
    CSY,

    /**
     * Danish
     * 
     */
    DAN,

    /**
     * German
     * 
     */
    DEU,

    /**
     * Greek
     * 
     */
    ELL,

    /**
     * English-British
     * 
     */
    ENG,

    /**
     * English-American
     * 
     */
    ENU,

    /**
     * Spanish (Modern)
     * 
     */
    ESN,

    /**
     * Spanish
     * 
     */
    ESP,

    /**
     * Finnish
     * 
     */
    FIN,

    /**
     * French
     * 
     */
    FRA,

    /**
     * French-Belgian
     * 
     */
    FRB,

    /**
     * Hebrew
     * 
     */
    HEB,

    /**
     * Italian
     * 
     */
    ITA,

    /**
     * Japanese
     * 
     */
    JPN,

    /**
     * Korean
     * 
     */
    KOR,

    /**
     * Dutch
     * 
     */
    NLD,

    /**
     * Polish
     * 
     */
    PLK,

    /**
     * Pseudo
     * 
     */
    PSE,

    /**
     * Portuguese-Brazilian
     * 
     */
    PTB,

    /**
     * Portuguese
     * 
     */
    PTG,

    /**
     * Russian
     * 
     */
    RUS,

    /**
     * Swedish
     * 
     */
    SVE,

    /**
     * Thailand
     * 
     */
    THA,

    /**
     * Turkish
     * 
     */
    TRK;

    public String value() {
        return name();
    }

    public static LanguageCodeType fromValue(String v) {
        return valueOf(v);
    }

}