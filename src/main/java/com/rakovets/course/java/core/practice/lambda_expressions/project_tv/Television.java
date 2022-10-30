package com.rakovets.course.java.core.practice.lambda_expressions.project_tv;

import java.util.Objects;

public class Television {
    private Manufacturer manufacturer;
    private String model;
    private int year;
    private int diagonal;
    private int price;

    public Television(Manufacturer manufacturer, String model, int year, int diagonal, int price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.year = year;
        this.diagonal = diagonal;
        this.price = price;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Television that = (Television) o;
        return year == that.year && diagonal == that.diagonal && price == that.price && manufacturer == that.manufacturer && Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, model, year, diagonal, price);
    }
}
