package com.rakovets.course.java.core.practice.jcf.list;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Manager {
    public static void main(String[] args) {
        List<Actor> actors = new LinkedList<>();
        actors.add(new Actor("bill", "aim", 120, 15));
        actors.add(new Actor("bill", "cim", 125, 18));
        actors.add(new Actor("bill", "bim", 125, 12));
        actors.add(new Actor("bill", "cim", 121, 17));
        actors.add(new Actor("bill", "dim", 119, 12));
        Studio actorsForFilm = new Studio(actors);
        Comparator<Actor> actorComparatorByFeeAndAge = new ActorComparatorByLastNameAndAge();
        actors.sort(actorComparatorByFeeAndAge);
        for (Actor actor : actors) {
            System.out.println(actor);
        }

    }
}
