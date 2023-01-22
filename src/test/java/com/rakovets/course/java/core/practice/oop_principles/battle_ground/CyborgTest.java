package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.project_pubg.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.lang.reflect.Field;

public class CyborgTest {
    private Cyborg cyborg;

    @BeforeEach
    public void instanceCyborg() {
        cyborg = new Cyborg();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/battle_ground/enemy/enemyConstructor.csv", numLinesToSkip = 1)
    public void cyborgConstructorTest(int expectedHealth, String healthFieldName, int inputHealth) {
        cyborg = new Cyborg(inputHealth);

        int actualHealth = Integer.parseInt(getValueFromPrivateField(healthFieldName));

        Assertions.assertEquals(expectedHealth, actualHealth);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/battle_ground/enemy/class_cyborg/attackHero.csv", numLinesToSkip = 1)
    public void attackHeroTest(int expectedHealth, String heroName, int heroHealth) {
        Hero warrior = new Warrior(heroName, heroHealth);

        cyborg.attackHero(warrior);
        int actualWarriorHealth = warrior.getHealth();

        Assertions.assertEquals(expectedHealth, actualWarriorHealth);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/battle_ground/enemy/class_cyborg/transformToDecepticon.csv", numLinesToSkip = 1)
    public void transformToDecepticonTest(int expectedHealth, int actualHealth) {
        Cyborg cyborg = new Cyborg(actualHealth);
        cyborg.transformToDecepticon();
        int resultHealthPoint = cyborg.getHealth();

        Assertions.assertEquals(expectedHealth, resultHealthPoint);
    }

    private String getValueFromPrivateField(String fieldName) {
        String fieldValue = null;
        try {
            Field privateClassField = Enemy.class.getDeclaredField(fieldName);
            privateClassField.setAccessible(true);
            fieldValue = privateClassField.get(cyborg).toString();
        } catch (IllegalAccessException | NoSuchFieldException exception) {
            exception.printStackTrace();
        }
        return fieldValue;
    }
}
