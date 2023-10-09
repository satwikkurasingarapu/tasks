package com.task2.task2.Controller;

import com.task2.task2.Exception.CustomerNotFoundException;
import com.task2.task2.Model.Customer;
import com.task2.task2.Service.Customerservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class Task2Controller {
    private static final Logger logger = LoggerFactory.getLogger(Task2Controller.class);
    @Autowired
    private Customerservice customerservice;
    @PostMapping("/addCustomer")
    public Long addCustomer(@RequestBody Customer customer){
        System.out.println(customer.getName()+" "+customer.getGender()+" "+customer.getEmail()+" "+customer.getPhoneNumber());
        return customerservice.addCustomer(customer);
    }
    @GetMapping("/getCustomer/{id}")
    public Customer getCustomerbyId(@PathVariable Long id){

        logger.trace("This is a TRACE-level log message");
        logger.debug("This is a DEBUG-level log message");
        logger.info("This is an INFO-level log message");
        logger.warn("This is a WARN-level log message");
        logger.error("This is an ERROR-level log message");


        Customer customer = customerservice.getCustomerById(id);
        if(customer == null){
            throw new CustomerNotFoundException("Customer not found with ID: "+ id);
        }
        return customer;

    }



}
