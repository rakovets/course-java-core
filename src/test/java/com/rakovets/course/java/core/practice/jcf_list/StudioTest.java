package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.studio_comparator.AgeActorComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio_comparator.FeeActorComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio_comparator.FeeSurnameActorComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio_comparator.SurnameAgeActorComparator;
import com.rakovets.course.java.core.practice.jcf_list.studio_comparator.SurnameActorComparator;
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
        actor1 = new Actor("Ivan", "Ivanov", 5000, 32);
        actor2 = new Actor("Peter", "Petrov", 500, 25);
        actor3 = new Actor("Inna", "Innova", 1000, 67);
        actor4 = new Actor("Yana", "Innova", 1000, 65);
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
    public void testSortBySurname() {
        List<Actor> expected = Arrays.asList(actor3, actor4, actor1, actor2);

        List<Actor> actual =studio.getActors();
        actual.sort(new SurnameActorComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortByAge() {
        List<Actor> expected = Arrays.asList(actor2, actor1, actor4, actor3);

        List<Actor> actual =studio.getActors();
        actual.sort(new AgeActorComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortBySurnameAge() {
        List<Actor> expected = Arrays.asList(actor4, actor3, actor1, actor2);

        List<Actor> actual =studio.getActors();
        actual.sort(new SurnameAgeActorComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortByFeeSurname() {
        List<Actor> expected = Arrays.asList(actor2, actor3, actor4, actor1);

        List<Actor> actual=studio.getActors();
        actual.sort(new FeeSurnameActorComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortByFee() {
        List<Actor> expected = Arrays.asList(actor2, actor3, actor4, actor1);

        List<Actor> actual=studio.getActors();
        actual.sort(new FeeActorComparator());

        Assertions.assertEquals(expected, actual);
    }
}
