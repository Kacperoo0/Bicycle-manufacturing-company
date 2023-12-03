package com.company.models;

public class ElectricBicycle extends Bicycle {
    private int batteryCapacity;

    public ElectricBicycle(String model, double price, String color, String size, int number ,int batteryCapacity) {
        super(model, price, color, size, number);
        if (batteryCapacity < 0) {
            throw new IllegalArgumentException("Niepoprawne dane");
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
                "model='" + getModel() + '\'' +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                ", size='" + getSize() + '\'' +
                ", number=" + getNumber() + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                '}';
    }
}