package com.lala.common.web.manage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 23:21 2018/2/12
 * @Modified By :
 */
@RequestMapping(value = "/manage/customer")
@RestController(value = "mCustomerController")
public class CustomerController {

    public String showUserList(){
        return null;
    }

}


