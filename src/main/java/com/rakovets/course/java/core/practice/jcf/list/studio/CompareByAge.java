package com.rakovets.course.java.core.practice.jcf.list.studio;

import java.util.Comparator;

public class CompareByAge implements Comparator<Actor> {

    @Override
    public int compare(Actor o1, Actor o2) {
        if (o1.getAge() == o2.getAge()) {
            return 0;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        } else if (o1.getAge() > o2.getAge()) {
            return 1;
        } return 0;
    }
}
