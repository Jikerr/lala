package com.lala.owners.service;

import com.lala.owners.entity.User;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 14:42 2018/1/29
 * @Modified By :
 */
public interface IUserService {

    public List<User> seachPageAllUser(Pageable pageable);
}
