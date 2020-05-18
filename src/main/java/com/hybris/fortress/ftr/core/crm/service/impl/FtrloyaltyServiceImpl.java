package com.hybris.fortress.ftr.core.crm.service.impl;

import com.hybris.fortress.ftr.core.crm.service.FtrLoyaltyService;
import com.hybris.fortress.gensrc.memberqueryrequest.SiebelMessageRequestType;
import com.hybris.fortress.gensrc.memberqueryresponse.SiebelMessageResponseType;
import com.hybris.fortress.igc.model.CustomerWrapper;
import com.hybris.fortress.model.CustomerModel;
import com.hybris.fortress.utils.MemberQueryRequestHelper;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.WebServiceTemplate;

import javax.annotation.Resource;
import javax.xml.bind.JAXBException;

@Service("ftrloyaltyService")
public class FtrloyaltyServiceImpl implements FtrLoyaltyService {

    @Resource
    MemberQueryRequestHelper memberQueryRequestHelper;

    @Resource
    WebServiceTemplate webServiceMemberInboundTemplate;

    @Override
    public CustomerWrapper memberQuery(CustomerModel customerModel, boolean updateCurrent) throws JAXBException {
        SiebelMessageRequestType request = memberQueryRequestHelper.createRequest(customerModel);
        String requestXml = memberQueryRequestHelper.serialize(request);

        System.out.println("Member Query Request XML : \n" + requestXml);




        return null;
    }


    private SiebelMessageResponseType invoke(){
        return null;
    }


}
