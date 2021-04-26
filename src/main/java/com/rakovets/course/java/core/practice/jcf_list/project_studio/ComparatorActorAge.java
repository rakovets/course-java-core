package com.rakovets.course.java.core.practice.jcf_list.project_studio;

import java.util.Comparator;

public class ComparatorActorAge implements Comparator<Actor> {
    @Override
    public int compare(Actor first, Actor second) {
        if (first == second) {
            return 0;
        } else {
            return Integer.compare(first.getAge(), second.getAge());
        }
    }
}
