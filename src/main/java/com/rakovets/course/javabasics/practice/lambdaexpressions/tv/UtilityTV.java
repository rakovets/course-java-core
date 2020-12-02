package com.rakovets.course.javabasics.practice.lambdaexpressions.tv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class UtilityTV {

    public List<TV> getTVWithGivenDiagonal(ArrayList<TV> televisor, Integer diagonal) {
        return televisor.stream()
                .filter(tv -> tv.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public List<TV> getTVWithGivenManufacturer(ArrayList<TV> televisor, String manufacturer ) {
        return televisor.stream()
                .filter(tv -> tv.getManufacturer().equalsIgnoreCase(manufacturer))
                .collect(Collectors.toList());

    }

    public List<TV> getTVNotOlderThanGivenYearOfIssue(ArrayList<TV> televisor, Integer yearOfIssue) {
        return televisor.stream()
                .filter(tv -> tv.getYearOfIssue() >= yearOfIssue)
                .collect(Collectors.toList());
    }

    public List<TV> getTVWithGivenPrice(ArrayList<TV> televisor, Double fromPrice, Double toPrice) {
        return televisor.stream()
                .filter(tv -> tv.getPrice() >= fromPrice && tv.getPrice() < toPrice)
                .collect(Collectors.toList());
    }

    public List<TV> getTVSortedByAscendingPrice(ArrayList<TV> televisor) {
        return televisor.stream()
                .sorted(Comparator.comparingDouble(TV::getPrice))
                .collect(Collectors.toList());
    }

    public List<TV> getTVSortedByDescendingPrice(ArrayList<TV> televisor) {
        return televisor.stream()
                .sorted(Comparator.comparingDouble(TV::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public List<TV> getTVSortedByAscendingDiagonal(ArrayList<TV> televisor) {
        return televisor.stream()
                .sorted(Comparator.comparingDouble(TV::getDiagonal))
                .collect(Collectors.toList());
    }

    public List<TV> getTVSortedByDescendingDiagonal(ArrayList<TV> televisor) {
        return televisor.stream()
                .sorted(Comparator.comparingDouble(TV::getDiagonal).reversed())
                .collect(Collectors.toList());
    }
}
