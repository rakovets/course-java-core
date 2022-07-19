package com.rakovets.course.java.core.practice.jcf_list.studio.comparators_studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.actors_and_studio.Actor;

import java.util.Comparator;

public class LastNameAndAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int sortByLastName = o1.getLastName().compareTo(o2.getLastName());
        return sortByLastName != 0 ? sortByLastName : Integer.compare(o1.getAge(), o2.getAge());
    }
}
