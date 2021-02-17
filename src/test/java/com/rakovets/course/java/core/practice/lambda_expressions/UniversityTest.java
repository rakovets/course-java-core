package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class UniversityTest {

    @Test
    void getGroupByCourse() {
        Student student1 = new Student("Sergej", "Dudkov", "Economy", 1);
        Student student2 = new Student("Vasya", "Ivanov", "Build", 2);
        Student student3 = new Student("Petya", "Petrushkin", "Philosophy", 3);
        Student student4 = new Student("Igor", "Karatist", "Build", 2);
        List<Student> listOfStudent = new LinkedList<>();
        listOfStudent.add(student1);
        listOfStudent.add(student2);
        listOfStudent.add(student3);
        listOfStudent.add(student4);
        University studentsInUniversity = new University(listOfStudent);
        Map<Integer, List<Student>> expected = new LinkedHashMap<>();
        expected.put(1, Arrays.asList(student1));
        expected.put(2, Arrays.asList(student2, student4));
        expected.put(3, Arrays.asList(student3));

        Map<Integer, List<Student>> actual = studentsInUniversity.getGroupByCourse();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getListOfSpecialty() {
        Student student1 = new Student("Sergej", "Dudkov", "Economy", 1);
        Student student2 = new Student("Vasya", "Ivanov", "Build", 2);
        Student student3 = new Student("Petya", "Petrushkin", "Philosophy", 3);
        Student student4 = new Student("Igor", "Karatist", "Build", 2);
        List<Student> listOfStudent = new LinkedList<>();
        listOfStudent.add(student1);
        listOfStudent.add(student2);
        listOfStudent.add(student3);
        listOfStudent.add(student4);
        University studentsInUniversity = new University(listOfStudent);
        List<String> expected = new LinkedList<>();
        expected.add("Build");
        expected.add("Economy");
        expected.add("Philosophy");

        List<String> actual = studentsInUniversity.getListOfSpecialty();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getNumberStudentsOfSpeciality() {
        Student student1 = new Student("Sergej", "Dudkov", "Economy", 1);
        Student student2 = new Student("Vasya", "Ivanov", "Build", 2);
        Student student3 = new Student("Petya", "Petrushkin", "Philosophy", 3);
        Student student4 = new Student("Igor", "Karatist", "Build", 2);
        List<Student> listOfStudent = new LinkedList<>();
        listOfStudent.add(student1);
        listOfStudent.add(student2);
        listOfStudent.add(student3);
        listOfStudent.add(student4);
        University studentsInUniversity = new University(listOfStudent);
        Map<String, Long> expected = new LinkedHashMap<>();
        expected.put("Economy", 1L);
        expected.put("Build", 3L);
        expected.put("Philosophy", 1L);

        Map<String, Long> actual = studentsInUniversity.getNumberStudentsOfSpeciality();

        Assertions.assertEquals(expected, actual);
    }

    static Stream<Arguments> provideArgumentsForAttackHero() {
        return Stream.of(
                Arguments.of(false, "Sergej", "Dudkov", 1),
                Arguments.of(false, "Sergej", "Dudkov", 2),
                Arguments.of(false, "Petya", "Petrushkin", 1),
                Arguments.of(true, "Petya", "Petrushkin", 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForAttackHero")
    void checkStudent(boolean expected, String name, String surname, int course) {
        Student student1 = new Student("Sergej", "Dudkov", "Economy", 1);
        Student student2 = new Student("Vasya", "Ivanov", "Build", 2);
        Student student3 = new Student("Petya", "Petrushkin", "Philosophy", 2);
        Student student4 = new Student("Igor", "Karatist", "Build", 1);
        List<Student> listOfStudent = new LinkedList<>();
        listOfStudent.add(student1);
        listOfStudent.add(student2);
        listOfStudent.add(student3);
        listOfStudent.add(student4);
        University studentsInUniversity = new University(listOfStudent);
        List<String> listOfIgnoreSpeciality = new LinkedList<>();
        listOfIgnoreSpeciality.add("Build");
        listOfIgnoreSpeciality.add("Economy");

        Boolean actual = studentsInUniversity.checkStudent(name,surname, listOfIgnoreSpeciality, course);

        Assertions.assertEquals(expected, actual);
    }
}
