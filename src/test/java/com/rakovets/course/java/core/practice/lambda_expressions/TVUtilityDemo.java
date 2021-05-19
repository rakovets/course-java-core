package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.ArrayList;
import java.util.List;

public class TVUtilityDemo {
    public static void main(String[] args) {
        List<TV> tv = new ArrayList<>();
        tv.add(new TV("A", "1", 2017, 42, 400));
        tv.add(new TV("A", "2", 2021, 45, 450.00));
        tv.add(new TV("B", "10", 2018, 23, 230));
        tv.add(new TV("B", "11", 2020, 25, 250));
        tv.add(new TV("C", "20", 2021, 42, 600));
        tv.add(new TV("C", "22", 2019, 52, 800));
        tv.add(new TV("D", "30", 2018, 52, 900));
        tv.add(new TV("D", "33", 2020, 25, 450));
        System.out.println(TVUtility.getTvDiagonal(tv, 52).toString());
        System.out.println(TVUtility.getTvBrand(tv, "B").toString());
        System.out.println(TVUtility.getTvNotOlderYear(tv, 2021).toString());
        System.out.println(TVUtility.getTvPriceInCertainRange(tv, 600, 900).toString());
        System.out.println(TVUtility.getTvSortedByPriceAscending(tv).toString());
        System.out.println(TVUtility.getTVSortedByPriceDescending(tv).toString());
        System.out.println(TVUtility.getTvSortedDiagonallyAscending(tv).toString());
        System.out.println(TVUtility.getTvSortedDiagonallyDescending(tv).toString());
    }
}
