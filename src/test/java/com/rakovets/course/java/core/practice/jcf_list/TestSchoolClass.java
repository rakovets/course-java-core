package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.school_class.Person;
import com.rakovets.course.java.core.practice.jcf_list.school_class.SchoolClass;
import com.rakovets.course.java.core.practice.jcf_list.school_class.comparator.PersonAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.school_class.comparator.PersonFullNameComparator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestSchoolClass {
    SchoolClass schoolClass = new SchoolClass();
    List<Person> personList = new ArrayList<>(List.of(
            new Person("Anna", "Bond", 17, 5.5),
            new Person("Victor", "Serkan", 16, 6.6),
            new Person("Olga", "Bond", 15, 6.6),
            new Person("Roman", "Lofar", 16, 7.8),
            new Person("Olga", "Kolad", 17, 8.6)));

    @Test
    void testGetBestStudent() {
        Person actual = schoolClass.getBestStudent(personList);
        Person expected = new Person("Olga", "Kolad", 17, 8.6);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testAgeComparator() {
        personList.sort(new PersonAgeComparator());

        List<Person> expected = new ArrayList<>(List.of(
                new Person("Olga", "Bond", 15, 6.6),
                new Person("Victor", "Serkan", 16, 6.6),
                new Person("Roman", "Lofar", 16, 7.8),
                new Person("Anna", "Bond", 17, 5.5),
                new Person("Olga", "Kolad", 17, 8.6)));

        Assertions.assertEquals(expected, personList);
    }

    @Test
    void testFullNameComparator() {
        personList.sort(new PersonFullNameComparator());

        List<Person> expected = new ArrayList<>(List.of(
                new Person("Anna", "Bond", 17, 5.5),
                new Person("Olga", "Bond", 15, 6.6),
                new Person("Olga", "Kolad", 17, 8.6),
                new Person("Roman", "Lofar", 16, 7.8),
                new Person("Victor", "Serkan", 16, 6.6)));

        Assertions.assertEquals(expected, personList);
    }
}
