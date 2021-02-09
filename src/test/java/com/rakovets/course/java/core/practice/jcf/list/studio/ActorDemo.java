package com.rakovets.course.java.core.practice.jcf.list.studio;

import java.util.ArrayList;
import java.util.List;

public class ActorDemo {
    public static void main(String[] args) {
        List<Actor> actors = new ArrayList<>();

        actors.add(new Actor( "Tom", "Cruse", 500, 33));
        actors.add(new Actor( "Bob", "Atkinson", 800, 62));
        actors.add(new Actor( "Sam", "Ball", 100, 25));
        actors.add(new Actor("Bob", "Marley", 900, 67));
        actors.add(new Actor("Bob", "Atkinson", 100, 58));
        actors.add(new Actor("Most", "Expensive", 10000, 32));

        Studio fox = new Studio(actors);
        fox.fire(actors);

        actors.sort(new CompareByLastName());

        actors.sort(new CompareByAge());

        actors.sort(new CompareByFee());

        actors.sort(new CompareByLastName().thenComparing(new CompareByAge()));

        actors.sort(new CompareByFee().thenComparing(new CompareByLastName()));

        for (Actor actor : actors) {
            System.out.println(actor);
        }
    }
}
