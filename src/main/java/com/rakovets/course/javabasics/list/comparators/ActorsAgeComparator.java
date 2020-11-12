package com.rakovets.course.javabasics.list.comparators;

import com.rakovets.course.javabasics.list.Actor;

import java.util.Comparator;

public class ActorsAgeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        int result = Integer.compare(o1.getAge(), o2.getAge());
        return result;
    }


}
