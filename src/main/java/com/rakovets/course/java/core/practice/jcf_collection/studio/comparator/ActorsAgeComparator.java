package com.rakovets.course.java.core.practice.jcf_collection.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_collection.studio.Actor;

import java.util.Comparator;

public class ActorsAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor ac1, Actor ac2) {
        return Integer.compare(ac1.getAge(), ac2.getAge());
    }
}
