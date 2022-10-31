package com.rakovets.course.java.core.practice.lambda_expressions.ProjectTv;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TvProject {
    List<TV> tv;

    public TvProject(List<TV> tv) {
        this.tv = tv;
    }

    public List<TV> getByDiagonal(double diagonal) {
        return tv.stream()
                .distinct()
                .filter(x -> x.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public List<TV> getByManufacturer(String manufacturer) {
        return tv.stream()
                .filter(x -> x.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
    }

    public List<TV> getByYear(int year) {
        return tv.stream()
                .filter(x -> x.getYear() >= year)
                .collect(Collectors.toList());
    }

    public List<TV> getByPriceRange(double startPrice, double finishPrice) {
        return tv.stream()
                .filter(x -> x.getPrice() >= startPrice && x.getPrice() <= finishPrice)
                .collect(Collectors.toList());
    }

    public List<TV> sortedByPrice() {
        return tv.stream()
                .sorted(Comparator.comparingDouble(TV::getPrice))
                .collect(Collectors.toList());
    }

    public List<TV> sortedByDescendingPrices() {
        return tv.stream()
                .sorted((x, y) -> -Double.compare(x.getPrice(), y.getPrice()))
                .collect(Collectors.toList());
    }

    public List<TV> sortedByDiagonalAsc() {
        return tv.stream()
                .sorted(Comparator.comparingDouble(TV::getDiagonal))
                .collect(Collectors.toList());
    }

    public List<TV> sortedByDiagonalDesc() {
        return tv.stream()
                .sorted((x, y) -> -Double.compare(x.getDiagonal(), y.getDiagonal()))
                .collect(Collectors.toList());
    }
}
