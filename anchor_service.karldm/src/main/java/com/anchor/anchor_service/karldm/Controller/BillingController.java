package com.anchor.anchor_service.karldm.Controller;


import com.anchor.anchor_service.karldm.Entity.Billing;
import com.anchor.anchor_service.karldm.Service.BillingService;
import com.anchor.anchor_service.karldm.Service.UtilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class BillingController {

    private final BillingService billingService;


    @Autowired
    public BillingController(BillingService billingService) {
        this.billingService = billingService;

    }

    @GetMapping("/billing")
    public List<Billing> getBilling(){
        return billingService.getBilling();

    }
    @GetMapping("/test")
    public String test(){
        return "This is working";

    }

}
