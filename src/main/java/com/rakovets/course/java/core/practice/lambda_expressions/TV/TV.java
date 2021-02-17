package com.rakovets.course.java.core.practice.lambda_expressions.TV;

public class TV {
    private final String producer;
    private final String model;
    private final int productionYear;
    private final double diagonal;
    private double price;

    public TV(String producer, String model, int productionYear, double diagonal, double price) {
        this.producer = producer;
        this.model = model;
        this.productionYear = productionYear;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "TV: " + producer + ", model: " + model + ", productionYear: " + productionYear +
                ", diagonal: " + diagonal + ", price: " + price;
    }
}
