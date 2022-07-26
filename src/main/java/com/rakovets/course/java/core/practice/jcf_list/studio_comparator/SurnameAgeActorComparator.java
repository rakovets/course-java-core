package com.rakovets.course.java.core.practice.jcf_list.studio_comparator;

import com.rakovets.course.java.core.practice.jcf_list.Actor;

import java.util.Comparator;
import java.util.Objects;

public class SurnameAgeActorComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor a1, Actor a2) {
        if (!Objects.equals(a1.getLastName(), a2.getLastName())) {
            return a1.getLastName().compareTo(a2.getLastName());
        }
        return Integer.compare(a1.getAge(), a2.getAge());
    }
}
