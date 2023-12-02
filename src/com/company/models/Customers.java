package com.company.models;

import java.util.List;

public class Customers {
    private String firstName;
    private String lastName;
    private String address;
    private String contactInfo;
    private List<Bicycle> purchasedBicycles;

    public Customers(String firstName, String lastName, String address, String contactInfo, List<Bicycle> purchasedBicycles) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactInfo = contactInfo;
        this.purchasedBicycles = purchasedBicycles;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public List<Bicycle> getPurchasedBicycles() {
        return purchasedBicycles;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setPurchasedBicycles(List<Bicycle> purchasedBicycles) {
        this.purchasedBicycles = purchasedBicycles;
    }

    public void addPurchasedBicycle(Bicycle bicycle) {
        purchasedBicycles.add(bicycle);
    }
}