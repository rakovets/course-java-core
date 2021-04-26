package com.rakovets.course.java.core.practice.jcf_list.studio.model;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.studio.Studio;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.*;

import java.util.ArrayList;
import java.util.List;

public class StudioDemo {
    public static void main(String[] args) {
        List<Actor> actorsList = new ArrayList<>();
        actorsList.add(new Actor("Gennadiy", "Ovsyannikov", 5000, 85));
        actorsList.add(new Actor("Galina", "Orlova", 4000, 88));
        actorsList.add(new Actor("Tamara","Mironova", 3000, 70));

        printActors(actorsList);

        actorsList.sort(new ActorLastNameComparator());
        printActors(actorsList);

        actorsList.sort(new ActorAgeComparator());
        printActors(actorsList);

        actorsList.sort(new ActorFeeComparator());
        printActors(actorsList);

        actorsList.sort(new ActorLastNameAndAgeComparator());
        printActors(actorsList);

        actorsList.sort(new ActorFeeAndLastNameComparator());
        printActors(actorsList);

        Studio studio = new Studio(actorsList);
        printActors(studio.fire(actorsList));

    }

    private static void printActors(List<Actor> actorsList) {
        for (Actor actor : actorsList) {
            System.out.println(actor.toString());
        }
        System.out.println();
    }
}
