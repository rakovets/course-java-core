package com.rakovets.course.java.core.practice.jcf_list.project_studio.comparators;

import com.rakovets.course.java.core.practice.jcf_list.project_studio.Actor;

import java.util.Comparator;

public class ActorLastNameAndAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor, Actor comparableActor) {
        int lastNameResult = actor.getLastName().compareTo(comparableActor.getLastName());
        if (lastNameResult == 0) {
            return actor.getAge().compareTo(comparableActor.getAge());
        }
        return lastNameResult;
    }
}
