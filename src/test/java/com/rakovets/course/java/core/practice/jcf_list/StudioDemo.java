package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.Studio.Comparators.*;
import com.rakovets.course.java.core.practice.jcf_list.Studio.Models.Actor;
import com.rakovets.course.java.core.practice.jcf_list.Studio.Models.Studio;

import java.util.*;

public class StudioDemo {
    public static void main(String[] args) {
        List<Actor> listOfActors= new ArrayList<>();
        listOfActors.add(new Actor("Penelope", "Cruz", 5000000,48));
        listOfActors.add(new Actor("Salma", "Hayek",7000000,56));
        listOfActors.add(new Actor("Johny","Depp",9000000,59));
        listOfActors.add(new Actor("Robert", "Pattinson",4500000,36));
        Comparator<Actor> comparatorLastName = new LastNameComparator();
        listOfActors.sort(comparatorLastName);
        for (Actor actor: listOfActors) {
            System.out.println(actor);
        }
        System.out.println(" ");

        Comparator<Actor> comparatorAge = new AgeComparator();
        listOfActors.sort(comparatorAge);
        for (Actor actor: listOfActors) {
            System.out.println(actor);
        }
        System.out.println(" ");

        Comparator<Actor> comparatorFee = new FeeComparator();
        listOfActors.sort(comparatorFee);
        for (Actor actor: listOfActors) {
            System.out.println(actor);
        }
        System.out.println(" ");

        Comparator<Actor> comparatorLastNameAndAge = new LastNameAndAgeComparator();
        listOfActors.sort(comparatorLastNameAndAge);
        for (Actor actor: listOfActors) {
            System.out.println(actor);
        }
        System.out.println(" ");

        Comparator<Actor> comparatorFeeAndLastName = new FeeAndLastNameComparator();
        listOfActors.sort(comparatorFeeAndLastName);
        for (Actor actor: listOfActors) {
            System.out.println(actor);
        }
        System.out.println(" ");

        Studio studio = new Studio(listOfActors);
        studio.fire(listOfActors);
        for(Actor actor: listOfActors) {
            System.out.println(actor);
        }
    }
}
