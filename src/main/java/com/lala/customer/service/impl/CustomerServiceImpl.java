package com.lala.customer.service.impl;

import com.lala.customer.dao.ICustomerRepository;
import com.lala.customer.entity.Customer;
import com.lala.customer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CustomerServiceImpl implements ICustomerService{


    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Customer queryCustomerById(Integer uId) {
        return customerRepository.findOne(uId);
    }
}
