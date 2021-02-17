package com.rakovets.course.java.core.practice.lambda_expressions;

import com.rakovets.course.java.core.practice.lambda_expressions.university.Student;
import com.rakovets.course.java.core.practice.lambda_expressions.university.StudentSorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentSorterTest {
    @Test
    void getSpecialityList() {
        // GIVEN
        List<Student> example = new ArrayList<>();
        Collections.addAll(example,
                new Student("Alex", "Swanson", "philosophy", 2),
                new Student("Sarah", "Willard", "engineering", 2),
                new Student("Deborah", "Schwarzwald", "economics", 1),
                new Student("Samanta", "Lilly", "economics", 2),
                new Student("Charles", "Connor", "philosophy", 5));

        List<String> expectedList = new ArrayList<>();
        Collections.addAll(expectedList, "economics", "engineering", "philosophy");

        // WHEN
        List<String> actualList = StudentSorter.getSpecialityList(example);

        // THEN
        Assertions.assertEquals(expectedList.toString(), actualList.toString());
    }

    @Test
    void getCountBySpeciality() {
        // GIVEN
        List<Student> example = new ArrayList<>();
        Collections.addAll(example,
                new Student("Alex", "Swanson", "philosophy", 2),
                new Student("Sarah", "Willard", "engineering", 2),
                new Student("Deborah", "Schwarzwald", "economics", 1),
                new Student("Samanta", "Lilly", "economics", 2),
                new Student("Charles", "Connor", "philosophy", 5));

        String expectedString = "{economics=2, engineering=1, philosophy=2}";

        // WHEN
        String actualString = StudentSorter.getCountBySpeciality(example).toString();

        // THEN
        Assertions.assertEquals(expectedString, actualString);
    }

    @Test
    void isStudentsExistTrue() {
        // GIVEN
        List<Student> example = new ArrayList<>();
        Collections.addAll(example,
                new Student("Alex", "Swanson", "philosophy", 2),
                new Student("Sarah", "Willard", "engineering", 2),
                new Student("Deborah", "Schwarzwald", "economics", 1),
                new Student("Samanta", "Lilly", "economics", 2),
                new Student("Charles", "Connor", "philosophy", 5));

        List<String> exceptSpecialities = new ArrayList<>();
        Collections.addAll(exceptSpecialities, "economics", "philosophy");

        // WHEN
        boolean actualBoolean = StudentSorter.isStudentsExist(example, 2, exceptSpecialities);

        // THEN
        Assertions.assertTrue(actualBoolean);
    }

    @Test
    void isStudentsExistFalse() {
        // GIVEN
        List<Student> example = new ArrayList<>();
        Collections.addAll(example,
                new Student("Alex", "Swanson", "philosophy", 2),
                new Student("Sarah", "Willard", "engineering", 2),
                new Student("Deborah", "Schwarzwald", "economics", 1),
                new Student("Samanta", "Lilly", "economics", 2),
                new Student("Charles", "Connor", "philosophy", 5));

        List<String> exceptSpecialities = new ArrayList<>();
        Collections.addAll(exceptSpecialities, "economics", "philosophy");

        // WHEN
        boolean actualBoolean = StudentSorter.isStudentsExist(example, 1, exceptSpecialities);

        // THEN
        Assertions.assertFalse(actualBoolean);
    }
}
