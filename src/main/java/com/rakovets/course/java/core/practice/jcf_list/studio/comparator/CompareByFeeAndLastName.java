package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class CompareByFeeAndLastName implements Comparator<Actor> {
    @Override
    public int compare(Actor act1, Actor act2) {
        int result = Integer.compare(act1.getFee(), act2.getFee());
        if (result == 0) {
            result = act1.getLastName().compareTo(act2.getLastName());
        }
        return result;
    }
}
