package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.studio.Studio;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StudioProjectTest {
    List<Actor> actors = new ArrayList<>();
    Studio studio = new Studio(actors);
    Comparator<Actor> comparatorLastNameActors = new ActorsLastNameComparator();
    Comparator<Actor> comparatorAgeActors = new ActorsAgeComparator();
    Comparator<Actor> comparatorFeeActors = new ActorsFeeComparator();
    Comparator<Actor> comparatorLastNameAndAgeActors = new ActorsLastNameAndAgeComparator();
    Comparator<Actor> comparatorFeeAndLastNameActors = new ActorsFeeAndLastNameComparator();

    static Stream<Arguments> provideArgumentsForConstructorActorClass() {
        return Stream.of(
                Arguments.of("Henry", "Cavill", 400_000.0, 39,
                        "Actor {First name: Henry; Last name: Cavill; Fee: 400000.0; Age: 39}"),
                Arguments.of("David", "Harbour", 350_000.0, 47,
                        "Actor {First name: David; Last name: Harbour; Fee: 350000.0; Age: 47}"),
                Arguments.of("Bryan", "Cranston", 750_000.0, 66,
                        "Actor {First name: Bryan; Last name: Cranston; Fee: 750000.0; Age: 66}"),
                Arguments.of("Jeremy", "Strong", 300_000.0, 43,
                        "Actor {First name: Jeremy; Last name: Strong; Fee: 300000.0; Age: 43}"),
                Arguments.of("Alec", "Baldwin", 575_000.0, 64,
                        "Actor {First name: Alec; Last name: Baldwin; Fee: 575000.0; Age: 64}")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForConstructorActorClass")
    void testConstructorActorClass(String firstName, String lastName, double fee, int age, String expected) {
        Actor actor = new Actor(firstName, lastName, fee, age);
        Actor actual = actor;

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForGetMethodsActorClass() {
        return Stream.of(
                Arguments.of("Henry", "Cavill", 400_000.0, 39,
                        "Henry Cavill 400000.0 39"),
                Arguments.of("David", "Harbour", 350_000.0, 47,
                        "David Harbour 350000.0 47"),
                Arguments.of("Bryan", "Cranston", 750_000.0, 66,
                        "Bryan Cranston 750000.0 66"),
                Arguments.of("Jeremy", "Strong", 300_000.0, 43,
                        "Jeremy Strong 300000.0 43"),
                Arguments.of("Alec", "Baldwin", 575_000.0, 64,
                        "Alec Baldwin 575000.0 64")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMethodsActorClass")
    void testGetMethodsActorClass(String firstName, String lastName, double fee, int age, String expected) {
        Actor actor = new Actor(firstName, lastName, fee, age);
        String actual = actor.getFirstName() + " " + actor.getLastName() + " "
                + actor.getFee() + " " + actor.getAge();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForFireMethodStudioClass() {
        return Stream.of(
                Arguments.of(Arrays.asList(
                        "Actor {First name: Henry; Last name: Cavill; Fee: 400000.0; Age: 39}",
                        "Actor {First name: David; Last name: Harbour; Fee: 350000.0; Age: 47}",
                        "Actor {First name: Jeremy; Last name: Strong; Fee: 300000.0; Age: 43}",
                        "Actor {First name: Alec; Last name: Baldwin; Fee: 575000.0; Age: 64}"
                ))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForFireMethodStudioClass")
    void testFireMethodStudioClass(List<Actor> expected) {
        actors.add(new Actor("Henry", "Cavill", 400_000.0, 39));
        actors.add(new Actor("David", "Harbour", 350_000.0, 47));
        actors.add(new Actor("Bryan", "Cranston", 750_000.0, 66));
        actors.add(new Actor("Jeremy", "Strong", 300_000.0, 43));
        actors.add(new Actor("Alec", "Baldwin", 575_000.0, 64));

        studio.fire(actors);
        List<Actor> actual = actors;

        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    static Stream<Arguments> provideArgumentsForComparatorAgeActors() {
        return Stream.of(
                Arguments.of(Arrays.asList(
                        "Actor {First name: Henry; Last name: Cavill; Fee: 400000.0; Age: 39}",
                        "Actor {First name: Jeremy; Last name: Strong; Fee: 300000.0; Age: 43}",
                        "Actor {First name: David; Last name: Harbour; Fee: 350000.0; Age: 47}",
                        "Actor {First name: Alec; Last name: Baldwin; Fee: 575000.0; Age: 64}",
                        "Actor {First name: Bryan; Last name: Cranston; Fee: 750000.0; Age: 66}"
                ))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForComparatorAgeActors")
    void testComparatorAgeActors(List<Actor> expected) {
        actors.add(new Actor("Henry", "Cavill", 400_000.0, 39));
        actors.add(new Actor("David", "Harbour", 350_000.0, 47));
        actors.add(new Actor("Bryan", "Cranston", 750_000.0, 66));
        actors.add(new Actor("Jeremy", "Strong", 300_000.0, 43));
        actors.add(new Actor("Alec", "Baldwin", 575_000.0, 64));

        actors.sort(comparatorAgeActors);
        List<Actor> actual = actors;

        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    static Stream<Arguments> provideArgumentsForComparatorFeeAndLastNameActors() {
        return Stream.of(
                Arguments.of(Arrays.asList(
                        "Actor {First name: Jeremy; Last name: Strong; Fee: 300000.0; Age: 43}",
                        "Actor {First name: David; Last name: Harbour; Fee: 350000.0; Age: 47}",
                        "Actor {First name: Alec; Last name: Baldwin; Fee: 400000.0; Age: 64}",
                        "Actor {First name: Henry; Last name: Cavill; Fee: 400000.0; Age: 39}",
                        "Actor {First name: Bryan; Last name: Cranston; Fee: 750000.0; Age: 66}"
                ))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForComparatorFeeAndLastNameActors")
    void testComparatorFeeAndLastNameActors(List<Actor> expected) {
        actors.add(new Actor("Henry", "Cavill", 400_000.0, 39));
        actors.add(new Actor("David", "Harbour", 350_000.0, 47));
        actors.add(new Actor("Bryan", "Cranston", 750_000.0, 66));
        actors.add(new Actor("Jeremy", "Strong", 300_000.0, 43));
        actors.add(new Actor("Alec", "Baldwin", 400_000.0, 64));

        actors.sort(comparatorFeeAndLastNameActors);
        List<Actor> actual = actors;

        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    static Stream<Arguments> provideArgumentsForComparatorFeeActors() {
        return Stream.of(
                Arguments.of(Arrays.asList(
                        "Actor {First name: Jeremy; Last name: Strong; Fee: 300000.0; Age: 43}",
                        "Actor {First name: David; Last name: Harbour; Fee: 350000.0; Age: 47}",
                        "Actor {First name: Henry; Last name: Cavill; Fee: 400000.0; Age: 39}",
                        "Actor {First name: Alec; Last name: Baldwin; Fee: 575000.0; Age: 64}",
                        "Actor {First name: Bryan; Last name: Cranston; Fee: 750000.0; Age: 66}"
                ))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForComparatorFeeActors")
    void testComparatorFeeActors(List<Actor> expected) {
        actors.add(new Actor("Henry", "Cavill", 400_000.0, 39));
        actors.add(new Actor("David", "Harbour", 350_000.0, 47));
        actors.add(new Actor("Bryan", "Cranston", 750_000.0, 66));
        actors.add(new Actor("Jeremy", "Strong", 300_000.0, 43));
        actors.add(new Actor("Alec", "Baldwin", 575_000.0, 64));

        actors.sort(comparatorFeeActors);
        List<Actor> actual = actors;

        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    static Stream<Arguments> provideArgumentsForComparatorLastNameActors() {
        return Stream.of(
                Arguments.of(Arrays.asList(
                        "Actor {First name: Alec; Last name: Baldwin; Fee: 575000.0; Age: 64}",
                        "Actor {First name: Henry; Last name: Cavill; Fee: 400000.0; Age: 39}",
                        "Actor {First name: Bryan; Last name: Cranston; Fee: 750000.0; Age: 66}",
                        "Actor {First name: David; Last name: Harbour; Fee: 350000.0; Age: 47}",
                        "Actor {First name: Jeremy; Last name: Strong; Fee: 300000.0; Age: 43}"
                ))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForComparatorLastNameActors")
    void testComparatorLastNameActors(List<Actor> expected) {
        actors.add(new Actor("Henry", "Cavill", 400_000.0, 39));
        actors.add(new Actor("David", "Harbour", 350_000.0, 47));
        actors.add(new Actor("Bryan", "Cranston", 750_000.0, 66));
        actors.add(new Actor("Jeremy", "Strong", 300_000.0, 43));
        actors.add(new Actor("Alec", "Baldwin", 575_000.0, 64));

        actors.sort(comparatorLastNameActors);
        List<Actor> actual = actors;

        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    static Stream<Arguments> provideArgumentsForComparatorLastNameAndAgeActors() {
        return Stream.of(
                Arguments.of(Arrays.asList(
                        "Actor {First name: Stephen; Last name: Baldwin; Fee: 300000.0; Age: 56}",
                        "Actor {First name: Alec; Last name: Baldwin; Fee: 575000.0; Age: 64}",
                        "Actor {First name: Henry; Last name: Cavill; Fee: 400000.0; Age: 39}",
                        "Actor {First name: Bryan; Last name: Cranston; Fee: 750000.0; Age: 66}",
                        "Actor {First name: David; Last name: Harbour; Fee: 350000.0; Age: 47}"
                ))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForComparatorLastNameAndAgeActors")
    void testComparatorLastNameAndAgeActors(List<Actor> expected) {
        actors.add(new Actor("Henry", "Cavill", 400_000.0, 39));
        actors.add(new Actor("David", "Harbour", 350_000.0, 47));
        actors.add(new Actor("Alec", "Baldwin", 575_000.0, 64));
        actors.add(new Actor("Bryan", "Cranston", 750_000.0, 66));
        actors.add(new Actor("Stephen", "Baldwin", 300_000.0, 56));

        actors.sort(comparatorLastNameAndAgeActors);
        List<Actor> actual = actors;

        Assertions.assertEquals(expected.toString(), actual.toString());
    }
}
