package com.rakovets.course.java.core.practice.jcf_list;

import java.util.Comparator;

public class ActorLastNameComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        int results = o1.getLastName().compareTo(o2.getLastName());
        return results;
    }
}
