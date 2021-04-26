package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class ActorFeeAndLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor first, Actor second) {
        if (first.getFee() == second.getFee()) {
            return first.getLastName().compareToIgnoreCase(second.getLastName());
        } else {
            return Double.compare(first.getFee(), second.getFee());
        }
    }
}
