package com.esdo.bepilot.Repository;

import com.esdo.bepilot.Model.Entity.MissionDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MissionDetailRepository extends JpaRepository<MissionDetail, Long> {

    List<MissionDetail> findAllById(Long missionId);
}
