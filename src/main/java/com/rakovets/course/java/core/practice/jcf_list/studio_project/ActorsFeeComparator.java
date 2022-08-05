package com.rakovets.course.java.core.practice.jcf_list.studio_project;

import java.util.Comparator;

public class ActorsFeeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a1, Actor a2) {
        return Double.compare(a1.getFee(), a2.getFee());
    }
}
