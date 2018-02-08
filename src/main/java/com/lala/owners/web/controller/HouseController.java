package com.lala.owners.web.controller;

import com.lala.common.entity.house.House;
import com.lala.common.enums.msg.Result;
import com.lala.common.enums.status.Operation;
import com.lala.common.utils.ResponseMsgUtil;
import com.lala.owners.service.IHouseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: zh
 * @Description :
 * @Date Created in 14:59 2018/2/8
 * @Modified By :
 */
@RestController
@RequestMapping(value = "house")
public class HouseController {

    @Autowired
    private IHouseService houseService;

    @RequestMapping(value = "showAll")
    public Result<List<House>> showAll() {
        return ResponseMsgUtil.builderResponse(Operation._ERROR.getCode(), Operation._SUCCESS.getMessage(), houseService.getAll());
    }
}
