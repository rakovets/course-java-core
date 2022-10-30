package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Utility {
    public List<Televisor> getTelevisorWithSetDiagonal(List<Televisor> tv, double setDiagonal) {
        List<Televisor> tvWithSetDiagonal = new ArrayList<>();
        tv.stream().filter(t -> t.getDiagonal() == setDiagonal).forEach(t -> tvWithSetDiagonal.add(t));
        return tvWithSetDiagonal;
    }

    public List<Televisor> getTelevisorWithSetManufacturer(List<Televisor> tv, String manufacturer) {
        List<Televisor> tvWithSetManufacturer = new ArrayList<>();
        tv.stream().filter(t -> t.getManufacturer() == manufacturer).forEach(t -> tvWithSetManufacturer.add(t));
        return tvWithSetManufacturer;
    }

    public List<Televisor> getTelevisorWithLimitYearOfIssue(List<Televisor> tv, int limitYearOfIssue) {
        List<Televisor> tvWithLimitYearOfIssue = new ArrayList<>();
        tv.stream().filter(t -> t.getYearOfIssue() <= limitYearOfIssue).forEach(t -> tvWithLimitYearOfIssue.add(t));
        return tvWithLimitYearOfIssue;
    }

    public List<Televisor> getTelevisorWithPriceRange(List<Televisor> tv, double startPrice, double finalPrice) {
        List<Televisor> tvWithPriceRange = new ArrayList<>();
        tv.stream().filter(t -> startPrice <= t.getPrice() && t.getPrice() <= finalPrice)
                .forEach(t -> tvWithPriceRange.add(t));
        return tvWithPriceRange;
    }

    public List<Televisor> getTelevisorSortedPriceAscending(List<Televisor> tv) {
        List<Televisor> tvSortedPriceAscending = new ArrayList<>();
        tv.stream().sorted(Comparator.comparing(Televisor::getPrice)).forEach(Televisor -> tvSortedPriceAscending.add(Televisor));
        return tvSortedPriceAscending;
    }

    public List<Televisor> getTelevisorSortedPriceDescending(List<Televisor> tv) {
        List<Televisor> tvSortedPriceDescending = new ArrayList<>();
        Comparator<Televisor> comparator = Comparator.comparing(Televisor::getPrice);
        tv.stream().sorted(comparator.reversed()).forEach(Televisor -> tvSortedPriceDescending.add(Televisor));
        return tvSortedPriceDescending;
    }

    public List<Televisor> getTelevisorSortedDiagonalAscending(List<Televisor> tv) {
        List<Televisor> tvSortedDiagonalAscending = new ArrayList<>();
        tv.stream()
                .sorted(Comparator.comparing(Televisor::getDiagonal))
                .forEach(Televisor -> tvSortedDiagonalAscending.add(Televisor));
        return tvSortedDiagonalAscending;
    }

    public List<Televisor> getTelevisorSortedDiagonalDescending(List<Televisor> tv) {
        List<Televisor> tvSortedDiagonalAscending = new ArrayList<>();
        Comparator<Televisor> comparator = Comparator.comparing(Televisor::getDiagonal);
        tv.stream().sorted(comparator.reversed()).forEach(Televisor -> tvSortedDiagonalAscending.add(Televisor));
        return tvSortedDiagonalAscending;
    }
}
