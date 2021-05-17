package com.rakovets.course.java.core.practice.lambda_expressions.tv;

public class TvModel {
    private String manufacture;
    private String model;
    private int yearIssue;
    private double diagonal;
    private double price;

    public TvModel(String manufacture, String model, int yearIssue, double diagonal, double price) {
        this.manufacture = manufacture;
        this.model = model;
        this.yearIssue = yearIssue;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getModel() {
        return model;
    }

    public int getYearIssue() {
        return yearIssue;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TV {"
                + "manufacture = " + getManufacture()
                + "\tmodel = " + getModel()
                + "\tyearIssue = " + getYearIssue()
                + "\tdiagonal = " + getDiagonal()
                + "\tprice = " + getPrice()
                + " }";
    }
}

