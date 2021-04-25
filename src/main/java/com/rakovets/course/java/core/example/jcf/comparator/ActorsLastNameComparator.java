package com.rakovets.course.java.core.example.jcf.comparator;

import com.rakovets.course.java.core.practice.jcf_list.Actor;

import java.util.Comparator;

public class ActorsLastNameComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
