package com.rakovets.course.java.core.practice.jcf.list;

import java.util.Comparator;

public class ActorComparatorByFeeAndLastName implements Comparator <Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        if (o1 == o2) {
            return 0;
        } else if (o1.getFee() == o2.getFee()) {
           return o1.getLastName().compareTo(o2.getLastName());
        } else {
           return Integer.compare(o1.getFee(), o2.getFee());
        }
    }
}
