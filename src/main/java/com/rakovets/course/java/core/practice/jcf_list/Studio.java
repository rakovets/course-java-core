package com.rakovets.course.java.core.practice.jcf_list;

import java.util.*;

public class Studio {
    private List<Actor> actors;

    public Studio(List actors) {
        this.actors = actors;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public List<Actor> fire(List<Actor> actors) {
        Actor maxFee = actors.get(0);
        for (Actor actor : actors) {
            if (actor.getFee() > maxFee.getFee()) {
                maxFee = actor;
            }
        }
        actors.remove(maxFee);
        return actors;
    }
}
