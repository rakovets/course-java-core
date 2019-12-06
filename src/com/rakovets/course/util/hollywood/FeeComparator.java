package com.rakovets.course.util.hollywood;

import java.util.Comparator;

public class FeeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor1, Actor actor2) {
        if (actor1.getFee() > actor2.getFee()) {
            return 1;
        } else if (actor1.getFee() < actor2.getFee()) {
            return -1;
        } else {
            return 0;
        }
    }
}
