package com.rakovets.course.java.core.practice.jcf.list.studio;

import java.util.Comparator;

public class ActorComparatorByFee implements Comparator<Actor> {
    @Override
    public int compare(Actor first, Actor second) {
        if (first == second) {
            return 0;
        } else {
            return Integer.compare(first.getFee(), second.getFee());
        }
    }
}
