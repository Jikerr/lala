package com.lala.common.web.resolver.helper;

import java.io.Serializable;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 10:51 2018/3/7
 * @Modified By :
 */
public class Column implements Serializable {
    private static final long serialVersionUID = 1L;
    private String data;
    private String name;
    private boolean searchable;
    private boolean orderable;
    private Search search = new Search();

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSearchable() {
        return searchable;
    }

    public void setSearchable(boolean searchable) {
        this.searchable = searchable;
    }

    public boolean isOrderable() {
        return orderable;
    }

    public void setOrderable(boolean orderable) {
        this.orderable = orderable;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }
}