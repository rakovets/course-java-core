package com.rakovets.course.java.core.practice.jcf_list.studio.comparators;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;
import java.util.Comparator;

public class ActorsFeeAndLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor1, Actor actor2) {
        int cmp = actor1.getFee().compareTo(actor2.getFee());
        if (cmp != 0) {
            return cmp;
        }
        return String.valueOf(actor1.getLastName()).compareTo(actor2.getLastName());
    }
}
