package com.rakovets.course.java.core.practice.jcf_list.studio.comporator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class ActorLastNameAndAgeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor first, Actor second) {
        if (first.getLastName().equals(second.getLastName())) {
            return Integer.compare(first.getAge(), second.getAge());
        } else {
            return first.getLastName().compareToIgnoreCase(second.getLastName());
        }
    }
}
