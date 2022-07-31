package com.rakovets.course.java.core.practice.lambda_expressions.tv;

import java.util.ArrayList;
import java.util.List;

public class TvDemo {
    public static void main(String[] args) {
        List<Tv> tvDb = new ArrayList<>();

        tvDb.add(new Tv("Samsung", "U90", 2019, 42, 800));
        tvDb.add(new Tv("Samsung", "U90", 2020, 40, 900));
        tvDb.add(new Tv("Samsung", "U90", 2021, 50, 1000));
        tvDb.add(new Tv("KIVI", "U90", 2022, 28, 500));

        TvUtil tvUtil = new TvUtil(tvDb);

        System.out.println(tvUtil.getTvByDiagonal(42));
        System.out.println(tvUtil.getTvByManufacturer("kivi"));
        System.out.println(tvUtil.getTvNotOlderYear(2021));
        System.out.println(tvUtil.getTvByPriceRange(0, 850));
        System.out.println("-----------");
        System.out.println(tvUtil.getSortedTvByPriceAsc());
        System.out.println(tvUtil.getSortedTvByPriceDesc());
        System.out.println("-----------");
        System.out.println(tvUtil.getSortedTvByDiagonalAsc());
        System.out.println(tvUtil.getSortedTvByDiagonalDesc());
    }
}
