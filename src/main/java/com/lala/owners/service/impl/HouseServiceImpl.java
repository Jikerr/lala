package com.lala.owners.service.impl;

import com.lala.common.entity.house.House;
import com.lala.owners.dao.repositorys.house.HouseRepository;
import com.lala.owners.service.IHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 14:58 2018/2/8
 * @Modified By :
 */
@Service
public class HouseServiceImpl implements IHouseService {

    @Autowired
    private HouseRepository houseRepository;

    @Override
    public List<House> getAll() {
        return houseRepository.findAll();
    }
}
