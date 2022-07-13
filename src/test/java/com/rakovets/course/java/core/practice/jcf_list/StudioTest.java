package com.rakovets.course.java.core.practice.jcf_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudioTest {

    Actor actor1 = new Actor("Ivan", "Ivanov", 5000, 32);
    Actor actor2 = new Actor("Peter", "Petrov", 500, 25);
    Actor actor3 = new Actor("Inna", "Innova", 1000, 67);

    ArrayList<Actor> list = new ArrayList<>(Arrays.asList(actor1, actor2, actor3));
    ArrayList<Actor> listChangedFee = new ArrayList<>(Arrays.asList(actor2, actor3));
    ArrayList<Actor> listChangedSurname = new ArrayList<>(Arrays.asList(actor3, actor1, actor2));
    ArrayList<Actor> listChangedAge = new ArrayList<>(Arrays.asList(actor2, actor1, actor3));
    Studio studio = new Studio();

    @Test
    public void testAddActor() {
        studio.addActor(actor1);
        studio.addActor(actor2);
        studio.addActor(actor3);
        Assertions.assertEquals(list, studio.getActors());
    }

    @Test
    public void testFire() {
        Assertions.assertEquals(listChangedFee, studio.fire(list));
    }

    @Test
    public void testSurnameComparator() {
        Assertions.assertEquals(listChangedSurname, studio.sortBySurname(list));
    }

    @Test
    public void testAgeComparator() {
        Assertions.assertEquals(listChangedAge, studio.sortByAge(list));
    }
}
