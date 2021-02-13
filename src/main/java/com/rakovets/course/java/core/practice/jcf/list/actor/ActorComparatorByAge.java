package com.rakovets.course.java.core.practice.jcf.list.actor;

import java.util.Comparator;

class ActorComparatorByAge implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        if (o1 == o2) {
            return 0;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        } else if (o1.getAge() > o2.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}
