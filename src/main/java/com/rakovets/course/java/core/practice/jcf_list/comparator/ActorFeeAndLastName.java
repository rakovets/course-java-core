package com.rakovets.course.java.core.practice.jcf_list.comparator;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;
import java.util.Comparator;

public class ActorFeeAndLastName implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        if (o1.getFee() == o2.getFee()) {
            return o1.getLastName().compareToIgnoreCase(o2.getLastName());
        } else {
            return Integer.compare(o1.getFee(), o2.getFee());
        }
    }
}
