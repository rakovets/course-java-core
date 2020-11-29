package com.rakovets.course.javabasics.practice.lambdaexpressions;

import com.rakovets.course.javabasics.practice.lambdaexpressions.model.TV;
import java.util.Arrays;
import java.util.Comparator;

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
                .sorted(Comparator.comparingInt(TV::getPrice))
                .toArray();
    }

    public Object[] getSortedByPriceDescending() {
        return Arrays.asList(tvs).stream()
                .sorted((Comparator.comparingInt(TV::getPrice).reversed()))
                .toArray();
    }

    public Object[] getSortedByDiagonalAscending() {
        return Arrays.asList(tvs).stream()
                .sorted(Comparator.comparingInt(TV::getDiagonal))
                .toArray();
    }

    public Object[] getSortedByDiagonalDescending() {
        return Arrays.asList(tvs).stream()
                .sorted((Comparator.comparingInt(TV::getDiagonal).reversed()))
                .toArray();
    }
}
