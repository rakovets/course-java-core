package com.rakovets.course.java.core.practice.jcf_list.Studio.Models;

import com.rakovets.course.java.core.practice.jcf_list.Studio.Comparators.FeeComparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Studio {
    private List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Actor> fire(List<Actor> actors) {
        Comparator<Actor> comparator = new FeeComparator();
        actors.sort(comparator);
        actors.remove(actors.size() - 1);
        return actors;
    }
}
