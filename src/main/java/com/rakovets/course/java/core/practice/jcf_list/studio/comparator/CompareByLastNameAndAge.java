package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class CompareByLastNameAndAge implements Comparator<Actor> {
    @Override
    public int compare(Actor act1, Actor act2) {
        int result = act1.getLastName().compareTo(act2.getLastName());
        if (result == 0) {
            result = Integer.compare(act1.getAge(), act2.getAge());
        }
        return result;
    }
}
