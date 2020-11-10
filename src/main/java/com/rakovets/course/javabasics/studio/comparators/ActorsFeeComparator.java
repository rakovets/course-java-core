package com.rakovets.course.javabasics.studio.comparators;

import com.rakovets.course.javabasics.studio.Actor;

import java.util.Comparator;

public class ActorsFeeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        int result = Double.compare(o1.getFee(), o2.getFee());
        return result;
    }
}
