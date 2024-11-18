package com.aquaguard.aquaguardbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class WaterUsage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int showerMinutesPerDay; // Minutos en la ducha (por día)
    private int dishwashingPerWeek; // Número de veces que lavas platos (por semana)
    private int laundryLoadsPerWeek; // Cargas de ropa lavadas (por semana)
    private int potableWaterPerDay; // Litros de agua potable consumidos (por día)
    private int gardenIrrigationMinutesPerWeek; // Minutos de riego en jardín (por semana)
    private int otherUsesPerDay; // Otros usos (litros por día)

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getShowerMinutesPerDay() {
        return showerMinutesPerDay;
    }

    public void setShowerMinutesPerDay(int showerMinutesPerDay) {
        this.showerMinutesPerDay = showerMinutesPerDay;
    }

    public int getDishwashingPerWeek() {
        return dishwashingPerWeek;
    }

    public void setDishwashingPerWeek(int dishwashingPerWeek) {
        this.dishwashingPerWeek = dishwashingPerWeek;
    }

    public int getLaundryLoadsPerWeek() {
        return laundryLoadsPerWeek;
    }

    public void setLaundryLoadsPerWeek(int laundryLoadsPerWeek) {
        this.laundryLoadsPerWeek = laundryLoadsPerWeek;
    }

    public int getPotableWaterPerDay() {
        return potableWaterPerDay;
    }

    public void setPotableWaterPerDay(int potableWaterPerDay) {
        this.potableWaterPerDay = potableWaterPerDay;
    }

    public int getGardenIrrigationMinutesPerWeek() {
        return gardenIrrigationMinutesPerWeek;
    }

    public void setGardenIrrigationMinutesPerWeek(int gardenIrrigationMinutesPerWeek) {
        this.gardenIrrigationMinutesPerWeek = gardenIrrigationMinutesPerWeek;
    }

    public int getOtherUsesPerDay() {
        return otherUsesPerDay;
    }

    public void setOtherUsesPerDay(int otherUsesPerDay) {
        this.otherUsesPerDay = otherUsesPerDay;
    }
}
