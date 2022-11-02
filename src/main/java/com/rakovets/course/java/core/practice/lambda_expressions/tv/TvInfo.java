package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class TvInfo {
    private LinkedList<TV> allTVs;

    public TvInfo(LinkedList<TV> allTVs) {
        this.allTVs = allTVs;
    }

    public TvInfo() {
    }

    public List<TV> getTVByDiagonal(double diagonal) {
        return allTVs.stream()
                .filter(tv -> tv.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public List<TV> getTVByManufacturer(String manufacturer) {
        return allTVs.stream()
                .filter(tv -> tv.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
    }

    public List<TV> getTVByMinYear(int year) {
        return allTVs.stream()
                .filter(tv -> tv.getYear() >= year)
                .collect(Collectors.toList());
    }

    public List<TV> getTVByPriceRange(double firstPrice, double lastPrice) {
        return allTVs.stream()
                .filter(tv -> tv.getPrice() >= firstPrice && tv.getPrice() <= lastPrice)
                .collect(Collectors.toList());
    }

    public List<TV> sortedByPriceAscending() {
        return allTVs.stream()
                .sorted(Comparator.comparing(TV::getPrice))
                .collect(Collectors.toList());
    }

    public List<TV> sortedByPriceDescending() {
        return allTVs.stream()
                .sorted(Comparator.comparing(TV::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public List<TV> sortedByDiagonalAscending() {
        return allTVs.stream()
                .sorted(Comparator.comparing(TV::getDiagonal))
                .collect(Collectors.toList());
    }

    public List<TV> sortedByDiagonalDescending() {
        return allTVs.stream()
                .sorted(Comparator.comparing(TV::getDiagonal).reversed())
                .collect(Collectors.toList());
    }

    public LinkedList<TV> getAllTVs() {
        return allTVs;
    }
}
