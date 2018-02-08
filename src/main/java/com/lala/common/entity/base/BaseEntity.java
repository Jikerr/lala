package com.lala.common.entity.base;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 14:41 2018/2/8
 * @Modified By :
 */
@MappedSuperclass
public class BaseEntity {
    @Column(name="create_user",nullable=false)
    private Integer createUser;
    @Column(name="update_user",nullable=false)
    private Integer updateUser;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="create_date",nullable=false)
    private Date createDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="update_date",nullable=false)
    private Date updateDate;

    public Integer getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Integer createUser) {
        this.createUser = createUser;
    }

    public Integer getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(Integer updateUser) {
        this.updateUser = updateUser;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
