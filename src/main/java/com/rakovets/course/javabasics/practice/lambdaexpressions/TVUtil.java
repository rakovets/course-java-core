package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.Arrays;

public class TVUtil {
    private TV[] tvs;

    public TVUtil(TV[] tvs) {
        this.tvs = tvs;
    }

    public Object[] getWithCurrentDiagonal(int diagonal) {
        return Arrays.asList(tvs).stream()
                .filter(tv -> tv.getDiagonal() == diagonal)
                .toArray();
    }

    public Object[] getWithCurrentManufacturer(String manufacturer) {
        return Arrays.asList(tvs).stream()
                .filter(tv -> tv.getManufacturer().equals(manufacturer))
                .toArray();
    }

    public Object[] getAfterCurrentYear(int year) {
        return Arrays.asList(tvs).stream()
                .filter(tv -> tv.getYear() > year)
                .toArray();
    }

    public Object[] getWithPrice(int from, int to) {
        return Arrays.asList(tvs).stream()
                .filter(tv -> tv.getPrice() > from && tv.getPrice() < to)
                .toArray();
    }

    public Object[] getSortedByPriceAscending() {
        return Arrays.asList(tvs).stream()
                .sorted((tv1, tv2) -> tv1.getPrice() - tv2.getPrice())
                .toArray();
    }

    public Object[] getSortedByPriceDescending() {
        return Arrays.asList(tvs).stream()
                .sorted((tv1, tv2) -> tv2.getPrice() - tv1.getPrice())
                .toArray();
    }

    public Object[] getSortedByDiagonalAscending() {
        return Arrays.asList(tvs).stream()
                .sorted((tv1, tv2) -> tv1.getDiagonal() - tv2.getDiagonal())
                .toArray();
    }

    public Object[] getSortedByDiagonalDescending() {
        return Arrays.asList(tvs).stream()
                .sorted((tv1, tv2) -> tv2.getDiagonal() - tv1.getDiagonal())
                .toArray();
    }
}
