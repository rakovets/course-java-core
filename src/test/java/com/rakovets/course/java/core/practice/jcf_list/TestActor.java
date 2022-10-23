package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.comparator.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestActor {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Oleg", "Aleksashov", 1000, 20));
        actors.add(new Actor("Veronika", "Aleksashova", 1200, 23));
        actors.add(new Actor("Victor", "GoldHands", 1850, 21));
        actors.add(new Actor("Irina", "UsefulAdvises", 1700, 22));

        Studio studio = new Studio(actors);

        Comparator<Actor> comparator = new LastNameComparator();
        actors.sort(comparator);
        System.out.println(actors + "\n");

        Comparator<Actor> comparator1 = new AgeComparator();
        actors.sort(comparator1);
        System.out.println(actors + "\n");

        Comparator<Actor> comparator2 = new FeeComparator();
        actors.sort(comparator2);
        System.out.println(actors + "\n");

        Comparator<Actor> comparator3 = new LastNameAndAgeComparator();
        actors.sort(comparator3);
        System.out.println(actors + "\n");

        Comparator<Actor> comparator4 = new FeeAndLastNameComparator();
        actors.sort(comparator4);
        System.out.println(actors + "\n");

        System.out.println(studio.fire(actors));
    }
}
