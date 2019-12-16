package com.rakovets.course.challenge.classes;

public class Home {
    public static void main(String[] args) {
        Person dmitri = new Person(50);
        System.out.println("now I will test happiness getter for person");
        dmitri.getHappiness();
        Cat siam = new Siamese("Seiam");
        siam.getName();
        System.out.println("now I will test name getter for Siamese cat");
        Cat sphy = new Sphynx("Sphy");
        System.out.println("now I will test name getter for Sphynx cat");
        sphy.getName();
        Cat pers = new Persian("Pers");
        System.out.println("now I will test name getter for Persian cat");
        pers.getName();
        System.out.println("now I will test cat's ability of getting dmitri to depression. As you will see,each cat has it' own phrase.");
        siam.mew(dmitri);
        sphy.mew(dmitri);
        pers.mew(dmitri);
        dmitri.getHappiness();
        System.out.println("now I will test cat's ability of getting dmitri to nirvana. As you will see,each cat has it' own phrase.");
        siam.purr(dmitri);
        sphy.purr(dmitri);
        pers.purr(dmitri);
        siam.purr(dmitri);
        sphy.purr(dmitri);
        pers.purr(dmitri);
        dmitri.getHappiness();
    }
}
