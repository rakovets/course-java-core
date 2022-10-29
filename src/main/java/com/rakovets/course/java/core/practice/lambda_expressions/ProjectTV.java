package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectTV {
    private List<TV> listTV;

    public ProjectTV(List<TV> listTV) {
        this.listTV = listTV;
    }

    public List<TV> getTVWithGivenDiagonal(List<TV> listTV, int diagonal) {
        return listTV.stream()
                .filter((x) -> x.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public List<TV> getTVSomeManufacturer(List<TV> listTV, String manufacturer) {
        return listTV.stream()
                .filter((x) -> x.getManufacturer() == manufacturer)
                .collect(Collectors.toList());
    }

    public List<TV> getTVNotOlderYear(List<TV> listTV, int year) {
        return listTV.stream()
                .filter((x) -> x.getYearOfIssue() >= year)
                .collect(Collectors.toList());
    }

    public List<TV> getTVWithPriceRange(List<TV> listTV, int minPrice, int maxPrice) {
        return listTV.stream()
                .filter((x) -> x.getPrice() >= minPrice && x.getPrice() <= maxPrice)
                .collect(Collectors.toList());
    }

    public List<TV> getTVSortedByPriceAscending(List<TV> listTV) {
        return listTV.stream()
                .sorted(Comparator.comparingInt(TV::getPrice))
                .collect(Collectors.toList());
    }

    public List<TV> getTVSortedByPriceDescending(List<TV> listTV) {
        return listTV.stream()
                .sorted(Comparator.comparingInt(TV::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public List<TV> getTVSortedByDiagonalAscending(List<TV> listTV) {
        return listTV.stream()
                .sorted(Comparator.comparingInt(TV::getDiagonal))
                .collect(Collectors.toList());
    }

    public List<TV> getTVSortedByDiagonalDescending(List<TV> listTV) {
        return listTV.stream()
                .sorted(Comparator.comparingInt(TV::getDiagonal).reversed())
                .collect(Collectors.toList());
    }
}
