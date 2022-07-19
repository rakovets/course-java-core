package com.rakovets.course.java.core.practice.jcf_list.studio.comparators_studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.actors_and_studio.Actor;

import java.util.Comparator;

public class AgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
