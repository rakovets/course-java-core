package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.studio.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StudioTest {
    static Stream<Arguments> deleteMaxFeeArguments() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Johnny", "Depp", 1000000, 59),
                                new Actor("Leonardo", "DiCaprio", 1500000, 47),
                                new Actor("Charles", "Hunnam", 900000, 42),
                                new Actor("Jensen", "Ackles", 800000, 44))),
                        new ArrayList<>(List.of(new Actor("Johnny", "Depp", 1000000, 59),
                                new Actor("Charles", "Hunnam", 900000, 42),
                                new Actor("Jensen", "Ackles", 800000, 44)))
                ));
    }

    @ParameterizedTest
    @MethodSource("deleteMaxFeeArguments")
    public void getDeleteMaxFee(List<Actor> actors, List<Actor> expected) {
        Studio studio = new Studio(actors);

        List<Actor> actual = studio.fire(studio.getActors());

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> ageComparatorArguments() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Johnny", "Depp", 1000000, 59),
                                new Actor("Leonardo", "DiCaprio", 1500000, 47),
                                new Actor("Charles", "Hunnam", 900000, 42),
                                new Actor("Jensen", "Ackles", 800000, 44))),
                        new ArrayList<>(List.of(new Actor("Charles", "Hunnam", 900000, 42),
                                new Actor("Jensen", "Ackles", 800000, 44),
                                new Actor("Leonardo", "DiCaprio", 1500000, 47),
                                new Actor("Johnny", "Depp", 1000000, 59)))
                ));
    }

    @ParameterizedTest
    @MethodSource("ageComparatorArguments")
    public void getCompareAge(List<Actor> actors, List<Actor> expected) {
        Comparator<Actor> comparatorAge = new AgeComparator();

        actors.sort(comparatorAge);

        Assertions.assertEquals(expected, actors);
    }

    static Stream<Arguments> feeComparatorArguments() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Johnny", "Depp", 1000000, 59),
                                new Actor("Leonardo", "DiCaprio", 1500000, 47),
                                new Actor("Charles", "Hunnam", 900000, 42),
                                new Actor("Jensen", "Ackles", 800000, 44))),
                        new ArrayList<>(List.of(new Actor("Jensen", "Ackles", 800000, 44),
                                new Actor("Charles", "Hunnam", 900000, 42),
                                new Actor("Johnny", "Depp", 1000000, 59),
                                new Actor("Leonardo", "DiCaprio", 1500000, 47)))
                ));
    }

    @ParameterizedTest
    @MethodSource("feeComparatorArguments")
    public void getCompareFee(List<Actor> actors, List<Actor> expected) {
        Comparator<Actor> feeComparator = new FeeComparator();

        actors.sort(feeComparator);

        Assertions.assertEquals(expected, actors);
    }

    static Stream<Arguments> feeWithLastNameComparatorArguments() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Johnny", "Depp", 800000, 59),
                                new Actor("Leonardo", "DiCaprio", 1500000, 47),
                                new Actor("Charles", "Hunnam", 900000, 42),
                                new Actor("Jensen", "Ackles", 800000, 44))),
                        new ArrayList<>(List.of(new Actor("Jensen", "Ackles", 800000, 44),
                                new Actor("Johnny", "Depp", 800000, 59),
                                new Actor("Charles", "Hunnam", 900000, 42),
                                new Actor("Leonardo", "DiCaprio", 1500000, 47)))
                ));
    }

    @ParameterizedTest
    @MethodSource("feeWithLastNameComparatorArguments")
    public void getCompareFeeWithLastName(List<Actor> actors, List<Actor> expected) {
        Comparator<Actor> feeWithLastNameComparator = new FeeWithLastNameComparator();

        actors.sort(feeWithLastNameComparator);

        Assertions.assertEquals(expected, actors);
    }

    static Stream<Arguments> LastNameComparatorArguments() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Johnny", "Depp", 1000000, 59),
                                new Actor("Leonardo", "DiCaprio", 1500000, 47),
                                new Actor("Charles", "Hunnam", 900000, 42),
                                new Actor("Jensen", "Ackles", 800000, 44))),
                        new ArrayList<>(List.of(new Actor("Jensen", "Ackles", 800000, 44),
                                new Actor("Johnny", "Depp", 1000000, 59),
                                new Actor("Leonardo", "DiCaprio", 1500000, 47),
                                new Actor("Charles", "Hunnam", 900000, 42)))
                ));
    }

    @ParameterizedTest
    @MethodSource("LastNameComparatorArguments")
    public void getCompareLastName(List<Actor> actors, List<Actor> expected) {
        Comparator<Actor> lastNameComparator = new LastNameComparator();

        actors.sort(lastNameComparator);

        Assertions.assertEquals(expected, actors);
    }

    static Stream<Arguments> LastNameWithAgeComparatorArguments() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Johnny", "Depp", 1000000, 46),
                                new Actor("Leonardo", "Depp", 1500000, 47),
                                new Actor("Charles", "Hunnam", 900000, 42),
                                new Actor("Jensen", "Ackles", 800000, 44))),
                        new ArrayList<>(List.of(new Actor("Jensen", "Ackles", 800000, 44),
                                new Actor("Johnny", "Depp", 1000000, 46),
                                new Actor("Leonardo", "Depp", 1500000, 47),
                                new Actor("Charles", "Hunnam", 900000, 42)))
                ));
    }

    @ParameterizedTest
    @MethodSource("LastNameWithAgeComparatorArguments")
    public void getCompareLastNameWithAge(List<Actor> actors, List<Actor> expected) {
        Comparator<Actor> lastNameWithAgeComparator = new LastNameWithAgeComparator();

        actors.sort(lastNameWithAgeComparator);

        Assertions.assertEquals(expected, actors);
    }
}
