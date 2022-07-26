package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

/**
 * Comparator by last name and age.
 */
public class LastNameAgeComparator implements Comparator<Actor> {
    public int compare(Actor o1, Actor o2) {
        if (o1.getLastName().equals(o2.getLastName())) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else {
            return o1.getLastName().compareTo(o2.getLastName());
        }
    }
}
