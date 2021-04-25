package com.rakovets.course.java.core.practice.jcf_list;

import java.util.ArrayList;

public class StudioDemo {
    public static void main(String[] args) {
        Actor dwayneJohnson = new Actor("Dwayne", "Johnson", 87.5, 48);
        Actor vinDiesel = new Actor("Vin", "Diesel", 54.0, 53);
        Actor willSmith = new Actor("Will", "Smith", 44.5, 52);
        Actor ivanOkhlobystin = new Actor("Ivan", "Okhlobystin", 2.0, 54);

        ArrayList<Actor> actors = new ArrayList<>();
        ArrayList<Actor> fixActors = new ArrayList<>();
        actors.add(dwayneJohnson);
        actors.add(vinDiesel);
        actors.add(willSmith);
        actors.add(ivanOkhlobystin);
        fixActors.addAll(actors);

        System.out.println("\nThis is a list without the most expensive actor:");
        printActors(Studio.fire(fixActors));

        actors.sort(new ActorLastNameComparator());
        System.out.println("\nThis is a list sorted by last name:");
        printActors(actors);

        actors.sort(new ActorAgeComparator());
        System.out.println("\nThis is a list sorted by age:");
        printActors(actors);

        actors.sort(new ActorFeeComparator());
        System.out.println("\nThis is a list sorted by fee:");
        printActors(actors);

        actors.sort(new ActorLastNameComparator().thenComparing(new ActorAgeComparator()));
        System.out.println("\nThis is a list sorted by last name and age:");
        printActors(actors);

        actors.sort(new ActorFeeComparator().thenComparing(new ActorLastNameComparator()));
        System.out.println("\nThis is a list sorted by fee and last name:");
        printActors(actors);
    }

    public static void printActors(ArrayList<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getFirstName() + " " + actor.getLastName() + ", fee = " + actor.getFee() + ", age = " + actor.getAge());
        }
    }
}








