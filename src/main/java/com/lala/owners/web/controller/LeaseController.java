package com.lala.owners.web.controller;

import com.lala.common.enums.msg.Result;
import com.lala.common.enums.status.Operation;
import com.lala.common.utils.ResponseMsgUtil;
import com.lala.owners.service.ILeaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "lease")
@RestController
public class LeaseController {

    @Autowired
    private ILeaseService leaseService;

    @RequestMapping(value = "showAll")
    public @ResponseBody Result showAll(){
        Operation querySuccess = Operation._QUERY_SUCCESS;
        return ResponseMsgUtil.builderResponse(querySuccess.getCode(), querySuccess.getMessage(), leaseService.getAll());
    }

}
