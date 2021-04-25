package com.rakovets.course.java.core.practice.jcf_list.studioTest;

import com.rakovets.course.java.core.practice.jcf_list.studio.comporator.*;
import com.rakovets.course.java.core.practice.jcf_list.studio.model.Actor;
import com.rakovets.course.java.core.practice.jcf_list.studio.model.Studio;

import java.util.ArrayList;
import java.util.List;

public class StudioDemo {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Slava", "Marlow", 100, 25));
        actors.add(new Actor("Filip", "Kirkorov", 111, 26));
        actors.add(new Actor("Nikolai", "Baskov", 120, 27));
        actors.add(new Actor("Tom", "Kirkorov", 130, 28));
        actors.add(new Actor("Jasom", "Statham", 100, 29));

        Studio studio = new Studio(actors);
        printActrors(studio.fire(actors));
        actors.sort(new ActorsLastNameComporator());
        printActrors(actors);
        actors.sort(new ActorsAgeComporator());
        printActrors(actors);
        actors.sort(new ActorsFeeComporator());
        printActrors(actors);
        actors.sort(new ActorLastNameAndAgeComporator());
        printActrors(actors);
        actors.sort(new ActorsFeeAndLastNameComporator());
        printActrors(actors);
    }

    public static void printActrors(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.toString());
        }
        System.out.println("\n");
    }
}
