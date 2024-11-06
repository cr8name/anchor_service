package com.anchor.anchor_service.karldm.Service;

import com.anchor.anchor_service.karldm.Entity.Billing;
import com.anchor.anchor_service.karldm.Entity.Utilities;
import com.anchor.anchor_service.karldm.Repository.BillingRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class BillingServiceImpl implements BillingService{

    private final BillingRepository billingRepository;

    public BillingServiceImpl(BillingRepository billingRepository) {
        this.billingRepository = billingRepository;
    }

    //display all billing
    public List<Billing> getBilling(){
        return billingRepository.findAll();
    }

    public void addBillingFromUtil(List<Utilities> utilities){
        for(Utilities util:utilities){
            Billing billing = new Billing(
                    util.getUtilities_id(),
                    util.getUtilities_id(),
                    util.getCustomer_id(),
                    util.getTotal_amount(),
                    util.getRent_rate(),
                    util.getElectric_bill(),
                    util.getWater_bill(),
                    LocalDate.now()
            );
            billingRepository.save(billing);
        }

    }
}
