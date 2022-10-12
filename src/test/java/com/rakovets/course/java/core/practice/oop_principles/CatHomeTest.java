package com.rakovets.course.java.core.practice.oop_principles;
import com.rakovets.course.java.core.practice.oop_principles.cat_home.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CatHomeTest {
    Person person = new Person(100);
    Cat cat = new Cat("Barsik");
    Persian persian = new Persian("Pepsi");
    Siamese siamese = new Siamese("Simka");
    Sphynx sphynx = new Sphynx("Egiped");
    @Test
    void testCat() {
        //WHEN
        String actual = cat.mew();

        //THEN
        Assertions.assertEquals("mew", actual);
    }
    @Test
    void testCatConstructor() {
        //WHEN
        String actual = cat.getName();

        //THEN
        Assertions.assertEquals("Barsik", actual);
    }
    @Test
    void testCatMew() {
        //WHEN
        cat.mew(person);
        double actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(90, actual);
    }
    @Test
    void testCatPurr() {
        //WHEN
        cat.purr(person);
        double actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(110, actual);
    }
    @Test
    void testCatSetName() {
        //WHEN
        cat.setName("Murka");
        String actual = cat.getName();

        //THEN
        Assertions.assertEquals("Murka", actual);
    }
    @Test
    void testPersianMew() {
        //WHEN
        String actual1 = persian.mew(person);
        double actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(80, actual, actual1);
        Assertions.assertEquals("mew-meww", actual1);
    }
    @Test
    void testPersianPurr() {
        //WHEN
        String actual1 = persian.purr(person);
        double actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(120, actual);
        Assertions.assertEquals("purr-purrr", actual1);
    }
    @Test
    void testSiameseMew() {
        //WHEN
        String actual1 = siamese.mew(person);
        double actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(70, actual);
        Assertions.assertEquals("meeww", actual1);
    }
    @Test
    void testSiamesePurr() {
        //WHEN
        String actual1 = siamese.purr(person);
        double actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(130, actual, actual1);
        Assertions.assertEquals("puurrr", actual1);
    }
    @Test
    void testSphynxMew() {
        //WHEN
        String actual1 = sphynx.mew(person);
        double actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(60, actual, actual1);
        Assertions.assertEquals("mew-meeew", actual1);
    }
    @Test
    void testSphynxPurr() {
        //WHEN
        String actual1 = sphynx.purr(person);
        double actual = person.getHappiness();

        //THEN
        Assertions.assertEquals(140, actual, actual1);
        Assertions.assertEquals("purr-puuurr", actual1);
    }
}
