package com.rakovets.course.util.tv;

public class TV {
    private String name;
    private int yearOfManufacture;
    private double cost;
    private double diagonal;
    private String manufacturer;

    public TV(String name, int yearOfManufacture, double cost, double diagonal, String manufacturer) {
        this.name = name;
        this.yearOfManufacture = yearOfManufacture;
        this.cost = cost;
        this.diagonal = diagonal;
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public double getCost() {
        return cost;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "TV{" +
                "name:'" + name + '\'' +
                ", yearOfManufacture:" + yearOfManufacture +
                ", cost:" + cost +
                ", diagonal:" + diagonal +
                ", manufacturer:'" + manufacturer + '\'' +
                '}';
    }
}
