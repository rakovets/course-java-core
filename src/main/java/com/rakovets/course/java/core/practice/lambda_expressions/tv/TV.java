package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import java.util.Objects;

public class TV {
    private String manufacturer;
    private String modelName;
    private int year;
    private double diagonal;
    private double price;

    public TV(String manufacturer, String modelName, int year, double diagonal, double price) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.year = year;
        this.diagonal = diagonal;
        this.price = price;
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

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV that = (TV) o;
        return year == that.year && Double.compare(that.diagonal, diagonal) == 0 && Double.compare(that.price, price) == 0 && Objects.equals(manufacturer, that.manufacturer) && Objects.equals(modelName, that.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, modelName, year, diagonal, price);
    }

    @Override
    public String toString() {
        return "Manufacturer: " + manufacturer
                + ", model: " + modelName + ", year: " + year
                + ", diagonal: " + diagonal + ", price: " + price + ".";
    }
}
