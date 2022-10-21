package com.rakovets.course.java.core.practice.jcf_list.comparator;

import com.rakovets.course.java.core.practice.jcf_list.project_studio.Actor;

import java.util.Comparator;

public class ActorFeeLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor1, Actor actor2) {
        var result = Double.compare(actor1.getFee(), actor2.getFee());
        if (result == 0) {
            return actor1.getLastName().compareTo(actor2.getLastName());
        } else {
            return result;
        }
    }
}
