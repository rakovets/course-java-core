package com.rakovets.course.java.core.practice.lambda_expressions.project_tv;

public class TVitem {
    private final String brand;
    private final String model;
    private final int year;
    private final int diagonal;
    private final int price;

    public TVitem(String brand, String model, int year, int diagonal, int price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getBrand() {
        return brand;
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

    @Override
    public String toString() {
        return "\n" + "TVitem{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", diagonal=" + diagonal +
                ", price=" + price +
                '}';
    }
}
