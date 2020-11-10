package com.rakovets.course.javabasics.example.collections.list.comparators;

import com.rakovets.course.javabasics.example.collections.list.Actor;

import java.util.Comparator;

public class ActorsLastNameAgeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        int result = CharSequence.compare(o1.getLastname(), o2.getLastname());
        if (result == 0) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else return result;
    }
}
