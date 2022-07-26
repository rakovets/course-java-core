package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.school_comparator.AgePersonComparator;
import com.rakovets.course.java.core.practice.jcf_list.school_comparator.AverageAnnualMarkPersonComparator;
import com.rakovets.course.java.core.practice.jcf_list.school_comparator.SurnameNamePersonComparator;
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
        person1 = new Person("Ivan", "Ivanov", 10, 3.0F);
        person2 = new Person("Peter", "Petrov", 9, 3.0F);
        person3 = new Person("Inna", "Innova", 10, 5.0F);
        person4 = new Person("Irina", "Innova", 8, 4.0F);
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
        actual.sort(new AgePersonComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortBySurnameName() {
        List<Person> expected = Arrays.asList(person3, person4, person1, person2);

        List <Person> actual=schoolClass.getStudents();
        actual.sort(new SurnameNamePersonComparator());

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testSortByAverageAnnualMark() {
        List<Person> expected = Arrays.asList(person1, person2, person4, person3);

        List <Person> actual=schoolClass.getStudents();
        actual.sort(new AverageAnnualMarkPersonComparator());

        Assertions.assertEquals(expected, actual);
    }
}
