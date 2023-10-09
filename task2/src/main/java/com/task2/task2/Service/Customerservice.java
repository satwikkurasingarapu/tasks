package com.task2.task2.Service;

import com.task2.task2.Model.Customer;

public interface Customerservice {
    Long addCustomer(Customer customer);
    Customer getCustomerById(Long id);
}
