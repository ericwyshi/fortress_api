package com.hybris.fortress.utils;

import com.hybris.fortress.gensrc.memberqueryrequest.*;
import com.hybris.fortress.model.CustomerModel;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;
import java.util.Date;
import java.util.Map;

@Component("memberQueryRequestHelper")
public class MemberQueryRequestHelper {

    @Resource
    Map<String, String> configParameter;

    ObjectFactory objectFactory = new ObjectFactory();

    private static final String XML_DIRECTIVE = "<?xml version=\"1.0\"?>";

    public SiebelMessageRequestType createRequest(CustomerModel customerModel){
        SiebelMessageRequestType request = objectFactory.createSiebelMessageRequestType();
        request.setHeader( constructHeader() );
        request.setBody( constructBodyType(customerModel.getIgcLoyaltyInfo().getMemberNumber()) );
        return request;
    }

    public String serialize(final SiebelMessageRequestType requestMessage) throws JAXBException {
        final JAXBContext jaxbContext = JAXBContext.newInstance(SiebelMessageRequestType.class);
        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE); // 是否省略xm头声明信息
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true); // 格式化输出

        final JAXBElement<SiebelMessageRequestType> messageWrapper = objectFactory.createSiebelMessage(requestMessage);
        final StringWriter stringWriter = new StringWriter();
        stringWriter.write(XML_DIRECTIVE);
        marshaller.marshal(messageWrapper, stringWriter);

        return stringWriter.toString();
    }

    private HeaderRequestType constructHeader() {
        HeaderRequestType header = objectFactory.createHeaderRequestType();
        header.setBUID( configParameter.get("bucode") );
        header.setFrom( configParameter.get("from") );
        header.setTo( configParameter.get("to") );
        header.setEnv( configParameter.get("env") );
        header.setAction(ActionType.QUERY);
        header.setSent(DateFormatUtils.format(new Date(), "MM/dd/yyyy"));
        return header;
    }

    private BodyType constructBodyType(String memberNumber){
        BodyType bodyType = objectFactory.createBodyType();
        JAXBElement<CustomerType> customer = objectFactory.createCustomer(constructCustomerType(memberNumber));
        bodyType.setAbstractCustomer(customer);
        return bodyType;
    }

    private CustomerType constructCustomerType(String memberNumber){
        CustomerType customerType = objectFactory.createCustomerType();
        customerType.setMemberNumber(memberNumber);
        return customerType;
    }

}
