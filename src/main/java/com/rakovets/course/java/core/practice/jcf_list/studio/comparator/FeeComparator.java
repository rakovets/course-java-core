package com.rakovets.course.java.core.practice.jcf_list.studio.comparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;
import java.util.Comparator;

public class FeeComparator implements Comparator<Actor> {
    @Override
    public int compare(Actor actor1, Actor actor2) {
        return Integer.compare(actor1.getFee(), actor2.getFee());
    }
}
