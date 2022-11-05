package com.rakovets.course.java.core.practice.lambda_expressions.tv;

public class Televisor {
    private String manufacturer;
    private String modelName;
    private int yearOfIssue;
    private double diagonal;
    private double price;

    public Televisor(String manufacturer, String modelName, int yearOfIssue, double diagonal, double price) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.yearOfIssue = yearOfIssue;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Televisor{" +
                "manufacturer='" + manufacturer + '\'' +
                ", modelName='" + modelName + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", diagonal=" + diagonal +
                ", price=" + price +
                '}';
    }
}
