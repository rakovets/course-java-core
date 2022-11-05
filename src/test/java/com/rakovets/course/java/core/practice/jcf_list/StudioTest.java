package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.studio.*;
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
        actor1 = new Actor("Ann", "Kovaleva", 29, 1000);
        actor2 = new Actor("Leon", "Lion", 27, 800);
        actor3 = new Actor("Hanna", "Smith", 62, 700);
        actor4 = new Actor("Kris", "Paker", 50, 200);
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
        List<Actor> expected = Arrays.asList(actor1, actor2, actor4, actor3);

        List<Actor> actual = studio.getActors();
        actual.sort(new LastNameComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortByAge() {
        List<Actor> expected = Arrays.asList(actor3, actor4, actor1, actor2);

        List<Actor> actual = studio.getActors();
        actual.sort(new AgeComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortByFee() {
        List<Actor> expected = Arrays.asList(actor1, actor2, actor3, actor4);

        List<Actor> actual = studio.getActors();
        actual.sort(new FeeComparator());

        Assertions.assertEquals(expected, actual);
    }
}
