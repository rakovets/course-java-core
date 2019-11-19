package com.rakovets.course.challenge.classes;

public class CatTest {
    public static void main(String[] args) {
        Cat tom = new Cat("tom");
        tom.getName();
        tom.mew();
        tom.setName("brian");
        tom.getName();
        tom.purr();
        Cat marla = new Siamese("Marla");
        marla.purr();
        marla.mew();
        marla.getName();
        Cat john = new Persian("john");
        john.purr();
        john.mew();
        john.getName();
        Cat henry = new Sphynx("henry");
        henry.purr();
        henry.mew();
        henry.getName();
        Person meriam = new Person(50);
        meriam.getHappiness();
        meriam.takeHappiness(50);
        meriam.getHappiness();
        meriam.setHappiness(70);
        meriam.getHappiness();
        henry.mew(meriam);
        meriam.getHappiness();
        john.mew(meriam);
        meriam.getHappiness();
        marla.mew(meriam);
        meriam.getHappiness();

    }
}
