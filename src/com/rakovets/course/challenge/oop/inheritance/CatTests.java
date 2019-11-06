package com.rakovets.course.challenge.oop.inheritance;

public class CatTests {
    public static void main(String[] args) {
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
    }
}



