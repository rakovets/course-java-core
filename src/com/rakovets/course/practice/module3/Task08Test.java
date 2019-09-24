package com.rakovets.course.practice.module3;

import com.rakovets.course.util.ConsoleTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Task08Test extends ConsoleTest {
    static Stream<Arguments> battleSettingsProvider() {
        return Stream.of(
                Arguments.of(new String[]{"100", "UNDEAD"}, "150"),
                Arguments.of(new String[]{"10", "ZOMBIE"}, "15"),
                Arguments.of(new String[]{"90", "SAINT"}, "45"),
                Arguments.of(new String[]{"15", "ANIMAL"}, "15"),
                Arguments.of(new String[]{"25", "HUMANOID"}, "25"),
                Arguments.of(new String[]{"1000", "PLANT"}, "1000"),
                Arguments.of(new String[]{"100", "GHOST"}, "100")
        );
    }

    @ParameterizedTest(name = "Weapon damage and type mob: {0}")
    @MethodSource("battleSettingsProvider")
    @DisplayName("Battle with mob")
    void test(String[] battleSetting, String expected) {
        Task08.main(battleSetting);
        assertEquals(getConsoleContent(), expected);
    }
}