package com.company.models;

public class ElectricBicycle extends Bicycle {
    private int batteryCapacity;

    public ElectricBicycle(String model, double price, String color, String size, int batteryCapacity) {
        super(model, price, color, size);
        if (batteryCapacity < 0) {
            throw new IllegalArgumentException("Invalid input for ElectricBicycle");
        }
        this.batteryCapacity = batteryCapacity;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public String toString() {
        return "ElectricBicycle{" +
                "batteryCapacity=" + batteryCapacity +
                '}';
    }



}