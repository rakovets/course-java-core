package com.rakovets.course.util.garage;

public class Car {
    String title;
    int yearOfProduce;
    long cost;
    String color;
    double engineVolume;

    public Car(String title, int yearOfProduce, long cost, String color, double engineVolume) {
        this.title = title;
        this.yearOfProduce = yearOfProduce;
        this.cost = cost;
        this.color = color;
        this.engineVolume = engineVolume;
    }

    @Override
    public String toString() {
        return "Car{" +
                "title='" + title + '\'' +
                ", yearOfProduce=" + yearOfProduce +
                ", cost=" + cost +
                ", color='" + color + '\'' +
                ", engineVolume=" + engineVolume +
                '}';
    }

    public int getYearOfProduce() {
        return yearOfProduce;
    }

    public long getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }

    public double getEngineVolume() {
        return engineVolume;
    }
}
