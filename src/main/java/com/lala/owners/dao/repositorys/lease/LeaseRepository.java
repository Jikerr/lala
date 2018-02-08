package com.lala.owners.dao.repositorys.lease;

import com.lala.common.entity.lease.Lease;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaseRepository extends JpaRepository<Lease,Integer> {

}
