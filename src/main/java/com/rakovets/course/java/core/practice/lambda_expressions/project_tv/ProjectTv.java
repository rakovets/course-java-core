package com.rakovets.course.java.core.practice.lambda_expressions.project_tv;

import com.rakovets.course.java.core.practice.lambda_expressions.project_tv.comparator.DiagonalAscendingComparator;
import com.rakovets.course.java.core.practice.lambda_expressions.project_tv.comparator.DiagonalDescendingComparator;
import com.rakovets.course.java.core.practice.lambda_expressions.project_tv.comparator.PriceAscendingComparator;
import com.rakovets.course.java.core.practice.lambda_expressions.project_tv.comparator.PriceDescendingComparator;

import java.util.List;
import java.util.stream.Collectors;

public class ProjectTv {
    public List<Television> getTvWithSpecialDiagonal(List<Television> televisionList, int diagonal) {
        List<Television> result = televisionList.stream()
                .filter(s -> s.getDiagonal() == diagonal)
                .collect(Collectors.toList());
        return result;
    }

    public List<Television> getTvOfSpecialManufacturer(List<Television> televisionList, Manufacturer manufacturer) {
        List<Television> result = televisionList.stream()
                .filter(s -> s.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
        return result;
    }

    public List<Television> getTvUnderYear(List<Television> televisionList, int year) {
        List<Television> result = televisionList.stream()
                .filter(s -> s.getYear() >= year)
                .collect(Collectors.toList());
        return result;
    }

    public List<Television> getTvInDiapasonPrice(List<Television> televisionList, int lowerPrice, int higherPrice) {
        List<Television> result = televisionList.stream()
                .filter(s -> s.getPrice() >= lowerPrice && s.getPrice() <= higherPrice)
                .collect(Collectors.toList());
        return result;
    }

    public List<Television> getTvSortByPriceAscending(List<Television> televisionList) {
        List<Television> result = televisionList.stream()
                .sorted(new PriceAscendingComparator())
                .collect(Collectors.toList());
        return result;
    }

    public List<Television> getTvSortByPriceDescending(List<Television> televisionList) {
        List<Television> result = televisionList.stream()
                .sorted(new PriceDescendingComparator())
                .collect(Collectors.toList());
        return result;
    }

    public List<Television> getTvSortByDiagonalAscending(List<Television> televisionList) {
        List<Television> result = televisionList.stream()
                .sorted(new DiagonalAscendingComparator())
                .collect(Collectors.toList());
        return result;
    }

    public List<Television> getTvSortByDiagonalDescending(List<Television> televisionList) {
        List<Television> result = televisionList.stream()
                .sorted(new DiagonalDescendingComparator())
                .collect(Collectors.toList());
        return result;
    }
}
