package com.rakovets.course.java.core.practice.jcf.list.project_studio.comparator;

import com.rakovets.course.java.core.practice.jcf.list.project_studio.Actor;

import java.util.Comparator;

public class ActorComparatorByLastName implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return o1.getLastName().compareTo(o2.getLastName());
    }
}
