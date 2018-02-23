package com.lala.customer.service;

import com.lala.customer.entity.Customer;
import org.springframework.data.domain.Page;

public interface ICustomerService {

    public Customer queryCustomerById(Integer uId);

    public Page<Customer> findAll(Integer page,Integer size,final Customer customer);

}
