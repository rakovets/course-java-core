package com.rakovets.course.java.core.practice.jcf_list.studio.actors_and_studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.comparators_studio.FeeComparator;

import java.util.List;

public class Studio {
    private List<Actor> actors;

    public void fire(List<Actor> actors) {
        actors.sort(new FeeComparator());
        actors.remove(actors.size() - 1);
    }
}
