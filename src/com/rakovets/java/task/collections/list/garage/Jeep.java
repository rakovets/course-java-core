package com.rakovets.java.task.collections.list.garage;

public class Jeep extends Car {
    public Jeep(String brand, String model, String color, int yearManufacture, int registrationNumber) {
        super(brand, model, color, yearManufacture, registrationNumber);
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Jeep{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearManufacture=" + yearManufacture +
                ", registrationNumber=" + registrationNumber +
                '}';
    }
}
