package com.rakovets.course.java.core.practice.jcf_list;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SchoolClassTest {
    Person person1 = new Person("Ivan", "Ivanov", 10, 3.0F);
    Person person2 = new Person("Peter", "Petrov", 9, 3.0F);
    Person person3 = new Person("Inna", "Innova", 10, 5.0F);
    Person person4 = new Person("Irina", "Innova", 8, 4.0F);
    SchoolClass schoolClass = new SchoolClass();
    List<Person> list = new ArrayList<>(Arrays.asList(person1, person2, person3, person4));

    @BeforeEach
    public void setUp() {
        schoolClass.setStudents(list);
    }

    @Test
    public void testAddStudents() {
        schoolClass.addStudents(person1);
        schoolClass.addStudents(person2);
        schoolClass.addStudents(person3);
        schoolClass.addStudents(person4);
        Assertions.assertEquals(list, schoolClass.getStudents());
    }

    @Test
    public void testGetBestStudent() {
        Assertions.assertEquals(person3, schoolClass.getBestStudent(schoolClass.getStudents()));
    }

    @Test
    public void testSortByAge() {
        schoolClass.getStudents().sort(schoolClass.byAge);
        List<Person> listSortedByAge = new ArrayList<>(Arrays.asList(person4, person2, person1, person3));
        Assertions.assertEquals(listSortedByAge, schoolClass.getStudents());
    }

    @Test
    public void testSortBySurnameName() {
        schoolClass.getStudents().sort(schoolClass.bySurnameName);
        List<Person> listSortedByFullSurnameName = new ArrayList<>(Arrays.asList(person3, person4, person1, person2));
        Assertions.assertEquals(listSortedByFullSurnameName, schoolClass.getStudents());
    }

    @Test
    public void testSortByAverageAnnualMark() {
        schoolClass.getStudents().sort(schoolClass.byAverageAnnualMark);
        List<Person> listSortedByMarks = new ArrayList<>(Arrays.asList(person1, person2, person4, person3));
        Assertions.assertEquals(listSortedByMarks, schoolClass.getStudents());
    }
}
