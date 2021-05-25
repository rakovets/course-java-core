package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.model.Actor;
import java.util.Comparator;

public class ComparatorForFee implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return o1.getFee() - o2.getFee();
    }
}
