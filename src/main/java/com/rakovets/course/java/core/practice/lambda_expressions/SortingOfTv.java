package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Collection;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SortingOfTv {

    public static Collection<Tv> showNeededDiagonal(Collection<Tv> list, double value) {
        return list.stream().filter(magicvalue -> magicvalue.getDiagonal() == value).collect(Collectors.toList());
    }

    public static Collection<Tv> showNeededTvOfProducer(Collection<Tv> list, String value) {
        return list.stream().filter(magicvalue -> magicvalue.getProducer().equals(value)).collect(Collectors.toList());
    }

    public static Collection<Tv> showNeededYears(Collection<Tv> list, int value) {
        return list.stream().filter(magicvalue -> magicvalue.getDateOfCreation() < value).collect(Collectors.toList());
    }

    public static Collection<Tv> showNeededRangeOfCost(Collection<Tv> list, double from, double to) {
        return list.stream().filter(magicvalue -> magicvalue.getPrice() <= from && magicvalue.getPrice() >= to).collect(Collectors.toList());
    }

    public static Collection<Tv> sortForPriceUp(Collection<Tv> list) {
        return list.stream().sorted(new Comparator<Tv>() {
            @Override
            public int compare(Tv o1, Tv o2) {
                return o1.getPrice() - o2.getPrice();
            }
        }).collect(Collectors.toList());
    }

    public static Collection<Tv> sortForPriceDown(Collection<Tv> list) {
        return list.stream().sorted(new Comparator<Tv>() {
            @Override
            public int compare(Tv o1, Tv o2) {
                return o2.getPrice() - o1.getPrice();
            }
        }).collect(Collectors.toList());
    }

    public static Collection<Tv> sortForDiagonalDown(Collection<Tv> list) {
        return list.stream().sorted(new Comparator<Tv>() {
            @Override
            public int compare(Tv o1, Tv o2) {
                return o1.getDiagonal() - o2.getDiagonal();
            }
        }).collect(Collectors.toList());
    }

    public static Collection<Tv> sortForDiagonalUp(Collection<Tv> list) {
        return list.stream().sorted(new Comparator<Tv>() {
            @Override
            public int compare(Tv o1, Tv o2) {
                return o2.getDiagonal() - o1.getDiagonal();
            }
        }).collect(Collectors.toList());
    }
}
