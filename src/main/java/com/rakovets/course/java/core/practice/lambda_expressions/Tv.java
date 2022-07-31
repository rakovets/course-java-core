package com.rakovets.course.java.core.practice.lambda_expressions;

import java.math.BigDecimal;

public class Tv {
    private final String manufacturer;
    private final String model;
    private final int yearOfProduction;
    private final double diagonal;
    private final BigDecimal price;

    public Tv(String manufacturer, String model, int yearOfIssue, double diagonal, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfProduction = yearOfIssue;
        this.diagonal = diagonal;
        this.price = new BigDecimal(price);
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

    public double getDiagonal() {
        return diagonal;
    }

    public double getPrice() {
        return price.doubleValue();
    }
}
