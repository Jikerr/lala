package com.lala.customer.web.controller;

import com.lala.common.enums.ex.ParamsCheckedResult;
import com.lala.common.enums.msg.Result;
import com.lala.common.enums.status.Operation;
import com.lala.common.exception.ServiceException;
import com.lala.common.utils.ResponseMsgUtil;
import com.lala.customer.entity.Customer;
import com.lala.customer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping(value = "customer")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;

    @RequestMapping(value = "queryUser")
    public @ResponseBody Result<Customer> queryUser(@RequestParam Map<String,String> queryParams){

        Integer uId = Integer.valueOf(String.valueOf(queryParams.get("uId")));
        if( uId==null ){
            ParamsCheckedResult paramIsnull = ParamsCheckedResult._PARAM_ISNULL;
            throw new ServiceException(paramIsnull.getCode(),paramIsnull.getMessage());
        }

        /*String str = "";
        str.substring(10);*/
        //尝试抛出异常.

        Customer customer = customerService.queryCustomerById(uId);//通过客户Id查询
        Operation success = Operation._QUERY_SUCCESS;//正确的操作
        return ResponseMsgUtil.builderResponse(success.getCode(), success.getMessage(), customer);
    }

}
