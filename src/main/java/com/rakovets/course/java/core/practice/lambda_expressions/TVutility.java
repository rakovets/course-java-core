package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TVutility {
    private List<TV> tvList;

    public TVutility(List<TV> tvList) {
        this.tvList = tvList;
    }

    public List<TV> getListOfDiagonal(int diagonal) {
        return tvList.stream()
                .filter(e -> e.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public List<TV> getListOfManufacturer(String manufacturer) {
        return tvList.stream()
                .filter(e -> e.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
    }

    public List<TV> getListOfYear(int year) {
        return tvList.stream()
                .filter(e -> e.getYear() >= year)
                .collect(Collectors.toList());
    }

    public List<TV> getListOfPrice(double minPrice, double maxPrice) {
        return tvList.stream()
                .filter(e -> e.getPrice() >= minPrice && e.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public List<TV> getSortUpListOfPrice() {
        return tvList.stream()
                .sorted(Comparator.comparing(TV::getPrice))
                .collect(Collectors.toList());
    }

    public List<TV> getSortDownListOfPrice() {
        return tvList.stream()
                .sorted(Comparator.comparing(TV::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public List<TV> getSortUpListOfDiagonal() {
        return tvList.stream()
                .sorted(Comparator.comparing(TV::getDiagonal))
                .collect(Collectors.toList());
    }

    public List<TV> getSortDownListOfDiagonal() {
        return tvList.stream()
                .sorted(Comparator.comparing(TV::getDiagonal).reversed())
                .collect(Collectors.toList());
    }
}
