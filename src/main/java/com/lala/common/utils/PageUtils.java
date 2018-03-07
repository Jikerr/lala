package com.lala.common.utils;

import com.lala.common.bean.list.helper.Search;
import com.lala.common.bean.page.DataTableResults;
import com.lala.common.bean.list.helper.Column;
import com.lala.common.bean.list.helper.Order;
import com.lala.common.bean.list.helper.SearchCondition;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 13:55 2018/3/7
 * @Modified By :
 */
public class PageUtils {

    public static Pageable searchConditionTo(SearchCondition searchCondition) {
        double pageSizeDouble = Double.valueOf(searchCondition.getLength()).doubleValue();
        double startDouble = Double.valueOf(searchCondition.getStart()).doubleValue();
        double pageDouble = Math.ceil(((startDouble + 1) / pageSizeDouble));
        int page = Double.valueOf(pageDouble).intValue() - 1;//这里注意,要减去1 , 从0开始

        List<Order> orderList = searchCondition.getOrders();//处理排序

        Sort sort = null;
        if(null!= orderList && !orderList.isEmpty()){//只有不为空时处理排序
            Order order = orderList.get(0);
            List<Column> columns = searchCondition.getColumns();
            Column column = columns.get(order.getColumn());//获取列
            Sort.Direction direction = order.getDir().equals("desc") ? Sort.Direction.DESC : Sort.Direction.ASC;
            sort = new Sort(direction, column.getName());//放值排序方案和列名
        }

        Pageable pageable = new PageRequest(page, searchCondition.getLength(),sort);//计算页码

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


    /*public static List<Predicate> seachPredicateFactory(SearchCondition searchCondition, CriteriaBuilder builder) {
        List<Predicate> list = new ArrayList<Predicate>();//响应


        Search search = searchCondition.getSearch();
        String targetValue = search.getValue();

        List<Column> columns = searchCondition.getColumns();

        for(Column column : columns){
            column.getName();
            column.getSearch();
            if(column.isSearchable()){ //允许查找
                list.add(builder.like(root.get("realName").as(String.class), "%" + 111 + "%"));
            }
        }

        return null;
    }*/


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
