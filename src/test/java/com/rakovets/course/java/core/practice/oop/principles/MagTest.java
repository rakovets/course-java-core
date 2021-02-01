package com.rakovets.course.java.core.practice.oop.principles;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

class MagTest {

    static Stream<Arguments> providerArgumentsForAttackEnemy() {
        return Stream.of(
                Arguments.of(501, new Mag("Shrek", 500))
        );
    }
    @ParameterizedTest
    @MethodSource("providerArgumentsForAttackEnemy")
    void attackEnemy(double expectedDouble, Mag mag) {
        Enemy enemy = new Enemy(400);
        mag.attackEnemy(enemy);
        double actualDouble = mag.getHealth();
        Assertions.assertEquals(expectedDouble, actualDouble);
    }

}
