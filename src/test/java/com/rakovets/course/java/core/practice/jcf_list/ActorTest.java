package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.example.jcf.comparator.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ActorTest {
    @Test
    void actorsLastNameComparatorTest() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Evgeni", "Ermakov", 5500, 20));
        actors.add(new Actor("Roman", "Romanich", 5300, 22));
        actors.add(new Actor("Uri", "Urevich", 5400, 23));

        actors.sort(new ActorsLastNameComparator());

        assertEquals("Ermakov", actors.get(0).getLastName());
        assertEquals("Urevich", actors.get(2).getLastName());
    }

    @Test
    void actorsAgeComparatorTest() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Evgeni", "Ermakov", 5500, 20));
        actors.add(new Actor("Roman", "Romanich", 5300, 22));
        actors.add(new Actor("Uri", "Urevich", 5400, 23));

        actors.sort(new ActorsAgeComparator());

        assertEquals(20, actors.get(0).getAge());
        assertEquals(23, actors.get(2).getAge());
    }

    @Test
    void actorsFeeComparatorTest() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Evgeni", "Ermakov", 5500, 20));
        actors.add(new Actor("Roman", "Romanich", 5300, 22));
        actors.add(new Actor("Uri", "Urevich", 5400, 23));

        actors.sort(new ActorsFeeComparator());

        assertEquals(5300, actors.get(0).getFee());
        assertEquals(5500, actors.get(2).getFee());
    }

    @Test
    void actorsLastNameAndAgeComparatorTest() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Evgeni", "Ermakov", 5500, 20));
        actors.add(new Actor("Roman", "Ermakov", 5300, 22));
        actors.add(new Actor("Uri", "Urevich", 5400, 23));

        actors.sort(new ActorsLastNameAndAgeComparator());

        assertEquals("Ermakov", actors.get(0).getLastName());
        assertEquals(20, actors.get(0).getAge());
        assertEquals(23, actors.get(2).getAge());
    }

    @Test
    void actorsFeeAndLastNameComparatorTest() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Evgeni", "Ermakov", 5500, 20));
        actors.add(new Actor("Roman", "Albertikov", 5400, 22));
        actors.add(new Actor("Uri", "Urevich", 5400, 23));

        actors.sort(new ActorsFeeAndLastNameComparator());

        assertEquals(5400, actors.get(0).getFee());
        assertEquals("Albertikov", actors.get(0).getLastName());
        assertEquals(5500, actors.get(2).getFee());
        assertEquals("Ermakov", actors.get(2).getLastName());
    }

    @Test
    void fireTest() {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Evgeni", "Ermakov", 5500, 20));
        actors.add(new Actor("Roman", "Albertikov", 5200, 22));
        actors.add(new Actor("Uri", "Urevich", 5300, 23));

        Studio studio = new Studio(actors);
        studio.fire(actors);
        actors.sort(new ActorsFeeComparator());

        assertEquals(2, studio.getActors().size());
        assertEquals(5300, actors.get(1).getFee());
    }

}
