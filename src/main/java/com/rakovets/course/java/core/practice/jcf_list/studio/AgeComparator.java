package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Comparator;

public class AgeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor a, Actor b) {
        return Integer.compare(a.getAge(), b.getAge());
    }
}

