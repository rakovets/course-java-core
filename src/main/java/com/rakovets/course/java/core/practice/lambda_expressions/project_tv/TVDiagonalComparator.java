package com.rakovets.course.java.core.practice.lambda_expressions.project_tv;

import java.util.Comparator;

public class TVDiagonalComparator implements Comparator <TVitem> {
    @Override
    public int compare(TVitem o1, TVitem o2) {
        return Integer.compare(o1.getDiagonal(),o2.getDiagonal());
    }
}
