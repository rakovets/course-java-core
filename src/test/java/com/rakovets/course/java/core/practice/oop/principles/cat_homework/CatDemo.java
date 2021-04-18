package com.rakovets.course.java.core.practice.oop.principles.cat_homework;

import com.rakovets.course.java.core.practice.oop.principles.cat_homework.*;

public class CatDemo {
    public static void main(String[] args) {
        Cat barsik = new Cat( "Barsik");
        Person tom = new Person (90);

        System.out.println("Hello, i am a cat, my name is: " + barsik.getName());
        System.out.println("Toms happiness level " + tom.getHappiness());
        System.out.println("Barsik Say: " + barsik.mew());
        barsik.mew(tom);
        System.out.println("Toms happiness level after Barsik say mew: " + tom.getHappiness());
        System.out.println("Barsik make: " + barsik.purr());
        barsik.purr(tom);
        System.out.println("Toms happiness level after Barsik make purr: " + tom.getHappiness());
        barsik.setName("Catillo");
        System.out.println("Now Barsik change name,and now his name is: " + barsik.getName() );

        Sphynx hellCat = new Sphynx("HellCat");

        System.out.println("\nIt is : " + hellCat.getName());
        System.out.println("Toms happiness level " + tom.getHappiness());
        System.out.println("Hellcat Say: " + hellCat.mew());
        hellCat.mew(tom);
        System.out.println("Toms happiness level after Hellcat say mew: " + tom.getHappiness());
        System.out.println("HellCat make: " + hellCat.purr());
        hellCat.purr(tom);
        System.out.println("Toms happiness level after HellCat make purr: " + tom.getHappiness());
        barsik.setName("Lucifer");
        System.out.println("Now Barsik change name,and now his name is: " + hellCat.getName() );

        Persian chester = new Persian("Chester");

        System.out.println("\nHello, i am a cat, my name is: " + chester.getName());
        System.out.println("Toms happiness level " + tom.getHappiness());
        System.out.println("Chester Say: " + chester.mew());
        chester.mew(tom);
        System.out.println("Toms happiness level after Chester say mew: " + tom.getHappiness());
        System.out.println("Chester make: " + chester.purr());
        chester.purr(tom);
        System.out.println("Toms happiness level after Chester make purr: " + tom.getHappiness());
        chester.setName("Honey");
        System.out.println("Now Chester change name,and now his name is: " + chester.getName() );

        Siamese jerry = new Siamese("Jerry");

        System.out.println("\nHello, i am a cat, my name is: " + jerry.getName());
        System.out.println("Toms happiness level " + tom.getHappiness());
        System.out.println("Jerry Say: " + jerry.mew());
        jerry.mew(tom);
        System.out.println("Toms happiness level after Jerry say mew: " + tom.getHappiness());
        System.out.println("Jerry make: " + jerry.purr());
        jerry.purr(tom);
        System.out.println("Toms happiness level after Jerry make purr: " + tom.getHappiness());
        jerry.setName("Vasily");
        System.out.println("Now Jerry change name,and now his name is: " + jerry.getName() );

        Person donald = new Person(150);

        System.out.println("\nTest Donald overload happiness constructor: " + donald.getHappiness());
        donald.changeHappiness(-20);
        System.out.println("Test donalds ChangeHappiness method: " + donald.getHappiness());
        donald.setHappiness(75);
        System.out.println("Test donalds Setter: " + donald.getHappiness());
    }
}
