package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.studio.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoActor {

    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();

        Actor johnny = new Actor("Johnny", "Depp", 1000000, 59);
        Actor leo = new Actor("Leonardo", "DiCaprio", 1500000, 47);
        Actor charly = new Actor("Charles", "Hunnam", 900000, 42);
        Actor jensen = new Actor("Jensen", "Ackles", 800000, 44);
        actors.add(johnny);
        actors.add(leo);
        actors.add(charly);
        actors.add(jensen);
        Comparator<Actor> comparatorFee = new FeeComparator();
        actors.sort(comparatorFee);
        for (Actor a : actors) {
            System.out.println(a);
        }
        System.out.println("____________");
        Comparator<Actor> comparatorAge = new AgeComparator();
        actors.sort(comparatorAge);
        for (Actor a : actors) {
            System.out.println(a);
        }
        System.out.println("____________");
        Comparator<Actor> comparatorLastName = new LastNameComparator();
        actors.sort(comparatorLastName);
        for (Actor a : actors) {
            System.out.println(a);
        }
        System.out.println("____________");
        Comparator<Actor> comparatorFeeWithLastName = new FeeWithLastNameComparator();
        actors.sort(comparatorFeeWithLastName);
        for (Actor a : actors) {
            System.out.println(a);
        }
        System.out.println("____________");
        Comparator<Actor> comparatorLastNameWithAge = new LastNameWithAgeComparator();
        actors.sort(comparatorLastNameWithAge);
        for (Actor a : actors) {
            System.out.println(a);
        }
        System.out.println("____________");
        Studio studio = new Studio(actors);
        for (Actor a : actors) {
            System.out.println(a);
        }
        System.out.println("____________");
        studio.fire(actors);
        for (Actor a : actors) {
            System.out.println(a);
        }
    }
}
