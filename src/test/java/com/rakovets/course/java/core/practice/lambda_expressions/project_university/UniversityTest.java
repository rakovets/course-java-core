package com.rakovets.course.java.core.practice.lambda_expressions.project_university;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

class UniversityTest {

    @Test
    void getSpecialty() {
        //Given
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Eugene", "Dunin", "UIR", 4));
        studentList.add(new Student("Vit", "Rotkevich", "UIR", 3));
        studentList.add(new Student("Egor", "Rat", "IID", 3));
        studentList.add(new Student("Egor", "Spit", "BA", 3));
        studentList.add(new Student("Translit", "Ostrovsky", "LOG", 3));
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("BA");
        expectedResult.add("IID");
        expectedResult.add("LOG");
        expectedResult.add("UIR");
        //When
        List<String> actualResult = University.getSpecialty(studentList);

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void getCountSpecialty() {
        //Given
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Eugene", "Dunin", "UIR", 4));
        studentList.add(new Student("Vit", "Rotkevich", "UIR", 3));
        studentList.add(new Student("Egor", "Rat", "IID", 3));
        studentList.add(new Student("Egor", "Spit", "BA", 3));
        studentList.add(new Student("Translit", "Ostrovsky", "LOG", 3));
        Map<String, Long> expectedResult = new HashMap<>();
        expectedResult.put("UIR", 2L);
        expectedResult.put("IID", 1L);
        expectedResult.put("BA", 1L);
        expectedResult.put("LOG", 1L);
        //When
        Map<String, Long> actualResult = University.getCountSpecialty(studentList);

        //Than
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    void checkIfStudentIsOnCourseTrue() {

        //Given
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Eugene", "Dunin", "UIR",4));
        studentList.add(new Student("Vit", "Rotkevich", "UIR",3));
        studentList.add(new Student("Egor", "Rat", "IID",3));
        studentList.add(new Student("Egor", "Spit", "BA",3));
        studentList.add(new Student("Translit", "Ostrovsky", "LOG",3));

        //When
        boolean actualResult = University.checkIfStudentIsOnCourse(studentList, "Vit", "Rotkevich", 3);

        //Than
        Assertions.assertTrue(actualResult);
    }

    @Test
    void checkIfStudentIsOnCourseFalse() {

        //Given
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Eugene", "Dunin", "UIR",4));
        studentList.add(new Student("Vit", "Rotkevich", "UIR",3));
        studentList.add(new Student("Egor", "Rat", "IID",3));
        studentList.add(new Student("Egor", "Spit", "BA",3));
        studentList.add(new Student("Translit", "Ostrovsky", "LOG",3));

        //When
        boolean actualResult = University.checkIfStudentIsOnCourse(studentList, "Vit", "Rotkevich", 2);

        //Than
        Assertions.assertFalse(actualResult);
    }
}

