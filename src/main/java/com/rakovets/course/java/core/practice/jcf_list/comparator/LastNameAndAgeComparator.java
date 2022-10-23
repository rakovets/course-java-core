package com.rakovets.course.java.core.practice.jcf_list.comparator;

import com.rakovets.course.java.core.practice.jcf_list.life_of_actors.Actor;
import java.util.Comparator;

public class LastNameAndAgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor o1, Actor o2) {
        int resulOfLastName = o1.getLastName().compareTo(o2.getLastName());
        if (resulOfLastName == 0) {
            return Integer.compare(o1.getAge(), o2.getAge());
        } else {
            return resulOfLastName;
        }
    }
}
