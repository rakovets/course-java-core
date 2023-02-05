package com.rakovets.course.java.core.practice.jcf_list.studio.comparators;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;
import java.util.Comparator;

public class ActorsLastNameAndAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor1, Actor actor2) {
        int cmp = actor1.getLastName().compareTo(actor2.getLastName());
        if (cmp != 0) {
            return cmp;
        }
        return actor1.getAge().compareTo(actor2.getAge());
    }
}
