package com.rakovets.course.java.core.practice.jcf_list.projectstudio;

import java.util.Comparator;

public class feeComparator implements Comparator<Actor> {

    @Override
    public int compare(Actor a1, Actor a2) {
        if (a1.getFee() == a2.getFee())
        return 0;
        else if (a1.getFee() > a2.getFee())
            return 1;
        else
            return -1;
    }
}
