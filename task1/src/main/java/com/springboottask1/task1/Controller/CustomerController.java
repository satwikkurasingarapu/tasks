package com.springboottask1.task1.Controller;





import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private List<Customer> customerList = new ArrayList<>();
    private AtomicInteger idCounter = new AtomicInteger(1);
    @PostMapping
    public int addCustomer(@RequestBody Customer customer){
        customer.setId(idCounter.getAndIncrement());
        customerList.add(customer);
        return customer.getId();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        // Search for the customer by ID in the list
        for (Customer customer : customerList) {
            if (customer.getId() == id) {
                return customer;
            }
        }

        return null;

    }


}

