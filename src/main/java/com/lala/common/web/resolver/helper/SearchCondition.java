package com.lala.common.web.resolver.helper;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 10:50 2018/3/7
 * @Modified By :
 */
public class SearchCondition implements Serializable {
    private static final long serialVersionUID = 1L;
    private int draw;
    private int length;
    private List<Column> columns = new ArrayList<Column>();
    private List<Order> orders = new ArrayList<Order>();
    private int start = 0;
    private Search search = new Search();


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    public List<Column> getColumns() {
        return columns;
    }

    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public Search getSearch() {
        return search;
    }

    public void setSearch(Search search) {
        this.search = search;
    }
}