package com.rakovets.course.java.core.practice.jcf_list.studio_project;

import java.util.Comparator;

public class ActorsLastNameAndAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a1, Actor a2) {
        var result = a1.getLastName().compareTo(a2.getLastName());
        if (result == 0)
            return Integer.compare(a1.getAge(), a2.getAge());
        else
            return result;
    }
}
