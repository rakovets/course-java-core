package com.rakovets.course.java.core.practice.jcf_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;

public class StudioTest {
    LinkedList<Actor> actors = new LinkedList<Actor>();

    @Test
    void studioTest() {
        actors.add(new Actor("Johny", "Depp", 100,60));
        actors.add(new Actor("Tom", "Cruise",98,70));
        actors.add(new Actor("Morgan", "Freeman", 98, 85));
        actors.add(new Actor("Keira", "Knightley", 86, 38));
        actors.add(new Actor("Matt", "Damon", 89, 52));
        actors.add(new Actor("Ryan", "Gosling", 89,42));
        actors.add(new Actor("Christian", "Bale", 94, 48));
        Studio studio = new Studio(actors);
        LinkedList<Actor> actors2 = new LinkedList<Actor>(studio.fire(actors));
        Assertions.assertEquals(actors2.getFirst().getFirstName(), actors.getFirst().getFirstName());
        Assertions.assertEquals(actors2.getLast().getFee(), actors.getLast().getFee());
        actors.sort(new ActorAgeComparator());
        actors2.sort(new ActorAgeComparator());
        Assertions.assertEquals(actors2.getFirst().getAge(),actors.getFirst().getAge());
    }
}
