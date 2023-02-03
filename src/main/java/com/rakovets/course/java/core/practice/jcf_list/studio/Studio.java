package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Collections;
import java.util.List;

public class Studio {
    private List<Actor> actors;

    public List<Actor> fire(List<Actor> actors) {
        Collections.sort(actors);
        actors.remove(actors.size() - 1);
        return actors;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
