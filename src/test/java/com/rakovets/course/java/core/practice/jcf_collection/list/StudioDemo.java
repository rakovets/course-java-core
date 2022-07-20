package com.rakovets.course.java.core.practice.jcf_collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudioDemo {
    public static void main(String[] args) {
        List<Actor> actorsStud = new ArrayList<>();
        Studio colambia = new Studio(actorsStud);
        actorsStud.add(new Actor("Vadim", "Voropai", 1100, 35));
        actorsStud.add(new Actor("Victor", "Budre", 1000, 41));
        actorsStud.add(new Actor("Victor", "Budrev", 1000, 41));
        actorsStud.add(new Actor("Marina", "Chiki-Piki", 1300, 28));
        actorsStud.add(new Actor("Mangol", "Voropai", 1200, 55));
        actorsStud.add(new Actor("Ruki", "Bazuri", 2000, 35));
        System.out.println("number of actors - " + actorsStud.size());

        Collections.sort(actorsStud);
        System.out.println("Actors who work in the studio Columbia Pictures list:");

        colambia.printActorList();
        colambia.fire(actorsStud);
        System.out.println("number of actors - " + actorsStud.size());
        System.out.println("After firing the most expensive actor:");

        colambia.printActorList();
        actorsStud.sort(new SortFeeComparatot());
        for (Actor a : actorsStud) System.out.println(a);
        System.out.println("\n");

        actorsStud.sort(new SortFeeComparatot());
        System.out.println("Sort Fee ");
        for (Actor a : actorsStud) System.out.println(a);
        System.out.println("\n");

        actorsStud.sort(new SortAgeComparator());
        System.out.println("Sort Age ");
        for (Actor a : actorsStud) System.out.println(a);
        System.out.println("\n");

        actorsStud.sort(new SortLastNameComparator());
        System.out.println("Sort Last Name");
        for (Actor a : actorsStud) System.out.println(a);
        System.out.println("\n");

        actorsStud.sort(new SortFeeAndLastNameComparator());
        System.out.println("Sort Fee And Last Name");
        for (Actor a : actorsStud) System.out.println(a);
        System.out.println("\n");

        actorsStud.sort(new SortLastNameAndAgeComparator());
        System.out.println("Sort Last Name And Age ");
        for (Actor a : actorsStud) System.out.println(a);
    }
}
