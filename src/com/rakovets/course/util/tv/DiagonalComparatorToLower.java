package com.rakovets.course.util.tv;

import java.util.Comparator;

public class DiagonalComparatorToLower implements Comparator<Television> {
    @Override
    public int compare(Television television, Television t1) {
        int result = 0;
        if (television.getDiagonal() > t1.getDiagonal()) {
            result = -1;
        } else if (television.getDiagonal() < t1.getDiagonal()) {
            result = 1;
        }
        return result;
    }
}
