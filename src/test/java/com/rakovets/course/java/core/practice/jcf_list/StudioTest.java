package com.rakovets.course.java.core.practice.jcf_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudioTest {
    private final Actor actor1 = new Actor("Ivan", "Ivanov", 5000, 32);
    private final Actor actor2 = new Actor("Peter", "Petrov", 500, 25);
    private final Actor actor3 = new Actor("Inna", "Innova", 1000, 67);
    private final Actor actor4 = new Actor("Yana", "Innova", 1000, 65);
    private final Studio studio = new Studio();
    private final List<Actor> list = new ArrayList<>(Arrays.asList(actor1, actor2, actor3, actor4));

    @BeforeEach
    public void setUp() {
        studio.setActors(list);
    }

    @Test
    public void testAddActors() {
        studio.addActors(actor1);
        studio.addActors(actor2);
        studio.addActors(actor3);
        studio.addActors(actor4);
        Assertions.assertEquals(list, studio.getActors());
    }

    @Test
    public void testFire() {
        List<Actor> actual = studio.fire(studio.getActors());

        List<Actor> expected = Arrays.asList(actor2, actor3, actor4);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortBySurname() {
        studio.getActors().sort(studio.bySurname);

        List<Actor> expected = Arrays.asList(actor3, actor4, actor1, actor2);

        Assertions.assertEquals(expected, studio.getActors());
    }

    @Test
    public void testSortByAge() {
        studio.getActors().sort(studio.byAge);

        List<Actor> expected = Arrays.asList(actor2, actor1, actor4, actor3);

        Assertions.assertEquals(expected, studio.getActors());
    }

    @Test
    public void testSortBySurnameAge() {
        studio.getActors().sort(studio.bySurnameAge);

        List<Actor> expected = Arrays.asList(actor4, actor3, actor1, actor2);

        Assertions.assertEquals(expected, studio.getActors());
    }

    @Test
    public void testSortByFeeSurname() {
        studio.getActors().sort(studio.byFeeSurname);

        List<Actor> expected = Arrays.asList(actor2, actor3, actor4, actor1);

        Assertions.assertEquals(expected, studio.getActors());
    }

    @Test
    public void testSortByFee() {
        studio.getActors().sort(studio.byFee);

        List<Actor> expected = Arrays.asList(actor2, actor3, actor4, actor1);

        Assertions.assertEquals(expected, studio.getActors());
    }
}
