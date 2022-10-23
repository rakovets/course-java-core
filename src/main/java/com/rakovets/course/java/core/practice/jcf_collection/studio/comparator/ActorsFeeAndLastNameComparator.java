package com.rakovets.course.java.core.practice.jcf_collection.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_collection.studio.Actor;

import java.util.Comparator;

public class ActorsFeeAndLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor ac1, Actor ac2) {
        int result = Double.compare(ac1.getFee(), ac2.getFee());
        if (result == 0) {
            result = ac1.getLastName().compareTo(ac2.getLastName());
        }
        return result;
    }
}
