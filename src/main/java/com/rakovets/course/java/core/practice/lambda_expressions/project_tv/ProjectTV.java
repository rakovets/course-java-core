package com.rakovets.course.java.core.practice.lambda_expressions.project_tv;

import java.util.List;
import java.util.stream.Collectors;

public class ProjectTV {
    // получение телевизоров с заданной диагональю
    public static List<TV> getTVWithDiagonal(List<TV> tvList, double diagonal) {
        return tvList.stream()
                .filter(x -> x.getDiagonal() == diagonal)
                .collect(Collectors.toList());
    }
    // получение телевизоров какого-то производителя
    public static List<TV> getTVSomeManufacturer(List<TV> tvList, String manufacturer) {
        return tvList.stream()
                .filter(x -> x.getManufacturer().equals(manufacturer))
                .collect(Collectors.toList());
    }
    // получение телевизоров не старше какого-то года
    public static List<TV> getTVLessYear(List<TV> tvList, int year) {
        return tvList.stream()
                .filter(x -> x.getYearOfIssue() < year)
                .collect(Collectors.toList());
    }
    // получение телевизоров с ценой в каком-то диапазоне
    public static List<TV> getTVWithPrice(List<TV> tvList, double priceMin, double priceMax) {
        return tvList.stream()
                .filter(x -> x.getPrice() > priceMin || x.getPrice() < priceMax)
                .collect(Collectors.toList());
    }
    // получение телевизоров отсортированные по цене (по возрастанию)
    public static List<TV> getTVSortPriceAsc(List<TV> tvList) {
        return tvList.stream()
                .sorted(new ComparatorTVPrice())
                .collect(Collectors.toList());
    }
    // отсортированные по цене (по убыванию)
    public static List<TV> getTVSortPriceDesc(List<TV> tvList) {
        return tvList.stream()
                .sorted(new ComparatorTVPrice().reversed())
                .collect(Collectors.toList());
    }
    // получение телевизоров отсортированные по диагонали (по возрастанию)
    public static List<TV> getTVSortDiagonalAsc(List<TV> tvList) {
        return tvList.stream()
                .sorted(new ComparatorTVDiagonal())
                .collect(Collectors.toList());
    }
    // получение телевизоров отсортированные по цене (по убыванию)
    public static List<TV> getTVSortDiagonalDesc(List<TV> tvList) {
        return tvList.stream()
                .sorted(new ComparatorTVDiagonal().reversed())
                .collect(Collectors.toList());
    }
}
