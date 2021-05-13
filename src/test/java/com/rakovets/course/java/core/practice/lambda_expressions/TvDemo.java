package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.project_tv.Tv;
import com.rakovets.course.java.core.practice.lambda_expressions.project_tv.TvUtility;

import javax.lang.model.util.TypeKindVisitor9;
import java.util.ArrayList;
import java.util.List;

public class TvDemo {
    public static void main(String[] args) {
        List<Tv> tvs = new ArrayList<>();
        tvs.add(new Tv("Samsung", "SM-123", 2019, 27.5, 1000.65));
        tvs.add(new Tv("Samsung", "SM-124", 2020, 30.5, 1200.65));
        tvs.add(new Tv("Samsung", "SM-125", 2021, 33.5, 1300.65));
        tvs.add(new Tv("Philips", "P-123", 2019, 27.5, 1000.65));
        tvs.add(new Tv("Philips", "P-124", 2020, 30.5, 1200.65));
        tvs.add(new Tv("Philips", "P-125", 2021, 33.5, 1300.65));
        tvs.add(new Tv("LG", "L-123", 2019, 27.5, 1000.65));
        tvs.add(new Tv("LG", "L-124", 2020, 30.5, 1200.65));
        tvs.add(new Tv("LG", "L-125", 2020, 30.5, 1300.65));
        tvs.add(new Tv("Horizont", "H-123", 2019, 27.5, 1200.65));
        tvs.add(new Tv("Horizont", "H-124", 2020, 33.5, 1300.65));
        System.out.println(TvUtility.getTvDiagonale(tvs,27.5).toString());
        System.out.println(TvUtility.getTvCompany(tvs,"LG").toString());
        System.out.println(TvUtility.getTvCostDia(tvs,1000,1200).toString());
        System.out.println(TvUtility.getTvYears(tvs,2020).toString());
        System.out.println(TvUtility.getTvSortedByDiagonalAscending(tvs).toString());
        System.out.println(TvUtility.getTvSortedByDiagonalDescending(tvs).toString());
        System.out.println(TvUtility.getTvSortedByPriceAscending(tvs).toString());
    }
}
