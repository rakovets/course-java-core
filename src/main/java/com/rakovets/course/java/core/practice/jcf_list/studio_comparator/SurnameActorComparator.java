package com.rakovets.course.java.core.practice.jcf_list.studio_comparator;

import com.rakovets.course.java.core.practice.jcf_list.Actor;

import java.util.Comparator;

public class SurnameActorComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a1, Actor a2) {
        return a1.getLastName().compareTo(a2.getLastName());
    }
}
