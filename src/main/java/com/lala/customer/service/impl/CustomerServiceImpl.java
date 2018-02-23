package com.lala.customer.service.impl;

import com.lala.customer.dao.ICustomerRepository;
import com.lala.customer.entity.Customer;
import com.lala.customer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;


@Service
public class CustomerServiceImpl implements ICustomerService{


    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Customer queryCustomerById(Integer uId) {
        return customerRepository.findOne(uId);
    }

    @Override
    public Page<Customer> findAll(Integer page, Integer size, Customer customer) {

        return null;
    }
}
