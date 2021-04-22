package com.rakovets.course.java.core.practice.jcf_list.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class ActorLastNameAndAgeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        if (o1.getLastName().equals(o2.getLastName())) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else {
            return o1.getLastName().compareToIgnoreCase(o2.getLastName());
        }
    }
}
