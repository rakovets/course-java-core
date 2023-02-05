package com.rakovets.course.java.core.practice.jcf_list.studio;

import com.rakovets.course.java.core.practice.jcf_list.studio.comparators.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StudioTest {
    private final Actor dzmitry = new Actor("Dzmitry", "Krasiuk", 850, 29);
    private final Actor alexander = new Actor("Alexander", "Braim", 940, 27);
    private final Actor elena = new Actor("Elena", "Ankova", 1100, 33);
    private final Actor julia = new Actor("Julia", "Serbskaya", 1100, 25);
    private final Actor anna = new Actor("Anna", "Krasiuk", 1400, 22);
    private final Actor iya = new Actor("Iya", "Krasiuk", 1100, 30);
    private Studio sonyVision;
    ArrayList<Actor> actorsList;
    private Comparator<Actor> comparator;

    @BeforeEach
    void init() {
        actorsList = new ArrayList<>(Arrays.asList(dzmitry, alexander, elena, julia, anna, iya));
        sonyVision = new Studio(actorsList);
    }

    @DisplayName("Test of fire(), returns actors list with removed actor which has highest salary")
    @Test
    void fireTest() {
        sonyVision.fire(sonyVision.getActors());
        Studio expected = new Studio(new ArrayList<>(Arrays.asList(dzmitry, alexander, elena, julia, iya)));

        Assertions.assertEquals(expected.getActors(), sonyVision.getActors());
    }

    @DisplayName("Test of Comparator, ActorsAgeComparator sorts Studio workers by Actors age")
    @Test
    void ActorsAgeComparatorTest() {
        comparator = new ActorsAgeComparator();

        actorsList.sort(comparator);
        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(anna, julia, alexander, dzmitry, iya, elena));

        Assertions.assertEquals(expected,  actorsList);
    }

    @DisplayName("Test of Comparator, ActorsFeeComparator sorts Studio workers by Actors fee")
    @Test
    void ActorsFeeComparatorTest() {
        comparator = new ActorsFeeComparator();

        actorsList.sort(comparator);
        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(dzmitry, alexander, elena, julia, iya, anna));

        Assertions.assertEquals(expected,  actorsList);
    }

    @DisplayName("Test of Comparator, ActorsLastNameComparator sorts Studio workers by Actors surname")
    @Test
    void ActorsLastNameComparatorTest() {
        comparator = new ActorsLastNameComparator();

        actorsList.sort(comparator);
        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(elena, alexander, dzmitry, anna, iya, julia));

        Assertions.assertEquals(expected,  actorsList);
    }

    @DisplayName("Test of Comparator, ActorsLastNameAndAgeComparator sorts Studio workers by Actors surname and age")
    @Test
    void ActorsLastNameAndAgeComparatorTest() {
        comparator = new ActorsLastNameAndAgeComparator();

        actorsList.sort(comparator);
        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(elena, alexander, anna, dzmitry, iya, julia));

        Assertions.assertEquals(expected,  actorsList);
    }

    @DisplayName("Test of Comparator, ActorsFeeAndLastNameComparator sorts Studio workers by Actors fee and surname")
    @Test
    void ActorsFeeAndLastNameComparatorTest() {
        comparator = new ActorsFeeAndLastNameComparator();

        actorsList.sort(comparator);
        ArrayList<Actor> expected = new ArrayList<>(Arrays.asList(dzmitry, alexander, elena, iya, julia, anna));

        Assertions.assertEquals(expected,  actorsList);
    }
}
