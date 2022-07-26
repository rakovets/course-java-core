package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.studio_comparator.FeeActorComparator;

import java.util.ArrayList;
import java.util.List;

public class Studio {
    private List<Actor> actors = new ArrayList<>();

    public void addActors(Actor actor) {
        actors.add(actor);
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Actor> fire(List<Actor> actors) {
        List<Actor> list = new ArrayList<>(actors);
        list.sort(new FeeActorComparator());
        Actor actor = list.remove(list.size() - 1);
        actors.remove(actor);
        return actors;
    }
}
