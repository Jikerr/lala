package com.lala.customer.service.impl;

import com.lala.common.bean.list.helper.Column;
import com.lala.common.bean.list.helper.Search;
import com.lala.common.bean.page.DataTableResults;
import com.lala.common.exception.PageQueryException;
import com.lala.common.utils.PageUtils;
import com.lala.common.bean.list.helper.SearchCondition;
import com.lala.customer.dao.ICustomerRepository;
import com.lala.customer.entity.Customer;
import com.lala.customer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.thymeleaf.util.StringUtils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;


@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Customer queryCustomerById(Integer uId) {
        return customerRepository.findOne(uId);
    }

    @Override
    public DataTableResults findAll(Pageable pageable, SearchCondition condition) {

        DataTableResults dataTableResults = null;
        try {
            Page<Customer> result = customerRepository.findAll(new Specification<Customer>() {
                @Override
                public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
                    List<Predicate> list = new ArrayList<Predicate>();

                    Search search = condition.getSearch();
                    String targetValue = search.getValue();

                    if (!StringUtils.isEmpty(targetValue)) {
                        List<Column> columns = condition.getColumns();
                        //这里其实可以给列实体增加一个查找模式 (硬匹配 , 模糊查询等)
                        //循环全部的列
                        for (Column column : columns) {
                            String columnName = column.getName();
                            //column.getSearch();//可以存查找模式
                            if (column.isSearchable()) { //允许查找
                                list.add(criteriaBuilder.like(root.get(columnName).as(String.class), "%" + targetValue + "%"));
                            }
                        }
                    }
                    Predicate[] p = new Predicate[list.size()];

                    if (!list.isEmpty()) {//为啥要这样写  因为这里是当存在搜索的时候才拼接or
                        return criteriaBuilder.and(criteriaBuilder.or(list.toArray(p)));//注意这里是OR
                    }
                    return criteriaBuilder.and(list.toArray(p));
                }
            }, pageable);

            dataTableResults = PageUtils.convertDatatableResults(result, Integer.valueOf(condition.getDraw()));

        } catch (Exception e) {
            //使用dataTable的错误返回格式 , 放置Error . 异常处理器会自动处理该异常并返回到前台
            DataTableResults errorResult = new DataTableResults();
            errorResult.setError(e.getMessage());
            throw new PageQueryException(e.getMessage(), errorResult);
        }

        return dataTableResults;
    }

}
