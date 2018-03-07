package com.lala.common.web.controller.manage;

import com.lala.common.annotation.IsSearchCondition;
import com.lala.common.bean.page.DataTableResults;
import com.lala.common.enums.status.Operation;
import com.lala.common.utils.PageUtils;
import com.lala.common.bean.list.helper.SearchCondition;
import com.lala.customer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    /*@RequestMapping(value = "showCustomerList")
    public Result<Page<Customer>> showCustomerList(@PageableDefault(value = 15, sort = { "id" }, direction = Sort.Direction.DESC)
                                       Pageable pageable, Customer customer){
        Page<Customer> queryResults = customerService.findAll(pageable,customer);
        return ResponseMsgUtil.builderResponse(querySuccess.getCode(), querySuccess.getMessage(),queryResults);
    }*/

    @RequestMapping(value = "showList")
    public DataTableResults testDataTableShowList(@IsSearchCondition SearchCondition condition){
        return customerService.findAll(PageUtils.searchConditionTo(condition),condition);
    }
}


