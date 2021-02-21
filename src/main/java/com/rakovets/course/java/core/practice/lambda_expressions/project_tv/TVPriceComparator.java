package com.rakovets.course.java.core.practice.lambda_expressions.project_tv;

import java.util.Comparator;

public class TVPriceComparator implements Comparator<TVitem> {
    @Override
    public int compare(TVitem o1, TVitem o2) {
        if (o1 == o2) {
            return 0;
        } else return Integer.compare(o1.getPrice(), o2.getPrice());
    }
}
