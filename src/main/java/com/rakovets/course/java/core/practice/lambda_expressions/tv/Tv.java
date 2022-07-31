package com.rakovets.course.java.core.practice.lambda_expressions.tv;

public class Tv {
    private final String manufacturer;
    private final String model;
    private final int year;
    private final double diagonal;
    private final double price;

    public Tv(String manufacturer, String model, int year, double diagonal, double price) {
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

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Tv{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", diagonal=" + diagonal +
                ", price=" + price +
                '}';
    }
}
