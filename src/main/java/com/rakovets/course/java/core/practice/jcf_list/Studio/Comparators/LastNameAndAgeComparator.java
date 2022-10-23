package com.rakovets.course.java.core.practice.jcf_list.Studio.Comparators;

import com.rakovets.course.java.core.example.generics.model.restrict.A;
import com.rakovets.course.java.core.practice.jcf_list.Studio.Models.Actor;

import java.util.Comparator;

public class LastNameAndAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor1, Actor actor2) {
        var result = actor1.getLastName().compareTo(actor2.getLastName());
        if (result == 0) {
            return Integer.compare(actor1.getAge(), actor2.getAge());
        } else {
            return result;
        }
    }
}
