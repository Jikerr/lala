package com.lala.owners.dao.repositorys;

import com.lala.owners.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 14:39 2018/1/29
 * @Modified By :
 */
public interface UserPageRepository extends PagingAndSortingRepository<User,Integer> {

    //Page<User> findByAge(int age, Pageable pageable);//在分页查询中依然可用衍生查询
    Page<User> findById(Integer id,Pageable pageable);//

    Page<User> findByEmail(String email, Pageable pageable);//分页并且可个性化排序

}
