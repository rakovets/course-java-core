package com.rakovets.course.java.core.practice.jcf.list.studio;

import java.util.List;

public class Studio {
    List<Actor> actorList;

    public Studio(List<Actor> actors) {
        this.actorList = actors;
    }

    public void fire(List<Actor> actors) {
        actors.sort(Actor::compareTo);
        actors.remove(actors.size() - 1);
    }
}
