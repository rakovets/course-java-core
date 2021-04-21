package com.rakovets.course.java.core.practice.jcf_collection;

import com.rakovets.course.java.core.practice.jcf_list.studio.Studio;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.*;
import com.rakovets.course.java.core.practice.jcf_list.studio.model.Actor;

import java.util.ArrayList;
import java.util.List;

public class StudioDemo {
    public static void main(String[] args) {
        Studio studio = new Studio();
        ComparatorForLastname compLast = new ComparatorForLastname();
        ComparatorForFee compFee = new ComparatorForFee();
        ComparatorForAge compAge = new ComparatorForAge();
        ComparatorForLastNameAndAge compLastAndAge = new ComparatorForLastNameAndAge();
        ComparatorForFeeAndLastName compFeeAndLast = new ComparatorForFeeAndLastName();
        List<Actor> actorsList = new ArrayList<>(List.of(
                new Actor("Tokamo", "Senti", 200, 20),
                new Actor("Johnny", "Silverhand", 184, 35),
                new Actor("Kerry", "Evrodin", 68, 18),
                new Actor("Judy", "Alvarez", 121, 5),
                new Actor("Viktor", "Vektor", 523, 121)));

        actorsList.sort(compLast);
        listOutput(actorsList);
        actorsList.sort(compFee);
        listOutput(actorsList);
        actorsList.sort(compAge);
        listOutput(actorsList);
        actorsList.sort(compLastAndAge);
        listOutput(actorsList);
        actorsList.sort(compFeeAndLast);
        listOutput(actorsList);
        studio.fire(actorsList);
        listOutput(actorsList);
    }

    private static void listOutput(List<Actor> actors) {
        for (Actor i : actors) {
            System.out.println(i.toString());
        }
        System.out.println("\n");
    }
}
