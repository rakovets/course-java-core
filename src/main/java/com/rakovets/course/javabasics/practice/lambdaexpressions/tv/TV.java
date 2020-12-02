package com.rakovets.course.javabasics.practice.lambdaexpressions.tv;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TV {
    private final String manufacturer;
    private final String modelName;
    private final Integer  yearOfIssue;
    private final Integer  diagonal;
    private final Double  price;

    public TV(String manufacturer, String modelName, Integer yearOfIssue, Integer diagonal, Double price) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.yearOfIssue = yearOfIssue;
        this.diagonal = diagonal;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getDiagonal() {
        return diagonal;
    }

    public Integer getYearOfIssue() {
        return yearOfIssue;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModelName() {
        return modelName;
    }

    @Override
    public String toString() {
        return "TV{" +
                "manufacturer='" + manufacturer + '\'' +
                ", modelName='" + modelName + '\'' +
                ", yearOfIssue=" + yearOfIssue +
                ", diagonal=" + diagonal +
                ", price=" + price +
                '}';
    }
}
