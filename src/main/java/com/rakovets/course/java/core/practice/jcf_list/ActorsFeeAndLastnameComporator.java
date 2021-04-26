package com.rakovets.course.java.core.practice.jcf_list;

import java.util.Comparator;

public class ActorsFeeAndLastnameComporator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int result = Integer.compare(o1.getFee(), o2.getFee());
        if (result == 0) {
            return o1.getLastname().compareTo(o2.getLastname());
        }
        return result;
    }
}
