package com.rakovets.course.java.core.practice.jcf_list.studio_project;

import java.util.Comparator;

public class ActorsLastNameAndFeeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a1, Actor a2) {
        var result = Double.compare(a1.getFee(), a2.getFee());
        if (result == 0)
            return a1.getLastName().compareTo(a2.getLastName());
        else
            return result;
    }
}
