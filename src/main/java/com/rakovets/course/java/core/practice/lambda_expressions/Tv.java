package com.rakovets.course.java.core.practice.lambda_expressions;

public class Tv {
    private final String manufacturer;
    private final String model;
    private final int yearOfManufacture;
    private final double displaySize;
    private final double price;

    public Tv(String manufacturer, String model, int yearOfManufacture, double displaySize, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
        this.displaySize = displaySize;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getDisplaySize() {
        return displaySize;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TV{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                ", displaySize=" + displaySize +
                ", price=" + price +
                '}';
    }
}
