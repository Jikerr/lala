package com.lala.common.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.List;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 15:05 2018/1/29
 * @Modified By :
 */
@NoRepositoryBean
public interface BaseRepository<T,ID extends Serializable> extends JpaRepository<T,ID> {
    List<Object[]> listBySQL(String sql);
}
