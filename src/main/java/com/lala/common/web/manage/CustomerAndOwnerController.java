package com.lala.common.web.manage;

import com.lala.common.entity.house.House;
import com.lala.common.enums.msg.Result;
import com.lala.common.enums.status.Operation;
import com.lala.common.utils.ResponseMsgUtil;
import com.lala.customer.entity.Customer;
import com.lala.customer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 23:21 2018/2/12
 * @Modified By :
 */
@RequestMapping(value = "/manage")
@RestController
public class CustomerAndOwnerController {

    Operation querySuccess = Operation._QUERY_SUCCESS;

    @Autowired
    private ICustomerService customerService;

    @RequestMapping(value = "showCustomerList")
    public Result<Page<Customer>> showCustomerList(@PageableDefault(value = 15, sort = { "id" }, direction = Sort.Direction.DESC)
                                       Pageable pageable, Customer customer){
        Page<Customer> queryResults = customerService.findAll(pageable,customer);
        return ResponseMsgUtil.builderResponse(querySuccess.getCode(), querySuccess.getMessage(),queryResults);
    }

}


