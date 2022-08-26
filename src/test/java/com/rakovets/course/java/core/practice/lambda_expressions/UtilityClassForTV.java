package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UtilityClassForTV {
    private final List<TV> tv;

    public UtilityClassForTV(List<TV> tv) {
        this.tv = tv;
    }

    public  List<TV> getDiagonalTV(int diagonal) {
        return tv.stream()
                .filter(tv -> tv.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public  List<TV> getProducerTV(String producer) {
        return tv.stream()
                .filter(tv -> tv.getProducer().equalsIgnoreCase(producer))
                .collect(Collectors.toList());
    }

    public  List<TV> getYearTV(int year) {
        return tv.stream()
                .filter(tv -> tv.getYear() >= year)
                .collect(Collectors.toList());
    }

    public  List<TV> getPriceTV(double startPrice, double endPrice) {
        return tv.stream()
                .filter(tv -> tv.getPrice() >= startPrice && tv.getPrice() <= endPrice)
                .collect(Collectors.toList());
    }

    public  List<TV> getSortedPriceAscendingTV() {
        return tv.stream()
                .sorted(Comparator.comparingDouble(TV::getPrice))
                .collect(Collectors.toList());
    }

    public  List<TV> getSortedPriceDescendingTV() {
        return tv.stream()
                .sorted(Comparator.comparingDouble(TV::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public  List<TV> getSortedDiagonalAscendingTV() {
        return tv.stream()
                .sorted(Comparator.comparingDouble(TV::getDiagonal))
                .collect(Collectors.toList());
    }

    public  List<TV> getSortedDiagonalDescendingTV() {
        return tv.stream()
                .sorted(Comparator.comparingDouble(TV::getDiagonal).reversed())
                .collect(Collectors.toList());
    }
}
