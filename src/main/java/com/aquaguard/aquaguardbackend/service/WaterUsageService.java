package com.aquaguard.aquaguardbackend.service;

import com.aquaguard.aquaguardbackend.model.WaterUsage;
import com.aquaguard.aquaguardbackend.repository.WaterUsageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WaterUsageService {

    @Autowired
    private WaterUsageRepository repository;

    /**
     * Guarda los datos del uso de agua en la base de datos.
     */
    public WaterUsage saveWaterUsage(WaterUsage waterUsage) {
        return repository.save(waterUsage);
    }

    /**
     * Calcula el consumo total de agua basado en los datos proporcionados.
     */
    public double calculateTotalUsage(WaterUsage waterUsage) {
        double totalUsage =
                waterUsage.getShowerMinutesPerDay() * 9 +  // Ejemplo: 9 litros/minuto
                        waterUsage.getDishwashingPerWeek() * 15 +
                        waterUsage.getLaundryLoadsPerWeek() * 50 +
                        waterUsage.getPotableWaterPerDay() +
                        waterUsage.getGardenIrrigationMinutesPerWeek() * 12 +
                        waterUsage.getOtherUsesPerDay();

        return totalUsage;
    }
}
