package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.model.Actor;

import java.util.Comparator;

public class compareNameAndAge  implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        var result = o1.getLastname().compareTo(o2.getLastname());
        if (result == 0) {
            return Double.compare(o1.getAge(), o2.getAge());
        } else {
            return result;

        }
    }
}
