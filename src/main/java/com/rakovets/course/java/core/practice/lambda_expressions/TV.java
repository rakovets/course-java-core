package com.rakovets.course.java.core.practice.lambda_expressions;

public class TV {
    private String manufacture;
    private String modelName;
    private int yearsOfIssue;
    private double diagonal;
    private double price;

    public TV(String manufacture, String modelName, int yearsOfIssue, double diagonal, double price) {
        this.manufacture = manufacture;
        this.modelName = modelName;
        this.yearsOfIssue = yearsOfIssue;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYearsOfIssue() {
        return yearsOfIssue;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public double getPrice() {
        return price;
    }
}
