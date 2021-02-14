package com.rakovets.course.java.core.practice.lambda_expressions.TV;

public class TV {
    private final String manufacturer;
    private final String model;
    private final int year;
    private final int diagonal;
    private final double price;

    public TV(String manufacturer, String model, int year, int diagonal, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TV{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", diagonal=" + diagonal +
                ", price=" + price +
                '}';
    }
}
