package com.rakovets.course.java.core.practice.jcf_list.studio;


import java.util.Comparator;

public class LastNameAndAgeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor a, Actor b) {
        var result = a.getLastName().compareTo(b.getLastName());
        if (result == 0) {
            return Integer.compare(a.getAge(), b.getAge());
        } else {
            return result;
        }
    }
}
