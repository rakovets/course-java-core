package com.rakovets.course.util.hollywood;

import java.util.Comparator;

public class AgeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor1, Actor actor2) {
        if (actor1.getAge() > actor2.getAge()) {
            return 1;
        } else if (actor1.getAge() < actor2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}
