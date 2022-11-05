package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Comparator;

public class FeeLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        if (o1.getFee() == o2.getFee()) {
            return o1.getLastName().compareTo(o2.getLastName());
        } else {
            return Double.compare(o1.getFee(), o2.getFee());
        }
    }
}
