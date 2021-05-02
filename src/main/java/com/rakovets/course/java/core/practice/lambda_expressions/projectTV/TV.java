package com.rakovets.course.java.core.practice.lambda_expressions.projectTV;

public class TV {
    private String manufacturer;
    private String modelName;
    private int year;
    private double diagonal;
    private double price;

    public TV (String manufacturer, String modelName, int year, double diagonal, double price) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.year = year;
        this.diagonal = diagonal;
        this.price = price;
    }

    @Override
    public String toString() {
        return manufacturer + ", model name: "
                + modelName + ", production year: "
                + year + ", diagonal: "
                + diagonal + ", price: "
                + price + "\n";
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYear() {
        return year;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public double getPrice() {
        return price;
    }
}
