package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Comparator;

public class FeeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a, Actor b) {
        return Double.compare(a.getFee(), b.getFee());
    }
}
