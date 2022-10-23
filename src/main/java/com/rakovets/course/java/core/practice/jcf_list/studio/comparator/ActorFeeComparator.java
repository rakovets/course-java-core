package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class ActorFeeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a, Actor b) {
        return Integer.compare(b.getFee(), a.getFee());
    }
}
