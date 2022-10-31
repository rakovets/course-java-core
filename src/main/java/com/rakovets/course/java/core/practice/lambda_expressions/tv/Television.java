package com.rakovets.course.java.core.practice.lambda_expressions.tv;

public class Television {
    private String manufacturer;
    private String modelName;
    private int yearOfProduction;
    private double diagonal;
    private double price;

    public Television(String manufacturer, String modelName, int yearOfProduction, double diagonal, double price) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.yearOfProduction = yearOfProduction;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "{Manufacturer: " + getManufacturer() +
                ", model TV: " + getModelName() +
                ", year of production: " + getYearOfProduction() +
                ", diagonal: " + getDiagonal() +
                ", price: " + getPrice() +
                "}";
    }
}
