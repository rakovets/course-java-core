package com.rakovets.course.java.core.example.jcf.comparator;

import com.rakovets.course.java.core.practice.jcf_list.Actor;

import java.util.Comparator;

public class ActorsFeeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return Double.compare(o1.getFee(), o2.getFee());
    }
}
