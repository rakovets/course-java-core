package com.rakovets.java.task.collections.list;

import java.util.Objects;

public class Bmw extends Car {
    private String petrolConsuming;

    public Bmw(String brand, String model, String color, Integer yearManufacture, Integer registrationNumber, String petrolConsuming) {
        super(brand, model, color, yearManufacture, registrationNumber);
        this.petrolConsuming = petrolConsuming;
    }

    public String getPetrolConsuming() {
        return petrolConsuming;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Bmw bmw = (Bmw) o;
        return Objects.equals(petrolConsuming, bmw.petrolConsuming);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), petrolConsuming);
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "petrolConsuming='" + petrolConsuming + '\'' +
                '}';
    }
}
