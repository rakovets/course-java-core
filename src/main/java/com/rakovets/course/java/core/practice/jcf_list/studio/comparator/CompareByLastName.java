package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class CompareByLastName implements Comparator<Actor> {
    @Override
    public int compare(Actor act1, Actor act2) {
        return act1.getLastName().compareTo(act2.getLastName());
    }
}
