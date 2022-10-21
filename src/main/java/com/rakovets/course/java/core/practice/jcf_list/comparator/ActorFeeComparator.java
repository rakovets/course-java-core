package com.rakovets.course.java.core.practice.jcf_list.comparator;

import com.rakovets.course.java.core.practice.jcf_list.project_studio.Actor;

import java.util.Comparator;

public class ActorFeeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor1, Actor actor2) {
        return Double.compare(actor1.getFee(), actor2.getFee());
    }
}
