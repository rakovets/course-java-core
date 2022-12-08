package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class ActorAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a, Actor b) {
        int result = 0;
        if (a.getAge() > b.getAge()) {
            result = 1;
        } else if (a.getAge() < b.getAge()) {
            result = -1;
        }
        return result;
    }
}
