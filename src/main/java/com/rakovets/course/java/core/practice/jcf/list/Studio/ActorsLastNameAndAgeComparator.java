package com.rakovets.course.java.core.practice.jcf.list.Studio;

import java.util.Comparator;

public class ActorsLastNameAndAgeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        var result = o1.getLastName().compareTo(o2.getLastName());
        if (result == 0)
            return Integer.compare(o1.getAge(), o2.getAge());
        else
            return result;
    }
}
