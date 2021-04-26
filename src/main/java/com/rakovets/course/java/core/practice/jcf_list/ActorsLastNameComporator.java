package com.rakovets.course.java.core.practice.jcf_list;

import java.util.Comparator;

public class ActorsLastNameComporator implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        return (int) o1.getLastname().compareTo(o2.getLastname());
    }
}
