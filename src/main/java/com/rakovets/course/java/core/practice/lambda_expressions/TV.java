package com.rakovets.course.java.core.practice.lambda_expressions;

import java.time.LocalDate;

public class TV {
    private String manufacturer;
    private String model;
    private LocalDate year;
    private int diagonalSize;
    private double price;

    public TV(String manufacturer, String model, LocalDate year, int diagonalSize, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.diagonalSize = diagonalSize;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public int getDiagonalSize() {
        return diagonalSize;
    }

    public void setDiagonalSize(int diagonalSize) {
        this.diagonalSize = diagonalSize;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TV{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", diagonalSize=" + diagonalSize +
                ", price=" + price +
                '}';
    }

}
