package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class ActorAgeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor first, Actor second) {
        return Integer.compare(first.getAge(), second.getAge());
    }
}
