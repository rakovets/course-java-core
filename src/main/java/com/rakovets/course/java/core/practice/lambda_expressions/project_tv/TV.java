package com.rakovets.course.java.core.practice.lambda_expressions.project_tv;

public class TV {
    private String manufacturer;
    private String model;
    private int yearOfIssue;
    private double diagonal;
    private double price;

    public TV(String manufacturer, String model, int yearOfIssue, double diagonal, double price) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfIssue = yearOfIssue;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public double getDiagonal() {
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
                ", yearOfIssue=" + yearOfIssue +
                ", diagonal=" + diagonal +
                ", price=" + price +
                '}';
    }
}
