package com.rakovets.course.javabasics.list.comparators;

import com.rakovets.course.javabasics.list.Actor;

import java.util.Comparator;


public class ActorsLastNameComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        int result = CharSequence.compare(o1.getLastname(), o2.getLastname());
        return result;
    }
}
