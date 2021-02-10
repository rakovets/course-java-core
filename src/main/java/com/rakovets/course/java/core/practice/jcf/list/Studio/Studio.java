package com.rakovets.course.java.core.practice.jcf.list.Studio;

import java.util.List;

public class Studio {
    private final List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }

    public void fire() {
        Actor maxFee = actors.get(0);
        for (Actor actor: actors) {
            if (actor.getFee() > maxFee.getFee())
                maxFee = actor;
        }
        actors.remove(maxFee);
    }
}
