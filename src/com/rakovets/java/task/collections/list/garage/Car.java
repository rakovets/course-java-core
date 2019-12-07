package com.rakovets.java.task.collections.list.garage;

import java.util.Objects;

public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private Integer yearManufacture;
    private Integer registrationNumber;

    public Car(String brand, String model, String color, Integer yearManufacture, Integer registrationNumber) {
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

    public Integer getYearManufacture() {
        return yearManufacture;
    }

    public Integer getRegistrationNumber() {
        return registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color) &&
                Objects.equals(yearManufacture, car.yearManufacture) &&
                Objects.equals(registrationNumber, car.registrationNumber);
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
                ", registrationNumber=" + registrationNumber +
                '}';
    }
}
