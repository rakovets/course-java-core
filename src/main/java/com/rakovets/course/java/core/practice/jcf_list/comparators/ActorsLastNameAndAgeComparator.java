package com.rakovets.course.java.core.practice.jcf_list.comparators;

import com.rakovets.course.java.core.practice.jcf_list.models.Actor;

import java.util.Comparator;

public class ActorsLastNameAndAgeComparator implements Comparator<Actor> {

    @Override
    public int compare (Actor actor1, Actor actor2) {
        int resultOfComparing = actor1.getLastName().compareTo(actor2.getLastName());
        if (resultOfComparing == 0) {
            return Double.compare(actor1.getAge(), actor2.getAge());
        } else {
            return resultOfComparing;
        }
    }
}
