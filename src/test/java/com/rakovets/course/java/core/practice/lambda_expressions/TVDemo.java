package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class TVDemo {
    public static void main(String[] args) {
        List list = new ArrayList<>(List.of(
                new Tv("Samsung", "S10", 2010, 39, 1000),
                new Tv("Xiaomi", "X10", 2012, 55, 696),
                new Tv("Apple", "I10", 2020, 25, 2000),
                new Tv("LG", "L10", 2030, 69, 987)));
        System.out.println(SortingOfTv.showNeededDiagonal(list, 25));
        System.out.println(SortingOfTv.showNeededTvOfProducer(list, "LG"));
        System.out.println(SortingOfTv.showNeededYears(list, 2020));
        System.out.println(SortingOfTv.showNeededRangeOfCost(list, 700, 1200));
        System.out.println(SortingOfTv.sortForPriceUp(list));
        System.out.println(SortingOfTv.sortForPriceDown(list));
        System.out.println(SortingOfTv.sortForDiagonalDown(list));
        System.out.println(SortingOfTv.sortForDiagonalUp(list));
    }
}
