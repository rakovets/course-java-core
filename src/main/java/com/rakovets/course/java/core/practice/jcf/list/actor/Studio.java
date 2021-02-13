package com.rakovets.course.java.core.practice.jcf.list.actor;

import java.util.Comparator;
import java.util.List;

public class Studio {
    private final List<Actor> actorList;

    public Studio(List<Actor> actorList) {
        this.actorList = actorList;
    }

    private static void fire(List<Actor> actorsForFilm) {
        Comparator<Actor> actorComparatorByFee = new ActorComparatorByFee();
        actorsForFilm.sort(actorComparatorByFee);
        actorsForFilm.remove(0);
    }

    public static void printActors(List<Actor> actorsForFilm) {
        for (Actor actor : actorsForFilm) {
            System.out.println(actor);

        }
    }
}









