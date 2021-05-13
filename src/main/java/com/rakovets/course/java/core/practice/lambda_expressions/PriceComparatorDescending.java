package com.rakovets.course.java.core.practice.lambda_expressions;

import java.util.Comparator;

public class PriceComparatorDescending implements Comparator<TV> {
    @Override
    public int compare(TV o1,TV o2) {
        return (int) (o2.getPrice()- o1.getPrice());
    }
}
