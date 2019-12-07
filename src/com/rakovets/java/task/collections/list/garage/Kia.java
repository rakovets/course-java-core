package com.rakovets.java.task.collections.list.garage;

import java.util.Objects;

public class Kia extends Car {
    private String kiaLogo;

    public Kia(String brand, String model, String color, Integer yearManufacture, Integer registrationNumber, String kiaLogo) {
        super(brand, model, color, yearManufacture, registrationNumber);
        this.kiaLogo = kiaLogo;
    }

    public String getKiaLogo() {
        return kiaLogo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Kia kia = (Kia) o;
        return Objects.equals(kiaLogo, kia.kiaLogo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), kiaLogo);
    }

    @Override
    public String toString() {
        return "Kia{" +
                "kiaLogo='" + kiaLogo + '\'' +
                '}';
    }
}
