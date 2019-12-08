package com.rakovets.java.task.collections.list.garage;

import java.util.Objects;

public abstract class Car {
    String brand;
    String model;
    String color;
    int yearManufacture;
    int registrationNumber;

    public Car(String brand, String model, String color, int yearManufacture, int registrationNumber) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearManufacture = yearManufacture;
        this.registrationNumber = registrationNumber;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearManufacture == car.yearManufacture &&
                registrationNumber == car.registrationNumber &&
                Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, yearManufacture, registrationNumber);
    }
}
