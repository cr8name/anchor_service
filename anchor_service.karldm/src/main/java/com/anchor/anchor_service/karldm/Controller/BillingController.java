package com.anchor.anchor_service.karldm.Controller;


import com.anchor.anchor_service.karldm.Entity.Billing;
import com.anchor.anchor_service.karldm.Service.BillingService;
import com.anchor.anchor_service.karldm.Service.UtilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;


@RestController
@RequestMapping
@CrossOrigin(maxAge = 3360)
public class BillingController {

    @Autowired
    private final BillingService billingService;
    private final UtilitiesService utilitiesService;

    public BillingController(BillingService billingService, UtilitiesService utilitiesService) {
        this.billingService = billingService;
        this.utilitiesService = utilitiesService;
    }
    @GetMapping("api/billing")
    public List<Billing> getBilling(){
        return billingService.getBilling();
    }

}
