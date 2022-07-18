package com.rakovets.course.java.core.practice.jcf_list.projectstudio;

import java.util.Comparator;

public class lastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a1, Actor a2) {
        return a1.getLastName().compareTo(a2.getLastName());
    }
}
