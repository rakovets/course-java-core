package com.rakovets.course.java.core.practice.jcf_list.studio.comparators_studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.actors_and_studio.Actor;

import java.util.Comparator;

public class FeeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return Double.compare(o1.getFee(), o2.getFee());
    }
}
