package com.lala.owners.web.controller;

import com.lala.common.enums.msg.Result;
import com.lala.owners.annotation.RequestParamValidate;
import com.lala.owners.enums.message.EnumResultCode;
import com.lala.common.utils.ResponseMsgUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Beauxie
 * @date Created on 2018/1/6
 */
@RestController
public class HelloController {
    /**
     *测试@RequestParam注解
     * @param name
     * @return
     */
    @GetMapping("/hello1")
    public Result<String> hello1(@RequestParam String name) {
        return ResponseMsgUtil.builderResponse(EnumResultCode.SUCCESS.getCode(), "请求成功", "Hello," + name);
    }

    /**
     * 测试@ParamCheck注解
     * @param name
     * @return
     */
    @GetMapping("/hello2")
    public Result<String> hello2(@RequestParamValidate String name) {
        return ResponseMsgUtil.builderResponse(EnumResultCode.SUCCESS.getCode(), "请求成功", "Hello," + name);
    }

    /**
     * 测试@ParamCheck与@RequestParam一起时
     * @param name
     * @return
     */
    @GetMapping("/hello3")
    public Result<String> hello3(@RequestParamValidate @RequestParam String name) {
        return ResponseMsgUtil.builderResponse(EnumResultCode.SUCCESS.getCode(), "请求成功", "Hello," + name);
    }
}
