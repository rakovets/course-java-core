package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.studio.studio;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.*;
import com.rakovets.course.java.core.practice.jcf_list.studio.model.Actor;

import java.util.ArrayList;
import java.util.List;

public class studioDemo {
    public static void main(String[] args) {
        studio studio = new studio();
        compareFee compareFee = new compareFee();
        compareAge compareAge = new compareAge();
        compareLastname compareLastname = new compareLastname();
        compareFeeAndLastname compareFeeAndLastname = new compareFeeAndLastname();
        compareNameAndAge compareNameAndAge = new compareNameAndAge();

        List<Actor> actorsList = new ArrayList<>(List.of(
                new Actor("Ivan", "Ivanov", 100, 20),
                new Actor("Ignat", "Smirnov", 200, 25),
                new Actor("Illia", "Petrov", 10, 13),
                new Actor("Iocif", "Sidorov", 150, 44),
                new Actor("Omen", "Satan", 250, 1)));

        actorsList.sort(compareAge);
        listOutput(actorsList);
        actorsList.sort(compareFee);
        listOutput(actorsList);
        actorsList.sort(compareLastname);
        listOutput(actorsList);
        actorsList.sort(compareFeeAndLastname);
        listOutput(actorsList);
        actorsList.sort(compareNameAndAge);
        listOutput(actorsList);
        studio.fire(actorsList);
        listOutput(actorsList);
    }

    private static void listOutput(List<Actor> actors) {
        for (Actor i : actors) {
            System.out.println(i.toString());
        }
        System.out.print("\n");
    }
}
