package com.rakovets.course.java.core.practice.oop.principles;

import com.rakovets.course.java.core.practice.oop.principles.Cat;
import com.rakovets.course.java.core.practice.oop.principles.Siamese;
import com.rakovets.course.java.core.practice.oop.principles.Sphynx;
import com.rakovets.course.java.core.practice.oop.principles.Persian;
import com.rakovets.course.java.core.practice.oop.principles.Person;

public class CatsHomeDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Charly");
        System.out.println("Cat " + cat1.getName() + " : " + cat1.catSayMew() + " " + cat1.catPurr() );

        cat1.setName("Murka");
        System.out.println(cat1.getName() + " " + cat1.catPurr() + " " + cat1.catSayMew());

        Siamese cat2 = new Siamese("Melany");
        System.out.println(cat2.getName() + " " + cat2.catPurr() + " " + cat2.catSayMew());

        Persian cat3 = new Persian("Baron");
        System.out.println(cat3.getName() + " " + cat3.catPurr() + " " + cat3.catSayMew());


        Sphynx cat4 = new Sphynx("Leon");
        System.out.println(cat4.getName() + " " + cat4.catPurr() + " " + cat4.catSayMew());

        Person person = new Person(400);
        person.changeHappiness(-100);
        System.out.println(person.getHappiness());
    }
}
