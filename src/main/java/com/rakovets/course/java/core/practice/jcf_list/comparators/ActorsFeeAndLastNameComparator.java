package com.rakovets.course.java.core.practice.jcf_list.comparators;

import com.rakovets.course.java.core.practice.jcf_list.models.Actor;

import java.util.Comparator;

public class ActorsFeeAndLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare (Actor actor1, Actor actor2) {
        if(actor1.getFee() != actor2.getFee()) {
            return Double.compare(actor1.getFee(), actor2.getFee());
        } else {
            return actor1.getLastName().compareTo(actor2.getLastName());
        }
    }
}
