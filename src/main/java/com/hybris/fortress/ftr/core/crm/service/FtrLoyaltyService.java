package com.hybris.fortress.ftr.core.crm.service;

import com.hybris.fortress.igc.model.CustomerWrapper;
import com.hybris.fortress.model.CustomerModel;

public interface FtrLoyaltyService {
    public CustomerWrapper memberQuery(CustomerModel customerModel, boolean updateCurrent);
}
