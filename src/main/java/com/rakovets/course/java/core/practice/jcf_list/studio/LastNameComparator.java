package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor a, Actor b) {
        return a.getLastName().compareTo(b.getLastName());
    }
}
