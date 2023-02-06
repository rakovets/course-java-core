package com.rakovets.course.java.core.practice.jcf_list;

import java.util.Comparator;

public class ActorLastNameAndAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        var results = o1.getLastName().compareTo(o2.getLastName());
        if(results == 0) {
            return Double.compare(o1.getAge(),o2.getAge());
        }
        return results;
    }
}
