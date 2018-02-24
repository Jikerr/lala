package com.lala.customer.dao;

import com.lala.customer.entity.Customer;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ICustomerRepository extends JpaRepository<Customer, Integer>, JpaSpecificationExecutor<Customer> {

    //Page<Customer> findAll(Specification<Customer> specification, Pageable pageable);

}
