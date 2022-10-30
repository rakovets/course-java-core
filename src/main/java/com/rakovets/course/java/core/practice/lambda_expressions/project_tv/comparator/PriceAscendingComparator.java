package com.rakovets.course.java.core.practice.lambda_expressions.project_tv.comparator;

import com.rakovets.course.java.core.practice.lambda_expressions.project_tv.Television;

import java.util.Comparator;

public class PriceAscendingComparator implements Comparator<Television> {
    @Override
    public int compare(Television a, Television b) {
        return Integer.compare(a.getPrice(), b.getPrice());
    }
}
