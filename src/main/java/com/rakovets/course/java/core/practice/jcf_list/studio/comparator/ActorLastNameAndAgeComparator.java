package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class ActorLastNameAndAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a, Actor b) {
        return a.getLastName().compareTo(b.getLastName()) == 0 ?
                Integer.compare(a.getAge(), b.getAge()) : a.getLastName().compareTo(b.getLastName());
    }
}
