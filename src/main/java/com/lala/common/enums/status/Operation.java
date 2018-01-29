package com.lala.common.enums.status;

/**
 * @Author: zh
 * @Description : 关于操作状态全部以10000+开始
 * @Date Created in 17:02 2018/1/29
 * @Modified By :
 */
public enum  Operation {

    _SUCCESS(10001,"operation is successed"),//操作是正常的
    _ERROR(10002,"operation is error"),//操作是错误的
    ;

    private Integer code;
    private String message;

    Operation(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
