package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.studio.Studio;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Test for class Studio.")
class StudioTest {

    List<Actor> actors;
    List<Actor> actual;
    Studio studio;

    @BeforeEach
    void initialize() {
        actors = new ArrayList<>(Arrays.asList(
                new Actor("Ivan", "Ivanov", 450.00, 45),
                new Actor("Petr", "Petrov", 500.50, 37),
                new Actor("Kirill", "Kirillov", 250.00, 27),
                new Actor("Brad", "Pitt", 1000.00, 57),
                new Actor("Nikita", "Ivanov", 150.50, 19)
        ));

        studio = new Studio(actors);
        actual = studio.getActors();
    }

    @Test
    @DisplayName("The dismissal of an actor with a large fee.")
    void fireTest() {
        List<Actor> expected = List.of(
                new Actor("Nikita", "Ivanov", 150.50, 19),
                new Actor("Kirill", "Kirillov", 250.00, 27),
                new Actor("Ivan", "Ivanov", 450.00, 45),
                new Actor("Petr", "Petrov", 500.50, 37)
        );

        actual = studio.fire(actors);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Comparison of actors by last name.")
    void LastNameComparatorTest() {
        List<Actor> expected = List.of(
                new Actor("Ivan", "Ivanov", 450.00, 45),
                new Actor("Nikita", "Ivanov", 150.50, 19),
                new Actor("Kirill", "Kirillov", 250.00, 27),
                new Actor("Petr", "Petrov", 500.50, 37),
                new Actor("Brad", "Pitt", 1000.00, 57)
        );

        actors.sort(new LastNameComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Comparison of actors by age.")
    void AgeComparatorTest() {
        List<Actor> expected = List.of(
                new Actor("Nikita", "Ivanov", 150.50, 19),
                new Actor("Kirill", "Kirillov", 250.00, 27),
                new Actor("Petr", "Petrov", 500.50, 37),
                new Actor("Ivan", "Ivanov", 450.00, 45),
                new Actor("Brad", "Pitt", 1000.00, 57)
        );

        actors.sort(new AgeComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Comparison of actors by fee.")
    void FeeComparatorTest() {
        List<Actor> expected = List.of(
                new Actor("Nikita", "Ivanov", 150.50, 19),
                new Actor("Kirill", "Kirillov", 250.00, 27),
                new Actor("Ivan", "Ivanov", 450.00, 45),
                new Actor("Petr", "Petrov", 500.50, 37),
                new Actor("Brad", "Pitt", 1000.00, 57)
        );

        actors.sort(new FeeComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Comparison of actors by last name and age.")
    void LastNameAgeComparatorTest() {
        List<Actor> expected = List.of(
                new Actor("Nikita", "Ivanov", 150.50, 19),
                new Actor("Ivan", "Ivanov", 450.00, 45),
                new Actor("Kirill", "Kirillov", 250.00, 27),
                new Actor("Petr", "Petrov", 500.50, 37),
                new Actor("Brad", "Pitt", 1000.00, 57)
        );

        actors.sort(new LastNameAgeComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Comparison of actors by fee and last name.")
    void FeeLastNameComparatorTest() {
        List<Actor> expected = List.of(
                new Actor("Nikita", "Ivanov", 150.50, 19),
                new Actor("Kirill", "Kirillov", 250.00, 27),
                new Actor("Ivan", "Ivanov", 450.00, 45),
                new Actor("Petr", "Petrov", 500.50, 37),
                new Actor("Brad", "Pitt", 1000.00, 57)
        );

        actors.sort(new FeeLastNameComparator());

        Assertions.assertEquals(expected, actual);
    }
}
