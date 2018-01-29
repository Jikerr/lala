package com.lala.owners.dao.repositorys;

import com.lala.owners.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 15:55 2018/1/29
 * @Modified By :
 */
public interface UserJpaRepository extends JpaRepository<User,Integer> {
}
