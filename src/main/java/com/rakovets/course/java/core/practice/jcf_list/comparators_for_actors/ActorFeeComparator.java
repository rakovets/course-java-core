package com.rakovets.course.java.core.practice.jcf_list.comparators_for_actors;

import com.rakovets.course.java.core.practice.jcf_list.project_studio.Actor;
import java.util.Comparator;

public class ActorFeeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return Double.compare(o1.getFee(), o2.getFee());
    }
}
