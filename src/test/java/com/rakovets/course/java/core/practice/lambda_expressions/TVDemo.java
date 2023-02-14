package com.rakovets.course.java.core.practice.lambda_expressions;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TVDemo {

    public static void main(String[] args) {
        TV tv1 = new TV("Horizont", "Zubr", LocalDate.of(2022, 1, 1), 25, 950);
        TV tv2 = new TV("Horizont", "Lux", LocalDate.of(2022, 1, 15), 39, 1250);
        TV tv3 = new TV("Samsung", "SL200M", LocalDate.of(2023, 2, 11), 42, 1550);
        TV tv4 = new TV("LG", "BlueVision7000", LocalDate.of(2023, 2, 12), 40, 1900);

        List<TV> simpleList = List.of(tv1, tv2, tv3, tv4);
        List<TV> tvList = new ArrayList<>(simpleList);
        TVHelper helper = new TVHelper();
        System.out.println(helper.getTV(tvList, 25));
        System.out.println(helper.getTV(tvList, "Samsung"));
        System.out.println(helper.getTV(tvList, LocalDate.of(2023, 1, 1)));
        System.out.println(helper.getTV(tvList, 1100, 1600));
        System.out.println(helper.getTVSortedByPrice(tvList, true));
        System.out.println(helper.getTVSortedByDiagonal(tvList, true));
    }
}
