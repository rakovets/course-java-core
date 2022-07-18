package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.projectstudio.*;

import java.util.*;

public class StudioDemo {
    public static void main(String[] args) {
        Actor a = new Actor("tony", "depp", 100000,25);
        Actor b = new Actor("johny", "depp", 50000, 50);
        Actor c = new Actor("tim", "roth", 50000, 45);

        List<Actor> actorsList = new ArrayList<>();
        actorsList.add(0, a);
        actorsList.add(1, b);
        actorsList.add(2, c);

        System.out.println("Tony Montana is " + a);
        System.out.println("Johny Depp is " + b);
        System.out.println("Tim Roth is " + c);

        Studio.fire(actorsList);

        Collections.sort(actorsList, new feeComparator());
        for (Actor actor : actorsList) {
            System.out.println(actor.getFee() + " " + actor.getLastName());
        }

        Collections.sort(actorsList, new ageComparator());
        for (Actor actor : actorsList) {
            System.out.println(actor.getAge() + " " + actor.getLastName());
        }

        Collections.sort(actorsList, new lastNameComparator());
        for (Actor actor : actorsList) {
            System.out.println(actor.getLastName());
        }

        Comparator<Actor> lastNameAndAgeComparator = new lastNameComparator().thenComparing(new ageComparator());
        Collections.sort(actorsList, lastNameAndAgeComparator);
        for (Actor actor : actorsList) {
            System.out.println(actor.getLastName() + " " + actor.getAge());
        }

        Comparator<Actor> feeAndLastNameComparator = new feeComparator().thenComparing(new lastNameComparator());
        Collections.sort(actorsList, feeAndLastNameComparator);
        for (Actor actor : actorsList) {
            System.out.println(actor.getFee() + " " + actor.getLastName());
        }
    }
}
