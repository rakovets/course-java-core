package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Comparator;

public class ActorLastNameAndFeeComporator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        var result = Double.compare(o1.getFee(), o2.getFee());
        if (result == 0) {
            return o1.getLastName().compareTo(o2.getLastName());
        } else {
            return result;
        }
    }
}
