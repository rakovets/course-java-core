package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;

import java.util.Comparator;

public class CompareByAge implements Comparator<Actor> {
    @Override
    public int compare(Actor act1, Actor act2) {
        return Integer.compare(act1.getAge(), act2.getAge());
    }
}
