package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.clazz.Person;
import com.rakovets.course.java.core.practice.jcf_list.clazz.SchoolClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Test for class School Class.")
class SchoolClassTest {
    static List<Person> students;
    static SchoolClass schoolClass;

    @BeforeEach
    void init() {
        students = new ArrayList<>(Arrays.asList(
                new Person("Ivan", "Ivanov", 11, 78.8),
                new Person("Petr", "Petrov", 10, 68.6),
                new Person("Kirill", "Kirillov", 12, 45.5),
                new Person("Brad", "Pitt", 11, 78.0),
                new Person("Nikita", "Ivanov", 12, 89.8)
        ));
        schoolClass = new SchoolClass(students);
    }

    @Test
    @DisplayName("Finding the best student")
    void getBestStudentTest() {
        Person expected = new Person("Nikita", "Ivanov", 12, 89.8);

        Assertions.assertEquals(expected, schoolClass.getBestStudent(students));
    }

    @Test
    @DisplayName("Comparator students by name.")
    void nameComparatorTest() {
        List<Person> expected = new ArrayList<>(Arrays.asList(
                new Person("Brad", "Pitt", 11, 78.0),
                new Person("Ivan", "Ivanov", 11, 78.8),
                new Person("Kirill", "Kirillov", 12, 45.5),
                new Person("Nikita", "Ivanov", 12, 89.8),
                new Person("Petr", "Petrov", 10, 68.6)

        ));

        students.sort(new SchoolClass.NameComparator());

        Assertions.assertEquals(expected, schoolClass.getStudents());
    }

    @Test
    @DisplayName("Comparator students by age.")
    void ageComparatorTest() {
        List<Person> expected = new ArrayList<>(Arrays.asList(
                new Person("Petr", "Petrov", 10, 68.6),
                new Person("Ivan", "Ivanov", 11, 78.8),
                new Person("Brad", "Pitt", 11, 78.0),
                new Person("Kirill", "Kirillov", 12, 45.5),
                new Person("Nikita", "Ivanov", 12, 89.8)
        ));

        students.sort(new SchoolClass.AgeComparator());

        Assertions.assertEquals(expected, schoolClass.getStudents());
    }

    @Test
    @DisplayName("Comparator students by average annual mark.")
    void averageAnnualMarkComparatorTest() {
        List<Person> expected = new ArrayList<>(Arrays.asList(
                new Person("Kirill", "Kirillov", 12, 45.5),
                new Person("Petr", "Petrov", 10, 68.6),
                new Person("Brad", "Pitt", 11, 78.0),
                new Person("Ivan", "Ivanov", 11, 78.8),
                new Person("Nikita", "Ivanov", 12, 89.8)
        ));

        students.sort(new SchoolClass.AverageAnnualMarkComparator());

        Assertions.assertEquals(expected, schoolClass.getStudents());
    }
}
