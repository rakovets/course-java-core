package com.rakovets.course.java.core.practice.jcf_list.studio.comparators;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;
import java.util.Comparator;

public class ActorsLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor1, Actor actor2) {
        return actor1.getLastName().compareTo(actor2.getLastName());
    }
}
