package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.project_TV.TV;
import com.rakovets.course.java.core.practice.lambda_expressions.project_TV.UtilityClassForTV;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TVDemo {
    public static void main(String[] args) {
        List<TV> tvList = Arrays.asList(
                new TV("Samsung", "QE43LS01TAU", 2020, 43, 2100),
                new TV("LG", "49UN71006LB", 2019, 49, 1200),
                new TV(" JVC", "LT-32MU208", 2018, 32, 540),
                new TV("Sony", "KD-55XH9505", 2021, 55, 4000),
                new TV("Philips", "50PUS8505/60", 2020, 50, 1800),
                new TV("LG", "28MT49S-PZ", 2017, 28, 510),
                new TV("LG", "OLED55C1RLA", 2021, 55, 4500),
                new TV("JVC", "LT-32MU208", 2018, 32, 550),
                new TV("Sharp", "43BL2EA", 2020, 43, 1250),
                new TV("Panasonic", "TX-43HSR400", 2020, 43, 850));

        UtilityClassForTV utilityClassForTV = new UtilityClassForTV(tvList);

        System.out.println("List of all TVs:");
        System.out.println(tvList);

        System.out.println("List of all TVs with diagonal 43'':");
        System.out.println(utilityClassForTV.getDiagonalTV(43));

        System.out.println("List of all TVs with producer 'LG':");
        System.out.println(utilityClassForTV.getProducerTV("LG"));

        System.out.println("List of all TVs not older than 2019:");
        System.out.println(utilityClassForTV.getYearTV(2019));

        System.out.println("List of all TVs with price from 1000 to 1500:");
        System.out.println(utilityClassForTV.getPriceTV(1000, 1500));

        System.out.println("List of all TVs sorted by price ascending:");
        System.out.println(utilityClassForTV.getSortedPriceAscendingTV());

        System.out.println("List of all TVs sorted in descending order by price:");
        System.out.println(utilityClassForTV.getSortedPriceDescendingTV());

        System.out.println("List of all TVs sorted by diagonal ascending:");
        System.out.println(utilityClassForTV.getSortedDiagonalAscendingTV());

        System.out.println("List of all TVs sorted in descending order by diagonal:");
        System.out.println(utilityClassForTV.getSortedDiagonalDescendingTV());





    }


}
