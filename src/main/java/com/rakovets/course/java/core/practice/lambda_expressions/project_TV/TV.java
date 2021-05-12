package com.rakovets.course.java.core.practice.lambda_expressions.project_TV;

public class TV {
    private final String producer;
    private final String model;
    private final int year;
    private final int diagonal;
    private final double price;

    public TV(String producer, String model, int year, int diagonal, double price) {
        this.producer = producer;
        this.model = model;
        this.year = year;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getProducer() {
        return producer;
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

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TV{" +
                "producer = '" + producer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", diagonal=" + diagonal +
                ", price=" + price +
                '\n' + '}';
    }
}
