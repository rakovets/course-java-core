package com.rakovets.course.java.core.practice.jcf_map.garage;

public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private int yearManufacture;
    private String registrationNumber;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return yearManufacture == car.yearManufacture && brand.equals(car.brand) && model.equals(car.model)
                && color.equals(car.color) && registrationNumber.equals(car.registrationNumber);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearManufacture() {
        return yearManufacture;
    }
}
