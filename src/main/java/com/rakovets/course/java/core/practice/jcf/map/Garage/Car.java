package com.rakovets.course.java.core.practice.jcf.map.Garage;

public abstract class Car {
    private final String brand;
    private final String model;
    private final String color;
    private final int yearManufacture;
    private final String registrationNumber;

    public Car(String brand, String model, String color, int yearManufacture, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearManufacture = yearManufacture;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return yearManufacture;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearManufacture=" + yearManufacture +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
