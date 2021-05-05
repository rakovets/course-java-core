package com.rakovets.course.java.core.practice.lambda_expressions;

public class Tv {
    private String producer;
    private String model;
    private int dateOfCreation;
    private int diagonal;
    private int price;

    public Tv(String producer, String model, int dateOfCreation, int diagonal, int price) {
        this.dateOfCreation = dateOfCreation;
        this.diagonal = diagonal;
        this.producer = producer;
        this.model = model;
        this.price = price;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public int getPrice() {
        return price;
    }

    public int getDateOfCreation() {
        return dateOfCreation;
    }

    public String getModel() {
        return model;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "producer is: " + producer + ". model: " + model + ". date of creatiom is: " + dateOfCreation + ". diagonal of TV is: "
                + diagonal + ". cost of TV is: " + price + "\n";
    }
}
