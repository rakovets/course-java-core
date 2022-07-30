package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import java.util.Objects;

public class Tv {
    private final String manufacturer;
    private final String name;
    private final int year;
    private final double price;
    private final double diagonal;

    public Tv(String manufacturer, String name, int year, double price, double diagonal) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.year = year;
        this.price = price;
        this.diagonal = diagonal;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }

    public double getDiagonal() {
        return diagonal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tv tv = (Tv) o;

        return year == tv.year && Double.compare(tv.price, price) == 0 && Double.compare(tv.diagonal, diagonal) == 0
                && manufacturer.equals(tv.manufacturer) && name.equals(tv.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, name, year, price, diagonal);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "manufacturer='" + manufacturer + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", diagonal=" + diagonal +
                '}';
    }
}
