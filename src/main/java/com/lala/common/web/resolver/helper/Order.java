package com.lala.common.web.resolver.helper;

import java.io.Serializable;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 10:52 2018/3/7
 * @Modified By :
 */
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;
    private int column;
    private String dir;


    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
}