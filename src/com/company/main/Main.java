package com.company.main;

import com.company.models.Bicycle;
import com.company.models.ElectricBicycle;
import com.company.models.Manufacturer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        List<Bicycle> bicycles = new ArrayList<>();
        List<Manufacturer> manufacturers = new ArrayList<>();
        List<ElectricBicycle> electricBicycles = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);


        Bicycle bicycle = new Bicycle("Bike", 600.0, "Blue", "Medium");
        Bicycle bicycle1 = new Bicycle("Bike", 700.0, "Purple", "Medium");
        Bicycle bicycle2 = new Bicycle("Bike", 900.0, "Green", "Medium");
        Bicycle mountainBike = new Bicycle("Mountain Bike", 500.0, "Red", "Large");
        ElectricBicycle electricBike = new ElectricBicycle("E-Bike", 1200.0, "Black", "Medium", 500);
        ElectricBicycle electricBicycle = new ElectricBicycle("E-Bike", 1200.0, "Black", "Medium", 500);

        bicycles.add(mountainBike);
        bicycles.add(bicycle1);
        bicycles.add(bicycle2);
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

        System.out.println("===================================================");
        System.out.println("\nEnter details for a new Electric Bicycle:");

        System.out.print("Enter model: ");
        String newModel = scanner.nextLine();
        System.out.print("Enter price: ");
        double newPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter color: ");
        String newColor = scanner.nextLine();
        System.out.print("Enter size: ");
        String newSize = scanner.nextLine();
        Bicycle newBicycle = new Bicycle(newModel, newPrice, newColor, newSize);
        bicycles.add(newBicycle);

        System.out.println("\nBicycles Details");
        for (Bicycle bike : bicycles) {
            System.out.println("Model: " + bike.getModel());
            System.out.println("Price: $" + bike.getPrice());
            System.out.println("Color: " + bike.getColor());
            System.out.println("Size: " + bike.getSize());
            System.out.println("-------------");
        }

        System.out.println("===================================================");
        System.out.print("Enter manufacturer name: ");
        String manufacturerName = scanner.nextLine();
        System.out.print("Enter manufacturer address: ");
        String manufacturerAddress = scanner.nextLine();
        System.out.print("Enter manufacturer contact info: ");
        String manufacturerContactInfo = scanner.nextLine();
        Manufacturer newManufacturer = new Manufacturer(manufacturerName, manufacturerAddress, manufacturerContactInfo);
        manufacturers.add(newManufacturer);
        System.out.println("\nManufacturers and Their Bicycles:");
        for (Manufacturer manufacturer : manufacturers) {
            System.out.println("Manufacturer Name: " + manufacturer.getName());
            System.out.println("Manufacturer Address: " + manufacturer.getAddress());
            System.out.println("Manufacturer Contact Info: " + manufacturer.getContactInfo());
            System.out.println("-------------");


        }
    }
}



