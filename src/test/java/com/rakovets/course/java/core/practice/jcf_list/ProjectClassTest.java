package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.project_class.Person;
import com.rakovets.course.java.core.practice.jcf_list.project_class.SchoolClass;
import com.rakovets.course.java.core.practice.jcf_list.project_class.comparators.PersonAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.project_class.comparators.PersonAverageAnnualMarkComparator;
import com.rakovets.course.java.core.practice.jcf_list.project_class.comparators.PersonFullNameComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ProjectClassTest {
    private SchoolClass schoolClass;
    private List<Person> personsList;
    private final Person JAMES_GOSLING = new Person(" James", "Gosling", 67, 5.5);
    private final Person WILLIAM_JOY = new Person(" William", "Joy", 68, 5.4);
    private final Person GUY_STEELE = new Person(" Guy", "Steele", 68, 5.4);
    private final Person ROSSUM_GUIDO_VAN = new Person(" Rossum", "Guido van", 67, 5.6);
    private final Person LINUS_TORVALDS = new Person(" Linus", "Torvalds", 53, 6.9);

    @BeforeEach
    void initTestData() {
        schoolClass = new SchoolClass();
        personsList = Arrays.asList(JAMES_GOSLING, WILLIAM_JOY, GUY_STEELE, ROSSUM_GUIDO_VAN, LINUS_TORVALDS);
    }

    @Test
    void getBestStudentTest() {
        Person actualPerson = schoolClass.getBestStudent(personsList);

        Assertions.assertEquals(LINUS_TORVALDS, actualPerson);
    }

    @Test
    void personFullNameComparatorTest() {
        List<Person> expectedList = Arrays.asList(GUY_STEELE, JAMES_GOSLING, LINUS_TORVALDS, ROSSUM_GUIDO_VAN, WILLIAM_JOY);
        Comparator<Person> comparator = new PersonFullNameComparator();

        personsList.sort(comparator);

        Assertions.assertEquals(expectedList, personsList);
    }

    @Test
    void personAgeComparatorTest() {
        List<Person> expectedList = Arrays.asList(LINUS_TORVALDS, JAMES_GOSLING, ROSSUM_GUIDO_VAN, WILLIAM_JOY, GUY_STEELE);
        Comparator<Person> comparator = new PersonAgeComparator();

        personsList.sort(comparator);

        Assertions.assertEquals(expectedList, personsList);
    }

    @Test
    void personAverageAnnualMarkComparatorTest() {
        List<Person> expectedList = Arrays.asList(WILLIAM_JOY, GUY_STEELE, JAMES_GOSLING, ROSSUM_GUIDO_VAN, LINUS_TORVALDS);
        Comparator<Person> comparator = new PersonAverageAnnualMarkComparator();

        personsList.sort(comparator);

        Assertions.assertEquals(expectedList, personsList);
    }

}
