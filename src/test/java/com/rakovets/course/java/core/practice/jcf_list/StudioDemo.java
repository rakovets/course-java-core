package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.studio.Studio;
import com.rakovets.course.java.core.practice.jcf_list.studio.comporators.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StudioDemo {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Alex", "Aleksandrov", 25, 2500));
        actors.add(new Actor("Ivan", "Aleksandrov", 26, 2000));
        actors.add(new Actor("Serg", "Petrov", 28, 3000));
        actors.add(new Actor("Alex", "Petrov", 35, 3000));
        actors.add(new Actor("Mihsa", "Mihailov", 18, 500));
        actors.add(new Actor("Andrey", "Andreev", 45, 45000));
        System.out.println(actors);
        System.out.println(actors.get(actors.size() - 1));

        Comparator<Actor> actorLastNameComparator = new ActorLastNameComparator();
        actors.sort(actorLastNameComparator);
        System.out.println('\n' + "Sorts for last name" + '\n');
        for (Actor actor : actors) {
            System.out.print(actor);
        }
        System.out.println(actors.size());

        Comparator<Actor> actorAgeComparator = new ActorAgeComparator();
        actors.sort(actorAgeComparator);
        System.out.println('\n' + "Sorts for age" + '\n');
        for (Actor actor : actors) {
            System.out.print(actor);
        }

        Comparator<Actor> actorFeeComparator = new ActorFeeComparator();
        actors.sort(actorFeeComparator);
        System.out.println('\n' + "Sorts for fee" + '\n');
        for (Actor actor : actors) {
            System.out.print(actor);
        }

        Comparator<Actor> actorLastNameAndAgeComparator = new ActorLastNameAndAgeComparator();
        actors.sort(actorLastNameAndAgeComparator);
        System.out.println('\n' + "Sorts for last name and age" + '\n');
        for (Actor actor : actors) {
            System.out.print(actor);
        }

        Comparator<Actor> actorFeeAndLastNameComparator = new ActorFeeAndLastNameComparator();
        actors.sort(actorFeeAndLastNameComparator);
        System.out.println('\n' + "Sorts for fee and last name" + '\n');
        for (Actor actor : actors) {
            System.out.print(actor);
        }

        Studio studio = new Studio(actors);
        studio.fire(actors);
        System.out.println('\n' + "New array without actor with maximum fee" + '\n');
        System.out.println(Arrays.asList(actors));
    }
}
