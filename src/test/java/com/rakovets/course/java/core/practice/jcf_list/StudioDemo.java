package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.studio.*;

import java.util.ArrayList;
import java.util.List;

public class StudioDemo {
    public static void main(String[] args) {
        List<Actor> actorsList = new ArrayList<>();
        actorsList.add(new Actor("Andrej", "Malachov", 1000, 55));
        actorsList.add(new Actor("Marina", "Aleksandrova", 700, 41));
        actorsList.add(new Actor("Aleksandr","Belov", 650, 35));
        actorsList.add(new Actor("Oksana", "Akinshina", 700, 33));

        printActors(actorsList);

        actorsList.sort(new ActorFirstNameComporator());
        printActors(actorsList);

        actorsList.sort(new ActorLastNameComporator());
        printActors(actorsList);

        actorsList.sort(new ActorAgeComporator());
        printActors(actorsList);

        actorsList.sort(new ActorFeeComporator());
        printActors(actorsList);

        actorsList.sort(new ActorLastNameAndAgeComporator());
        printActors(actorsList);

        actorsList.sort(new ActorLastNameAndFeeComporator());
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
