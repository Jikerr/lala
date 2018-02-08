package com.lala.owners.service.impl;

import com.lala.common.entity.lease.Lease;
import com.lala.owners.dao.repositorys.lease.LeaseRepository;
import com.lala.owners.service.ILeaseService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LeaseServiceImpl implements ILeaseService {

    private final static Logger logger = Logger.getLogger(LeaseServiceImpl.class);

    @Autowired
    private LeaseRepository leaseRepository;

    @Override
    public List<Lease> getAll() {
        logger.info("[查询全部出租信息]");
        return leaseRepository.findAll();
    }
}
