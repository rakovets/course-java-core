package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import java.util.Objects;

public class Television {
    private final String manufacturer;
    private final String modelName;
    private final int yearOfIssue;
    private final double diagonal;
    private final double price;

    public Television(String manufacturer, String modelName, int yearOfIssue, double diagonal, double price) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.yearOfIssue = yearOfIssue;
        this.diagonal = diagonal;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Television that = (Television) o;
        return yearOfIssue == that.yearOfIssue && Double.compare(that.diagonal, diagonal) == 0 && Double.compare(that.price, price) == 0 && Objects.equals(manufacturer, that.manufacturer) && Objects.equals(modelName, that.modelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manufacturer, modelName, yearOfIssue, diagonal, price);
    }

    @Override
    public String toString() {
        return "Television{" +
                "manufacturer='" + manufacturer + '\'' +
                ", modelName='" + modelName + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", diagonal=" + diagonal +
                ", price=" + price +
                '}';
    }
}
