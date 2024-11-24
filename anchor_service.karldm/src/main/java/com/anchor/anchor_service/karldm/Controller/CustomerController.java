package com.anchor.anchor_service.karldm.Controller;

import com.anchor.anchor_service.karldm.Entity.Customer;
import com.anchor.anchor_service.karldm.Service.CutomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@CrossOrigin(maxAge = 3360)
public class CustomerController {

    private final CutomerService cutomerService;

    @Autowired
    public CustomerController(CutomerService cutomerService) {
        this.cutomerService = cutomerService;
    }

    @GetMapping("api/customer")
    public List<Customer> getCustomer(){
        return cutomerService.getCustomer();
    }
    @PostMapping("/addcustomer")
    public void addNewCustomer(@RequestBody Customer customer){
        cutomerService.addCustomer(customer);
    }
    @DeleteMapping(path = "/deletecustomer/{customer_id}")
    public void deleteCustomer(@PathVariable("customer_id")int customer_id){
        cutomerService.deleteCustomer(customer_id);
    }
}
