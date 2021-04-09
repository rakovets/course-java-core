package com.rakovets.course.java.core.practice.oop.principles.task01test;

import com.rakovets.course.java.core.practice.oop.principles.task01.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonTest {
    static Person person;
    static double happiness;

    @BeforeEach
    void beforeEach(){
        happiness = 30.00;
        person = new Person(happiness);
    }
    @Test
    void changeHappinessTest (){
        double percentOfHappiness = 15.00;
        person.changeHappiness(percentOfHappiness);
        double actual = person.getHappiness();
        Assertions.assertEquals(45, actual);
    }

    @Test
    void setHappinessTest(){
        person.setHappiness(55.00);
        double actual = person.getHappiness();
        Assertions.assertEquals(55.00, actual);
    }

}
