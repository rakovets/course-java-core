package com.rakovets.course.java.core.practice.lambda_expressions;

public class Tv {
    private String brand;
    private String model;
    private int yearOfProduction;
    private double screenSize;
    private double price;

    public Tv(String brand, String model, int yearOfProduction, double screenSize, double price) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.screenSize = screenSize;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "model='" + model + '\'' +
                '}';
    }
}
