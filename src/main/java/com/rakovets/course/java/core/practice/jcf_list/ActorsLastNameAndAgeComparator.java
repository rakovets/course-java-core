package com.rakovets.course.java.core.practice.jcf_list;

import java.util.Comparator;

public class ActorsLastNameAndAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        var result = ((Integer) o1.getLastname().compareTo(o2.getLastname()));
        if (result == 0) {
            return o1.getAge() - o2.getAge();
        }
        return result;
    }
}
