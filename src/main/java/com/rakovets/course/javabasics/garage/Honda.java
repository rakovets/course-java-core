package com.rakovets.course.javabasics.garage;

public class Honda extends Car{
    static final String brand = "Honda";
    public Honda(String model, String color, int yearManufacture, int registrationNumber) {
        super(brand, model, color, yearManufacture, registrationNumber);
    }
}
