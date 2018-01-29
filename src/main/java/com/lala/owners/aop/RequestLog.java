package com.lala.owners.aop;

import com.alibaba.fastjson.JSONObject;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author: zh
 * @Description : 切面日志 , 保证请求输出后台日志可见
 * @Date Created in 16:48 2018/1/29
 * @Modified By :
 */
@Aspect
@Component
public class RequestLog {
    public static final Logger log = Logger.getLogger(RequestLog.class);

    // defined aop pointcut
    @Pointcut("execution(* com.lala.owners.web.controller.*.*(..))")
    public void controllerLog() {
    }

    // log all of controller
    @Before("controllerLog()")
    public void before(JoinPoint joinPoint) {
        log.info(joinPoint.getSignature().getDeclaringType() + ",method:" + joinPoint.getSignature().getName()
                + ",params:" + Arrays.asList(joinPoint.getArgs()));
    }

    // result of return
    @AfterReturning(pointcut = "controllerLog()", returning = "retVal")
    public void after(JoinPoint joinPoint, Object retVal) {
        String returnJson = ((JSONObject)JSONObject.toJSON(retVal)).toJSONString();
        log.info(joinPoint.getSignature().getDeclaringType() + ",method:" + joinPoint.getSignature().getName()
                + ",response:" + returnJson);
    }
}