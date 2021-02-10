package com.rakovets.course.java.core.practice.jcf.list.Studio;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest {

    @Test
    void actorsLastNameComparator() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Chris", "Evans", 150000, 40));
        actors.add(new Actor("Robert", "Downey", 200000, 55));
        actors.add(new Actor("Jennifer", "Lawrence", 500000, 31));
        actors.sort(new ActorsLastNameComparator());
        assertEquals("Downey", actors.get(0).getLastName());
    }

    @Test
    void actorsAgeComparator() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Chris", "Evans", 150000, 40));
        actors.add(new Actor("Robert", "Downey", 200000, 55));
        actors.add(new Actor("Jennifer", "Lawrence", 500000, 31));
        actors.sort(new ActorsAgeComparator());
        assertEquals(31, actors.get(0).getAge());
    }

    @Test
    void actorsFeeComparator() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Chris", "Evans", 150000, 40));
        actors.add(new Actor("Robert", "Downey", 200000, 55));
        actors.add(new Actor("Jennifer", "Lawrence", 500000, 31));
        actors.sort(new ActorsFeeComparator());
        assertEquals(150000, actors.get(0).getFee());
    }

    @Test
    void actorsLastNameAndAgeComparator() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Chris", "Evans", 150000, 40));
        actors.add(new Actor("Robert", "Downey", 200000, 55));
        actors.add(new Actor("Jennifer", "Lawrence", 500000, 31));
        actors.sort(new ActorsLastNameAndAgeComparator());
        assertEquals("Downey", actors.get(0).getLastName());
        assertEquals(55, actors.get(0).getAge());
    }

    @Test
    void actorsFeeAndLastNameComparator() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Chris", "Evans", 150000, 40));
        actors.add(new Actor("Robert", "Downey", 200000, 55));
        actors.add(new Actor("Jennifer", "Lawrence", 500000, 31));
        actors.sort(new ActorsFeeAndLastNameComparator());
        assertEquals(150000, actors.get(0).getFee());
        assertEquals("Evans", actors.get(0).getLastName());
    }
}
