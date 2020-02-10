package com.rakovets.course.util.garage;

public class Car {
    private String name;
    private int yearOfCarManufacture;
    private String color;
    private double cost;
    private double engineCapacity;


    public Car(String name, int yearOfCarManufacture, String color, double cost, double engineCapacity) {
        this.name = name;
        this.yearOfCarManufacture = yearOfCarManufacture;
        this.color = color;
        this.cost = cost;
        this.engineCapacity = engineCapacity;
    }

    public String getName() {
        return name;
    }

    public int getYearOfCarManufacture() {
        return yearOfCarManufacture;
    }

    public String getColor() {
        return color;
    }

    public double getCost() {
        return cost;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name: '" + name + '\'' +
                ", yearOfCarManufacture: " + yearOfCarManufacture +
                ", color: '" + color + '\'' +
                ", cost: " + cost +
                ", engineCapacity: " + engineCapacity +
                '}';
    }
}
