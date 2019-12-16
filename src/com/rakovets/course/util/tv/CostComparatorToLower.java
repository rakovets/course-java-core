package com.rakovets.course.util.tv;

import java.util.Comparator;

public class CostComparatorToLower implements Comparator<Television> {
    @Override
    public int compare(Television television, Television t1) {
        int result = 0;
        if (television.getCost() > t1.getCost()) {
            result = -1;
        } else if (television.getCost() < t1.getCost()) {
            result = 1;
        }
        return result;
    }
}
