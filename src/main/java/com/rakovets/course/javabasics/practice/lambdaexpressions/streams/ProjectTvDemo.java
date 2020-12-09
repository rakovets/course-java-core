package com.rakovets.course.javabasics.practice.lambdaexpressions.streams;

import java.util.Arrays;
import java.util.List;

import static com.rakovets.course.javabasics.practice.lambdaexpressions.streams.ProjectTV.*;

public class ProjectTvDemo {

    public static void main(String[] args) {

        List<TV> tvList = Arrays.asList(new TV("Sony", "SuperModel", 2019, 55, 450),
                new TV("LG", "turbo", 2018, 55, 400),
                new TV("Panasonic", "x100", 2019, 45, 450),
                new TV("Samsung", "n500", 2017, 40, 300),
                new TV("Samsung", "n501", 2020, 50, 350),
                new TV("Horizont", "x12b34c", 2015, 21, 200));

        System.out.println(getTVsByDiagonal(tvList, 55));

        System.out.println(getTVsByProducer(tvList, "Samsung"));

        System.out.println(getTVsNewerThanSpecifiedYear(tvList, 2018));

        System.out.println(getTVsBetweenPrices(tvList, 390, 510));

        System.out.println(sortTVsByCostAsc(tvList));

        System.out.println(sortTVsByCostDesc(tvList));

        System.out.println(sortTVsByDiagonalAsc(tvList));

        System.out.println(sortTVsByDiagonalDesc(tvList));


    }


}
