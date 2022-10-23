package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.studio.Studio;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestStudio {
    Studio studio = new Studio();
    List<Actor> actors = new ArrayList<>(List.of(
            new Actor("Anna", "Bond", 38, 500),
            new Actor("Victor", "Serkan", 25, 400),
            new Actor("Olga", "Bond", 45, 200),
            new Actor("Roman", "Lofar", 80, 900),
            new Actor("Kate", "Kolad", 25, 200)));

    @Test
    void testFire() {
        List<Actor> actual = studio.fire(actors);
        List<Actor> expected = new ArrayList<>(List.of(
                new Actor("Anna", "Bond", 38, 500),
                new Actor("Victor", "Serkan", 25, 400),
                new Actor("Olga", "Bond", 45, 200),
                new Actor("Kate", "Kolad", 25, 200)));

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testAgeComparator() {
        actors.sort(new ActorAgeComparator());

        List<Actor> expected = new ArrayList<>(List.of(
                new Actor("Victor", "Serkan", 25, 400),
                new Actor("Kate", "Kolad", 25, 200),
                new Actor("Anna", "Bond", 38, 500),
                new Actor("Olga", "Bond", 45, 200),
                new Actor("Roman", "Lofar", 80, 900)));

        Assertions.assertEquals(expected, actors);
    }

    @Test
    void testLastNameComparator() {
        actors.sort(new ActorLastNameComparator());

        List<Actor> expected = new ArrayList<>(List.of(
                new Actor("Anna", "Bond", 38, 500),
                new Actor("Olga", "Bond", 45, 200),
                new Actor("Kate", "Kolad", 25, 200),
                new Actor("Roman", "Lofar", 80, 900),
                new Actor("Victor", "Serkan", 25, 400)));

        Assertions.assertEquals(expected, actors);
    }

    @Test
    void testFeeAndLastNameComparator() {
        actors.sort(new ActorFeeAndLastNameComparator());

        List<Actor> expected = new ArrayList<>(List.of(
                new Actor("Roman", "Lofar", 80, 900),
                new Actor("Anna", "Bond", 38, 500),
                new Actor("Victor", "Serkan", 25, 400),
                new Actor("Olga", "Bond", 45, 200),
                new Actor("Kate", "Kolad", 25, 200)));

        Assertions.assertEquals(expected, actors);
    }

    @Test
    void testLastNameAndAgeComparator() {
        actors.sort(new ActorLastNameAndAgeComparator());

        List<Actor> expected = new ArrayList<>(List.of(
                new Actor("Anna", "Bond", 38, 500),
                new Actor("Olga", "Bond", 45, 200),
                new Actor("Kate", "Kolad", 25, 200),
                new Actor("Roman", "Lofar", 80, 900),
                new Actor("Victor", "Serkan", 25, 400)));

        Assertions.assertEquals(expected, actors);
    }
}
