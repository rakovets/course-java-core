package com.rakovets.course.java.core.practice.jcf_collection.list;

import java.util.Comparator;

public class SortLastNameAndAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        if (o1.getLastName() == o2.getLastName()) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }
}
