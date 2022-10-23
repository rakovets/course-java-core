package com.rakovets.course.java.core.practice.jcf_collection.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_collection.studio.Actor;

import java.util.Comparator;

public class ActorsLastNameAndAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int result = o1.getLastName().compareTo(o2.getLastName());
        if (result == 0) {
            result = Integer.compare(o1.getAge(), o2.getAge());
        }
        return result;
    }
}
