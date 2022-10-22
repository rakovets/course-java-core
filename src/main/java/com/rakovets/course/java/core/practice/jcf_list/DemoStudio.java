package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.comparators.*;
import com.rakovets.course.java.core.practice.jcf_list.models.Actor;
import com.rakovets.course.java.core.practice.jcf_list.models.Studio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoStudio {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Victor", "Polonnikov", 100.5, 40));
        actors.add(new Actor("Andrew", "Airsmith", 101.5, 30));
        actors.add(new Actor("John", "Turbey", 101.5, 20));
        actors.add(new Actor("Bob", "Polonnikov", 90.5, 50));

        Studio studio = new Studio(actors);
        System.out.println(studio);

        Comparator<Actor> comparatorLastName = new ActorsLastNameComparator();
        studio.getActors().sort(comparatorLastName);
        System.out.println(studio);

        Comparator<Actor> comparatorFee = new ActorsFeeComparator();
        studio.getActors().sort(comparatorFee);
        System.out.println(studio);

        Comparator<Actor> comparatorAge = new ActorsAgeComparator();
        studio.getActors().sort(comparatorAge);
        System.out.println(studio);

        Comparator<Actor> comparatorLastNameAndAge = new ActorsLastNameAndAgeComparator();
        studio.getActors().sort(comparatorLastNameAndAge);
        System.out.println(studio);

        Comparator<Actor> comparatorFeeAndLastName = new ActorsFeeAndLastNameComparator();
        studio.getActors().sort(comparatorFeeAndLastName);
        System.out.println(studio);

        studio.fire(studio.getActors());
        System.out.println(studio);
    }
}
