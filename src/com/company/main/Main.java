package com.company.main;

import com.company.models.Bicycle;
import com.company.models.ElectricBicycle;
import com.company.models.Manufacturer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Bicycle> bicycles = new ArrayList<>();
        List<Manufacturer> manufacturers = new ArrayList<>();

        Bicycle bicycle = new Bicycle("Mountain Bike", 500.0, "Red", "Large");
        Bicycle mountainBike = new Bicycle("Mountain Bike", 500.0, "Red", "Large");
        ElectricBicycle electricBike = new ElectricBicycle("E-Bike", 1200.0, "Black", "Medium", 500);
        ElectricBicycle electricBicycle = new ElectricBicycle("E-Bike", 1200.0, "Black", "Medium", 500);

        bicycles.add(mountainBike);
        bicycles.add(new Bicycle("Road Bike", 700.0, "Blue", "Medium"));
        bicycles.add(electricBike);


        Manufacturer abcBikes = new Manufacturer("ABC Bikes", "123 Main St", "123-456-7890");
        Manufacturer xyzCycles = new Manufacturer("XYZ Cycles", "456 Oak St", "987-654-3210");

        manufacturers.add(abcBikes);
        manufacturers.add(xyzCycles);

        System.out.println("===================================================");
        System.out.println("Bicycles:");
        for (Bicycle bike : bicycles) {
            System.out.println(bike.toString());
        }
        System.out.println("===================================================");
        System.out.println("\nManufacturers:");
        for (Manufacturer manufacturer : manufacturers) {
            System.out.println(manufacturer.toString());
        }

        System.out.println("===================================================");
        System.out.println("Bicycle Details:");
        System.out.println("Model: " + bicycle.getModel());
        System.out.println("Price: $" + bicycle.getPrice());
        System.out.println("Color: " + bicycle.getColor());
        System.out.println("Size: " + bicycle.getSize());

        System.out.println("===================================================");
        System.out.println("Electric Bicycle Details:");
        System.out.println("Model: " + electricBicycle.getModel());
        System.out.println("Price: $" + electricBicycle.getPrice());
        System.out.println("Color: " + electricBicycle.getColor());
        System.out.println("Size: " + electricBicycle.getSize());
        System.out.println("Battery Capacity: " + electricBicycle.getBatteryCapacity() + " Wh");


        System.out.println("===================================================");
        abcBikes.addBicycle(mountainBike);
        abcBikes.addBicycle(electricBike);
        abcBikes.addBicycle(electricBike);

        abcBikes.removeBicycle(electricBike);
        abcBikes.removeBicycle(electricBike);

        System.out.println("===================================================");
        System.out.println("\nUpdated Manufacturer (ABC Bikes):");
        System.out.println(abcBikes.toString());


        System.out.println("===================================================");
        System.out.println("\nTotal Bicycles Produced: " + Manufacturer.getTotalBicyclesProduced());
        Manufacturer.setTotalBicyclesProduced(50);

        int totalProduced = Manufacturer.getTotalBicyclesProduced();
        System.out.println("Updated Total Bicycles Produced: " + totalProduced);

        electricBicycle.setBatteryCapacity(600);

        System.out.println("===================================================");
        System.out.println("\nElectric Bicycle Details:");
        System.out.println("Model: " + electricBicycle.getModel());
        System.out.println("Price: $" + electricBicycle.getPrice());
        System.out.println("Color: " + electricBicycle.getColor());
        System.out.println("Size: " + electricBicycle.getSize());
        System.out.println("Battery Capacity: " + electricBicycle.getBatteryCapacity() + " Wh");
    }
}


