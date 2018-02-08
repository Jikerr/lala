package com.lala.common.exception;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 17:12 2018/1/29
 * @Modified By :
 */
public class ServiceException extends RuntimeException {

    public ServiceException(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ServiceException(Enum<?> enumS) {
        //enumS.
    }


    private Integer code;
    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
