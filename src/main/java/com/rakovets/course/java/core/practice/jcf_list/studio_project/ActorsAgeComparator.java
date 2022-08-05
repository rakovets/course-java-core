package com.rakovets.course.java.core.practice.jcf_list.studio_project;

import java.util.Comparator;

public class ActorsAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a1, Actor a2) {
        return Integer.compare(a1.getAge(), a2.getAge());
    }
}
