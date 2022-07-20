package com.rakovets.course.java.core.practice.jcf_collection.list;

import java.util.Comparator;

public class SortLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
