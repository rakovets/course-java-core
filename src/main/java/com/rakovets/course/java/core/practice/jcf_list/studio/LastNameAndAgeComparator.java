package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Comparator;

public class LastNameAndAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int compareByLastname = o1.getLastName().compareTo(o2.getLastName());
        return compareByLastname != 0 ? compareByLastname : Integer.compare(o1.getAge(), o2.getAge());
    }
}
