package com.rakovets.course.java.core.practice.jcf_list.studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.ActorFeeComparator;

import java.util.List;

public class Studio {
    private List<Actor> actors;

    public List<Actor> fire(List<Actor> actors) {
        actors.sort(new ActorFeeComparator());
        actors.remove(0);
        return actors;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
