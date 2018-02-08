package com.lala.common.enums.ex;

/**
 * @Author: zh
 * @Description : 关于操作状态全部以10000+开始
 * @Date Created in 17:02 2018/1/29
 * @Modified By :
 */
public enum ParamsCheckedResult {

    _PARAM_ISNULL(110001,"参数为空"),
    _PARAM_ISFORMAT_ERROR(10002,"参数格式是错误的"),
    ;

    private Integer code;
    private String message;

    ParamsCheckedResult(Integer code, String message) {
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
