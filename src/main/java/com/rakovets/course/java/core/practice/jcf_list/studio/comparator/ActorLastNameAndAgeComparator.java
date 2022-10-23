package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class ActorLastNameAndAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a, Actor b) {
        int result = a.getLastName().compareTo(b.getLastName());
        if (result == 0) {
            return Integer.compare(a.getAge(), b.getAge());
        } else {
            return result;
        }
    }
}
