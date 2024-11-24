package com.anchor.anchor_service.karldm.Controller;

import com.anchor.anchor_service.karldm.Entity.Utilities;
import com.anchor.anchor_service.karldm.Service.BillingService;
import com.anchor.anchor_service.karldm.Service.UtilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;



@CrossOrigin(maxAge = 3360)
@RestController
@RequestMapping
public class UtilitiesController {
    private final UtilitiesService utilitiesService;
    private final BillingService billingService;


    @Autowired
    public UtilitiesController(UtilitiesService utilitiesService, BillingService billingService) {
        this.utilitiesService = utilitiesService;
        this.billingService = billingService;
    }

    @GetMapping("api/getutil")
    public List<Utilities> getUtilities(){
        return utilitiesService.getUtilities();
    }

    @PostMapping("/updateutil")
    public void updateUtil(@RequestBody List<Utilities> utilities){
        utilitiesService.updateUtilities(utilities);
        billingService.addBillingFromUtil(utilities);
    }

}
