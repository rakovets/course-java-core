package com.rakovets.course.java.core.practice.io.computer_repair_workshop;

import java.io.Serializable;

public class Computer implements Serializable {
    private final String producer;
    private final String model;
    private final int productionYear;
    private double price;

    public Computer(String producer, String model, int productionYear, double price) {
        this.producer = producer;
        this.model = model;
        this.productionYear = productionYear;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
