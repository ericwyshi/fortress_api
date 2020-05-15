package com.hybris.fortress.ftr.core.crm.service.impl;

import com.hybris.fortress.ftr.core.crm.service.FtrLoyaltyService;
import com.hybris.fortress.igc.model.CustomerWrapper;
import com.hybris.fortress.model.CustomerModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service("ftrloyaltyService")
public class FtrloyaltyServiceImpl implements FtrLoyaltyService {

    @Resource
    Map<String, String> configParameter;

    @Override
    public CustomerWrapper memberQuery(CustomerModel customerModel, boolean updateCurrent) {


        return null;
    }

}
