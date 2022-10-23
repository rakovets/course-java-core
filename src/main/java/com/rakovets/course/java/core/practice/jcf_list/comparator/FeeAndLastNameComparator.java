package com.rakovets.course.java.core.practice.jcf_list.comparator;

import com.rakovets.course.java.core.practice.jcf_list.Actor;
import java.util.Comparator;

public class FeeAndLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int resultOfHighFee = Integer.compare(o2.getFee(), o1.getFee());
        if (resultOfHighFee == 0) {
            return o1.getLastName().compareTo(o2.getLastName());
        } else {
            return resultOfHighFee;
        }
    }
}
