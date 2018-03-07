package com.lala.customer.service;

import com.lala.common.bean.page.DataTableResults;
import com.lala.common.bean.list.helper.SearchCondition;
import com.lala.customer.entity.Customer;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {

    public Customer queryCustomerById(Integer uId);

    public DataTableResults findAll(Pageable pageable, SearchCondition condition);


}
