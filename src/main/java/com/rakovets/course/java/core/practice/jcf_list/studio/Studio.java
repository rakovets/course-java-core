package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.ArrayList;
import java.util.List;

public class Studio {
    private List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Actor> fire(List<Actor> actors) {
        List<Actor> list = new ArrayList<>(actors);
        list.sort(new FeeComparator());
        Actor actor = list.remove(list.size() - 1);
        actors.remove(actor);
        return actors;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
