package com.aquaguard.aquaguardbackend.controller;

import com.aquaguard.aquaguardbackend.model.WaterUsage;
import com.aquaguard.aquaguardbackend.service.WaterUsageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/water-usage")
public class WaterUsageController {

    @Autowired
    private WaterUsageService service;

    @PostMapping("/calculate")
    public double calculateWaterUsage(@RequestBody WaterUsage waterUsage) {
        // Guardar los datos en la base de datos
        service.saveWaterUsage(waterUsage);

        // Calcular el consumo total
        return service.calculateTotalUsage(waterUsage);
    }
}