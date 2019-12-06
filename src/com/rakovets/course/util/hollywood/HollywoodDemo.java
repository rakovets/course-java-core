package com.rakovets.course.util.hollywood;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HollywoodDemo {
    public static void main(String[] args) {
        LastNameComparator comp1 = new LastNameComparator();
        AgeComparator comp2 = new AgeComparator();
        FeeComparator comp3 = new FeeComparator();
        Comparator<Actor> comp4 = new LastNameComparator().thenComparing(new AgeComparator());
        Comparator<Actor> comp5 = new FeeComparator().thenComparing(new LastNameComparator());
        List<Actor> listWithActors = new ArrayList<>();
        listWithActors.add(new Actor("Leonardo", "Dikaprio", 1050.0, 54));
        listWithActors.add(new Actor("Siymon", "Pag", 500.0, 47));
        listWithActors.add(new Actor("Brad", "Pitt", 1200.0, 49));

        fire(listWithActors);
        printList(listWithActors);
        listWithActors.sort(comp3);
        printList(listWithActors);
    }

    public static List<Actor> fire(List<Actor> list) {
        double moneyOfActor = 0.0;
        for (Actor actor : list) {
            if (actor.getFee() > moneyOfActor) {
                moneyOfActor = actor.getFee();
            }
        }
        Actor actor1 = null;
        for (Actor actor : list) {
            if (actor.getFee() == moneyOfActor) {
                actor1 = actor;
            }
        }
        if(actor1 != null) {
            list.remove(actor1);
        }
        return list;
    }

    public static void printList(List<Actor> list) {
        for (Actor actor : list) {
            System.out.println(actor);
        }
    }
}
