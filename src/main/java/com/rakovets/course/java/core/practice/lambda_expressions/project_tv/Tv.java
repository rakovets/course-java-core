package com.rakovets.course.java.core.practice.lambda_expressions.project_tv;

public class Tv {
    private final String company;
    private final String model;
    private final int year;
    private final double diagonal;
    private final double price;

    public Tv(String company, String model, int year, double diagonal, double price) {
        this.company = company;
        this.model = model;
        this.year = year;
        this.diagonal = diagonal;
        this.price = price;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getCompany() {
        return company;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "TV{" + company + '\'' +
                ", model='" + model + '\'' +
                ", diagonale='" + diagonal + '\'' +
                '}';
    }
}
