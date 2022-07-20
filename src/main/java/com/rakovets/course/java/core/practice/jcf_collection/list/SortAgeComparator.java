package com.rakovets.course.java.core.practice.jcf_collection.list;

import java.util.Comparator;

public class SortAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
