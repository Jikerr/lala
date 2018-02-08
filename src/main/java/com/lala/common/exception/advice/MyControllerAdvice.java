package com.lala.common.exception.advice;

import com.lala.common.enums.msg.Result;
import com.lala.common.enums.msg.SysResponseMessage;
import com.lala.common.exception.ServiceException;
import com.lala.common.utils.ResponseMsgUtil;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zh
 * @Description : 异常通知与处理
 * @Date Created in 17:14 2018/1/29
 * @Modified By :
 */
@ControllerAdvice
public class MyControllerAdvice {

    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public Result errorHandler(Exception ex) {
        return ResponseMsgUtil.builderResponse(SysResponseMessage._SYS_ERROR.getCode(),ex.getMessage(),null);
    }

    /**
     * 拦截捕捉自定义异常 MyException.class
     * @param exception
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = ServiceException.class)
    public Result myErrorHandler(ServiceException exception) {
        return ResponseMsgUtil.builderResponse(exception.getCode(),exception.getMsg(),null);
    }

}