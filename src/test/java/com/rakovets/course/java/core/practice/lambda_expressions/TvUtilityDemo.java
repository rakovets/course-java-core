package com.rakovets.course.java.core.practice.lambda_expressions;
import java.util.ArrayList;
import java.util.List;

public class TvUtilityDemo {
    public static void main(String[] args) {
        List<TV> tv = new ArrayList<>();
        tv.add(new TV("LG", "L-1", 2018, 27.5, 920));
        tv.add(new TV("LG", "L-4", 2020, 30.5, 1000.00));
        tv.add(new TV("Samsung", "SM-12", 2017, 27.5, 850.65));
        tv.add(new TV("Samsung", "SM-14", 2019, 30.5, 1200.65));
        tv.add(new TV("Philips", "P-568", 2016, 27.5, 800.65));
        tv.add(new TV("Philips", "P-277", 2021, 35.5, 1300.65));
        tv.add(new TV("Horizont", "H-13", 2018, 27.5, 1200));
        tv.add(new TV("Horizont", "H-14", 2019, 33.5, 1000.00));
        System.out.println(TvUtility.getTvDiagonal(tv, 30.5).toString());
        System.out.println(TvUtility.getTvCompany(tv, "LG").toString());
        System.out.println(TvUtility.getTvYearRelease(tv, 2019).toString());
        System.out.println(TvUtility.getTvPrice(tv, 850, 1200).toString());
        System.out.println(TvUtility.getTvSortedByPriceAscending(tv).toString());
        System.out.println(TvUtility.getTVSortedByPriceDescending(tv).toString());
        System.out.println(TvUtility.getTvSortedByDiagonalAscending(tv).toString());
        System.out.println(TvUtility.getTvSortedByDiagonalDescending(tv).toString());
    }
}
