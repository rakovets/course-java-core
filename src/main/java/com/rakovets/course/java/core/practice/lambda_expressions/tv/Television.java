package com.rakovets.course.java.core.practice.lambda_expressions.tv;

public class Television {
    private String company;
    private String model;
    private int year;
    private int diagonal;
    private int price;

    public Television(String company, String model, int year,int diagonal, int price) {
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

    public int getDiagonal() {
        return diagonal;
    }

    public int getPrice() {
        return price;
    }
}
