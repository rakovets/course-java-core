package com.rakovets.course.java.core.practice.lambda_expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UniversityTest {
    static List<Student> students = Arrays.asList(
            new Student("Zhenya", "Evmakov", "KIPIA", 5),
            new Student("Asya", "Asina", "Chemistry", 3),
            new Student("A", "A", "KIPIA", 5),
            new Student("B", "B", "KIPIA", 1),
            new Student("C", "C", "Chemistry", 3));

    @Test
    static Stream<Arguments> groupingByCourseTestProviderArguments() {
        return Stream.of(
                Arguments.of(Map.of(
                        1, Arrays.asList(students.get(3)),
                        3, Arrays.asList(students.get(1), students.get(4)),
                        5, Arrays.asList(students.get(0), students.get(2))))
        );
    }

    @ParameterizedTest
    @MethodSource("groupingByCourseTestProviderArguments")
    public void groupingByCourseTest(Map<Integer, List<Student>> expected) {
        Map<Integer, List<Student>> actual = University.groupingByCourse(students);
        assertEquals(expected, actual);
    }

    @Test
    static Stream<Arguments> getSpecTestProviderArguments() {
        return Stream.of(
                Arguments.of(Arrays.asList("Chemistry", "KIPIA"))
        );
    }

    @ParameterizedTest
    @MethodSource("getSpecTestProviderArguments")
    public void getSpecTest(List<Student> expected) {
        List<String> actual = University.getSpec(students);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    static Stream<Arguments> countStudentsInSpecProviderArguments() {
        return Stream.of(
                Arguments.of(Map.of("Chemistry", 2l, "KIPIA", 3l)));
    }

    @ParameterizedTest
    @MethodSource("countStudentsInSpecProviderArguments")
    public void countStudentsInSpecTest(Map<String, Long> expected) {
        Map<String, Long> actual = University.countStudentsInSpec(students);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    static Stream<Arguments> groupingBySpecialtyProviderArguments() {
        return Stream.of(
                Arguments.of(Map.of(
                        "Chemistry", Map.of(3, Arrays.asList(students.get(1), students.get(4))),
                        "KIPIA", Map.of(1, Arrays.asList(students.get(3)),
                                5, Arrays.asList(students.get(0), students.get(2)))))
        );
    }

    @ParameterizedTest
    @MethodSource("groupingBySpecialtyProviderArguments")
    public void groupingBySpecialtyTest(Map<String, Map<Integer, List<Student>>> expected) {
        Map<String, Map<Integer, List<Student>>> actual = University.groupingBySpecialty(students);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    static Stream<Arguments> checkStudentsProviderArguments() {
        return Stream.of(
                Arguments.of(false, 5, Arrays.asList("KIPIA")),
                Arguments.of(true, 3, Arrays.asList("KIPIA")),
                Arguments.of(false, 3, Arrays.asList("Chemistry", "KIPIA"))
        );
    }

    @ParameterizedTest
    @MethodSource("checkStudentsProviderArguments")
    public void checkStudentsTest(boolean expected, int course, List<Student> withoutSpec) {
        boolean actual = University.checkStudents(students, course, withoutSpec);
        Assertions.assertEquals(expected, actual);
    }
}
