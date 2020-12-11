package com.rakovets.course.javabasics.practice.lambdaexpressions.tv;

import com.rakovets.course.javabasics.practice.lambdaexpressions.tv.model.TVModel;

import java.util.Comparator;

public class PriceComparator implements Comparator<TVModel> {
    private boolean isReversed;

    PriceComparator(boolean isReversed) {
        this.isReversed = isReversed;
    }

    @Override
    public int compare(TVModel o1, TVModel o2) {
        if (!isReversed) {
            return o1.getPrice() - o2.getPrice();
        } else {
            return o2.getPrice() - o1.getPrice();
        }
    }
}
