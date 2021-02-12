package com.rakovets.course.java.core.practice.jcf.list.project_studio;

import com.rakovets.course.java.core.practice.jcf.list.project_studio.comparator.ActorComparatorByAge;
import com.rakovets.course.java.core.practice.jcf.list.project_studio.comparator.ActorComparatorByLastName;
import com.rakovets.course.java.core.practice.jcf.list.project_studio.comparator.ActorComparatorByFee;

import java.util.*;

public class StudioDemo {
    public static void main(String[] args) {
        List<Actor> actorList = new ArrayList<>();
        actorList.add(new Actor("Jared", "Leto", 1_100_000, 55));
        actorList.add(new Actor("Leonardo", "DiKaprio", 1_500_000, 46));
        actorList.add(new Actor("Matthew", "McConaughey", 1_300_000, 51));
        actorList.add(new Actor("Brad", "Pitt", 2_700_000, 55));
        actorList.add(new Actor("Keanu", "Reevse", 2_500_000, 51));

        Studio studio = new Studio(actorList);

        Comparator<Actor> actorComparatorByAge = new ActorComparatorByAge();
        Comparator<Actor> actorComparatorByLastName = new ActorComparatorByLastName();
        Comparator<Actor> actorComparatorByFee = new ActorComparatorByFee();
        Comparator<Actor> actorComparatorByFeeAndLastName = new ActorComparatorByFee().thenComparing(new ActorComparatorByLastName());
        Comparator<Actor> actorComparatorByLastNameAndAge = new ActorComparatorByLastName().thenComparing(new ActorComparatorByAge());

        actorList.sort(actorComparatorByAge);
        System.out.println("SortByAge: ");
        printActor(actorList);

        actorList.sort(actorComparatorByLastName);
        System.out.println("SortByLastName: ");
        printActor(actorList);

        actorList.sort(actorComparatorByFee);
        System.out.println("SortByFee: ");
        printActor(actorList);

        actorList.sort(actorComparatorByFeeAndLastName);
        System.out.println("SortByFeeAndLastName: ");
        printActor(actorList);

        actorList.sort(actorComparatorByLastNameAndAge);
        System.out.println("SortByLastNameAndAge: ");
        printActor(actorList);

        studio.fire(actorList);
        System.out.println("Fire: ");
        printActor(actorList);
    }

    private static void printActor(List<Actor> actorList) {
        for (Actor actors : actorList) {
            System.out.println(actors.toString());
        }
    }
}
