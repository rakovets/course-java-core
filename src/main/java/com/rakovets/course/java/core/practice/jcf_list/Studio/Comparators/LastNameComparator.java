package com.rakovets.course.java.core.practice.jcf_list.Studio.Comparators;

import com.rakovets.course.java.core.practice.jcf_list.Studio.Models.Actor;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor1, Actor actor2) {
        return actor1.getLastName().compareTo(actor2.getLastName());
    }
}
