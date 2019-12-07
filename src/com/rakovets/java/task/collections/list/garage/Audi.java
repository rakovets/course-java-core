package com.rakovets.java.task.collections.list.garage;

import java.util.Objects;

public class Audi extends Car {
    private String audiLogo;

    public Audi(String brand, String model, String color, Integer yearManufacture, Integer registrationNumber, String audiLogo) {
        super(brand, model, color, yearManufacture, registrationNumber);
        this.audiLogo = audiLogo;
    }

    public String getAudiLogo() {
        return audiLogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Audi audi = (Audi) o;
        return Objects.equals(audiLogo, audi.audiLogo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), audiLogo);
    }

    @Override
    public String toString() {
        return "Audi{" +
                "audiLogo='" + audiLogo + '\'' +
                '}';
    }
}
