package com.rakovets.course.util.tv;

public class Television {
    String model;
    int yearOfProduction;
    int cost;
    double diagonal;
    String producer;

    public Television(String model, int yearOfProduction, int cost, double diagonal, String producer) {
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.cost = cost;
        this.diagonal = diagonal;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Television{" +
                "model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", cost=" + cost +
                ", diagonal=" + diagonal +
                ", producer='" + producer + '\'' +
                '}';
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getCost() {
        return cost;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getProducer() {
        return producer;
    }
}
