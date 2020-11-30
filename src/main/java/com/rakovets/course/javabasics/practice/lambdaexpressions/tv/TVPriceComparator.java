package com.rakovets.course.javabasics.practice.lambdaexpressions.tv;

import com.rakovets.course.javabasics.practice.lambdaexpressions.tv.model.TVSet;

import java.util.Comparator;

public class TVPriceComparator implements Comparator<TVSet> {
    boolean isAscendingOrder;
    public TVPriceComparator (boolean isAscendingOrder) {
        this.isAscendingOrder = isAscendingOrder;
    }
    @Override
    public int compare(TVSet o1, TVSet o2) {
        if (isAscendingOrder) {
            return o1.getPrice() - o2.getPrice();
        } else {
            return o2.getPrice() - o1.getPrice();
        }
    }
}
