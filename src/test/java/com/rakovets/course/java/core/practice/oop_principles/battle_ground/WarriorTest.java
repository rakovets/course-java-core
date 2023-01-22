package com.rakovets.course.java.core.practice.oop_principles.battle_ground;

import com.rakovets.course.java.core.practice.oop_principles.project_pubg.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.lang.reflect.Field;

public class WarriorTest {
    private Warrior warrior;

    @BeforeEach
    public void instanceWarrior() {
        warrior = new Warrior();
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/battle_ground/hero/heroConstructor.csv", numLinesToSkip = 1)
    public void warriorConstructorTest(ArgumentsAccessor argumentsAccessor) {
        int indexCounter = 0;
        String expectedName = argumentsAccessor.getString(indexCounter++);
        int expectedHealth = argumentsAccessor.getInteger(indexCounter++);
        String nameFieldName = argumentsAccessor.getString(indexCounter++);
        String healthFieldName = argumentsAccessor.getString(indexCounter++);
        String inputName = argumentsAccessor.getString(indexCounter++);
        int inputHealth = argumentsAccessor.getInteger(indexCounter);

        warrior = new Warrior(inputName, inputHealth);

        String actualName = getValueFromPrivateField(nameFieldName);
        int actualHealth = Integer.parseInt(getValueFromPrivateField(healthFieldName));

        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedHealth, actualHealth);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/battle_ground/hero/class_warrior/attackEnemy.csv", numLinesToSkip = 1)
    public void attackEnemyTest(int expectedHealth, int enemyHealth) {
        Enemy cyborg = new Cyborg(enemyHealth);

        warrior.attackEnemy(cyborg);
        int actualZombieHealth = cyborg.getHealth();

        Assertions.assertEquals(expectedHealth, actualZombieHealth);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/data_test/battle_ground/hero/class_warrior/ultimateAttackEnemy.csv", numLinesToSkip = 1)
    public void ultimateAttackEnemyTest(int expectedHealth, int enemyHealth) {
        Enemy cyborg = new Cyborg(enemyHealth);

        warrior.ultimateAttackEnemy(cyborg);
        int actualZombieHealth = cyborg.getHealth();

        Assertions.assertEquals(expectedHealth, actualZombieHealth);
    }

    private String getValueFromPrivateField(String fieldName) {
        String fieldValue = null;
        try {
            Field privateClassField = Hero.class.getDeclaredField(fieldName);
            privateClassField.setAccessible(true);
            fieldValue = privateClassField.get(warrior).toString();
        } catch (IllegalAccessException | NoSuchFieldException exception) {
            exception.printStackTrace();
        }
        return fieldValue;
    }
}
