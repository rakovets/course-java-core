package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.projectTV.SortTV;
import com.rakovets.course.java.core.practice.lambda_expressions.projectTV.TV;

import java.util.ArrayList;
import java.util.List;

public class ProjectTVDemo {
    public static void main(String[] args) {
        List<TV> tvList = new ArrayList<>(List.of(
                new TV("Samsung", "HG40EE590SK", 2017, 40, 1609.0),
                new TV("Samsung", "UE43TU7090U", 2020, 43, 1009.73),
                new TV("Samsung", "QE49Q6FNAU", 2018, 49, 2391.34),
                new TV("LG", "43UN71006LB", 2020, 43, 972.0),
                new TV("LG", "49UN71006LB", 2019, 49, 1086.01),
                new TV("LG", "50NANO796NF", 2017, 50, 1424.89),
                new TV("Sony", "KDL-40RE353", 2017, 40, 833.41),
                new TV("Sony", "KD-43XH8005", 2020, 43, 1800),
                new TV("Sony", "KDL-50WF665", 2018, 50, 1358.63)
        ));
        System.out.println(SortTV.getTVDiagonally(tvList, 43).toString());
        System.out.println(SortTV.getSpecifiedTV(tvList, "sony"));
        System.out.println(SortTV.getTVNoMoreThanSpecifiedYearsOld(tvList, 2018));
        System.out.println(SortTV.getTVFromPriceDiapason(tvList, 1000, 1700));
        System.out.println(SortTV.getAscendingSortedTVByPrice(tvList));
        System.out.println(SortTV.getDescendingSortedTVByPrice(tvList));
        System.out.println(SortTV.getAscendingSortedTVByDiagonal(tvList));
        System.out.println(SortTV.getDescendingSortedTVByDiagonal(tvList));
    }
}
