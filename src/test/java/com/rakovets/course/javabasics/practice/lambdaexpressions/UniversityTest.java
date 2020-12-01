package com.rakovets.course.javabasics.practice.lambdaexpressions;

import com.rakovets.course.javabasics.practice.lambdaexpressions.university.Student;
import com.rakovets.course.javabasics.practice.lambdaexpressions.university.University;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.*;

public class UniversityTest {
    private static Collection<Student> university;
    private static Map<String, List<Student>> studentGroupedByYearOfStudy;
    private static List<Student> firstYear;
    private static List<Student> secondYear;
    private static List<Student> thirdYear;
    private static List<String> specialties;
    private static Map<String, Long> numberOfStudentsForEachSpecialty;
    @BeforeAll
    static void init() {
        university = List.of(
                new Student("Bill", "Lee", "history", "first"),
                new Student("Mark", "Black", "law", "second"),
                new Student("Ann", "Smith", "law", "first"),
                new Student("Emily", "Harris", "history", "second"),
                new Student("Jack", "Wilson", "math", "third"),
                new Student("Lily", "King", "law", "third"),
                new Student("John", "Brown", "math", "first"),
                new Student("Jessica", "Young", "math", "third"),
                new Student("James", "White", "history", "third"),
                new Student("Leo", "Johnson", "law", "first"),
                new Student("David", "Snow", "math", "first"));
        firstYear = List.of(
                new Student("Bill", "Lee", "history", "first"),
                new Student("Ann", "Smith", "law", "first"),
                new Student("John", "Brown", "math", "first"),
                new Student("Leo", "Johnson", "law", "first"),
                new Student("David", "Snow", "math", "first"));
        secondYear = List.of(
                new Student("Mark", "Black", "law", "second"),
                new Student("Emily", "Harris", "history", "second"));
        thirdYear = List.of(
                new Student("Jack", "Wilson", "math", "third"),
                new Student("Lily", "King", "law", "third"),
                new Student("Jessica", "Young", "math", "third"),
                new Student("James", "White", "history", "third"));
        studentGroupedByYearOfStudy = new HashMap<>();
        studentGroupedByYearOfStudy.put("first", firstYear);
        studentGroupedByYearOfStudy.put("second", secondYear);
        studentGroupedByYearOfStudy.put("third", thirdYear);
        specialties = List.of("history", "law", "math");
        numberOfStudentsForEachSpecialty = new HashMap<>();
        numberOfStudentsForEachSpecialty.put("math", (long) 4);
        numberOfStudentsForEachSpecialty.put("law", (long) 4);
        numberOfStudentsForEachSpecialty.put("history", (long) 3);
    }
    @Test
    void getStudentGroupByYearOfStudyTest() {
        Assertions.assertEquals(studentGroupedByYearOfStudy, University.getStudentGroupByYearOfStudy(university));
    }
    @Test
    void getListSpecialitiesTest() {
        Assertions.assertEquals(specialties, University.getListSpecialities(university));
    }
    @Test
    void getNumberOfStudentsForEachSpecialtyTest() {
        Assertions.assertEquals(numberOfStudentsForEachSpecialty, University.getNumberOfStudentsForEachSpecialty(university));
    }
}
