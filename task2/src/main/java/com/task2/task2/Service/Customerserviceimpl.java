package com.task2.task2.Service;

import com.task2.task2.Model.Customer;
import com.task2.task2.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Customerserviceimpl implements Customerservice {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Long addCustomer(Customer customer){

        Customer savedCustomer = customerRepository.save(customer);
        return savedCustomer.getId();
    }

    @Override

    public Customer getCustomerById(Long id){
        return customerRepository.findById(id).orElse(null);
    }


}
