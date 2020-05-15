package com.hybris.fortress.ftr.core.crm.service.impl;

import com.hybris.fortress.ftr.core.crm.service.FtrLoyaltyService;
import com.hybris.fortress.gensrc.ActionType;
import com.hybris.fortress.gensrc.CustomerType;
import com.hybris.fortress.gensrc.HeaderRequestType;
import com.hybris.fortress.gensrc.ObjectFactory;
import com.hybris.fortress.igc.model.CustomerWrapper;
import com.hybris.fortress.model.CustomerModel;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

@Service("ftrloyaltyService")
public class FtrloyaltyServiceImpl implements FtrLoyaltyService {

    @Resource
    Map<String, String> configParameter;

    @Override
    public CustomerWrapper memberQuery(CustomerModel customerModel, boolean updateCurrent) {

        HeaderRequestType header = constructHeader();
        CustomerType customer = constructCustomerType();

        return null;
    }

    private HeaderRequestType constructHeader() {
        HeaderRequestType header = new HeaderRequestType();
        header.setBUID( configParameter.get("bucode") );
        header.setFrom( configParameter.get("from") );
        header.setTo( configParameter.get("to") );
        header.setEnv( configParameter.get("env") );
        header.setAction(ActionType.QUERY);
        header.setSent(DateFormatUtils.format(new Date(), "MM/dd/yyyy"));
        return header;
    }


    private CustomerType constructCustomerType(){
        CustomerType customerType = new CustomerType();
        return customerType;
    }

}
