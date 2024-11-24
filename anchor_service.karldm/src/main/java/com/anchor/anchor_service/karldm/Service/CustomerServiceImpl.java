package com.anchor.anchor_service.karldm.Service;


import com.anchor.anchor_service.karldm.Entity.Customer;
import com.anchor.anchor_service.karldm.Repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CutomerService{

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomer(){
       return customerRepository.findAll();
    }

    public void addCustomer(Customer customer){

        Optional<Customer> firstNameLastName = customerRepository.findFirstNameLastName(
                customer.getFirst_name(),customer.getLast_name());

        if(firstNameLastName.isPresent()){
            throw new IllegalStateException("Customer already exist");
        }
        customerRepository.save(customer);
    }

    public void deleteCustomer(int customer_id){
        Boolean exist = customerRepository.existsById(customer_id);
        if(!exist){
            throw new IllegalStateException("Customer ID "+customer_id+" does not exist");
        }
        customerRepository.deleteById(customer_id);
    }
}
