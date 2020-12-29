package com.rakovets.course.javabasics.practice.conditionalstatements;

import com.rakovets.course.javabasics.util.StandardOutputTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Dmitry Rakovets
 */
class Task08Test extends StandardOutputTest {
    static Stream<Arguments> battleSettingsProvider() {
        return Stream.of(
                Arguments.of(100, "UNDEAD", true, 150),
                Arguments.of(10, "ZOMBIE", true, 15),
                Arguments.of(90, "SAINT", true, 45),
                Arguments.of(15, "ANIMAL", true, 15),
                Arguments.of(25, "HUMANOID", true, 25),
                Arguments.of(1000, "PLANT", true, 1000),
                Arguments.of(100, "GHOST", true, 100)
        );
    }

    @ParameterizedTest(name = "Weapon damage and type mob: {0}")
    @MethodSource("battleSettingsProvider")
    @DisplayName("Battle with mob")
    void test(int damage, String typeMob, boolean hasHolyAttribute, int expected) {
        int totalDamage = Task08.getTotalDamage(damage, typeMob, hasHolyAttribute);

        assertEquals(expected, totalDamage);
    }
}
