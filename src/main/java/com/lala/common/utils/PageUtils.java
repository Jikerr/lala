package com.lala.common.utils;

import com.lala.common.bean.page.DataTableResults;
import com.lala.common.web.resolver.helper.SearchCondition;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 13:55 2018/3/7
 * @Modified By :
 */
public class PageUtils {

    public static Pageable searchConditionTo(SearchCondition searchCondition) {
        int start = searchCondition.getStart();
        int pageSize = searchCondition.getLength();

        double pageSizeDouble = Double.valueOf(pageSize).doubleValue();
        double startDouble = Double.valueOf(start).doubleValue();
        double pageDouble = Math.ceil(((startDouble + 1) / pageSizeDouble));
        int page = Double.valueOf(pageDouble).intValue() - 1;//这里注意,要减去1 , 从0开始
        //计算页码
        Pageable pageable = new PageRequest(page, pageSize);

        return pageable;
    }

    public static DataTableResults convertDatatableResults(Page<?> page, Integer draw) {
        DataTableResults dataTableResults = new DataTableResults();
        dataTableResults.setData(page.getContent());
        dataTableResults.setRecordsTotal(page.getTotalElements());
        dataTableResults.setDraw(draw);
        dataTableResults.setRecordsFiltered(Long.valueOf(page.getTotalElements()).intValue());//加上条件查找之后的总条数 暂时没这个功能
        return dataTableResults;
    }


    public static void main(String[] args) {
        //是关于分页的 , 我已知每页显示记录数
        //已知记录 开始索引 (索引可理解为每条数据在数据库中的数组下标)
        //我要计算当前是第几页


        //我写的
        /*int length = 10;
        int start = 9;
        int page = (length+start) % length == 0  ? (length+start)/length : Double.valueOf(Math.floor((length+start)/length)).intValue();
        System.out.println(page);*/

        //我同事写的
        double length = 10;
        double start = 0;
        double page = Math.ceil(((start + 1) / length));
        System.out.println(page);
    }


}
