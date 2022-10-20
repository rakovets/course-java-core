package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.school.Person;
import com.rakovets.course.java.core.practice.jcf_list.school.SchoolClass;
import com.rakovets.course.java.core.practice.jcf_list.school.comparator.CompareByAge;
import com.rakovets.course.java.core.practice.jcf_list.school.comparator.CompareByAverageMark;
import com.rakovets.course.java.core.practice.jcf_list.school.comparator.CompareByFullName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchoolTest {
    static Stream<Arguments> provideArgumentsForGetBestStudent() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Person("Mark", "Green", 15, 6.5),
                                new Person("Ann", "Blake", 16, 9.5),
                                new Person("Jake", "Blake", 16, 8.5),
                                new Person("Kris", "Wood", 15, 7.4))),
                        new Person("Ann", "Blake", 16, 9.5))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetBestStudent")
    void getBestStudent(List<Person> students, Person expected) {
        SchoolClass school = new SchoolClass(students);

        Person actual = school.getBestStudent(students);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCompareByAge() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Person("Mark", "Green", 15, 6.5),
                                new Person("Ann", "Blake", 16, 9.5),
                                new Person("Jake", "Blake", 16, 8.5),
                                new Person("Kris", "Wood", 15, 7.4))),
                        new ArrayList<>(List.of(new Person("Mark", "Green", 15, 6.5),
                                new Person("Kris", "Wood", 15, 7.4),
                                new Person("Ann", "Blake", 16, 9.5),
                                new Person("Jake", "Blake", 16, 8.5))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCompareByAge")
    void getCompareByAge(List<Person> students, List<Person> expected) {
        students.sort(new CompareByAge());

        List<Person> actual = new ArrayList<>(students);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCompareByAverageMark() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Person("Mark", "Green", 15, 6.5),
                                new Person("Ann", "Blake", 16, 9.5),
                                new Person("Jake", "Blake", 16, 8.5),
                                new Person("Kris", "Wood", 15, 7.4))),
                        new ArrayList<>(List.of(new Person("Mark", "Green", 15, 6.5),
                                new Person("Kris", "Wood", 15, 7.4),
                                new Person("Jake", "Blake", 16, 8.5),
                                new Person("Ann", "Blake", 16, 9.5))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCompareByAverageMark")
    void getCompareByAverageMark(List<Person> students, List<Person> expected) {
        students.sort(new CompareByAverageMark());

        List<Person> actual = new ArrayList<>(students);

        assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForCompareByFullName() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Person("Mark", "Green", 15, 6.5),
                                new Person("Ann", "Blake", 16, 9.5),
                                new Person("Jake", "Blake", 16, 8.5),
                                new Person("Ann", "Wood", 15, 7.4))),
                        new ArrayList<>(List.of(new Person("Ann", "Blake", 16, 9.5),
                                new Person("Ann", "Wood", 15, 7.4),
                                new Person("Jake", "Blake", 16, 8.5),
                                new Person("Mark", "Green", 15, 6.5))))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForCompareByFullName")
    void getCompareByFullName(List<Person> students, List<Person> expected) {
        students.sort(new CompareByFullName());

        List<Person> actual = new ArrayList<>(students);

        assertEquals(expected, actual);
    }
}
