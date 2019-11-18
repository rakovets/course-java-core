package com.rakovets.course.challenge.oop.inheritance;

public class CatTests {
    public static void main(String[] args) {
        Person olegBel = new Person(50);

        Cat barsic = new Cat("Barsic");
        barsic.displayInfo();
        barsic.mew();
        barsic.setName("Kiska");
        barsic.getName();
        barsic.displayInfo();
        barsic.purr();

        Siamese siamese = new Siamese("Simka", "Siamese");
        siamese.displayInfo();
        siamese.purr();
        siamese.mew();

        Persian persian = new Persian("Persik", "Persian");
        persian.displayInfo();
        persian.purr();
        persian.mew();

        Sphynx sphynx = new Sphynx("Pharaon", "Sphynx");
        sphynx.displayInfo();
        sphynx.purr();
        sphynx.mew();

        barsic.mew(olegBel);
        olegBel.displayInfo();
        barsic.purr(olegBel);
        barsic.purr(olegBel);
        olegBel.displayInfo();

        siamese.mew(olegBel);
        olegBel.displayInfo();
        siamese.purr(olegBel);
        olegBel.displayInfo();
        siamese.purr();
        olegBel.displayInfo();


        olegBel.displayInfo();
        persian.mew(olegBel);
        olegBel.displayInfo();
        persian.purr();
        olegBel.displayInfo();
        persian.purr(olegBel);
        olegBel.displayInfo();


        for (int i = 0; i < 5; i++) {
            sphynx.mew(olegBel);
        }
        olegBel.displayInfo();

        for (int i = 0; i < 10; i++) {
            sphynx.purr(olegBel);
        }
        olegBel.displayInfo();


    }
}



