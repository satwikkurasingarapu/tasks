package com.task2.task2.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.task2.task2.Model.Customer;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long>{
}
