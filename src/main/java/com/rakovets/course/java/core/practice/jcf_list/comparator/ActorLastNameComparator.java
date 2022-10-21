package com.rakovets.course.java.core.practice.jcf_list.comparator;

import com.rakovets.course.java.core.practice.jcf_list.project_studio.Actor;

import java.util.Comparator;

public class ActorLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor1, Actor actor2) {
        return actor1.getLastName().compareTo(actor2.getLastName());
    }
}
