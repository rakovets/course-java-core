package com.rakovets.course.java.core.practice.jcf_list.project_studio.comparators;

import com.rakovets.course.java.core.practice.jcf_list.project_studio.Actor;

import java.util.Comparator;

public class ActorLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor, Actor comparableActor) {
        return actor.getLastName().compareTo(comparableActor.getLastName());
    }
}
