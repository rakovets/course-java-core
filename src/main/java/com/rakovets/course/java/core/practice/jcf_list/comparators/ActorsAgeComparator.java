package com.rakovets.course.java.core.practice.jcf_list.comparators;

import com.rakovets.course.java.core.practice.jcf_list.models.Actor;

import java.util.Comparator;

public class ActorsAgeComparator implements Comparator<Actor> {

    @Override
    public int compare (Actor actor1, Actor actor2) {
        return Double.compare(actor1.getAge(), actor2.getAge());
    }
}
