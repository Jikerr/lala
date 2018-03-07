package com.lala.common.exception;

/**
 * @Author: zh
 * @Description : 分页查询异常
 * @Date Created in 17:12 2018/1/29
 * @Modified By :
 */
public class PageQueryException extends RuntimeException {

    private String message;
    private Object page;

    public PageQueryException(String message,Object page){
        this.message = message;
        this.page = page;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getPage() {
        return page;
    }

    public void setPage(Object page) {
        this.page = page;
    }
}
