package com.rakovets.course.java.core.practice.jcf_list.studio;

import java.util.ArrayList;
import java.util.List;

public class StudioDemo {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Denzel", "Washington", 135500.0, 65));
        actors.add(new Actor("Keanu", "Reeves", 233500.0, 30));
        actors.add(new Actor("Johnny", "Depp", 150500.0, 59));
        actors.add(new Actor("Nicole", "Kidman", 333500.0, 18));
        actors.add(new Actor("Melissa", "McCarthy", 50000.1, 40));
        actors.add(new Actor("Catherine", "Deneuve", 40000.0, 50));

        Studio hollyWood = new Studio();

        hollyWood.fire(actors);
        System.out.println("List of actors after fired: " + actors);

        actors.sort(new FirstNameComparator());
        System.out.println("List of actors sorted by first name: " + actors);

        actors.sort(new AgeComparator());
        System.out.println("List of actors sorted by age: " + actors);

        actors.sort(new FeeComparator());
        System.out.println("List of actors sorted by fee: " + actors);
    }
}
