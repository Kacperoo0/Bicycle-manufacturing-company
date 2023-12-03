package com.company.models;

import java.util.ArrayList;
import java.util.List;

public class Manufacturer {
    private String name;
    private String address;
    private String contactInfo;
    private List<Bicycle> inventory;

//    private static int totalBicyclesProduced;

    public Manufacturer(String name, String address, String contactInfo) {
        if (name == null || address == null || contactInfo == null || name.isEmpty() || address.isEmpty() || contactInfo.isEmpty()) {
            throw new IllegalArgumentException("Niepoprawne dane");
        }
        this.name = name;
        this.address = address;
        this.contactInfo = contactInfo;
        this.inventory = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public List<Bicycle> getInventory() {
        return inventory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contactInfo='" + contactInfo + '\'' +
                '}';
    }

//    public static void setTotalBicyclesProduced(int newValue) {
//        totalBicyclesProduced = newValue;
//    }
//
//    public void addBicycle(Bicycle bicycle) {
//        if (!inventory.contains(bicycle)) {
//            inventory.add(bicycle);
//            totalBicyclesProduced++;
//            System.out.println("Added bicycle to inventory: " + bicycle.toString());
//        } else {
//            System.out.println("Bicycle is already in inventory: " + bicycle.toString());
//        }
//    }
//
//    public void removeBicycle(Bicycle bicycle) {
//        if (inventory.contains(bicycle)) {
//            inventory.remove(bicycle);
//            totalBicyclesProduced--;
//            System.out.println("Removed bicycle from inventory: " + bicycle.toString());
//        } else {
//            System.out.println("Bicycle not found in inventory: " + bicycle.toString());
//        }
//    }
//
//    public void reserveAndRemoveBicycle(String modelToReserve) {
//        Iterator<Bicycle> iterator = inventory.iterator();
//        while (iterator.hasNext()) {
//            Bicycle bike = iterator.next();
//            if (bike.getModel().equalsIgnoreCase(modelToReserve)) {
//                System.out.println("Bicycle reserved: " + bike.getModel());
//                iterator.remove();
//                return;
//            }
//        }
//        System.out.println("Bicycle not found: " + modelToReserve);
//    }
//
//
//    public static int getTotalBicyclesProduced() {
//        return totalBicyclesProduced;
//    }
}