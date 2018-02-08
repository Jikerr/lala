package com.lala.common.entity.lease;

import com.lala.common.entity.base.BaseEntity;

import java.math.BigDecimal;
import java.util.Date;

public class Lease extends BaseEntity {

    private Integer id;//主键
    private Integer cId;//用户客户信息
    private Integer oId;//房东信息
    private Integer hId;//房屋信息
    private Integer leaseStatus;//出租状态
    private BigDecimal billCountAmount;//账单费用合计
    private Integer payStatus;//付款状态 0未缴费 1正常交租  2拖欠交租(超一月待催租)
    private Integer keepLeaseStatus;//续租状态 0未发生续租 1发生续租
    private Date checkInDate;//入住时间
    private Date expireDate;//合同到期时间  既租赁结束时间


}
