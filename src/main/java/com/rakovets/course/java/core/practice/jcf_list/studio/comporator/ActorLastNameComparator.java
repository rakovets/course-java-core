package com.rakovets.course.java.core.practice.jcf_list.studio.comporator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class ActorLastNameComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor first, Actor second) {
        return first.getLastName().compareToIgnoreCase(second.getLastName());
    }
}
