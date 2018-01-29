package com.lala.common.enums.msg;

/**
 * @Author: zh
 * @Description : 系统级响应 , 全程System response message
 * 注意系统级响应错误代码从4000+开始
 * @Date Created in 16:56 2018/1/29
 * @Modified By :
 */
public enum SysResponseMessage {

    _SYS_ERROR(4001,"服务器发生严重错误!"),
    ;
    private Integer code;
    private String message;

    SysResponseMessage(Integer code, String message) {
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
