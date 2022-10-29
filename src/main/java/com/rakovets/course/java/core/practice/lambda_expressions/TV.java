package com.rakovets.course.java.core.practice.lambda_expressions;

public class TV {
    private String manufacturer;
    private String modelName;
    private int yearOfIssue;
    private int diagonal;
    private int price;

    public TV(String manufacturer, String modelName, int yearOfIssue, int diagonal, int price) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.yearOfIssue = yearOfIssue;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TV{" +
                "Manufacturer='" + manufacturer + '\'' +
                ", Model='" + modelName + '\'' +
                ", Year of issue=" + yearOfIssue +
                ", display diagonal=" + diagonal +
                ", price=" + price +
                '}';
    }
}
