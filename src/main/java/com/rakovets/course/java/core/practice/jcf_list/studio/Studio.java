package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Collections;
import java.util.List;

public class Studio {
    private final List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Actor> fire(List<Actor> actors) {
        Collections.sort(actors);
        actors.remove(actors.size() - 1);
        return actors;
    }

    public List<Actor> getActors() {
        return actors;
    }
}
