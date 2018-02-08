package com.lala.owners.dao.repositorys;

import com.lala.owners.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 14:21 2018/1/29
 * @Modified By :
 */
public interface UserRepository extends Repository<User,Integer> ,PagingAndSortingRepository<User,Integer> {

    @Query("select u from User u where u.id=?1")
    public User loadById(Integer id);//使用Query 注解查询 .可用于查询复杂数据
    //多添件查询
    public List<User> findByUserNameAndEmail(String userName, String email);//自动隐射   衍生查询，多添件用And
    //根据主键查询单个
    public User readById(Integer id);//衍生查询 单个条件
    //根据主键查询多个
    public List<User> getById(Integer id);
    //根据主键查询单个
    public User findById(Integer id);


}
