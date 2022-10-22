package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.school.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SchoolTest {

    static Stream<Arguments> bestStudentArguments() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Person("Michel", "Williams", 16, 9.9),
                                new Person("Mishel", "Willi", 15, 9.8),
                                new Person("Garry", "Peters", 17, 7.9),
                                new Person("Oliver", "Martin", 14, 8.5),
                                new Person("Kate", "Grant", 13, 8.4))),
                        (new Person("Michel", "Williams", 16, 9.9))
                ));
    }

    @ParameterizedTest
    @MethodSource("bestStudentArguments")
    public void getBestStudent(List<Person> students, Person expected) {
        SchoolClass school = new SchoolClass(students);

        Person actual = school.getBestStudent(students);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> agePersonComparatorArguments() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Person("Michel", "Williams", 16, 9.8),
                                new Person("Mishel", "Willi", 15, 9.8),
                                new Person("Garry", "Peters", 17, 7.9),
                                new Person("Oliver", "Martin", 14, 8.5),
                                new Person("Kate", "Grant", 13, 8.4))),
                        new ArrayList<>(List.of(new Person("Kate", "Grant", 13, 8.4),
                                new Person("Oliver", "Martin", 14, 8.5),
                                new Person("Mishel", "Willi", 15, 9.8),
                                new Person("Michel", "Williams", 16, 9.8),
                                new Person("Garry", "Peters", 17, 7.9)))
                ));
    }

    @ParameterizedTest
    @MethodSource("agePersonComparatorArguments")
    public void getCompareAgePerson(List<Person> students, List<Person> expected) {
        Comparator<Person> comparatorPersonAge = new AgePersonComparator();

        students.sort(comparatorPersonAge);

        Assertions.assertEquals(expected, students);
    }

    static Stream<Arguments> averageAnnualMarkComparatorArguments() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Person("Michel", "Williams", 16, 9.8),
                                new Person("Mishel", "Willi", 15, 9.8),
                                new Person("Garry", "Peters", 17, 7.9),
                                new Person("Oliver", "Martin", 14, 8.5),
                                new Person("Kate", "Grant", 13, 8.4))),
                        new ArrayList<>(List.of(new Person("Garry", "Peters", 17, 7.9),
                                new Person("Kate", "Grant", 13, 8.4),
                                new Person("Oliver", "Martin", 14, 8.5),
                                new Person("Michel", "Williams", 16, 9.8),
                                new Person("Mishel", "Willi", 15, 9.8)))
                ));
    }

    @ParameterizedTest
    @MethodSource("averageAnnualMarkComparatorArguments")
    public void getCompareAverageAnnualMark(List<Person> students, List<Person> expected) {
        Comparator<Person> comparatorAverageAnnualMark = new AverageAnnualMarkComparator();

        students.sort(comparatorAverageAnnualMark);

        Assertions.assertEquals(expected, students);
    }

    static Stream<Arguments> nameWithSurnameComparatorArguments() {
        return Stream.of(
                Arguments.of(new ArrayList<>(List.of(new Person("Michel", "Williams", 16, 9.8),
                                new Person("Mishel", "Willi", 15, 9.8),
                                new Person("Garry", "Peters", 17, 7.9),
                                new Person("Oliver", "Martin", 14, 8.5),
                                new Person("Kate", "Grant", 13, 8.4))),
                        new ArrayList<>(List.of(new Person("Garry", "Peters", 17, 7.9),
                                new Person("Kate", "Grant", 13, 8.4),
                                new Person("Michel", "Williams", 16, 9.8),
                                new Person("Mishel", "Willi", 15, 9.8),
                                new Person("Oliver", "Martin", 14, 8.5)))
                ));
    }

    @ParameterizedTest
    @MethodSource("nameWithSurnameComparatorArguments")
    public void getCompareNameWithSurname(List<Person> students, List<Person> expected) {
        Comparator<Person> comparatorNameWithSurname = new NameWithSurnameComparator();

        students.sort(comparatorNameWithSurname);

        Assertions.assertEquals(expected, students);
    }
}
