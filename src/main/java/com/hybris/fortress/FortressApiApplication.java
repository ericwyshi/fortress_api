package com.hybris.fortress;

import com.hybris.fortress.ftr.core.crm.service.FtrLoyaltyService;
import com.hybris.fortress.jaxb.JAXBDemo;
import com.hybris.fortress.model.CustomerModel;
import com.hybris.fortress.model.IgcLoyaltyInfoModel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.io.StringWriter;
import java.util.Map;

@SpringBootApplication
@RestController
public class FortressApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(FortressApiApplication.class, args);
    }

    @Resource
    FtrLoyaltyService ftrLoyaltyService;

    @RequestMapping("/test")
    public String test(){
        final String XML_DIRECTIVE = "<?xml version=\"1.0\"?>";
        final StringWriter stringWriter = new StringWriter();
        stringWriter.write(XML_DIRECTIVE);
        //return stringWriter.toString();
        System.out.println(stringWriter.toString());
        return "sayhi";
    }

    @RequestMapping("/jaxb")
    public void testJaxB() throws JAXBException, FileNotFoundException {
        JAXBDemo.testMarshaller();
        //JAXBDemo.testUnmarshaller();
    }


    @RequestMapping("/memberquery")
    public void testMemberQuery() throws JAXBException, FileNotFoundException {
        CustomerModel customerModel = new CustomerModel();
        IgcLoyaltyInfoModel loyaltyInfoModel = new IgcLoyaltyInfoModel();
        loyaltyInfoModel.setMemberNumber("50000047431");
        customerModel.setIgcLoyaltyInfo(loyaltyInfoModel);
        ftrLoyaltyService.memberQuery(customerModel, false);
    }


}
