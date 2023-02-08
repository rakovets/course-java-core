package com.rakovets.course.java.core.practice.jcf_list.studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.comparators.ActorAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparators.ActorFeeComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparators.ActorLastNameComparator;

import java.util.ArrayList;
import java.util.Arrays;

public class StudioDemo {
    public static void main(String[] args) {
        ArrayList<Actor> actors = new ArrayList<>(Arrays.asList(
                new Actor("Marilyn", "Monroe", 85, 3330),
                new Actor("Patric", "Stewart", 82, 5450),
                new Actor("Dev", "Patel", 37, 5300),
                new Actor("Sean", "Penn", 62, 4700),
                new Actor("Brad", "Pitt", 55, 5000),
                new Actor("Nicolas", "Cage", 56, 400),
                new Actor("Jane", "Levy", 35, 3000),
                new Actor("Scarlett", "Johansson", 35, 4300),
                new Actor("Maryl", "Streep", 65, 6000)));
        Studio warnerBroth = new Studio(actors);

        System.out.println("sort by Last name: \n");
        actors.sort(new ActorLastNameComparator());
        print(warnerBroth);

        System.out.println("sort by Age: \n");
        actors.sort(new ActorAgeComparator());
        print(warnerBroth);

        System.out.println("sort by Fee: \n");
        actors.sort(new ActorFeeComparator());
        print(warnerBroth);

        System.out.println("sort by Last name and Age:  \n");
        actors.sort(new ActorLastNameComparator().thenComparing(new ActorAgeComparator()));
        print(warnerBroth);

        System.out.println("sort by Fee and Last name:  \n");
        actors.sort(new ActorFeeComparator().thenComparing(new ActorLastNameComparator()));
        print(warnerBroth);
    }

    public static void print(Studio studio) {
        for (Actor actors : studio.getActors()) {
            System.out.println(actors.getFirstName() + " " + actors.getLastName()
                    + " " + actors.getAge() + " " + actors.getFee());
        }
        System.out.println(" ");
    }
}
