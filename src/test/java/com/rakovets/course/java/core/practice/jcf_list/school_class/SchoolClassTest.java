package com.rakovets.course.java.core.practice.jcf_list.school_class;

import com.rakovets.course.java.core.practice.jcf_list.school_class.comparators.PersonAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.school_class.comparators.PersonAverageAnnualMarkComparator;
import com.rakovets.course.java.core.practice.jcf_list.school_class.comparators.PersonFirstNameComparator;
import com.rakovets.course.java.core.practice.jcf_list.school_class.comparators.PersonSurnameComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class SchoolClassTest {
    private final Person monroe = new Person("Marilyn", "Monroe", 18, 6.9);
    private final Person stewart = new Person("Patric", "Stewart", 17, 8.2);
    private final Person patel = new Person("Dev", "Patel", 16, 4.5);
    private final Person penn = new Person("Sean", "Penn", 15, 5.6);
    private final Person pitt = new Person("Brad", "Pitt", 15, 7.5);
    private final Person cage = new Person("Nicolas", "Cage", 17, 6.6);
    private final Person levy = new Person("Jane", "Levy", 16, 8.9);
    private final Person johansson = new Person("Scarlett", "Johansson", 13, 8.1);
    private final Person streep = new Person("Maryl", "Streep", 18, 7.7);

    @Test
    public void getBestStudentTest1() {
        ArrayList<Person> students = new ArrayList<>(Arrays.asList(monroe, patel, penn, pitt, levy, streep));
        SchoolClass class9A = new SchoolClass(students);

        Person actual = class9A.getBestStudent(students);

        Assertions.assertEquals(levy, actual);
    }

    @Test
    public void getBestStudentTest2() {
        ArrayList<Person> students = new ArrayList<>(Arrays.asList(monroe, patel, penn, pitt, streep, cage, stewart));
        SchoolClass class9A = new SchoolClass(students);

        Person actual = class9A.getBestStudent(students);

        Assertions.assertEquals(stewart, actual);
    }

    @Test
    public void getBestStudentTest3() {
        ArrayList<Person> students = new ArrayList<>(Arrays.asList(monroe, patel, penn, pitt, streep, cage));
        SchoolClass class9A = new SchoolClass(students);

        Person actual = class9A.getBestStudent(students);

        Assertions.assertEquals(streep, actual);
    }

    @Test
    public void PersonAgeComparatorTest1() {
        ArrayList<Person> students = new ArrayList<>(Arrays.asList(monroe, patel, penn, pitt, streep, cage));
        Comparator<Person> comparator = new PersonAgeComparator();

        students.sort(comparator);

        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(penn, pitt, patel, cage, monroe, streep));
        Assertions.assertEquals(expected, students);
    }

    @Test
    public void PersonAgeComparatorTest2() {
        ArrayList<Person> students = new ArrayList<>(Arrays.asList(stewart, patel, levy, pitt, johansson));
        Comparator<Person> comparator = new PersonAgeComparator();

        students.sort(comparator);

        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(johansson, pitt, patel, levy, stewart));
        Assertions.assertEquals(expected, students);
    }

    @Test
    public void PersonFirstNameComparatorTest1() {
        ArrayList<Person> students = new ArrayList<>(Arrays.asList(stewart, patel, levy, pitt, johansson));
        Comparator<Person> comparator = new PersonFirstNameComparator();

        students.sort(comparator);

        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(pitt, patel, levy, stewart, johansson));
        Assertions.assertEquals(expected, students);
    }

    @Test
    public void PersonFirstNameComparatorTest2() {
        ArrayList<Person> students = new ArrayList<>(Arrays.asList(monroe, patel, penn, pitt, streep, cage));
        Comparator<Person> comparator = new PersonFirstNameComparator();

        students.sort(comparator);

        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(pitt, patel, monroe, streep, cage, penn));
        Assertions.assertEquals(expected, students);
    }

    @Test
    public void PersonSurnameComparatorTest1() {
        ArrayList<Person> students = new ArrayList<>(Arrays.asList(stewart, patel, levy, pitt, johansson));
        Comparator<Person> comparator = new PersonSurnameComparator();

        students.sort(comparator);

        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(johansson, levy, patel, pitt, stewart));
        Assertions.assertEquals(expected, students);
    }

    @Test
    public void PersonSurnameComparatorTest2() {
        ArrayList<Person> students = new ArrayList<>(Arrays.asList(monroe, patel, penn, pitt, streep, cage));
        Comparator<Person> comparator = new PersonSurnameComparator();

        students.sort(comparator);

        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(cage, monroe, patel, penn, pitt, streep));
        Assertions.assertEquals(expected, students);
    }

    @Test
    public void PersonAverageAnnualMarkComparatorTest1() {
        ArrayList<Person> students = new ArrayList<>(Arrays.asList(stewart, patel, levy, pitt, johansson));
        Comparator<Person> comparator = new PersonAverageAnnualMarkComparator();

        students.sort(comparator);

        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(patel, pitt, johansson, stewart, levy));
        Assertions.assertEquals(expected, students);
    }

    @Test
    public void PersonAverageAnnualMarkComparatorTest2() {
        ArrayList<Person> students = new ArrayList<>(Arrays.asList(monroe, patel, penn, pitt, streep, cage));
        Comparator<Person> comparator = new PersonAverageAnnualMarkComparator();

        students.sort(comparator);

        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(patel, penn, cage, monroe, pitt, streep));
        Assertions.assertEquals(expected, students);
    }

    @Test
    public void PersonFirstNameComparatorAndPersonSurnameComparatorTest1() {
        ArrayList<Person> students = new ArrayList<>(Arrays.asList(monroe, patel, penn, pitt, cage, levy, stewart, johansson, streep));
        Comparator<Person> comparator = new PersonFirstNameComparator();
        Comparator<Person> comparator2 = new PersonSurnameComparator();

        students.sort(comparator.thenComparing(comparator2));

        ArrayList<Person> expected = new ArrayList<>(Arrays.asList(pitt, patel, levy, monroe, streep, cage, stewart, johansson, penn));
        Assertions.assertEquals(expected, students);
    }
}
