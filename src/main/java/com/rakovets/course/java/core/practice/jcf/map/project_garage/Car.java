package com.rakovets.course.java.core.practice.jcf.map.project_garage;

import java.util.Objects;

public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private int yearManufacture;
    private String registrationNumber;

    public Car(String brand, String model, String color, int yearManufacture, String registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearManufacture = yearManufacture;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearManufacture == car.yearManufacture && Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(registrationNumber, car.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, yearManufacture, registrationNumber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearManufacture=" + yearManufacture +
                ", registrationNumber='" + registrationNumber + '\'' +
                '}' + "\n";
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return  model;
    }

    public String getColor() {
        return color;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
