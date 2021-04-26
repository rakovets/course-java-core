package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.model.Actor;

import java.util.Comparator;

public class compareFeeAndLastname  implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        var result = Double.compare(o1.getFee(), o2.getFee());;
        if (result == 0) {
            return o1.getLastname().compareTo(o2.getLastname());
        } else {
            return result;
        }
    }
}
