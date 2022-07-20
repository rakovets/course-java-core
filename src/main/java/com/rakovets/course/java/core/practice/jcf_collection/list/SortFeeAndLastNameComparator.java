package com.rakovets.course.java.core.practice.jcf_collection.list;

import java.util.Comparator;

public class SortFeeAndLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        if (o1.getFee() == o2.getFee()) {
            return o1.getLastName().compareTo(o2.getLastName());
        } else {
            return Integer.compare(o1.getFee(), o2.getFee());
        }
    }
}
