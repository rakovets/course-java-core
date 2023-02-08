package com.rakovets.course.java.core.practice.jcf_list.studio.comparators;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class ActorAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a, Actor b) {
        return Integer.compare(a.getAge(), b.getAge());
    }
}
