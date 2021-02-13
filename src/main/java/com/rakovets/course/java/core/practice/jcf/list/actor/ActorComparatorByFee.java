package com.rakovets.course.java.core.practice.jcf.list.actor;

import java.util.Comparator;

class ActorComparatorByFee implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        if (o1 == o2) {
            return 0;
        } else return Integer.compare(o2.getFee(), o1.getFee());
    }
}
