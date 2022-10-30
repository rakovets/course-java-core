package com.rakovets.course.java.core.practice.lambda_expressions.TV;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TV {
    private List<ProjectTV> tvList;

    public TV(List<ProjectTV> tvList) {
        this.tvList = tvList;
    }

    public List<ProjectTV> getTVDiagonal(List<ProjectTV> list, Integer diagonal) {
        return list.stream()
                .filter(x -> x.getDiagonal().equals(diagonal))
                .collect(Collectors.toList());
    }

    public List<ProjectTV> getManufacture(List<ProjectTV> list, String manufacture) {
        return list.stream()
                .filter(x -> x.getManufacture().equals(manufacture))
                .collect(Collectors.toList());
    }

    public List<ProjectTV> getNotOlder(List<ProjectTV> list, Integer year) {
        return list.stream()
                .filter(x -> x.getYearOfRelease() > year)
                .collect(Collectors.toList());
    }

    public List<ProjectTV> getRangePrice(List<ProjectTV> list, Integer minPrice, Integer maxPrice) {
        return list.stream()
                .filter(x -> x.getPrice() < maxPrice && x.getPrice() > minPrice)
                .collect(Collectors.toList());
    }

    public List<ProjectTV> getSortedInAscendingOrder(List<ProjectTV> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(ProjectTV::getPrice))
                .collect(Collectors.toList());
    }

    public List<ProjectTV> getSortedInDescendingOrder(List<ProjectTV> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(ProjectTV::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public List<ProjectTV> getDiagonalSortedInAscendingOrder(List<ProjectTV> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(ProjectTV::getDiagonal))
                .collect(Collectors.toList());
    }

    public List<ProjectTV> getDiagonalSortedInDescendingOrder(List<ProjectTV> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(ProjectTV::getDiagonal).reversed())
                .collect(Collectors.toList());
    }
}
