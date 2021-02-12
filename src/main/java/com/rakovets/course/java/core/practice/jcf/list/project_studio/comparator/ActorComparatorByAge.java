package com.rakovets.course.java.core.practice.jcf.list.project_studio.comparator;

import com.rakovets.course.java.core.practice.jcf.list.project_studio.Actor;

import java.util.Comparator;

public class ActorComparatorByAge implements Comparator <Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        if (o1 == o2) {
            return 0;
        } else if (o1.getAge() > o2.getAge()) {
            return -1;
        } else if (o1.getAge() < o2.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}
