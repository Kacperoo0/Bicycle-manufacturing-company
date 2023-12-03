package com.company.main;

import com.company.models.Bicycle;
import com.company.models.Customers;
import com.company.models.ElectricBicycle;
import com.company.models.Manufacturer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    static List<Bicycle> bicycles = new ArrayList<>();
    static List<Manufacturer> manufacturers = new ArrayList<>();

    static List<Customers> customers = new ArrayList<>();
    public static void main(String[] args) {

        bicycles = initializeBicycles();
        manufacturers = initializeManufacturers();

        Scanner scanner = new Scanner(System.in);


        Bicycle bicycle = new Bicycle("Bike", 600.0, "Blue", "Medium", 1);
        Bicycle bicycle1 = new Bicycle("Bike1", 700.0, "Purple", "Medium",2);
        Bicycle bicycle2 = new Bicycle("Bike2", 900.0, "Green", "Medium",3);
        Bicycle mountainBike = new Bicycle("Mountain Bike", 500.0, "Red", "Large",4);
        ElectricBicycle electricBike = new ElectricBicycle("E-Bike", 1200.0, "Black", "Medium",5, 500);
        ElectricBicycle electricBicycle = new ElectricBicycle("E-Bike", 1200.0, "Black", "Medium", 6, 500);

        bicycles.add(mountainBike);
        bicycles.add(bicycle1);
        bicycles.add(bicycle2);
        bicycles.add(new Bicycle("Road Bike", 700.0, "Blue", "Medium", 7));
        bicycles.add(electricBike);


        Manufacturer abcBikes = new Manufacturer("ABC Bikes", "123 Main St", "123-456-7890");
        Manufacturer xyzCycles = new Manufacturer("XYZ Cycles", "456 Oak St", "987-654-3210");

        manufacturers.add(abcBikes);
        manufacturers.add(xyzCycles);

//        System.out.println("===================================================");
//        System.out.println("Bicycles:");
//        for (Bicycle bike : bicycles) {
//            System.out.println(bike.toString());
//        }
//        System.out.println("===================================================");
//        System.out.println("\nManufacturers:");
//        for (Manufacturer manufacturer : manufacturers) {
//            System.out.println(manufacturer.toString());
//        }
//
//        System.out.println("===================================================");
//        System.out.println("Bicycle Details:");
//        System.out.println("Model: " + bicycle.getModel());
//        System.out.println("Price: $" + bicycle.getPrice());
//        System.out.println("Color: " + bicycle.getColor());
//        System.out.println("Size: " + bicycle.getSize());
//
//        System.out.println("===================================================");
//        System.out.println("Electric Bicycle Details:");
//        System.out.println("Model: " + electricBicycle.getModel());
//        System.out.println("Price: $" + electricBicycle.getPrice());
//        System.out.println("Color: " + electricBicycle.getColor());
//        System.out.println("Size: " + electricBicycle.getSize());
//        System.out.println("Battery Capacity: " + electricBicycle.getBatteryCapacity() + " Wh");
//
//
//        System.out.println("===================================================");
//        abcBikes.addBicycle(mountainBike);
//        abcBikes.addBicycle(electricBike);
//        abcBikes.addBicycle(electricBike);
//        abcBikes.removeBicycle(electricBike);
//        abcBikes.removeBicycle(electricBike);

//        System.out.println("===================================================");
//        System.out.println("\nUpdated Manufacturer (ABC Bikes):");
//        System.out.println(abcBikes);
//
//
//        System.out.println("===================================================");
//        System.out.println("\nTotal Bicycles Produced: " + Manufacturer.getTotalBicyclesProduced());
//        Manufacturer.setTotalBicyclesProduced(50);
//
//        int totalProduced = Manufacturer.getTotalBicyclesProduced();
//        System.out.println("Updated Total Bicycles Produced: " + totalProduced);
//
//        electricBicycle.setBatteryCapacity(600);
//
//        System.out.println("===================================================");
//        System.out.println("\nElectric Bicycle Details:");
//        System.out.println("Model: " + electricBicycle.getModel());
//        System.out.println("Price: $" + electricBicycle.getPrice());
//        System.out.println("Color: " + electricBicycle.getColor());
//        System.out.println("Size: " + electricBicycle.getSize());
//        System.out.println("Battery Capacity: " + electricBicycle.getBatteryCapacity() + " Wh");

//        System.out.println("===================================================");
//        System.out.println("\nEnter details for a new Bicycle:");
//
//        System.out.print("Enter model: ");
//        String newModel = scanner.nextLine();
//        System.out.print("Enter price: ");
//        double newPrice = scanner.nextDouble();
//        scanner.nextLine();
//        System.out.print("Enter color: ");
//        String newColor = scanner.nextLine();
//        System.out.print("Enter size: ");
//        String newSize = scanner.nextLine();
//        System.out.print("Enter number: ");
//        int newNumber = scanner.nextInt();
//        Bicycle newBicycle = new Bicycle(newModel, newPrice, newColor, newSize, newNumber);
//        bicycles.add(newBicycle);
//
//        System.out.println("\nBicycles Details");
//        for (Bicycle bike : bicycles) {
//            System.out.println("Model: " + bike.getModel());
//            System.out.println("Price: $" + bike.getPrice());
//            System.out.println("Color: " + bike.getColor());
//            System.out.println("Size: " + bike.getSize());
//            System.out.println("-------------");
//        }

//        System.out.println("===================================================");
//        System.out.print("Enter manufacturer name: ");
//        String manufacturerName = scanner.nextLine();
//        System.out.print("Enter manufacturer address: ");
//        String manufacturerAddress = scanner.nextLine();
//        System.out.print("Enter manufacturer contact info: ");
//        String manufacturerContactInfo = scanner.nextLine();
//        Manufacturer newManufacturer = new Manufacturer(manufacturerName, manufacturerAddress, manufacturerContactInfo);
//        manufacturers.add(newManufacturer);
//        System.out.println("\nManufacturers and Their Bicycles:");
//        for (Manufacturer manufacturer : manufacturers) {
//            System.out.println("Manufacturer Name: " + manufacturer.getName());
//            System.out.println("Manufacturer Address: " + manufacturer.getAddress());
//            System.out.println("Manufacturer Contact Info: " + manufacturer.getContactInfo());
//            System.out.println("-------------");
//
//            List<Bicycle> inventory = manufacturer.getInventory();
//            for (Bicycle bike : inventory) {
//                System.out.println("Model: " + bike.getModel());
//                System.out.println("Price: $" + bike.getPrice());
//                System.out.println("Color: " + bike.getColor());
//                System.out.println("Size: " + bike.getSize());
//
//                if (bike instanceof ElectricBicycle electricBicycle1) {
//                    System.out.println("Battery Capacity: " + electricBicycle1.getBatteryCapacity() + " Wh");
//                }
//
//                System.out.println("-------------");
//            }
//
//
//        }


//        Scanner scanners = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Wyświetl listę wszystkich dostępnych rowerów");
            System.out.println("2. Wyświetl listę wszystkich producentów");
            System.out.println("3. Stwórz własny rower");
            System.out.println("4. Rezerwuj rower");
            System.out.println("5. Stwórz konto");
            System.out.println("6. Zakończ");

            System.out.print("Wybierz opcję: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    displayAllBicycles();
                    break;
                case 2:
                    displayAllManufacturers();
                    break;
                case 3:
                    createCustomBicycle();
                    break;
                case 4:
                    reserveBicycle();
                    break;
                case 5:
                    createCustomerAccount();
                    break;
                case 6:
                    System.out.println("Program zakończony.");
                    break;
                default:
                    System.out.println("Niepoprawny wybór. Wybierz ponownie.");
            }
        } while (choice != 6);
    }

    private static void reserveBicycle() {
        displayAllBicycles();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj numer roweru do zarezerwowania: ");
        int bicycleNumber = scanner.nextInt();

        Iterator<Bicycle> iterator = bicycles.iterator();
        while (iterator.hasNext()) {
            Bicycle bicycle = iterator.next();
            if (bicycle.getNumber() == bicycleNumber) {
                iterator.remove();
                System.out.println("Rower został zarezerwowany: " + bicycle);
                return;
            }
        }

        System.out.println("Nie znaleziono roweru o numerze " + bicycleNumber);
    }


    private static void displayAllBicycles() {
        System.out.println("\nLista wszystkich dostępnych rowerów:");
        for (Bicycle bicycle : bicycles) {
            System.out.println(bicycle);
        }
    }

    private static void displayAllManufacturers() {
        System.out.println("\nLista wszystkich producentów:");
        for (Manufacturer manufacturer : manufacturers) {
            System.out.println(manufacturer);
        }
    }

    private static void createCustomBicycle() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Tworzenie własnego roweru:");
        System.out.print("Podaj model roweru: ");
        String model = scanner.nextLine();

        System.out.print("Podaj cenę roweru: ");
        double price = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Podaj kolor roweru: ");
        String color = scanner.nextLine();

        System.out.print("Podaj rozmiar roweru: ");
        String size = scanner.nextLine();

        System.out.print("Podaj numer roweru: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Czy to rower elektryczny? (Tak/Nie): ");
        boolean isElectric = scanner.nextLine().equalsIgnoreCase("Tak");


        Bicycle newBicycle;
        if (isElectric) {
            System.out.print("Podaj pojemność baterii roweru elektrycznego: ");
            int batteryCapacity = scanner.nextInt();
            newBicycle = new ElectricBicycle(model, price, color, size, number,batteryCapacity);
        } else {
            newBicycle = new Bicycle(model, price, color, size, number);
        }


        bicycles.add(newBicycle);

        System.out.println("Nowy rower został dodany: " + newBicycle);
    }

    public static void createCustomerAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj swoje imie: ");
        String firstName = scanner.next();

        System.out.print("Podaj swoje nazwisko: ");
        String lastName = scanner.next();

        System.out.print("Podaj swoj adress: ");
        String address = scanner.next();

        System.out.print("Podaj preferowana metode kontaktu: ");
        String contactInfo = scanner.next();

        Customers newCustomer = new Customers(firstName, lastName, address, contactInfo);
        customers.add(newCustomer);
        System.out.println("Konto stworzone pomyslnie.");
    }

    private static List<Bicycle> initializeBicycles() {
        List<Bicycle> bicycles = new ArrayList<>();
        bicycles.add(new Bicycle("Model A", 300, "Blue", "M",8));
        bicycles.add(new Bicycle("Model B", 400, "Red", "L",9));
        bicycles.add(new Bicycle("Mountain Bike", 600, "Green", "L",10));
        bicycles.add(new Bicycle("Road Bike", 800, "Black", "M",11));
        bicycles.add(new Bicycle("City Bike", 500, "Silver", "S",12));
        bicycles.add(new Bicycle("Hybrid Bike", 700, "Blue", "XL",13));
        bicycles.add(new ElectricBicycle("Electric Commuter", 1200, "White", "M", 14,500));
        return bicycles;
    }

    private static List<Manufacturer> initializeManufacturers() {
        List<Manufacturer> manufacturers = new ArrayList<>();
        manufacturers.add(new Manufacturer("Manufacturer A", "Address A", "Contact A"));
        manufacturers.add(new Manufacturer("Manufacturer B", "Address B", "Contact B"));
        manufacturers.add(new Manufacturer("ABC Bikes", "123 Main St", "123-456-7890"));
        manufacturers.add(new Manufacturer("XYZ Cycles", "456 Oak St", "987-654-3210"));
        manufacturers.add(new Manufacturer("Swift Bicycles", "789 Maple St", "555-123-4567"));
        manufacturers.add(new Manufacturer("City Bikes Co.", "321 Pine St", "888-777-9999"));
        manufacturers.add(new Manufacturer("ElectroBike", "555 Elm St", "111-222-3333"));

        return manufacturers;
    }
        }





