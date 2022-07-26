package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.clazz.Person;
import com.rakovets.course.java.core.practice.jcf_list.clazz.SchoolClass;
import com.rakovets.course.java.core.practice.jcf_list.clazz.comparator.AgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.clazz.comparator.AverageAnnualMarkComparator;
import com.rakovets.course.java.core.practice.jcf_list.clazz.comparator.NameComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@DisplayName("Test for class School Class.")
class SchoolClassTest {
    List<Person> students;
    List<Person> actual;
    SchoolClass schoolClass;

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
        actual = schoolClass.getStudents();
    }

    @Test
    @DisplayName("Finding the best student")
    void getBestStudentTest() {
        Person expected = new Person("Nikita", "Ivanov", 12, 89.8);

        Person actual = schoolClass.getBestStudent(students);

        Assertions.assertEquals(expected, actual);
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

        students.sort(new NameComparator());

        Assertions.assertEquals(expected, actual);
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

        students.sort(new AgeComparator());

        Assertions.assertEquals(expected, actual);
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

        students.sort(new AverageAnnualMarkComparator());

        Assertions.assertEquals(expected, actual);
    }
}
