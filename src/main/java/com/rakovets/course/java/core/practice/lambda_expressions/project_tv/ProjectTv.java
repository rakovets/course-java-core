package com.rakovets.course.java.core.practice.lambda_expressions.project_tv;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ProjectTv {
    public List<Television> getTvWithSpecialDiagonal(List<Television> televisionList, int diagonal) {
        return televisionList.stream()
                .filter(s -> s.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }

    public List<Television> getTvOfSpecialManufacturer(List<Television> televisionList, Manufacturer manufacturer) {
       return televisionList.stream()
                .filter(s -> s.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
    }

    public List<Television> getTvUnderYear(List<Television> televisionList, int year) {
        return televisionList.stream()
                .filter(s -> s.getYear() >= year)
                .collect(Collectors.toList());
    }

    public List<Television> getTvInDiapasonPrice(List<Television> televisionList, int lowerPrice, int higherPrice) {
        return televisionList.stream()
                .filter(s -> s.getPrice() >= lowerPrice && s.getPrice() <= higherPrice)
                .collect(Collectors.toList());
    }

    public List<Television> getTvSortByPriceAscending(List<Television> televisionList) {
        return televisionList.stream()
                .sorted(Comparator.comparing(Television::getPrice))
                .collect(Collectors.toList());
    }

    public List<Television> getTvSortByPriceDescending(List<Television> televisionList) {
        return televisionList.stream()
                .sorted(Comparator.comparing(Television::getPrice).reversed())
                .collect(Collectors.toList());
    }

    public List<Television> getTvSortByDiagonalAscending(List<Television> televisionList) {
        return televisionList.stream()
                .sorted(Comparator.comparing(Television::getDiagonal))
                .collect(Collectors.toList());
    }

    public List<Television> getTvSortByDiagonalDescending(List<Television> televisionList) {
       return televisionList.stream()
                .sorted(Comparator.comparing(Television::getDiagonal).reversed())
                .collect(Collectors.toList());
    }
}
