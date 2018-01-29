package com.lala.common.dao.impl;

import com.lala.common.dao.BaseRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import javax.persistence.EntityManager;
import java.io.Serializable;
import java.util.List;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 15:08 2018/1/29
 * @Modified By :
 */
public class BaseRepositoryImpl <T, ID extends Serializable> extends SimpleJpaRepository<T,ID> implements BaseRepository<T,ID> {

    private final EntityManager entityManager;

    public BaseRepositoryImpl(Class<T> domainClass, EntityManager entityManager) {
        super(domainClass, entityManager);
        this.entityManager = entityManager;
        //父类没有不带参数的构造方法，这里手动构造父类
    }

    @Override
    public List<Object[]> listBySQL(String sql) {
        return entityManager.createNativeQuery(sql).getResultList();
    }
}