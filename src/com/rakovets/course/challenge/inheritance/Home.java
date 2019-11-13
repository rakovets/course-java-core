package com.rakovets.course.challenge.inheritance;

public class Home {
    public static void main(String[] args) {
        Person man = new Person(50);
        System.out.println("man happiness now: " + man.getHappiness());
        man.takeHappiness(10);
        Cat cat = new Cat("cat");
        cat.mew(man);
        System.out.println("man happiness now: " + man.getHappiness());
        cat.purr(man);
        System.out.println("man happiness now: " + man.getHappiness());

        Persian persian = new Persian("pers");
        persian.mew(man);
        System.out.println("man happiness now: " + man.getHappiness());
        persian.purr(man);
        System.out.println("man happiness now: " + man.getHappiness());
        Sphynx sphynx = new Sphynx("sphy");
        sphynx.mew(man);
        System.out.println("man happiness now: " + man.getHappiness());
        sphynx.purr(man);
        System.out.println("man happiness now: " + man.getHappiness());
        Siamese siamese = new Siamese("sia");
        siamese.mew(man);
        System.out.println("man happiness now: " + man.getHappiness());
        siamese.purr(man);
        System.out.println("man happiness now: " + man.getHappiness());

        siamese.mew(man);
        persian.mew(man);
        sphynx.mew(man);
        System.out.println("man happiness now: " + man.getHappiness());
        siamese.purr(man);
        siamese.purr(man);
        persian.purr(man);
        persian.purr(man);
        sphynx.purr(man);
        sphynx.purr(man);
        System.out.println("man happiness now: " + man.getHappiness());
    }
}
