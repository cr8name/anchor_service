package com.anchor.anchor_service.karldm.Repository;

import com.anchor.anchor_service.karldm.Entity.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillingRepository extends JpaRepository<Billing,Integer> {
}
