package com.anchor.anchor_service.karldm.Service;

import com.anchor.anchor_service.karldm.Entity.Billing;
import com.anchor.anchor_service.karldm.Entity.Utilities;

import java.util.List;

public interface BillingService {

    public List<Billing> getBilling();
    public void addBillingFromUtil(List<Utilities> utilities);
}
