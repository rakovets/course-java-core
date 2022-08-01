package com.rakovets.course.java.core.practice.jcf_list.studio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudioTest {
    private Actor actor1;
    private Actor actor2;
    private Actor actor3;
    private Actor actor4;
    private Studio studio;

    @BeforeEach
    public void setUp() {
        actor1 = new Actor("Anny", "Smith", 29, 10);
        actor2 = new Actor("Jane", "Thomson", 27, 5);
        actor3 = new Actor("Ann", "Edward", 62, 7);
        actor4 = new Actor("Sam", "Edward", 50, 7);
        studio = new Studio();
        List<Actor> list = new ArrayList<>(Arrays.asList(actor1, actor2, actor3, actor4));
        studio.setActors(list);
    }

    @Test
    public void testFire() {
        List<Actor> expected = Arrays.asList(actor2, actor3, actor4);

        List<Actor> actual = studio.fire(studio.getActors());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortByLastName() {
        List<Actor> expected = Arrays.asList(actor3, actor4, actor1, actor2);

        List<Actor> actual =studio.getActors();
        actual.sort(new ActorLastNameComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortByAge() {
        List<Actor> expected = Arrays.asList(actor2, actor1, actor4, actor3);

        List<Actor> actual =studio.getActors();
        actual.sort(new ActorAgeComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortLastNameAndAge() {
        List<Actor> expected = Arrays.asList(actor4, actor3, actor1, actor2);

        List<Actor> actual =studio.getActors();
        actual.sort(new ActorLastNameAndAgeComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortByFeeAndLastName() {
        List<Actor> expected = Arrays.asList(actor2, actor3, actor4, actor1);

        List<Actor> actual=studio.getActors();
        actual.sort(new ActorFeeAndLastNameComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortByFee() {
        List<Actor> expected = Arrays.asList(actor2, actor3, actor4, actor1);

        List<Actor> actual=studio.getActors();
        actual.sort(new ActorFeeComparator());

        Assertions.assertEquals(expected, actual);
    }
}
