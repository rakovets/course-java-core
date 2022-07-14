package com.rakovets.course.java.core.practice.jcf_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudioTest {
    Actor actor1 = new Actor("Ivan", "Ivanov", 5000, 32);
    Actor actor2 = new Actor("Peter", "Petrov", 500, 25);
    Actor actor3 = new Actor("Inna", "Innova", 1000, 67);
    Actor actor4 = new Actor("Yana", "Innova", 1000, 65);
    Studio studio = new Studio();
    List<Actor> list = new ArrayList<>(Arrays.asList(actor1, actor2, actor3, actor4));

    @BeforeEach
    public void setUp() {
        studio.setActors(list);
    }

    @Test
    public void testAddActor() {
        studio.addActors(actor1);
        studio.addActors(actor2);
        studio.addActors(actor3);
        studio.addActors(actor4);
        Assertions.assertEquals(list, studio.getActors());
    }

    @Test
    public void testFire() {
        List<Actor> listSortedByFee = new ArrayList<>(Arrays.asList(actor2, actor3, actor4));
        Assertions.assertEquals(listSortedByFee, studio.fire(studio.getActors()));
    }

    @Test
    public void testSurnameComparator() {
        studio.getActors().sort(studio.bySurname);
        List<Actor> listSortedBySurname = new ArrayList<>(Arrays.asList(actor3, actor4, actor1, actor2));
        Assertions.assertEquals(listSortedBySurname, studio.getActors());
    }

    @Test
    public void testAgeComparator() {
        studio.getActors().sort(studio.byAge);
        List<Actor> listSortedByAge = new ArrayList<>(Arrays.asList(actor2, actor1, actor4, actor3));
        Assertions.assertEquals(listSortedByAge, studio.getActors());
    }

    @Test
    public void testSurnameAgeComparator() {
        studio.getActors().sort(studio.bySurnameAge);
        List<Actor> listSortedBySurnameAge = new ArrayList<>(Arrays.asList(actor4, actor3, actor1, actor2));
        Assertions.assertEquals(listSortedBySurnameAge, studio.getActors());
    }

    @Test
    public void testFeeSurnameComparator() {
        studio.getActors().sort(studio.byFeeSurname);
        List<Actor> listSortedByFeeSurname = new ArrayList<>(Arrays.asList(actor2, actor3, actor4, actor1));
        Assertions.assertEquals(listSortedByFeeSurname, studio.getActors());
    }
}
