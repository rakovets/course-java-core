package com.rakovets.course.javabasics.studio;

import com.rakovets.course.javabasics.studio.comparators.*;
import java.util.LinkedList;


public class Studio {

    private LinkedList<Actor> actors;

    public Studio(LinkedList<Actor> actors) {
        this.actors = actors;
    }

    public LinkedList<Actor> fire() {
        actors.sort(new ActorsFeeComparator());
        actors.removeLast();
        return actors;
    }

    public LinkedList<Actor> getSortedListByAge() {
        actors.sort(new ActorsAgeComparator());
        return actors;
    }

    public LinkedList<Actor> getSortedByLastName() {
        actors.sort(new ActorsLastNameComparator());
        return actors;
    }

    public LinkedList<Actor> getSortedByLastNameAge() {
        actors.sort(new ActorsLastNameAgeComparator());
        return actors;
    }

    public LinkedList<Actor> getSortedActorsByFeeLastName() {
        actors.sort(new ActorsFeeLastNameComparator());
        return actors;
    }

    public LinkedList<Actor> getActors() {
        return actors;
    }
}
