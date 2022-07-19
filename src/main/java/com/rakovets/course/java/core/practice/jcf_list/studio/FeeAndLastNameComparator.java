package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Comparator;

public class FeeAndLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int compareByFee = Double.compare(o1.getFee(), o2.getFee());
        return compareByFee != 0 ? compareByFee : o1.getLastName().compareTo(o2.getLastName());
    }
}
