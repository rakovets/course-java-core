package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.List;

public class Studio {
    private List<Actor> actors;

    public void fire(List<Actor> actors) {
        actors.sort(new FeeComparator());
        actors.remove(actors.size() - 1);
    }
}
