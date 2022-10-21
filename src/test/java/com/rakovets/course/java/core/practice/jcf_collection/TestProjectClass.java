package com.rakovets.course.java.core.practice.jcf_collection;

import com.rakovets.course.java.core.practice.jcf_list.comparator.PersonAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.comparator.PersonAverageAnnualMarkComparator;
import com.rakovets.course.java.core.practice.jcf_list.comparator.PersonNameSurnameComparator;
import com.rakovets.course.java.core.practice.jcf_list.project_class.Person;
import com.rakovets.course.java.core.practice.jcf_list.project_class.SchoolClass;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestProjectClass {
    static Stream<Arguments> provideArgumentsGetBestStudent() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Person("Petr", "Atrov", 20, 8.0),
                                new Person("Petr", "Basiliev", 18, 6.0),
                                new Person("Petr", "Cichailov", 25, 7.0))),
                        new Person("Petr", "Atrov", 20, 8.0))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsGetBestStudent")
    public void testPersonGetBestStudent(List<Person> personList, Person personExpected) {
        SchoolClass schoolClass = new SchoolClass();
        Person personActual = schoolClass.getBestStudent(personList);

        assertEquals(personExpected, personActual);
    }

    static Stream<Arguments> provideArgumentsNameSurnameCompare() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Person("Petr", "Aleksandrov", 22, 7.0),
                                new Person("Petr", "Mask", 25, 8.0),
                                new Person("Petr", "Gavrilov", 18, 5.0))),
                        new ArrayList<>(List.of(new Person("Petr", "Aleksandrov", 22, 7.0),
                                new Person("Petr", "Gavrilov", 18, 5.0),
                                new Person("Petr", "Mask", 25, 8.0))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsNameSurnameCompare")
    public void testPersonNameSurnameCompare(List<Person> personList, List<Person> expected) {
        Comparator<Person> comparatorNameSurname = new PersonNameSurnameComparator();
        personList.sort(comparatorNameSurname);

        assertEquals(expected, personList);
    }

    static Stream<Arguments> provideArgumentsAgeCompare() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Person("Petr", "Aleksandrov", 22, 7.0),
                                new Person("Petr", "Mask", 25, 8.0),
                                new Person("Petr", "Gavrilov", 18, 5.0))),
                        new ArrayList<>(List.of(new Person("Petr", "Gavrilov", 18, 5.0),
                                new Person("Petr", "Aleksandrov", 22, 7.0),
                                new Person("Petr", "Mask", 25, 8.0))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsAgeCompare")
    public void testPersonAgeCompare(List<Person> personList, List<Person> expected) {
        Comparator<Person> comparatorAge = new PersonAgeComparator();
        personList.sort(comparatorAge);

        assertEquals(expected, personList);
    }

    static Stream<Arguments> provideArgumentsAverageAnnualMarkCompare() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Person("Petr", "Aleksandrov", 22, 7.0),
                                new Person("Petr", "Mask", 25, 8.0),
                                new Person("Petr", "Gavrilov", 18, 5.0))),
                        new ArrayList<>(List.of(new Person("Petr", "Gavrilov", 18, 5.0),
                                new Person("Petr", "Aleksandrov", 22, 7.0),
                                new Person("Petr", "Mask", 25, 8.0))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsAverageAnnualMarkCompare")
    public void testPersonAverageAnnualMarkCompare(List<Person> personList, List<Person> expected) {
        Comparator<Person> comparatorAverageAnnualMark = new PersonAverageAnnualMarkComparator();
        personList.sort(comparatorAverageAnnualMark);

        assertEquals(expected, personList);
    }
}
