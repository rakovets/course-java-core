package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.project_studio.*;

import java.util.*;

public class StudioDemo {
    public static void main(String[] args) {
        List<Actor> studioList = new ArrayList<>();
        studioList.add(new Actor ("Tom", "Hanks", 100000, 55));
        studioList.add(new Actor("Robert", "De Niro", 565000, 61));
        studioList.add(new Actor("Julia", "Roberts", 100500, 42));
        studioList.add(new Actor("Jack", "Nicholson", 155500, 64));
        studioList.add(new Actor("Mel", "Gibson", 347000, 48));

        Studio warner = new Studio(studioList);
        System.out.println("Default studio list:");
        warner.printActorList();

        warner.fire(studioList);
        System.out.println("After firing the most expensive actor:");
        warner.printActorList();

        studioList.sort(new ComparatorActorLastname());
        System.out.println("Actor list sorted by lastname: ");
        warner.printActorList();

        studioList.sort(new ComparatorActorAge());
        System.out.println("Actor list sorted by age: ");
        warner.printActorList();

        studioList.sort(new ComparatorActorFee());
        System.out.println("Actor list sorted by fee: ");
        warner.printActorList();

        studioList.sort(new ComparatorActorLastname().thenComparing(new ComparatorActorAge()));
        System.out.println("Actor list sorted by lastname and age: ");
        warner.printActorList();

        studioList.sort(new ComparatorActorFee().thenComparing(new ComparatorActorLastname()));
        System.out.println("Actor list sorted by fee and lastname: ");
        warner.printActorList();
    }
}
