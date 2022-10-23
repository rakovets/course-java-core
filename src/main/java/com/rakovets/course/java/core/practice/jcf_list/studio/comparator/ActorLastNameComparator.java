package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class ActorLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a, Actor b) {
        return a.getLastName().compareTo(b.getLastName());
    }
}
