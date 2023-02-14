package com.rakovets.course.java.core.practice.lambda_expressions;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class TVHelper {

    public List<TV> getTV(List<TV> tvList, int requiredDiagonal) {
        return tvList.stream().filter((tv) -> Objects.equals(tv.getDiagonalSize(), requiredDiagonal)).collect(Collectors.toList());
    }

    public List<TV> getTV(List<TV> tvList, String manufacturer) {
        return tvList.stream().filter((tv -> Objects.equals(tv.getManufacturer(), manufacturer))).collect(Collectors.toList());
    }

    public List<TV> getTV(List<TV> tvList, LocalDate afterThisYear) {
        return tvList.stream().filter((tv -> tv.getYear().isAfter(afterThisYear))).collect(Collectors.toList());
    }

    public List<TV> getTV(List<TV> tvList, double minPrice, double maxPrice) {
        return tvList.stream().filter(tv -> tv.getPrice() > minPrice && tv.getPrice() < maxPrice).collect(Collectors.toList());
    }

    public List<TV> getTVSortedByPrice(List<TV> tvList, boolean ascending) {
        if (ascending) {
            tvList.sort(Comparator.comparingDouble(TV::getPrice));
        } else {
            tvList.sort(Comparator.comparingDouble(TV::getPrice).reversed());
        }
        return tvList;
    }

    public List<TV> getTVSortedByDiagonal(List<TV> tvList, boolean ascending) {
        if (ascending) {
            tvList.sort(Comparator.comparingInt(TV::getDiagonalSize));
        } else {
            tvList.sort(Comparator.comparingInt(TV::getDiagonalSize).reversed());
        }
        return tvList;
    }
}
