package com.rakovets.course.challenge.CatSolution;

public class CatTests {
    public static void main(String[] args) {
        Cat tom = new Cat ("Tom");
        /*
        tom.mew();
        tom.purr();
        tom.setName("Eugene");
        System.out.println(tom.getName());
        */
        Cat persian = new Persian("Pers");
        //persian.mew();
        //persian.purr();
        Cat siamese = new Siamese("Siam");
        //siamese.mew();
        //siamese.purr();
        Cat sphynx = new Sphynx("Sphy");
        //sphynx.mew();
        //sphynx.purr();
        Person james = new Person(50);
        /*System.out.println(james.getHappiness());
        james.setHappiness(35);
        System.out.println(james.getHappiness());
         */
        System.out.println(james.getHappiness());
        tom.purr(james);
        System.out.println(james.getHappiness());
        tom.mew(james);
        System.out.println(james.getHappiness());
    }
}
