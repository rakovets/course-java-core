package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.studio.actors_and_studio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.studio.actors_and_studio.Studio;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparators_studio.*;

import java.util.ArrayList;
import java.util.List;

public class StudioDemo {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Vin", "Diesel", 350000, 55));
        actors.add(new Actor("Daniel", "Daniel", 200000, 32));
        actors.add(new Actor("John", "Depp", 405000, 59));
        actors.add(new Actor("Amber", "Heard", 1000000, 36));

        actors.sort(new LastNameComparator());
        System.out.println(actors);

        actors.sort(new AgeComparator());
        System.out.println(actors);

        actors.sort(new FeeComparator());
        System.out.println(actors);

        actors.sort(new LastNameAndAgeComparator());
        System.out.println(actors);

        actors.sort(new FeeAndLastNameComparator());
        System.out.println(actors);

        Studio Universal = new Studio();
        Universal.fire(actors);
        System.out.println(actors);
    }
}
