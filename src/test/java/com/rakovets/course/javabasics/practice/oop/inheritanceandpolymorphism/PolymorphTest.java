package com.rakovets.course.javabasics.practice.oop.inheritanceandpolymorphism;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class PolymorphTest {
    Person human = new Person(70);
    Cat murka = new Cat("Murka");
    Siamese siamese = new Siamese("Po");
    Persian persian = new Persian("Jafar");
    Sphynx sphynx = new Sphynx("Pharaon");

    @Test
    void CatTest() {
        Assertions.assertEquals("Mau-Mau-Mau", murka.mew());
        Assertions.assertEquals("Trrrrrrr-Trrrrrrr", murka.purr());
        Assertions.assertEquals("Miu-Miu_miu", siamese.mew());
        Assertions.assertEquals("Srrrr_Srrrr", siamese.purr());
        Assertions.assertEquals("Moa-Moa-Moa", persian.mew());
        Assertions.assertEquals("Prrrr_Prrrr-Prrrsss", persian.purr());
        Assertions.assertEquals("Miihha", sphynx.mew());
        Assertions.assertEquals("Sphrrrr_mummia-Raaaarrsss", sphynx.purr());

    }

    @Test
    void CatMurkaTest() {
        murka.mew(human);
        murka.purr(human);
        Assertions.assertEquals("70", human.getHappiness());


    }
    @Test
    void SiameseTest(){
        siamese.mew(human);
        siamese.purr(human);
        Assertions.assertEquals("95", human.getHappiness());


    }

}
