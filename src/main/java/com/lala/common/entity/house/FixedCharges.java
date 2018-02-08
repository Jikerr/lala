package com.lala.common.entity.house;

import com.lala.common.entity.base.BaseEntity;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 15:32 2018/2/8
 * @Modified By :
 */
@Table(name = "wco_fixed_charges")
@Entity
public class FixedCharges extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;//主键
    private String chargesName;//固定收费项名称
    private String description;//描述
    private BigDecimal amount;//金额

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChargesName() {
        return chargesName;
    }

    public void setChargesName(String chargesName) {
        this.chargesName = chargesName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
