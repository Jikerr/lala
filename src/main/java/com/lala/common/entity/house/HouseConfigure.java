package com.lala.common.entity.house;

import com.lala.common.entity.base.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @Author: zh
 * @Description : 房屋配置
 * @Date Created in 15:52 2018/2/8
 * @Modified By :
 */
@Table(name = "wco_house_configure")
@Entity
public class HouseConfigure extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;//主键
    private String goodsName;//配置物品名称 注意单纯的name和descripn 是关键字
    private String description;//描述
    private BigDecimal costPrice;//成本价

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }
}
