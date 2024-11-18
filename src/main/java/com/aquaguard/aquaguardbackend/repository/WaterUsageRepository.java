package com.aquaguard.aquaguardbackend.repository;

import com.aquaguard.aquaguardbackend.model.WaterUsage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WaterUsageRepository extends JpaRepository<WaterUsage, Long> {
}
