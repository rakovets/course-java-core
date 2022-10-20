package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.studio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.studio.Studio;
import com.rakovets.course.java.core.practice.jcf_list.studio.comparator.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudioTest {
    static Stream<Arguments> provideArgumentsForFire() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Kyle", "MacLachlan", 1_500_000, 63),
                        new Actor("Elijah", "Wood", 1_250_000, 41))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForFire")
    void getFire(List<Actor> expected) {
        List<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Kevin", "Bacon", 2_000_000, 64));
        actors.add(new Actor("Kyle", "MacLachlan", 1_500_000, 63));
        actors.add(new Actor("Elijah", "Wood", 1_250_000, 41));
        Studio studio = new Studio(actors);

        List<Actor> actual = new ArrayList<>(studio.fire(actors));

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCompareByAge() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Kyle", "MacLachlan", 1_500_040, 63),
                                new Actor("Kevin", "Bacon", 2_000_000, 64),
                                new Actor("Elijah", "Wood", 3_550_000, 41))),
                        new ArrayList<>(List.of(new Actor("Elijah", "Wood", 3_550_000, 41),
                                new Actor("Kyle", "MacLachlan", 1_500_040, 63),
                                new Actor("Kevin", "Bacon", 2_000_000, 64))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCompareByAge")
    void getCompareByAge(List<Actor> actors, List<Actor> expected) {
        actors.sort(new CompareByAge());

        List<Actor> actual = new ArrayList<>(actors);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCompareByFee() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Elijah", "Wood", 3_550_000, 41),
                                new Actor("Kyle", "MacLachlan", 1_500_040, 63),
                                new Actor("Kevin", "Bacon", 2_000_000, 64))),
                        new ArrayList<>(List.of(new Actor("Kyle", "MacLachlan", 1_500_040, 63),
                                new Actor("Kevin", "Bacon", 2_000_000, 64),
                                new Actor("Elijah", "Wood", 3_550_000, 41))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCompareByFee")
    void getCompareByFee(List<Actor> actors, List<Actor> expected) {
        actors.sort(new CompareByFee());

        List<Actor> actual = new ArrayList<>(actors);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCompareByLastName() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Elijah", "Wood", 3_550_000, 41),
                                new Actor("Kyle", "MacLachlan", 1_500_040, 63),
                                new Actor("Kevin", "Bacon", 2_000_000, 64))),
                        new ArrayList<>(List.of(new Actor("Kevin", "Bacon", 2_000_000, 64),
                                new Actor("Kyle", "MacLachlan", 1_500_040, 63),
                                new Actor("Elijah", "Wood", 3_550_000, 41))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCompareByLastName")
    void getCompareByLastName(List<Actor> actors, List<Actor> expected) {
        actors.sort(new CompareByLastName());

        List<Actor> actual = new ArrayList<>(actors);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCompareByLastNameAndAge() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Elijah", "Wood", 3_550_000, 41),
                                new Actor("Kyle", "Bacon", 1_500_040, 63),
                                new Actor("Kevin", "Bacon", 2_000_000, 64))),
                        new ArrayList<>(List.of(new Actor("Kyle", "Bacon", 1_500_040, 63),
                                new Actor("Kevin", "Bacon", 2_000_000, 64),
                                new Actor("Elijah", "Wood", 3_550_000, 41))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCompareByLastNameAndAge")
    void getCompareByLastNameAndAge(List<Actor> actors, List<Actor> expected) {
        actors.sort(new CompareByLastNameAndAge());

        List<Actor> actual = new ArrayList<>(actors);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCompareByFeeAndLastName() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Actor("Elijah", "Bood", 2_000_000, 41),
                                new Actor("Kyle", "MacLachlan", 1_500_040, 63),
                                new Actor("Kevin", "Wacon", 2_000_000, 64))),
                        new ArrayList<>(List.of(new Actor("Kyle", "MacLachlan", 1_500_040, 63),
                                new Actor("Elijah", "Bood", 2_000_000, 41),
                                new Actor("Kevin", "Wacon", 2_000_000, 64))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCompareByFeeAndLastName")
    void getCompareByFeeAndLastName(List<Actor> actors, List<Actor> expected) {
        actors.sort(new CompareByFeeAndLastName());

        List<Actor> actual = new ArrayList<>(actors);

        assertEquals(expected, actual);
    }
}
