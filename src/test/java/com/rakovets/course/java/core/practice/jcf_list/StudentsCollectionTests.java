package com.rakovets.course.java.core.practice.jcf_list;

import com.rakovets.course.java.core.practice.jcf_list.project_class.comparators.StudentsAgeComparator;
import com.rakovets.course.java.core.practice.jcf_list.project_class.comparators.StudentsAverageAnnualMarkComparator;
import com.rakovets.course.java.core.practice.jcf_list.project_class.comparators.StudentsNameAndSurnameComparator;
import com.rakovets.course.java.core.practice.jcf_list.project_class.models.Person;
import com.rakovets.course.java.core.practice.jcf_list.project_class.models.SchoolClass;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StudentsCollectionTests {
    List<Person> studentsActual = new ArrayList<>(List.of(
        new Person("Victor", "Polonnikov", 15, 8.2),
        new Person("Andrew", "Throw", 16, 7.2),
        new Person("Victor", "Tarken", 15, 7.8),
        new Person("Sam", "Dillan", 16, 8.5)
    ));
    SchoolClass schoolClassActual = new SchoolClass(studentsActual);

    @Test
    public void testToString() {
        List<Person> studentsExpected = new ArrayList<>(List.of(
            new Person("Victor", "Polonnikov", 15, 8.2),
            new Person("Andrew", "Throw", 16, 7.2),
            new Person("Victor", "Tarken", 15, 7.8),
            new Person("Sam", "Dillan", 16, 8.5)
        ));
        SchoolClass schoolClassExpected = new SchoolClass(studentsExpected);

        Assertions.assertEquals(schoolClassExpected.toString(), schoolClassActual.toString());
    }

    @Test
    public void testSortByAge() {
        List<Person> studentsExpected = new ArrayList<>(List.of(
            new Person("Victor", "Polonnikov", 15, 8.2),
            new Person("Victor", "Tarken", 15, 7.8),
            new Person("Andrew", "Throw", 16, 7.2),
            new Person("Sam", "Dillan", 16, 8.5)
        ));
        SchoolClass schoolClassExpected = new SchoolClass(studentsExpected);
        Comparator<Person> comparatorAge = new StudentsAgeComparator();
        schoolClassActual.getStudents().sort(comparatorAge);

        Assertions.assertEquals(schoolClassExpected.toString(), schoolClassActual.toString());
    }

    @Test
    public void testSortByAverageAnnualMark() {
        List<Person> studentsExpected = new ArrayList<>(List.of(
            new Person("Andrew", "Throw", 16, 7.2),
            new Person("Victor", "Tarken", 15, 7.8),
            new Person("Victor", "Polonnikov", 15, 8.2),
            new Person("Sam", "Dillan", 16, 8.5)

        ));
        SchoolClass schoolClassExpected = new SchoolClass(studentsExpected);
        Comparator<Person> comparatorAverageAnnualMark = new StudentsAverageAnnualMarkComparator();
        schoolClassActual.getStudents().sort(comparatorAverageAnnualMark);

        Assertions.assertEquals(schoolClassExpected.toString(), schoolClassActual.toString());
    }

    @Test
    public void testSortByNameAndSurname() {
        List<Person> studentsExpected = new ArrayList<>(List.of(
            new Person("Andrew", "Throw", 16, 7.2),
            new Person("Sam", "Dillan", 16, 8.5),
            new Person("Victor", "Polonnikov", 15, 8.2),
            new Person("Victor", "Tarken", 15, 7.8)
        ));
        SchoolClass schoolClassExpected = new SchoolClass(studentsExpected);
        Comparator<Person> comparatorNameAndSurname = new StudentsNameAndSurnameComparator();
        schoolClassActual.getStudents().sort(comparatorNameAndSurname);

        Assertions.assertEquals(schoolClassExpected.toString(), schoolClassActual.toString());
    }

    @Test
    public void testGetBestStudent() {
        Person bestStudentExpected = new Person("Sam", "Dillan", 16, 8.5);
        Person bestStudentActual = schoolClassActual.getBestStudent(studentsActual);

        Assertions.assertEquals(bestStudentExpected.toString(), bestStudentActual.toString());
    }
}
