package com.rakovets.course.java.core.practice.jcf_list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Studio {
    LinkedList<Actor> actors = new LinkedList<>();

    public Studio (LinkedList<Actor> actors) {
        for (Actor x: actors) {
            this.actors.add(x);
        }
    }

    public LinkedList<Actor> fire(LinkedList<Actor> actors) {
        actors.sort(new ActorFeeComparator());
        actors.removeLast();
        return actors;
    }
}
