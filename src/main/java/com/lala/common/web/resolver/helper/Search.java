package com.lala.common.web.resolver.helper;

import java.io.Serializable;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 10:51 2018/3/7
 * @Modified By :
 */
public class Search implements Serializable {
    private static final long serialVersionUID = 1L;
    private String value;
    private boolean regex;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public boolean isRegex() {
        return regex;
    }

    public void setRegex(boolean regex) {
        this.regex = regex;
    }
}