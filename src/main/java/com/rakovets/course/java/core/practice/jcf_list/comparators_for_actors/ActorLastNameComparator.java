package com.rakovets.course.java.core.practice.jcf_list.comparators_for_actors;

import com.rakovets.course.java.core.practice.jcf_list.project_studio.Actor;
import java.util.Comparator;

public class ActorLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        var result = o1.getLastName().compareTo(o2.getLastName());
        return result;
    }
}
