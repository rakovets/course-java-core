package com.rakovets.course.java.core.practice.jcf_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class StudioTest {

    Actor actor1 = new Actor("Ivan", "Ivanov", 5000, 32);
    Actor actor2 = new Actor("Peter", "Petrov", 500, 25);
    Actor actor3 = new Actor("Inna", "Innova", 1000, 67);
    Actor actor4 = new Actor("Yana", "Innova", 1000, 65);
    Studio studio = new Studio();
    ArrayList<Actor> list = new ArrayList<>(Arrays.asList(actor1, actor2, actor3, actor4));
    ArrayList<Actor> listSortedByFee = new ArrayList<>(Arrays.asList(actor2, actor3, actor4));
    ArrayList<Actor> listSortedBySurname = new ArrayList<>(Arrays.asList(actor3, actor4, actor1, actor2));
    ArrayList<Actor> listSortedByAge = new ArrayList<>(Arrays.asList(actor2, actor1, actor4, actor3));
    ArrayList<Actor> listSortedByFeeSurname = new ArrayList<>(Arrays.asList(actor2, actor3, actor4, actor1));
    ArrayList<Actor> listSortedBySurnameAge = new ArrayList<>(Arrays.asList(actor4, actor3, actor1, actor2));

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
        Assertions.assertEquals(listSortedByFee, studio.fire(list));
    }

    @Test
    public void testSurnameComparator() {
        Assertions.assertEquals(listSortedBySurname, studio.sortBySurname(list));
    }

    @Test
    public void testAgeComparator() {
        Assertions.assertEquals(listSortedByAge, studio.sortByAge(list));
    }

    @Test
    public void testSurnameAgeComparator() {
        Assertions.assertEquals(listSortedBySurnameAge, studio.sortBySurnameAge(list));
    }

    @Test
    public void testFeeSurnameComparator() {
        Assertions.assertEquals(listSortedByFeeSurname, studio.sortByFeeSurname(list));
    }
}
