package com.lala.common.utils;


import com.lala.common.enums.msg.Result;
import com.lala.common.enums.msg.SysResponseMessage;
import com.lala.common.enums.status.Operation;
import com.lala.owners.enums.message.EnumResultCode;

/**
 * @author zh
 * @date Created on 2018/1/6
 */
public class ResponseMsgUtil {

    /**
     * 根据消息码等生成接口返回对象
     *
     * @param code 结果返回码
     * @param msg  结果返回消息
     * @param data 数据对象
     * @param <T>
     * @return
     */
    public static <T> Result<T> builderResponse(int code, String msg, T data) {
        Result<T> res = new Result<>();
        res.setResCode(code);
        res.setResMsg(msg);
        res.setData(data);
        return res;
    }

    /**
     * 请求异常返回结果
     *
     * @param <T>
     * @return
     */
    public static <T> Result<T> operationFail() {
        return builderResponse(Operation._ERROR.getCode(), Operation._ERROR.getMessage(), null);
    }

    public static <T> Result<T> operationSuccess() {
        return builderResponse(Operation._SUCCESS.getCode(), Operation._SUCCESS.getMessage(), null);
    }

    public static <T> Result<T> querySuccess() {
        return builderResponse(Operation._QUERY_SUCCESS.getCode(), Operation._QUERY_SUCCESS.getMessage(), null);
    }

    public static <T> Result<T> queryFail() {
        return builderResponse(Operation._QUERY_FAIL.getCode(), Operation._QUERY_FAIL.getMessage(), null);
    }

    /**
     * 发生严重错误时候的返回 . 此时代码不知道具体发生了什么
     * @param <T>
     * @return
     */
    public static <T> Result<T> exception(String exMessage) {
        return builderResponse(SysResponseMessage._SYS_ERROR.getCode(), exMessage, null);
    }

}
