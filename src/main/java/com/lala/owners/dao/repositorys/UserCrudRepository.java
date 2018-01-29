package com.lala.owners.dao.repositorys;

import com.lala.owners.entity.User;
import org.springframework.data.repository.CrudRepository;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 14:28 2018/1/29
 * @Modified By :
 */
public interface UserCrudRepository extends CrudRepository<User,Integer> {

    //已经包含了增删改查基础查询方法
    //增加了一个countByXX的方法
    public long countByEmail(int age);//拓展查询
}
