package com.rakovets.course.java.core.practice.jcf_list.comparator;

import com.rakovets.course.java.core.practice.jcf_list.Actor;
import java.util.Comparator;

public class FeeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        return Integer.compare(o2.getFee(), o1.getFee());
    }
}
