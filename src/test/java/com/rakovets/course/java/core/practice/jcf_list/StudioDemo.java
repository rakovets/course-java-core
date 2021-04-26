package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.Actor;
import com.rakovets.course.java.core.practice.jcf_list.Studio;


import java.util.ArrayList;
import java.util.List;

public class StudioDemo {
    public static void main(String[] args) {
        List<Actor> listOfActors = new ArrayList<>();
        listOfActors.add(new Actor("Grisha", "Shishka", 0, 23));
        listOfActors.add(new Actor("Misha", "Misha", 3, 24));
        listOfActors.add(new Actor("Masha", "Masha", 2, 25));
        listOfActors.add(new Actor("Sasha", "Sasha", 1, 27));
        listOfActors.add(new Actor("Lesha", "Lesha", 12, 26));
        Studio studio = new Studio(listOfActors);
        System.out.println("\nremoved the actor with the highest fee\n");
        printActors(Studio.fire(listOfActors));
        listOfActors.sort(new ActorFeeComparator());
        System.out.println("\nSort by fee\n");
        printActors(listOfActors);
        System.out.println("\nSort by Lastname\n");
        listOfActors.sort(new ActorsLastNameComporator());
        printActors(listOfActors);
        System.out.println("\nSort by age\n");
        listOfActors.sort(new ActorsAgeComparator());
        printActors(listOfActors);
        System.out.println("\nSort by Lastname and Age\n");
        listOfActors.sort(new ActorsLastNameAndAgeComparator());
        printActors(listOfActors);
        System.out.println("\nSort by Fee and LastName\n");
        listOfActors.sort(new ActorsFeeAndLastnameComporator());
        printActors(listOfActors);





    }

    public static void printActors(List<Actor> listOfActors) {
        for (Actor actor : listOfActors) {
            System.out.println("Firstname - " + actor.getFirstname() + " Lastname - " + actor.getLastname() + " Fee - " + actor.getFee() + " Age - " + actor.getAge());
        }
    }


}
