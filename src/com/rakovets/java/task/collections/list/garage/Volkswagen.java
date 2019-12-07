package com.rakovets.java.task.collections.list.garage;

import java.util.Objects;

public class Volkswagen extends Car {
    private String volkswagenLogo;

    public Volkswagen(String brand, String model, String color, Integer yearManufacture, Integer registrationNumber, String volkswagenLogo) {
        super(brand, model, color, yearManufacture, registrationNumber);
        this.volkswagenLogo = volkswagenLogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Volkswagen that = (Volkswagen) o;
        return Objects.equals(volkswagenLogo, that.volkswagenLogo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), volkswagenLogo);
    }

    @Override
    public String toString() {
        return "Volkswagen{" +
                "volkswagenLogo='" + volkswagenLogo + '\'' +
                '}';
    }
}
