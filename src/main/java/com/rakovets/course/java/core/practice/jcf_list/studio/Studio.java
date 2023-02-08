package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.List;

public class Studio {
    private final List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public void fire(List<Actor> actors) {
        Actor actorToFire = actors.get(0);

        for (Actor actor : actors) {
            if (actor.getFee() > actorToFire.getFee()) {
                actorToFire = actor;
            }
        }

        actors.remove(actorToFire);
    }

    public List<Actor> getActors() {
        return actors;
    }
}
