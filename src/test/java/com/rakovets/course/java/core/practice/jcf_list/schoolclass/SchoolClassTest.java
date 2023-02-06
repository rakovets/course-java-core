package com.rakovets.course.java.core.practice.jcf_list.schoolclass;

import com.rakovets.course.java.core.practice.jcf_list.schoolclass.comparators.StudentsAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.schoolclass.comparators.StudentsAverageAnnualMarkComparator;
import com.rakovets.course.java.core.practice.jcf_list.schoolclass.comparators.StudentsFullNameComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SchoolClassTest {
    private final Person dzmitry = new Person("Dzmitry", "Krasiuk", 17, 8.3);
    private final Person alexander = new Person("Alexander", "Braim", 16, 5.1);
    private final Person elena = new Person("Elena", "Ankova", 16, 7.6);
    private final Person julia = new Person("Julia", "Serbskaya",17, 4.9);
    private final Person anna = new Person("Anna", "Krasiuk",16, 9.7);
    private final Person iya = new Person("Iya", "Krasiuk",17, 8.7);
    private ArrayList<Person> studentList;
    private SchoolClass class11B;
    private Comparator<Person> comparator;

    @BeforeEach
    void init() {
        studentList = new ArrayList<>(Arrays.asList(dzmitry, alexander, elena, julia, anna, iya));
        class11B = new SchoolClass(studentList);
    }

    @DisplayName("Test getBestStudent(), returns Person from student list with highest annual average mark")
    @Test
    void getBestStudentTest() {
        Person result = class11B.getBestStudent(studentList);

        Assertions.assertEquals(anna, result);
    }

    @DisplayName("Test StudentsAverageAnnualMarkComparator(), returns list of students sorted by average annual mark")
    @Test
    void StudentsAverageAnnualMarkComparatorTest() {
        comparator = new StudentsAverageAnnualMarkComparator();

        studentList.sort(comparator);
        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(anna, iya, dzmitry, elena, alexander, julia));

        Assertions.assertEquals(expected, studentList);
    }

    @DisplayName("Test StudentsFullNameComparator(), returns list of students sorted by full name (name + surname")
    @Test
    void StudentsFullNameComparatorTest() {
        comparator = new StudentsFullNameComparator();

        studentList.sort(comparator);
        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(elena, alexander, anna, dzmitry, iya, julia));

        Assertions.assertEquals(expected, studentList);
    }

    @DisplayName("Test StudentsAgeComparator(), returns list of students sorted by age")
    @Test
    void StudentsAgeComparatorTest() {
        comparator = new StudentsAgeComparator();

        studentList.sort(comparator);
        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(alexander, elena, anna, dzmitry, julia, iya));

        Assertions.assertEquals(expected, studentList);
    }
}
