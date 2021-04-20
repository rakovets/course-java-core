package com.rakovets.course.java.core.practice.jcf_list.comporator;

import com.rakovets.course.java.core.practice.jcf_list.model.Actor;

import java.util.Comparator;

public class ActorsFeeAndLastNameComporator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int result = ((Integer) o1.getFee()).compareTo(((Integer) o2.getFee()));
        if (result == 0) {
            result = o1.getLastName().compareTo(o2.getLastName());
        }
        return result;
    }
}
