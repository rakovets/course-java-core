package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.comparators_for_students.StudentAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.comparators_for_students.StudentAverageAnnualMarkComparator;
import com.rakovets.course.java.core.practice.jcf_list.comparators_for_students.StudentFullNameComparator;
import com.rakovets.course.java.core.practice.jcf_list.project_class.Person;
import com.rakovets.course.java.core.practice.jcf_list.project_class.SchoolClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ProjectClassTests {
    static Stream<Arguments> provideArgumentsGetBestStudent() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(new Person("Johnny", "Depp", 59, 4.0),
                                new Person("Kevin", "Spacey", 63, 3.0),
                                new Person("Brad", "Pitt", 58, 10.0))),
                        new Person("Brad", "Pitt", 58, 10.0))
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsGetBestStudent")
    void testGetBestStudent(List<Person> students, Person expected) {
        SchoolClass schoolClass = new SchoolClass();

        Person actual = schoolClass.getBestStudent(students);

        Assertions.assertEquals(expected, actual);
    }
    static Stream<Arguments> provideArgumentsStudentAgeComparator() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(new Person("Johnny", "Depp", 59, 4.0),
                                new Person("Kevin", "Spacey", 63, 3.0),
                                new Person("Brad", "Pitt", 58, 10.0))),
                        new ArrayList<>(Arrays.asList(new Person("Brad", "Pitt", 58, 10.0),
                                new Person("Johnny", "Depp", 59, 4.0),
                                new Person("Kevin", "Spacey", 63, 3.0))))
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsStudentAgeComparator")
    void testStudentAgeComparator(List<Person> students, List<Person> expected) {
        Comparator<Person> comparator = new StudentAgeComparator();

        students.sort(comparator);

        Assertions.assertEquals(expected, students);
    }
    static Stream<Arguments> provideArgumentsStudentAverageAnnualMarkComparator() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(new Person("Johnny", "Depp", 59, 4.0),
                                new Person("Kevin", "Spacey", 63, 3.0),
                                new Person("Brad", "Pitt", 58, 10.0))),
                        new ArrayList<>(Arrays.asList(new Person("Kevin", "Spacey", 63, 3.0),
                                new Person("Johnny", "Depp", 59, 4.0),
                                new Person("Brad", "Pitt", 58, 10.0))))
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsStudentAverageAnnualMarkComparator")
    void testStudentAverageAnnualMarkComparator(List<Person> students, List<Person> expected) {
        Comparator<Person> comparator = new StudentAverageAnnualMarkComparator();

        students.sort(comparator);

        Assertions.assertEquals(expected, students);
    }
    static Stream<Arguments> provideArgumentsStudentFullNameComparator() {
        return Stream.of(
                Arguments.of(new ArrayList<>(Arrays.asList(new Person("Johnny", "Depp", 59, 4.0),
                                new Person("Kevin", "Spacey", 63, 3.0),
                                new Person("Johnny", "Spacey", 17, 7.0),
                                new Person("Brad", "Pitt", 58, 10.0))),
                        new ArrayList<>(Arrays.asList(new Person("Brad", "Pitt", 58, 10.0),
                                new Person("Johnny", "Depp", 59, 4.0),
                                new Person("Johnny", "Spacey", 17, 7.0),
                                new Person("Kevin", "Spacey", 63, 3.0))))
        );
    }

    @ParameterizedTest()
    @MethodSource("provideArgumentsStudentFullNameComparator")
    void testStudentFullNameComparator(List<Person> students, List<Person> expected) {
        Comparator<Person> comparator = new StudentFullNameComparator();

        students.sort(comparator);

        Assertions.assertEquals(expected, students);
    }
}
