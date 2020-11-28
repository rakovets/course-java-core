package com.rakovets.course.javabasics.practice.lambdaexpressions;

import com.rakovets.course.javabasics.util.Color;

import java.util.Arrays;

import static java.lang.System.*;

public class TVDemo {
    public static void main(String[] args) {
        TV[] tvs = new TV[] {
                new TV("LG", "55NANO916NA", 2020, 55,2374),
                new TV("LG", "32LM6350PLA", 2019, 32, 713),
                new TV("Samsung", "UE43TU8000U", 2020, 43, 1068),
                new TV("Samsung", "UE32T5300AU", 2020, 32, 619),
                new TV("Sony", "KD-55XH9096", 2020, 54, 2990),
                new TV("Philips", "50PUS8505/60", 2020, 50, 1551),
                new TV("Xiaomi", "MI TV 4S 43", 2019, 43, 852)
        };
        TVUtil tvUtil = new TVUtil(tvs);
        int diagonal = 32;
        out.println(Color.BLUE + "TVs with diagonal " + diagonal + "\": " + Color.RESET + Arrays.asList(tvUtil.getWithCurrentDiagonal(diagonal)));
        String manufacturer = "LG";
        out.println(Color.BLUE + "TVs of manufacturer " + manufacturer + ": " + Color.RESET + Arrays.asList(tvUtil.getWithCurrentManufacturer(manufacturer)));
        int year = 2019;
        out.println(Color.BLUE + "TVs after year " + year + ": " + Color.RESET + Arrays.asList(tvUtil.getAfterCurrentYear(year)));
        int priceFrom = 1000;
        int priceTo = 2000;
        out.println(Color.BLUE + "TVs with price from " + priceFrom + " to " + priceTo + " BYN: " + Color.RESET + Arrays.asList(tvUtil.getWithPrice(priceFrom, priceTo)));
        out.println(Color.BLUE + "TVs sorted by price ascending: " + Color.RESET + Arrays.asList(tvUtil.getSortedByPriceAscending()));
        out.println(Color.BLUE + "TVs sorted by price descending: " + Color.RESET + Arrays.asList(tvUtil.getSortedByPriceDescending()));
        out.println(Color.BLUE + "TVs sorted by diagonal ascending: " + Color.RESET + Arrays.asList(tvUtil.getSortedByDiagonalAscending()));
        out.println(Color.BLUE + "TVs sorted by diagonal descending: " + Color.RESET + Arrays.asList(tvUtil.getSortedByDiagonalDescending()));
    }
}
