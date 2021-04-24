package com.rakovets.course.java.core.practice;

import java.util.*;

public class Studio  {
    private List<Actor> actors;

    public Studio(List actors) {
        this.actors = actors;
    }

    public List<Actor> getActors() {
        return actors;
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

