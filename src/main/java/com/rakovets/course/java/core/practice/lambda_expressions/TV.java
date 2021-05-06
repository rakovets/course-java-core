package com.rakovets.course.java.core.practice.lambda_expressions;

public class TV {
    private final String company;
    private final String model;
    private final int year;
    private final double diagonal;
    private final double price;

    public TV(String company, String model, int year, double diagonal, double price) {
        this.company = company;
        this.model = model;
        this.year = year;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TV{" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
