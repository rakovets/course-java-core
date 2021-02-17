package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TVUtility {
    private List<TV> tvList;

    public TVUtility(List<TV> tvList) {
        this.tvList = tvList;
    }

    public List<TV> getDiagonal(double diagonal) {
        return tvList.stream()
                .filter(d -> d.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public List<TV> getProducer(String production) {
        return tvList.stream()
                .filter(p -> p.getProduction().equals(production))
                .collect(Collectors.toList());
    }

    public List<TV> getYear(int year) {
        return tvList.stream()
                .filter(y -> y.getYear() >= year)
                .collect(Collectors.toList());
    }

    public List<TV> specificPrice(double firstPointPrice, double secondPointPrice) {
        return tvList.stream()
                .filter(tv -> tv.getPrice() >= firstPointPrice && tv.getPrice() <= secondPointPrice)
                .collect(Collectors.toList());
    }

    public List<TV> sortedByPriceAscending() {
        return tvList.stream()
                .sorted(Comparator.comparingDouble(TV::getPrice))
                .collect(Collectors.toList());
    }

    public List<TV> sortedByPriceDescending() {
        return tvList.stream()
                .sorted(Comparator.comparingDouble(TV::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public List<TV> sortedByDiagonalAscending() {
        return tvList.stream()
                .sorted(Comparator.comparingDouble(TV::getDiagonal))
                .collect(Collectors.toList());
    }

    public List<TV> sortedByDiagonalDescending() {
        return tvList.stream()
                .sorted(Comparator.comparingDouble(TV::getDiagonal).reversed())
                .collect(Collectors.toList());
    }
}
