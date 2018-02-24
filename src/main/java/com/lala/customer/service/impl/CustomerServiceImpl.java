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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


@Service
public class CustomerServiceImpl implements ICustomerService{

    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Customer queryCustomerById(Integer uId) {
        return customerRepository.findOne(uId);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable, Customer customer) {
        Page<Customer> result = customerRepository.findAll(new Specification<Customer>(){
            @Override
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                List<Predicate> list = new ArrayList<Predicate>();
                if (!StringUtils.isEmpty(customer.getRealName())) {
                    list.add(criteriaBuilder.like(root.get("realName").as(String.class), "%" + customer.getRealName() + "%"));
                }

                Predicate[] p = new Predicate[list.size()];
                return criteriaBuilder.and(list.toArray(p));
            }
        },pageable);
        return result;
    }

}
