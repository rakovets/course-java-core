package com.rakovets.course.java.core.practice.jcf_list.studio_project;

import java.util.Comparator;

public class ActorsLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a1, Actor a2) {
        return a1.getLastName().compareTo(a2.getLastName());
    }
}
