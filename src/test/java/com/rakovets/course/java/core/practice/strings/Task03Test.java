package com.rakovets.course.java.core.practice.strings;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Tests for Task03.
 *
 * @author Dmitry Rakovets
 */
@DisplayName("Stuff")
@SuppressWarnings("unused")
class Task03Test {
    static Stream<Arguments> provideArguments() {
        return Stream.of(
                Arguments.of("Nappie Lopez-gomez    5000;" +
                                "Crawford   Kelsey 2000;" +
                                "Gregor    Samenfeld 4000;" +
                                "Bendick Berti 3500     ;" +
                                "Westleigh Aghayan   6899;" +
                                "Maurits   Loreti 1200;" +
                                "Thorvald Masson 2500;" +
                                "Elijah   Simo 3450;" +
                                "Shaun Nadal-ginard 1234;" +
                                "Malvin Cambern 7654;" +
                                "Northrup Berti 2345;" +
                                "Laurence Aghayan 4632;",
                        new String[]{"Nappie", "Crawford", "Gregor", "Bendick", "Westleigh", "Maurits", "Thorvald", "Elijah", "Shaun", "Malvin", "Northrup", "Laurence"},
                        new String[]{"Lopez-gomez", "Kelsey", "Samenfeld", "Berti", "Aghayan", "Loreti", "Masson", "Simo", "Nadal-ginard", "Cambern", "Berti", "Aghayan"},
                        new int[]{5000, 2000, 4000, 3500, 6899, 1200, 2500, 3450, 1234, 7654, 2345, 4632})
        );
    }

    @ParameterizedTest(name = "Get names: {1}")
    @MethodSource("provideArguments")
    void parseToArrayNameTest(String information, String[] names, String[] surnames, int[] salaries) {
        String[] actual = Task03.parseToArrayName(information);

        assertArrayEquals(actual, names);
    }

    @ParameterizedTest(name = "Get surnames: {2}")
    @MethodSource("provideArguments")
    void parseToArraySurnameTest(String information, String[] names, String[] surnames, int[] salaries) {
        String[] actual = Task03.parseToArraySurname(information);

        assertArrayEquals(actual, surnames);
    }

    @ParameterizedTest(name = "Get salaries: {3}")
    @MethodSource("provideArguments")
    void parseToArraySalaryTest(String information, String[] names, String[] surnames, int[] salaries) {
        int[] actual = Task03.parseToArraySalary(information);

        assertArrayEquals(actual, salaries);
    }
}
