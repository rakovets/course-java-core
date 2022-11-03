package com.rakovets.course.java.core.practice.lambda_expressions.TV;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Tv {
    private List<ProjectTv> tvList;

    public Tv(List<ProjectTv> tvList) {
        this.tvList = tvList;
    }

    public List<ProjectTv> getTVDiagonal(List<ProjectTv> list, Integer diagonal) {
        return list.stream()
                .filter(x -> x.getDiagonal().equals(diagonal))
                .collect(Collectors.toList());
    }

    public List<ProjectTv> getManufacture(List<ProjectTv> list, String manufacture) {
        return list.stream()
                .filter(x -> x.getManufacture().equals(manufacture))
                .collect(Collectors.toList());
    }

    public List<ProjectTv> getNotOlder(List<ProjectTv> list, Integer year) {
        return list.stream()
                .filter(x -> x.getYearOfRelease() > year)
                .collect(Collectors.toList());
    }

    public List<ProjectTv> getRangePrice(List<ProjectTv> list, Integer minPrice, Integer maxPrice) {
        return list.stream()
                .filter(x -> x.getPrice() < maxPrice && x.getPrice() > minPrice)
                .collect(Collectors.toList());
    }

    public List<ProjectTv> getSortedInAscendingOrder(List<ProjectTv> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(ProjectTv::getPrice))
                .collect(Collectors.toList());
    }

    public List<ProjectTv> getSortedInDescendingOrder(List<ProjectTv> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(ProjectTv::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public List<ProjectTv> getDiagonalSortedInAscendingOrder(List<ProjectTv> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(ProjectTv::getDiagonal))
                .collect(Collectors.toList());
    }

    public List<ProjectTv> getDiagonalSortedInDescendingOrder(List<ProjectTv> list) {
        return list.stream()
                .sorted(Comparator.comparingInt(ProjectTv::getDiagonal).reversed())
                .collect(Collectors.toList());
    }
}
