package com.rakovets.course.java.core.practice.jcf_list.studio.comparators;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class ActorFeeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a, Actor b) {
        int result = 0;
        if (a.getFee() > b.getFee()) {
            result = 1;
        } else if (a.getFee() < b.getFee()) {
            result = -1;
        }
        return result;
    }
}

