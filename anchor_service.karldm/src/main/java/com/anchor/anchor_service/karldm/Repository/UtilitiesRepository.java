package com.anchor.anchor_service.karldm.Repository;

import com.anchor.anchor_service.karldm.Entity.Utilities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilitiesRepository extends JpaRepository<Utilities,Integer> {
}
