package com.rakovets.course.java.core.practice.jcf.map.garage;

import java.util.Objects;

public abstract class Car {
    private final String brand;
    private final String model;
    private String color;
    private final int yearManufacture;
    private final int registrationNumber;

    public Car(String brand, String model, String color, int yearManufacture, int registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearManufacture = yearManufacture;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return getYearManufacture() == car.getYearManufacture() &&
               getRegistrationNumber() == car.getRegistrationNumber() &&
               getBrand().equals(car.getBrand()) &&
               getModel().equals(car.getModel()) &&
               getColor().equals(car.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getModel(), getColor(), getYearManufacture(), getRegistrationNumber());
    }

    @Override
    public String toString() {
        return '\'' + brand + '\'' +
                ", model: '" + model + '\'' +
                ", color: " + color +
                ", yearManufacture: " + yearManufacture +
                ", registrationNumber: " + registrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
