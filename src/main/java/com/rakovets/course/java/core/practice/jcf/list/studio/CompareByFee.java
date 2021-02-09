package com.rakovets.course.java.core.practice.jcf.list.studio;

import java.util.Comparator;

public class CompareByFee implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int result = 0;
        if (o1.getFee() > o2.getFee()) {
            result = 1;
        } else if (o1.getFee() < o2.getFee()) {
            result = -1;
        }
        return result;
    }
}
