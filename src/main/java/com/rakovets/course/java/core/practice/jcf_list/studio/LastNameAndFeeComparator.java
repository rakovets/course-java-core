package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Comparator;

public class LastNameAndFeeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor a, Actor b) {
        var result = Double.compare(a.getFee(), b.getFee());
        if (result == 0) {
            return a.getLastName().compareTo(b.getLastName());
        } else {
            return result;
        }
    }
}
