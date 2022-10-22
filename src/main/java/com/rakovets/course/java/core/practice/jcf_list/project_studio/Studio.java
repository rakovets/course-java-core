package com.rakovets.course.java.core.practice.jcf_list.project_studio;

import com.rakovets.course.java.core.practice.jcf_list.comparators_for_actors.ActorFeeComparator;
import java.util.Comparator;
import java.util.List;

public class Studio {
    private List<Actor> actors;

    public List<Actor> fire(List<Actor> actors) {
        Comparator<Actor> comparator = new ActorFeeComparator();
        actors.sort(comparator);
        actors.remove(actors.size() - 1);
        return actors;
    }
}
