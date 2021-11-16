package com.esdo.bepilot.Repository;

import com.esdo.bepilot.Model.Entity.Mission;
import com.esdo.bepilot.Model.Response.MissionResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MissionRepository extends JpaRepository<Mission,Long>, JpaSpecificationExecutor<Mission> {

    @Query("SELECT m FROM Mission m WHERE m.status = :status AND m.customerId = :customerId")
    List<MissionResponse> findByStatus(String status,Long customerId);
}
