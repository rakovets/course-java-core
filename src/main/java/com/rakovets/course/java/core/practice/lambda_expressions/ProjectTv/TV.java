package com.rakovets.course.java.core.practice.lambda_expressions.ProjectTv;

import java.util.Objects;

public class TV {
    private final String manufacturer;
    private final String model;
    private final int year;
    private final double diagonal;
    private final double price;

    public TV(String manufacturer, String model, int year, double diagonal, double price) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return year == tv.year && Double.compare(tv.diagonal, diagonal) == 0 && Double.compare(tv.price, price) == 0 && Objects.equals(manufacturer, tv.manufacturer) && Objects.equals(model, tv.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, year, diagonal, price);
    }

    @Override
    public String toString() {
        return "TV{" + "manufacturer: " + manufacturer + ", " + "model: " + model + "," +
                "year: " + year + "," + "diagonal: " + diagonal + "," + "price: " + price + "}";
    }
}
