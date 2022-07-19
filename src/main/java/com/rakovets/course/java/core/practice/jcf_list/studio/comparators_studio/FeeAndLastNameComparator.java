package com.rakovets.course.java.core.practice.jcf_list.studio.comparators_studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.actors_and_studio.Actor;

import java.util.Comparator;

public class FeeAndLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int sortByFee = Double.compare(o1.getFee(), o2.getFee());
        return sortByFee != 0 ? sortByFee : o1.getLastName().compareTo(o2.getLastName());
    }
}
