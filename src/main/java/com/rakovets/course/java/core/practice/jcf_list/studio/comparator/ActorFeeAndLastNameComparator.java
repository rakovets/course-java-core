package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class ActorFeeAndLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a, Actor b) {
        int result = Integer.compare(b.getFee(), a.getFee());
        if (result == 0) {
            return a.getLastName().compareTo(b.getLastName());
        } else {
            return result;
        }
    }
}
