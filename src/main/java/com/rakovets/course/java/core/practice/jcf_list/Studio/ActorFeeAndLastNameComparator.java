package com.rakovets.course.java.core.practice.jcf_list.Studio;

import java.util.Comparator;

public class ActorFeeAndLastNameComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        var results = Double.compare(o1.getAge(),o2.getAge());
        int res;
        if(results == 0) {
            return res = o1.getLastName().compareTo(o2.getLastName());
        }
        return results;
    }
}
