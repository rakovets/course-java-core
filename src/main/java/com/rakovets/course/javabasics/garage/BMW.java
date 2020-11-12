package com.rakovets.course.javabasics.garage;

public class BMW extends Car{
    static final String brand = "BMW";

    public BMW(String model, String color, int yearManufacture, int registrationNumber) {
        super(brand, model, color, yearManufacture, registrationNumber);
    }
}
