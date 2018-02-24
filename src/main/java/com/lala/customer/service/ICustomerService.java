package com.lala.customer.service;

import com.lala.customer.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Map;

public interface ICustomerService {

    public Customer queryCustomerById(Integer uId);

    public Page<Customer> findAll(Pageable pageable, Customer customer);


}
