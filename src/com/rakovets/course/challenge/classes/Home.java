package com.rakovets.course.challenge.classes;

public class Home {
    public static void main(String[] args) {
        Person dmitri = new Person(50);
        dmitri.getHappiness();
        Cat siam = new Siamese("Seiam");
        siam.getName();
        Cat sphy = new Sphynx("Sphy");
        sphy.getName();
        Cat pers = new Persian("Pers");
        pers.getName();
        siam.mew(dmitri);
        sphy.mew(dmitri);
        pers.mew(dmitri);
        dmitri.getHappiness();
        siam.purr(dmitri);
        sphy.purr(dmitri);
        pers.purr(dmitri);
        siam.purr(dmitri);
        sphy.purr(dmitri);
        pers.purr(dmitri);
        dmitri.getHappiness();
    }
}
