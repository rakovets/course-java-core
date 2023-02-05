package com.rakovets.course.java.core.practice.jcf_list.studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.comparators.*;
import java.util.ArrayList;
import java.util.Arrays;

public class StudioDemo {
    public static void main(String[] args) {
        Actor dzmitry = new Actor("Dzmitry", "Krasiuk", 850, 29);
        Actor alexander = new Actor("Alexander", "Braim", 940, 27);
        Actor elena = new Actor("Elena", "Ankova", 1100, 33);
        Actor julia = new Actor("Julia", "Serbskaya", 1100, 25);
        Actor anna = new Actor("Anna", "Krasiuk", 1400, 22);
        Actor iya = new Actor("Iya", "Krasiuk", 1100, 30);
        ArrayList<Actor> actorsList = new ArrayList<>(Arrays.asList(dzmitry, alexander, elena, julia, anna, iya));
        Studio sonyVision = new Studio(actorsList);

        actorsList.sort(new ActorsAgeComparator());
        printList(sonyVision);

        actorsList.sort(new ActorsFeeComparator());
        printList(sonyVision);

        actorsList.sort(new ActorsLastNameComparator());
        printList(sonyVision);

        actorsList.sort(new ActorsLastNameAndAgeComparator());
        printList(sonyVision);

        actorsList.sort(new ActorsFeeAndLastNameComparator());
        printList(sonyVision);

        sonyVision.fire(actorsList);
        printList(sonyVision);
    }

    public static void printList(Studio studio) {
        for (Actor actor : studio.getActors()) {
            System.out.println("Actor: " + actor.getFirstName() + " " + actor.getLastName() + ", " + actor.getFee()
                    + "$ fee, " + actor.getAge() + " years old");
        }
        System.out.println();
    }
}
