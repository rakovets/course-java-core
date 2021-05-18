package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.List;

public class Studio {
    public List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
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
