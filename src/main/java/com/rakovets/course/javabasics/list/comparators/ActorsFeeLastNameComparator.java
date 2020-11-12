package com.rakovets.course.javabasics.list.comparators;

import com.rakovets.course.javabasics.list.Actor;
import java.util.Comparator;

public class ActorsFeeLastNameComparator implements Comparator <Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        int result = Double.compare(o1.getFee(), o2.getFee());
        if (result == 0) {
            return CharSequence.compare(o1.getLastname(), o2.getLastname());
        } else return result;
    }
}
