package com.rakovets.course.javabasics.practice.lambdaexpressions;

import java.util.Comparator;

public class TVDiagonalComparator implements Comparator<TVSet> {
    boolean isAscendingOrder;
    public TVDiagonalComparator (boolean isAscendingOrder) {
        this.isAscendingOrder = isAscendingOrder;
    }

    @Override
    public int compare(TVSet o1, TVSet o2) {
        if (isAscendingOrder) {
            return o1.getDiagonal() - o2.getDiagonal();
        } else {
            return o2.getDiagonal() - o1.getDiagonal();
        }
    }
}
