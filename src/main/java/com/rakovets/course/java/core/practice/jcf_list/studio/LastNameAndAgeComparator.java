package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Comparator;

public class LastNameAndAgeComparator implements Comparator<Actor> {
    public int compare(Actor o1, Actor o2) {
        if (o1.getLastName().equals(o2.getLastName())) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }
}
