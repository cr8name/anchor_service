package com.anchor.anchor_service.karldm.Controller;

import com.anchor.anchor_service.karldm.Entity.Utilities;
import com.anchor.anchor_service.karldm.Service.BillingService;
import com.anchor.anchor_service.karldm.Service.UtilitiesService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class UtilitiesController {
    private final UtilitiesService utilitiesService;
    private final BillingService billingService;

    public UtilitiesController(UtilitiesService utilitiesService, BillingService billingService) {
        this.utilitiesService = utilitiesService;
        this.billingService = billingService;
    }

    @GetMapping("getutil")
    public List<Utilities> getUtilities(){
        return utilitiesService.getUtilities();
    }

    @PostMapping("/updateutil")
    public void updateUtil(@RequestBody List<Utilities> utilities){
        utilitiesService.updateUtilities(utilities);
        billingService.addBillingFromUtil(utilities);
    }

}
