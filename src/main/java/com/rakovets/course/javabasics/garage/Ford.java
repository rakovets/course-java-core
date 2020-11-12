package com.rakovets.course.javabasics.garage;

public class Ford extends Car{

    static final String brand = "Ford";

    public Ford(String model, String color, int yearManufacture, int registrationNumber) {
        super(brand, model, color, yearManufacture, registrationNumber);
    }
}
