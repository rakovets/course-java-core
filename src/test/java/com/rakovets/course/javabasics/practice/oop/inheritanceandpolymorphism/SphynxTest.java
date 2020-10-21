package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SphynxTest {
    Sphynx sphynx = new Sphynx("Pharaon");

    @Test
    void CatTest() {
        Assertions.assertEquals("Miihha", sphynx.mew());
        Assertions.assertEquals("Sphrrrr_mummia-Raaaarrsss", sphynx.purr());

    }

}
