package com.lala.customer.entity;

import com.lala.common.entity.base.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "wc_leanse_bill")
@Entity
public class LeaseBill extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键生成 自增长
    private Integer id;

    private String billNum;//账单编号
    private BigDecimal amount;//金额
    private String expensesType;//费用类型   1租金        2固定收费项
    private Integer hId;//房屋信息
    private Integer settleAccountsStatus;//结算状态   0未结算   1结清     2拖延



    /****************************关联表 GET AND SET ---->START<------******************************/



    /****************************关联表 GET AND SET ---->END<------******************************/



    /****************************固定字段GET AND SET ---->START<------******************************/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillNum() {
        return billNum;
    }

    public void setBillNum(String billNum) {
        this.billNum = billNum;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getExpensesType() {
        return expensesType;
    }

    public void setExpensesType(String expensesType) {
        this.expensesType = expensesType;
    }

    public Integer gethId() {
        return hId;
    }

    public void sethId(Integer hId) {
        this.hId = hId;
    }

    public Integer getSettleAccountsStatus() {
        return settleAccountsStatus;
    }

    public void setSettleAccountsStatus(Integer settleAccountsStatus) {
        this.settleAccountsStatus = settleAccountsStatus;
    }



/****************************固定字段GET AND SET ---->END<------******************************/

}
