package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.comparators_for_actors.*;
import com.rakovets.course.java.core.practice.jcf_list.project_studio.Actor;
import com.rakovets.course.java.core.practice.jcf_list.project_studio.Studio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;


public class ProjectStudioTests {
    static Stream<Arguments> provideArgumentsFire() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(new Actor("Johnny", "Depp", 1000, 59),
                                new Actor("Kevin", "Spacey", 950, 63),
                                new Actor("Brad", "Pitt", 1050, 58))),
                        new ArrayList<>(Arrays.asList(new Actor("Kevin", "Spacey", 950, 63),
                                new Actor("Johnny", "Depp", 1000, 59))))
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsFire")
    void testFire(List<Actor> actors, List<Actor> expected) {
        Studio studio = new Studio();

        List<Actor> actual = studio.fire(actors);

        Assertions.assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsActorAgeComparator() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(new Actor("Johnny", "Depp", 1000, 59),
                                new Actor("Kevin", "Spacey", 950, 63),
                                new Actor("Brad", "Pitt", 1050, 58))),
                        new ArrayList<>(Arrays.asList(new Actor("Brad", "Pitt", 1050, 58),
                                new Actor("Johnny", "Depp", 1000, 59),
                                new Actor("Kevin", "Spacey", 950, 63))))
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsActorAgeComparator")
    void testActorAgeComparator(List<Actor> actors, List<Actor> expected) {
        Comparator<Actor> comparator = new ActorAgeComparator();

        actors.sort(comparator);

        Assertions.assertEquals(expected, actors);
    }
    static Stream<Arguments> provideArgumentsActorFeeComparator() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(new Actor("Johnny", "Depp", 1000, 59),
                                new Actor("Kevin", "Spacey", 950, 63),
                                new Actor("Brad", "Pitt", 1050, 58))),
                        new ArrayList<>(Arrays.asList(new Actor("Kevin", "Spacey", 950, 63),
                                new Actor("Johnny", "Depp", 1000, 59),
                                new Actor("Brad", "Pitt", 1050, 58))))
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsActorFeeComparator")
    void testActorFeeComparator(List<Actor> actors, List<Actor> expected) {
        Comparator<Actor> comparator = new ActorFeeComparator();

        actors.sort(comparator);

        Assertions.assertEquals(expected, actors);
    }
    static Stream<Arguments> provideArgumentsActorLastNameComparator() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(new Actor("Johnny", "Depp", 1000, 59),
                                new Actor("Kevin", "Spacey", 950, 63),
                                new Actor("Brad", "Pitt", 1050, 58))),
                        new ArrayList<>(Arrays.asList(new Actor("Johnny", "Depp", 1000, 59),
                                new Actor("Brad", "Pitt", 1050, 58),
                                new Actor("Kevin", "Spacey", 950, 63))))
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsActorLastNameComparator")
    void testActorLastNameComparator(List<Actor> actors, List<Actor> expected) {
        Comparator<Actor> comparator = new ActorLastNameComparator();

        actors.sort(comparator);

        Assertions.assertEquals(expected, actors);
    }
    static Stream<Arguments> provideArgumentsActorFeeAndLastNameComparator() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(new Actor("Johnny", "Depp", 1000, 59),
                                new Actor("Kevin", "Spacey", 950, 63),
                                new Actor("Matt", "Damon", 950, 52),
                                new Actor("Brad", "Pitt", 1050, 58))),
                        new ArrayList<>(Arrays.asList(new Actor("Matt", "Damon", 950, 52),
                                new Actor("Kevin", "Spacey", 950, 63),
                                new Actor("Johnny", "Depp", 1000, 59),
                                new Actor("Brad", "Pitt", 1050, 58))))
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsActorFeeAndLastNameComparator")
    void testActorFeeAndLastNameComparator(List<Actor> actors, List<Actor> expected) {
        Comparator<Actor> comparator = new ActorFeeAndLastNameComparator();

        actors.sort(comparator);

        Assertions.assertEquals(expected, actors);
    }
    static Stream<Arguments> provideArgumentsActorLastNameAndAgeComparator() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(new Actor("Johnny", "Depp", 1000, 59),
                                new Actor("Kevin", "Spacey", 950, 63),
                                new Actor("Matt", "Depp", 950, 52),
                                new Actor("Brad", "Pitt", 1050, 58))),
                        new ArrayList<>(Arrays.asList(new Actor("Matt", "Depp", 950, 52),
                                new Actor("Johnny", "Depp", 1000, 59),
                                new Actor("Brad", "Pitt", 1050, 58),
                                new Actor("Kevin", "Spacey", 950, 63))))
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsActorLastNameAndAgeComparator")
    void testActorLastNameAndAgeComparator(List<Actor> actors, List<Actor> expected) {
        Comparator<Actor> comparator = new ActorLastNameAndAgeComparator();

        actors.sort(comparator);

        Assertions.assertEquals(expected, actors);
    }
}
