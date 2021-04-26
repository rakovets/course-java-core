package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Comparator;

public class ActorFirstNameComporator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return o1.getFirstName().compareTo(o2.getFirstName());
    }
}
