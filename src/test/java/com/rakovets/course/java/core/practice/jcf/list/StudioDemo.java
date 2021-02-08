package com.rakovets.course.java.core.practice.jcf.list;

import com.rakovets.course.java.core.practice.jcf.list.studio.*;

import java.util.*;

public class StudioDemo {
    public static void main(String[] args) {
        List<Actor> studioList = new ArrayList<>();
        studioList.add(new Actor ("Alex", "Rodriquez", 10000, 23));
        studioList.add(new Actor("Arthur", "Castillo", 56500, 20));
        studioList.add(new Actor("Julia", "Zaharova", 10000, 24));
        studioList.add(new Actor("Hugh", "Jackman", 156700, 51));
        studioList.add(new Actor("Deborah", "Castillo", 34700, 48));

        Studio colambia = new Studio(studioList);
        System.out.println("Default studio list:");
        colambia.printActorList();

        colambia.fire(studioList);
        System.out.println("After firing the most expensive actor:");
        colambia.printActorList();

        studioList.sort(new ActorComparatorBySurname());
        System.out.println("Actor list sorted by surname: ");
        colambia.printActorList();

        studioList.sort(new ActorComparatorByAge());
        System.out.println("Actor list sorted by age: ");
        colambia.printActorList();

        studioList.sort(new ActorComparatorByFee());
        System.out.println("Actor list sorted by fee: ");
        colambia.printActorList();

        studioList.sort(new ActorComparatorBySurname().thenComparing(new ActorComparatorByAge()));
        System.out.println("Actor list sorted by surname and age: ");
        colambia.printActorList();

        studioList.sort(new ActorComparatorByFee().thenComparing(new ActorComparatorBySurname()));
        System.out.println("Actor list sorted by fee and surname: ");
        colambia.printActorList();
    }
}
