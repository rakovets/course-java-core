package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectTV {
    List<Television> tv;

    public ProjectTV(List<Television> tv) {
        this.tv = tv;
    }

    public List<Television> getListDiagonal(double diagonal) {
        return tv.stream()
                .filter(television -> television.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public List<Television> getListManufacturer(String manufacturer) {
        return tv.stream()
                .filter(television -> television.getManufacturer() == manufacturer)
                .collect(Collectors.toList());
    }

    public List<Television> getListLessThanYear(int yearOfIssue) {
        return tv.stream()
                .filter(television -> television.getYearOfIssue() < yearOfIssue)
                .collect(Collectors.toList());
    }

    public List<Television> getListPriceRange(double priceFrom, double priceTo) {
        return tv.stream()
                .filter(television -> television.getPrice() > priceFrom && television.getPrice() < priceTo)
                .collect(Collectors.toList());
    }

    public List<Television> getListSortedByPriceAscending() {
        return tv.stream()
                .sorted(Comparator.comparingDouble(Television::getPrice))
                .collect(Collectors.toList());
    }

    public List<Television> getListSortedByPriceDescending() {
        return tv.stream()
                .sorted((a, b) -> Double.compare(b.getPrice(), a.getPrice()))
                .collect(Collectors.toList());
    }

    public List<Television> getListSortedByDiagonalAscending() {
        return tv.stream()
                .sorted(Comparator.comparingDouble(Television::getDiagonal))
                .collect(Collectors.toList());
    }

    public List<Television> getListSortedByDiagonalDescending() {
        return tv.stream()
                .sorted((a, b) -> Double.compare(b.getDiagonal(), a.getDiagonal()))
                .collect(Collectors.toList());
    }
}
