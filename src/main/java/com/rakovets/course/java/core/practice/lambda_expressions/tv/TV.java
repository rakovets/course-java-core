package com.rakovets.course.java.core.practice.lambda_expressions.tv;

public class TV {
    private String manufacturer;
    private String model;
    private int year;
    private double diagonal;
    private int price;

    public TV(String manufacturer, String model, int year, double diagonal, int price) {
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

    public double getDiagonal() {
        return diagonal;
    }

    public int getPrice() {
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
