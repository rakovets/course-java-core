package com.rakovets.course.java.core.practice.lambda_expressions.project_tv;

import java.util.ArrayList;
import java.util.List;

public class DemoProjectTV {
    public static void main(String[] args) {
        List<TV> tvList = new ArrayList<>();
        tvList.add(new TV("Panasonic", "PN784", 2010, 25.5, 100));
        tvList.add(new TV("Toshiba", "TB121", 2012, 30.7, 80));
        tvList.add(new TV("Samsung", "SM781", 2013, 22, 75));
        tvList.add(new TV("LG", "PN111", 2014, 35, 110));
        tvList.add(new TV("Panasonic", "PN942", 2015, 24.7, 95));
        tvList.add(new TV("LG", "LG197", 2010, 15.8, 100));
        tvList.add(new TV("Samsung", "SM777", 2020, 50, 510));
        tvList.add(new TV("Toshiba", "TB", 2016, 35, 320));

        System.out.println(ProjectTV.getTVWithDiagonal(tvList, 22).toString());
        System.out.println(ProjectTV.getTVSomeManufacturer(tvList, "LG").toString());
        System.out.println(ProjectTV.getTVLessYear(tvList, 2013).toString());
        System.out.println(ProjectTV.getTVWithPrice(tvList, 90, 100).toString());
        System.out.println(ProjectTV.getTVSortPriceAsc(tvList).toString());
        System.out.println(ProjectTV.getTVSortPriceDesc(tvList).toString());
        System.out.println(ProjectTV.getTVSortDiagonalAsc(tvList).toString());
        System.out.println(ProjectTV.getTVSortDiagonalDesc(tvList).toString());
    }
}
