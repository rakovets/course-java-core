package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_collection.school_class.Person;
import com.rakovets.course.java.core.practice.jcf_collection.school_class.SchoolClass;
import com.rakovets.course.java.core.practice.jcf_collection.school_class.comparator.StudentsAgeComparator;
import com.rakovets.course.java.core.practice.jcf_collection.school_class.comparator.StudentsAverageAnnualMarkComparator;
import com.rakovets.course.java.core.practice.jcf_collection.school_class.comparator.StudentsFullNameComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class SchoolClassProjectTest {
    List<Person> student = new ArrayList<>();
    SchoolClass schoolClass = new SchoolClass(student);
    Comparator<Person> comparatorAgeStudents = new StudentsAgeComparator();
    Comparator<Person> comparatorAverageAnnualMark = new StudentsAverageAnnualMarkComparator();
    Comparator<Person> comparatorFullNameComparator = new StudentsFullNameComparator();

    static Stream<Arguments> provideArgumentsForConstructorPersonClass() {
        return Stream.of(
                Arguments.of("Ronald", "Weasley", 14, 7.4,
                        "Student {Name: Ronald; Surname: Weasley; Age: 14; Average annual mark: 7.4}"),
                Arguments.of("Hermione", "Granger", 15, 9.8,
                        "Student {Name: Hermione; Surname: Granger; Age: 15; Average annual mark: 9.8}"),
                Arguments.of("Neville", "Longbottom", 14, 6.3,
                        "Student {Name: Neville; Surname: Longbottom; Age: 14; Average annual mark: 6.3}"),
                Arguments.of("Draco", "Malfoy", 14, 8.8,
                        "Student {Name: Draco; Surname: Malfoy; Age: 14; Average annual mark: 8.8}"),
                Arguments.of("Cedric", "Diggory", 17, 9.9,
                        "Student {Name: Cedric; Surname: Diggory; Age: 17; Average annual mark: 9.9}")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForConstructorPersonClass")
    void testConstructorPersonClass(String name, String surname, int age, double averageAnnualMark, String expected) {
        Person student = new Person(name, surname, age, averageAnnualMark);
        Person actual = student;

        Assertions.assertEquals(expected, actual.toString());
    }

    static Stream<Arguments> provideArgumentsForGetMethodsPersonClass() {
        return Stream.of(
                Arguments.of("Ronald", "Weasley", 14, 7.4,
                        "Ronald Weasley 14 7.4"),
                Arguments.of("Hermione", "Granger", 15, 9.8,
                        "Hermione Granger 15 9.8"),
                Arguments.of("Neville", "Longbottom", 14, 6.3,
                        "Neville Longbottom 14 6.3"),
                Arguments.of("Draco", "Malfoy", 14, 8.8,
                        "Draco Malfoy 14 8.8"),
                Arguments.of("Cedric", "Diggory", 17, 9.9,
                        "Cedric Diggory 17 9.9")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetMethodsPersonClass")
    void testGetMethodsPersonClass(String name, String surname, int age, double averageAnnualMark, String expected) {
        Person student = new Person(name, surname, age, averageAnnualMark);
        String actual = student.getName() + " " + student.getSurname() + " "
                + student.getAge() + " " + student.getAverageAnnualMark();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForGetBestStudentMethodSchoolClassClass() {
        return Stream.of(
                Arguments.of("Best Student {Name: Cedric; Surname: Diggory; " +
                        "Age: 17; Average annual mark: 9.9}")
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForGetBestStudentMethodSchoolClassClass")
    void testGetBestStudentMethodSchoolClassClass(String expected) {
        student.add(new Person("Ronald", "Weasley", 14, 7.4));
        student.add(new Person("Hermione", "Granger", 15, 9.8));
        student.add(new Person("Neville", "Longbottom", 14, 6.3));
        student.add(new Person("Draco", "Malfoy", 14, 8.8));
        student.add(new Person("Cedric", "Diggory", 17, 9.9));

        String actual = schoolClass.getBestStudent(student);

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForComparatorAgeStudents() {
        return Stream.of(
                Arguments.of(Arrays.asList(
                        "Student {Name: Ronald; Surname: Weasley; Age: 14; Average annual mark: 7.4}",
                        "Student {Name: Neville; Surname: Longbottom; Age: 14; Average annual mark: 6.3}",
                        "Student {Name: Draco; Surname: Malfoy; Age: 14; Average annual mark: 8.8}",
                        "Student {Name: Hermione; Surname: Granger; Age: 15; Average annual mark: 9.8}",
                        "Student {Name: Cedric; Surname: Diggory; Age: 17; Average annual mark: 9.9}"
                ))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForComparatorAgeStudents")
    void testComparatorAgeStudents(List<Person> expected) {
        student.add(new Person("Ronald", "Weasley", 14, 7.4));
        student.add(new Person("Hermione", "Granger", 15, 9.8));
        student.add(new Person("Neville", "Longbottom", 14, 6.3));
        student.add(new Person("Draco", "Malfoy", 14, 8.8));
        student.add(new Person("Cedric", "Diggory", 17, 9.9));

        student.sort(comparatorAgeStudents);
        List<Person> actual = student;

        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    static Stream<Arguments> provideArgumentsForComparatorAverageAnnualMarkStudent() {
        return Stream.of(
                Arguments.of(Arrays.asList(
                        "Student {Name: Neville; Surname: Longbottom; Age: 14; Average annual mark: 6.3}",
                        "Student {Name: Ronald; Surname: Weasley; Age: 14; Average annual mark: 7.4}",
                        "Student {Name: Draco; Surname: Malfoy; Age: 14; Average annual mark: 8.8}",
                        "Student {Name: Hermione; Surname: Granger; Age: 15; Average annual mark: 9.8}",
                        "Student {Name: Cedric; Surname: Diggory; Age: 17; Average annual mark: 9.9}"
                ))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForComparatorAverageAnnualMarkStudent")
    void testComparatorAverageAnnualMarkStudent(List<Person> expected) {
        student.add(new Person("Ronald", "Weasley", 14, 7.4));
        student.add(new Person("Hermione", "Granger", 15, 9.8));
        student.add(new Person("Neville", "Longbottom", 14, 6.3));
        student.add(new Person("Draco", "Malfoy", 14, 8.8));
        student.add(new Person("Cedric", "Diggory", 17, 9.9));

        student.sort(comparatorAverageAnnualMark);
        List<Person> actual = student;

        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    static Stream<Arguments> provideArgumentsForComparatorFullNameStudent() {
        return Stream.of(
                Arguments.of(Arrays.asList(
                        "Student {Name: Cedric; Surname: Diggory; Age: 17; Average annual mark: 9.9}",
                        "Student {Name: Draco; Surname: Malfoy; Age: 14; Average annual mark: 8.8}",
                        "Student {Name: Hermione; Surname: Granger; Age: 15; Average annual mark: 9.8}",
                        "Student {Name: Neville; Surname: Longbottom; Age: 14; Average annual mark: 6.3}",
                        "Student {Name: Ronald; Surname: Weasley; Age: 14; Average annual mark: 7.4}"
                ))
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForComparatorFullNameStudent")
    void testComparatorFullNameStudent(List<Person> expected) {
        student.add(new Person("Ronald", "Weasley", 14, 7.4));
        student.add(new Person("Hermione", "Granger", 15, 9.8));
        student.add(new Person("Neville", "Longbottom", 14, 6.3));
        student.add(new Person("Draco", "Malfoy", 14, 8.8));
        student.add(new Person("Cedric", "Diggory", 17, 9.9));

        student.sort(comparatorFullNameComparator);
        List<Person> actual = student;

        Assertions.assertEquals(expected.toString(), actual.toString());
    }
}
