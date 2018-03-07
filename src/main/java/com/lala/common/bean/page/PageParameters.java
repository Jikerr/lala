package com.lala.common.bean.page;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 11:22 2018/2/26
 * @Modified By :
 */
public class PageParameters {

    private Integer draw;//绘制计数器。这个是用来确保Ajax从服务器返回的是对应的（Ajax是异步的，因此返回的顺序是不确定的）。 要求在服务器接收到此参数后再返回（具体看 下面）
    private Integer start;//第一条数据的起始位置，比如0代表第一条数据
    private Integer length;//告诉服务器每页显示的条数
    //private String[]  search;//全局的搜索条件
    //private boolean search;
    //private Integer[] order;
    //private String [] columns;
    //private


    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public Integer getStart() {
        return start;
    }

    public void setStart(Integer start) {
        this.start = start;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    /*public String[] getSearch() {
        return search;
    }

    public void setSearch(String[] search) {
        this.search = search;
    }

    public Integer[] getOrder() {
        return order;
    }

    public void setOrder(Integer[] order) {
        this.order = order;
    }*/

//    public String[] getColumns() {
//        return columns;
//    }
//
//    public void setColumns(String[] columns) {
//        this.columns = columns;
//    }
}
