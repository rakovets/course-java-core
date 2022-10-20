package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class CompareByFee implements Comparator<Actor> {
    @Override
    public int compare(Actor act1, Actor act2) {
        return Integer.compare(act1.getFee(), act2.getFee());
    }
}
