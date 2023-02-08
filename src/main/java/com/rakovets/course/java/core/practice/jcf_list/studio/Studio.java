package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Studio {
    private List<Actor> actors;

    public Studio(List<Actor> actors) {
        this.actors = actors;
    }


    public Studio fire(List<Actor> actors) {
        Iterator<Actor> iterator = actors.iterator();
        Integer highestFee = 0;

        for (Actor actor : actors) {
            if (actor.getFee() > highestFee) {
                highestFee = actor.getFee();
            }
        }

        while (iterator.hasNext()) {
            if (Objects.equals(iterator.next().getFee(), highestFee)) {
                iterator.remove();
            }
        }

        return new Studio(actors);
    }

    public List<Actor> getActors() {
        return actors;
    }
}
