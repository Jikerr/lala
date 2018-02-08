package com.lala.common.entity.lease;

import com.lala.common.entity.base.BaseEntity;
import com.lala.common.entity.house.House;
import com.lala.customer.entity.Customer;
import com.lala.customer.entity.LeaseBill;
import com.lala.owners.entity.Owner;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Table(name = "wco_leanse")
@Entity
public class Lease extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键生成 自增长
    private Integer id;//主键
    //private Integer cId;//用户客户信息
    //private Integer oId;//房东信息
    //private Integer hId;//房屋信息
    private Integer leaseStatus;//出租状态
    private BigDecimal billCountAmount;//账单费用合计
    private Integer payStatus;//付款状态 0未缴费 1正常交租  2拖欠交租(超一月待催租)
    private Integer keepLeaseStatus;//续租状态 0未发生续租 1发生续租
    private Date checkInDate;//入住时间
    private Date expireDate;//合同到期时间  既租赁结束时间

    /****************************关联表 GET AND SET ---->START<------******************************/
    //关联客户信息
    @ManyToOne(fetch = FetchType.EAGER ,optional = false)//不允许该信息为空
    @JoinColumn(name = "cId")//关联到客户表主键
    private Customer customer;
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    //关联房东信息
    @ManyToOne(fetch = FetchType.EAGER ,optional = false)//不允许该信息为空
    @JoinColumn(name = "oId")//关联到客户表主键
    private Owner owner;
    public Owner getOwner() {
        return owner;
    }
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    //关联房屋信息
    @ManyToOne(fetch = FetchType.EAGER ,optional = false)//不允许该信息为空
    @JoinColumn(name = "hId")//关联到客户表主键
    private House house;
    public House getHouse() {
        return house;
    }
    public void setHouse(House house) {
        this.house = house;
    }
/****************************关联表 GET AND SET ---->END<------******************************/

    /****************************固定字段GET AND SET ---->START<------******************************/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLeaseStatus() {
        return leaseStatus;
    }

    public void setLeaseStatus(Integer leaseStatus) {
        this.leaseStatus = leaseStatus;
    }

    public BigDecimal getBillCountAmount() {
        return billCountAmount;
    }

    public void setBillCountAmount(BigDecimal billCountAmount) {
        this.billCountAmount = billCountAmount;
    }

    public Integer getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Integer payStatus) {
        this.payStatus = payStatus;
    }

    public Integer getKeepLeaseStatus() {
        return keepLeaseStatus;
    }

    public void setKeepLeaseStatus(Integer keepLeaseStatus) {
        this.keepLeaseStatus = keepLeaseStatus;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    /****************************固定字段GET AND SET ---->END<------******************************/
}
