package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.studio.Studio;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.ActorAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.ActorFeeComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.ActorLastNameComparator;

import java.util.ArrayList;
import java.util.List;

public class ActorDemo {
    public static void main(String[] args) {
        ActorFeeComparator actorFeeComparator = new ActorFeeComparator();
        List<Actor> actors = List.of(new Actor("Nik", "Kin", 100,20),
                new Actor("Lin", "Nil", 0, 25),
                new Actor("Kan", "Nak", 100, 22),
                new Actor("Hax", "Xah", 50, 25));

        List<Actor> actorsArrayList = new ArrayList<>(actors);

        actorsArrayList.sort(actorFeeComparator);
        System.out.println(actorsArrayList);

        List<Actor> actors1 = new ArrayList<>();
        actors1.add(new Actor("Lin", "Nil", 0, 25));
        actors1.add(new Actor("Nik", "Ain", 100,20));
        actors1.add(new Actor("Kan", "Cak", 100, 22));
        actors1.add(new Actor("Hax", "Xah", 50, 25));

        actors1.sort(new ActorLastNameComparator());
        System.out.println(actors1);
        actors1.sort(new ActorAgeComparator());
        System.out.println(actors1);
        actors1.sort(new ActorLastNameComparator().thenComparing(new ActorAgeComparator()));
        System.out.println(actors1);
        actors1.sort(actorFeeComparator.thenComparing(new ActorLastNameComparator()));
        System.out.println(actors1);

        Studio studio = new Studio(actors1);
        System.out.println(studio.fire(actors1));
    }
}
