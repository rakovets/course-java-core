package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.Person;
import com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism.cats.Sphynx;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    Sphynx sphynx = new Sphynx("Pharaon");
    Person human = new Person(66);

    @Test
    void sphynxMewTest() {
        Assertions.assertEquals("Miihha", sphynx.mew());
    }

    @Test
    void sphynxPurrTest() {
        Assertions.assertEquals("Sphrrrr_mummia-Raaaarrsss", sphynx.purr());
    }

    @Test
    void sphynxPharaonMewTest() {
        sphynx.mew(human);
        Assertions.assertEquals(-34, human.getHappiness());
    }

    @Test
    void sphynxPharaonPurrTest() {
        sphynx.purr(human);
        Assertions.assertEquals(216, human.getHappiness());
    }

}
