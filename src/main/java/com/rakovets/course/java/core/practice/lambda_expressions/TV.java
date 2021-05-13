package com.rakovets.course.java.core.practice.lambda_expressions;

public class TV {
    private String brand;
    private String model;
    private int yearOfIssuse;
    private int diagonal;
    private int price;

    public TV (String brand,String model,int yearOfIssuse,int diagonal,int price) {
        this.brand = brand;
        this.model = model;
        this.yearOfIssuse = yearOfIssuse;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfIssuse() {
        return yearOfIssuse;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TV: " + brand + ", model name: "
                + model + ", year of issuse: "
                + yearOfIssuse + ", diagonal: "
                + diagonal + ", price: "
                + price + "\n";
    }
}
