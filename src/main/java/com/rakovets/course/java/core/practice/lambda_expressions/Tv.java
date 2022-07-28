package com.rakovets.course.java.core.practice.lambda_expressions;

public class Tv {
    private final String manufacturer;
    private final String model;
    private final int yearOfProduction;
    private final float diagonal;
    private final float price;

    public Tv(String manufacturer, String model, int yearOfIssue, int diagonal, float price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfProduction = yearOfIssue;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public float getDiagonal() {
        return diagonal;
    }

    public float getPrice() {
        return price;
    }
}
