package com.rakovets.course.java.core.practice.jcf_list.Studio;

import java.util.Comparator;

public class ActorAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return Double.compare(o1.getAge(),o2.getAge());
    }
}
