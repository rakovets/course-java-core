package com.rakovets.course.java.core.practice.jcf_list.studio.comporator;

import com.rakovets.course.java.core.practice.jcf_list.studio.model.Actor;

import java.util.Comparator;

public class ActorNameComporator implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        var result = o1.getFirstName().compareTo(o2.getFirstName());
        if (result == 0) {
            return Double.compare(o1.getFee(), o2.getFee());
        } else {
            return result;
        }
    }
}
