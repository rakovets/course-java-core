package com.rakovets.course.java.core.practice.jcf_list.comporator;

import com.rakovets.course.java.core.practice.jcf_list.model.Actor;

import java.util.Comparator;

public class ActorLastNameAndAgeComporator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int result = o1.getLastName().compareTo(o2.getLastName());
        if (result == 0) {
            result = ((Integer) o1.getAge()).compareTo(((Integer) o2.getAge()));
        }
        return result;
    }
}
