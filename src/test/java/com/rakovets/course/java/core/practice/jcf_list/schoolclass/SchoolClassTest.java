package com.rakovets.course.java.core.practice.jcf_list.schoolclass;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SchoolClassTest {
    private SchoolClass schoolClass;
    private Person person1;
    private Person person2;
    private Person person3;
    private Person person4;

    @BeforeEach
    public void setUp() {
        person1 = new Person("John", "Last", 7, 6);
        person2 = new Person("Simon", "Smith", 6, 6);
        person3 = new Person("Ann", "Edwards", 7, 9);
        person4 = new Person("Anny", "Edwards", 5, 8);
        List<Person> list = new ArrayList<>(Arrays.asList(person1, person2, person3, person4));
        schoolClass = new SchoolClass();
        schoolClass.setStudents(list);
    }

    @Test
    public void testGetBestStudent() {
        Person expected = person3;

        Person actual = schoolClass.getBestStudent(schoolClass.getStudents());

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void testSortByAge() {
        List<Person> expected = Arrays.asList(person4, person2, person1, person3);

        List <Person> actual = schoolClass.getStudents();
        actual.sort(new PersonAgeComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortByFullName() {
        List<Person> expected = Arrays.asList(person3, person4, person1, person2);

        List <Person> actual=schoolClass.getStudents();
        actual.sort(new PersonFullNameComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortByAverageAnnualMark() {
        List<Person> expected = Arrays.asList(person1, person2, person4, person3);

        List <Person> actual=schoolClass.getStudents();
        actual.sort(new PersonAverageMarkComparator());

        Assertions.assertEquals(expected, actual);
    }
}
