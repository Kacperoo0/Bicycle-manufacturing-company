package com.company.models;

public class Bicycle {
    private  String model;
    private  double price;
    private  String color;
    private  String size;

    public Bicycle(String model, double price, String color, String size) {
        if (model == null || color == null || size == null || model.isEmpty() || color.isEmpty() || size.isEmpty() || price < 0) {
            throw new IllegalArgumentException("Invalid input for Bicycle");
        }
        this.model = model;
        this.price = price;
        this.color = color;
        this.size = size;
    }

    public  String getModel() {
        return model;
    }

    public  double getPrice() {
        return price;
    }

    public  String getColor() {
        return color;
    }

    public  String getSize() {
        return size;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bicycle{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                '}';
    }
}