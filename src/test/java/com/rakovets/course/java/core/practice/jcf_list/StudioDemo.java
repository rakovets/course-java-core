package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.studio.*;

import java.util.ArrayList;

public class StudioDemo {
    public static void main(String[] args) {
        Actor zackBraff = new Actor("Zack", "Braff", 5000.0, 30);
        Actor keanuReeves = new Actor("Keanu", "Reeves", 60000.0, 50);
        Actor willSmith = new Actor("Will", "Smith", 100000, 55);
        Actor martinLaurence = new Actor("Martin", "Laurence", 70000, 54);
        Actor loraLaurence = new Actor ("Lora", "Laurence",80000,56);

        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(zackBraff);
        actors.add(keanuReeves);
        actors.add(willSmith);
        actors.add(martinLaurence);
        actors.add(loraLaurence);
        printArray(actors);

        Studio.fire(actors);
        System.out.println("\n Artist list after Fired: ");
        printArray(actors);
        actors.add(willSmith);

        System.out.println("\nLast Name sort: ");
        actors.sort(new LastNameComparator());
        printArray(actors);

        System.out.println("\nAge sort: ");
        actors.sort(new AgeComparator());
        printArray(actors);

        System.out.println("\nFee sort: ");
        actors.sort(new FeeComparator());
        printArray(actors);

        System.out.println("\nLast name and Age sort: ");
        actors.sort(new LastNameAndAgeComparator());
        printArray(actors);

        System.out.println("\nLast name and Fee sort: ");
        actors.sort(new LastNameAndFeeComparator());
        printArray(actors);
    }

    public static void printArray(ArrayList<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getFirstName() + " " + actor.getLastName() + ", fee = " + actor.getFee() + ", age = " + actor.getAge());
        }
    }
}
