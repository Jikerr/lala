package com.lala.owners.service.impl;

import com.lala.common.exception.ServiceException;
import com.lala.owners.dao.repositorys.UserCrudRepository;
import com.lala.owners.dao.repositorys.UserPageRepository;
import com.lala.owners.dao.repositorys.UserRepository;
import com.lala.owners.entity.User;
import com.lala.owners.service.IUserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.sql.rowset.serial.SerialException;
import java.util.List;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 14:43 2018/1/29
 * @Modified By :
 */
@Service
public class UserServiceImpl implements IUserService {

    private static final Logger logger = Logger.getLogger(UserServiceImpl.class);
    private static final String logTag = "User ";

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserCrudRepository userCrudRepository;

    @Autowired
    private UserPageRepository userPageRepository;

    //上述代码可多继承

    //
    @Override
    public List<User> seachPageAllUser(Pageable pageable) {
        logger.info("["+logTag+"]   分页查询全部用户 :");
        Page<User> userPage = userPageRepository.findById(1,pageable);

        //分页并且可以个性化排序
        Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC,"email"));//邮箱升序
        PageRequest pageRequest = new PageRequest(pageable.getPageNumber(),pageable.getPageSize(),sort);
        userPageRepository.findByEmail("zh-dev@outlook.com",pageRequest);

        //分页还有一种Specification的玩法就不演示了 ,但是对于不想写sql 的开发人员绝对是好东西

        return null;
    }
}
