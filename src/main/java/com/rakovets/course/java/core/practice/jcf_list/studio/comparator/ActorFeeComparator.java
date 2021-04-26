package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class ActorFeeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        return Integer.compare(o1.getFee(), o2.getFee());
    }
}
