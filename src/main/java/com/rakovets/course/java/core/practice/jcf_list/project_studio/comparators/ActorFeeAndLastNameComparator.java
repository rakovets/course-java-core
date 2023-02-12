package com.rakovets.course.java.core.practice.jcf_list.project_studio.comparators;

import com.rakovets.course.java.core.practice.jcf_list.project_studio.Actor;

import java.util.Comparator;

public class ActorFeeAndLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor, Actor comparableActor) {
        int feeResult = actor.getFee().compareTo(comparableActor.getFee());
        if (feeResult == 0) {
            return actor.getLastName().compareTo(comparableActor.getLastName());
        }
        return feeResult;
    }
}
