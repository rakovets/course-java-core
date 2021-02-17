package com.rakovets.course.java.core.practice.lambda_expressions;

public class TV {

    private String production;
    private String modelName;
    private int year;
    private double diagonal;
    private double price;

    public TV(String production, String modelName, int year, double diagonal, double price) {
        this.production = production;
        this.modelName = modelName;
        this.year = year;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getProduction() {
        return production;
    }

    public void setProduction(String production) {
        this.production = production;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
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
        return "TV{" +
                "production='" + production + '\'' +
                ", modelName='" + modelName + '\'' +
                ", year=" + year +
                ", diagonal=" + diagonal +
                ", price=" + price +
                '}';
    }
}
