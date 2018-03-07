package com.lala.common.bean.page;

import java.util.List;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 16:09 2018/3/7
 * @Modified By :
 */
public class DataTableResults {

    private Integer draw;
    private long recordsTotal;
    private Integer recordsFiltered;
    private List<?> data;

    public Integer getDraw() {
        return draw;
    }

    public void setDraw(Integer draw) {
        this.draw = draw;
    }

    public long getRecordsTotal() {
        return recordsTotal;
    }

    public void setRecordsTotal(long recordsTotal) {
        this.recordsTotal = recordsTotal;
    }

    public Integer getRecordsFiltered() {
        return recordsFiltered;
    }

    public void setRecordsFiltered(Integer recordsFiltered) {
        this.recordsFiltered = recordsFiltered;
    }

    public List<?> getData() {
        return data;
    }

    public void setData(List<?> data) {
        this.data = data;
    }
}
