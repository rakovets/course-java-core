package com.rakovets.course.java.core.practice.jcf_collection;

import com.rakovets.course.java.core.practice.jcf_list.comparator.*;
import com.rakovets.course.java.core.practice.jcf_list.project_studio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.project_studio.Studio;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProjectStudio {
    static Stream<Arguments> provideArgumentsFire() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Petr", "Petrov", 250.0, 18),
                                new Actor("Ivan", "Mask", 100.0, 28),
                                new Actor("Pen", "Petrovich", 450.0, 22))),
                        new ArrayList<>(List.of(new Actor("Petr", "Petrov", 250.0, 18),
                                new Actor("Ivan", "Mask", 100.0, 28))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsFire")
    public void testActorFire(List<Actor> actorsList, List<Actor> expected) {
        Studio studio = new Studio();
        List<Actor> actual = studio.fire(actorsList);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsLastNameCompare() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Petr", "Petrov", 250.0, 18),
                                new Actor("Ivan", "Mask", 100.0, 28),
                                new Actor("Pen", "Gavrilov", 400.0, 22))),
                        new ArrayList<>(List.of(new Actor("Pen", "Gavrilov", 400.0, 22),
                                new Actor("Ivan", "Mask", 100.0, 28),
                                new Actor("Petr", "Petrov", 250.0, 18))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsLastNameCompare")
    public void testActorLastNameCompare(List<Actor> actorsList, List<Actor> expected) {
        Comparator<Actor> comparatorLastName = new ActorLastNameComparator();
        actorsList.sort(comparatorLastName);

        assertEquals(expected, actorsList);
    }

    static Stream<Arguments> provideArgumentsAgeCompare() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Petr", "Petrov", 250.0, 18),
                                new Actor("Ivan", "Mask", 100.0, 28),
                                new Actor("Pen", "Gavrilov", 400.0, 22))),
                        new ArrayList<>(List.of(new Actor("Petr", "Petrov", 250.0, 18),
                                new Actor("Pen", "Gavrilov", 400.0, 22),
                                new Actor("Ivan", "Mask", 100.0, 28))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsAgeCompare")
    public void testActorAgeCompare(List<Actor> actorsList, List<Actor> expected) {
        Comparator<Actor> comparatorAge = new ActorAgeComparator();
        actorsList.sort(comparatorAge);

        assertEquals(expected, actorsList);
    }

    static Stream<Arguments> provideArgumentsFeeCompare() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Petr", "Petrov", 250.0, 18),
                                new Actor("Ivan", "Mask", 100.0, 28),
                                new Actor("Pen", "Gavrilov", 400.0, 22))),
                        new ArrayList<>(List.of(new Actor("Ivan", "Mask", 100.0, 28),
                                new Actor("Petr", "Petrov", 250.0, 18),
                                new Actor("Pen", "Gavrilov", 400.0, 22))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsFeeCompare")
    public void testActorFeeCompare(List<Actor> actorsList, List<Actor> expected) {
        Comparator<Actor> comparatorFee = new ActorFeeComparator();
        actorsList.sort(comparatorFee);

        assertEquals(expected, actorsList);
    }

    static Stream<Arguments> provideArgumentsLastNameAgeCompare() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Petr", "Petrov", 250.0, 18),
                                new Actor("Ivan", "Petrov", 100.0, 28),
                                new Actor("Pen", "Gavrilov", 400.0, 22))),
                        new ArrayList<>(List.of(new Actor("Pen", "Gavrilov", 400.0, 22),
                                new Actor("Petr", "Petrov", 250.0, 18),
                                new Actor("Ivan", "Petrov", 100.0, 28))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsLastNameAgeCompare")
    public void testActorLastNameAgeCompare(List<Actor> actorsList, List<Actor> expected) {
        Comparator<Actor> comparatorLastNameAge = new ActorLastNameAgeComparator();
        actorsList.sort(comparatorLastNameAge);

        assertEquals(expected, actorsList);
    }

    static Stream<Arguments> provideArgumentsFeeLastNameCompare() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Petr", "Petrov", 100.0, 18),
                                new Actor("Ivan", "Mask", 100.0, 28),
                                new Actor("Pen", "Gavrilov", 400.0, 22))),
                        new ArrayList<>(List.of(new Actor("Ivan", "Mask", 100.0, 28),
                                new Actor("Petr", "Petrov", 100.0, 18),
                                new Actor("Pen", "Gavrilov", 400.0, 22))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsFeeLastNameCompare")
    public void testActorFeeLastNameAgeCompare(List<Actor> actorsList, List<Actor> expected) {
        Comparator<Actor> comparatorFeeLastName = new ActorFeeLastNameComparator();
        actorsList.sort(comparatorFeeLastName);

        assertEquals(expected, actorsList);
    }
}
