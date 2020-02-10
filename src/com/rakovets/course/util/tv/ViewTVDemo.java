package com.rakovets.course.util.tv;

import java.util.ArrayList;

public class ViewTVDemo {
    public static void main(String[] args) {
        ArrayList<TV> tVs = new ArrayList<>();
        tVs.add(new TV("MI TV 4A 32", 2018, 449, 31.5, "Xiaomi"));
        tVs.add(new TV("MI TV 4S 43", 2019, 849, 43, "Xiaomi"));
        tVs.add(new TV("UE32N5300AU", 2018, 639, 32, "Samsung"));
        tVs.add(new TV("UE24N4500AU", 2018, 499, 24, "Samsung"));
        tVs.add(new TV("43UK6300", 2018, 879, 43, "LG"));
        tVs.add(new TV("49UK6300", 2018, 1039, 49, "LG"));
        tVs.add(new TV("KDL-49WE755", 2017, 1374, 43, "Sony"));

        ViewTV viewTV = new ViewTV(tVs);

        viewTV.viewAllTVs();
        viewTV.viewTVsGivenDiagonal();
        viewTV.viewTVGivenManufacturer();
        viewTV.viewTVGivenYearOfManufacture();
        viewTV.viewTVsAreMoreExpensiveThanTheSetCost();
    }
}
